package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Game;
import simple.example.hewanpedia.model.Naga;
import simple.example.hewanpedia.model.Pedia;
import simple.example.hewanpedia.model.Unggas;

public class DataProvider {
    private static List<Pedia> pedias = new ArrayList<>();

    private static List<Unggas> initDataUnggas(Context ctx) {
        List<Unggas> unggases = new ArrayList<>();
        unggases.add(new Unggas(ctx.getString(R.string.angsa_nama), ctx.getString(R.string.angsa_asal),
                ctx.getString(R.string.angsa_deskripsi), R.drawable.angsa));
        unggases.add(new Unggas(ctx.getString(R.string.ayam_nama), ctx.getString(R.string.ayam_asal),
                ctx.getString(R.string.ayam_deskripsi), R.drawable.ayam));
        unggases.add(new Unggas(ctx.getString(R.string.kalkun_nama), ctx.getString(R.string.ayam_asal),
                ctx.getString(R.string.kalkun_deskripsi), R.drawable.kalkun));
        unggases.add(new Unggas(ctx.getString(R.string.puyuh_nama), ctx.getString(R.string.puyuh_asal),
                ctx.getString(R.string.puyuh_deskripsi), R.drawable.puyuh));
        unggases.add(new Unggas(ctx.getString(R.string.bebek_nama), ctx.getString(R.string.bebek_asal),
                ctx.getString(R.string.bebek_deskripsi), R.drawable.bebek));
        unggases.add(new Unggas(ctx.getString(R.string.pinguin_nama), ctx.getString(R.string.pinguin_asal),
                ctx.getString(R.string.pinguin_deskripsi), R.drawable.pinguin));
        return unggases;
    }

    private static List<Naga> initDataNaga(Context ctx) {
        List<Naga> nagas = new ArrayList<>();
        nagas.add(new Naga(ctx.getString(R.string.huang_nama), ctx.getString(R.string.huang_asal),
                ctx.getString(R.string.huang_deskripsi), R.drawable.uanglong));
        nagas.add(new Naga(ctx.getString(R.string.hydra_nama), ctx.getString(R.string.hydra_asal),
                ctx.getString(R.string.hydra_deskripsi), R.drawable.hydra));
        nagas.add(new Naga(ctx.getString(R.string.dragon_nama), ctx.getString(R.string.dragon_asal),
                ctx.getString(R.string.dragon_deskripsi), R.drawable.dragon));
        nagas.add(new Naga(ctx.getString(R.string.quetzalcoatl_nama), ctx.getString(R.string.quetzalcoatl_asal),
                ctx.getString(R.string.quetzalcoatl_deskripsi), R.drawable.quetzalcoatl));
        nagas.add(new Naga(ctx.getString(R.string.tiamat_nama), ctx.getString(R.string.tiamat_asal),
                ctx.getString(R.string.tiamat_deskripsi), R.drawable.tiamat));
        nagas.add(new Naga(ctx.getString(R.string.qilin_nama), ctx.getString(R.string.qilin_asal),
                ctx.getString(R.string.qilin_deskripsi), R.drawable.qilin));
        return nagas;
    }

    private static List<Game>initDataGame(Context ctx) {
        List<Game> games = new ArrayList<>();
        games.add(new Game(ctx.getString(R.string.gensin_nama), ctx.getString(R.string.gensin_asal),
                ctx.getString(R.string.gensi_deskripsi), R.drawable.genshin));
        games.add(new Game(ctx.getString(R.string.blue_nama), ctx.getString(R.string.blue_asal),
                ctx.getString(R.string.blue_deskripsi), R.drawable.arsipbiru));
        games.add(new Game(ctx.getString(R.string.mobile_nama), ctx.getString(R.string.mobile_asal),
                ctx.getString(R.string.mobile_deskripsi), R.drawable.mlbb));
        games.add(new Game(ctx.getString(R.string.pubg_nama), ctx.getString(R.string.pubg_asal),
                ctx.getString(R.string.pubg_deskripsi), R.drawable.pubgm));
        games.add(new Game(ctx.getString(R.string.honkai_nama), ctx.getString(R.string.honkai_asal),
                ctx.getString(R.string.honkai_deskripsi), R.drawable.startrail));
        games.add(new Game(ctx.getString(R.string.subway_nama), ctx.getString(R.string.subway_asal),
                ctx.getString(R.string.subway_deskripsi), R.drawable.subway));
        return games;
    }

    private static void initAllPedias(Context ctx) {
        pedias.addAll(initDataUnggas(ctx));
        pedias.addAll(initDataNaga(ctx));
        pedias.addAll(initDataGame(ctx));
    }

    public static List<Pedia> getAllPedia(Context ctx) {
        if (pedias.size() == 0) {
            initAllPedias(ctx);
        }
        return  pedias;
    }

    public static List<Pedia> getPediasByTipe(Context ctx, String jenis) {
        List<Pedia> pediasByType = new ArrayList<>();
        if (pedias.size() == 0) {
            initAllPedias(ctx);
        }
        for (Pedia h : pedias) {
            if (h.getJenis().equals(jenis)) {
                pediasByType.add(h);
            }
        }
        return pediasByType;
    }

}
