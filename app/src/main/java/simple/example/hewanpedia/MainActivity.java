package simple.example.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Intent pindah;
    ImageButton btnUnggas,btnNaga,btnGame,tombol;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    @SuppressLint("WrongViewCast")
    private void inisialisasiView() {
        btnUnggas = findViewById(R.id.btn_buka_unggas);
        btnNaga = findViewById(R.id.btn_buka_naga);
        btnGame = findViewById(R.id.btn_buka_game);
        tombol = (ImageButton) findViewById(R.id.btn_buka_profile);
        btnUnggas.setOnClickListener(view -> bukaGaleri("Unggas"));
        btnNaga.setOnClickListener(view -> bukaGaleri("Naga"));
        btnGame.setOnClickListener(view -> bukaGaleri("Game"));
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(pindah);
            }
        });
    }

    private void bukaGaleri(String jenisPedia) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, DaftarPediaActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisPedia);
        startActivity(intent);
    }

}