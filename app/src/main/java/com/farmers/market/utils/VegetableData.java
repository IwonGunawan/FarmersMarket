package com.farmers.market.utils;

import android.util.Log;

import com.farmers.market.R;

import java.util.ArrayList;

public class VegetableData {

    private static String[] sku = {
            "SYN-001",
            "SYN-002",
            "SYN-003",
            "SYN-004",
            "SYN-005",
            "SYN-006",
            "BSR-001",
            "BSR-002",
            "BSR-003",
            "BSR-004"
    };

    private static String[] name = {
            "Wortel",
            "Kembang Kol",
            "Brokoli",
            "Sawi Hijau",
            "Bayam Hijau",
            "Buncis",
            "Nanas Madu",
            "Salak",
            "Pisang Tanduk",
            "Jambu Biji"
    };

    private static int[] stock = {
            100,
            100,
            100,
            100,
            100,
            100,
            100,
            100,
            100,
            100,
    };
    private static String[] category = {
            "Sayuran",
            "Sayuran",
            "Sayuran",
            "Sayuran",
            "Sayuran",
            "Sayuran",
            "Buah-buahan",
            "Buah-buahan",
            "Buah-buahan",
            "Buah-buahan"
    };

    private static String[] price = {
            "Rp 4.500",
            "Rp 17.000",
            "Rp 36.000",
            "Rp 5.000",
            "Rp 5.500",
            "Rp 6.300",
            "Rp 5.100",
            "Rp 6.200",
            "Rp 8.300",
            "Rp 9.700"
    };

    private static String[] detail = {
            "Wortel adalah tumbuhan biennial (siklus hidup 12 - 24 bulan) yang menyimpan karbohidrat dalam jumlah besar untuk tumbuhan tersebut berbunga pada tahun kedua.",
            "Kembang kol memiliki kandungan antioksidan, serat, kalium, isothiocyanate (termasuk senyawa sulfur) dan asam folat yang cukup tinggi. Kandungan ini yang dapat membantu mencegah beragam penyakit, serta memperbaiki dan membantu pertumbuhan jaringan tubuh.",
            "Brokoli adalah tanaman sayuran yang termasuk dalam suku kubis-kubisan atau Brassicaceae",
            "Sawi hijau adalah salah satu sayuran daun populer di Indonesia. Nama lainnya adalah sawi bakso (karena menjadi sayuran daun pendamping dalam penyajian bakso) atau caisim/caisin",
            "Bayam (Amaranthus)adalah tumbuhan yang biasa ditanam untuk dikonsumsi daunnya sebagai sayuran hijau. Tumbuhan ini berasal dari Amerika tropik namun sekarang tersebar ke seluruh dunia. Tumbuhan ini dikenal sebagai sayuran sumber zat besi yang penting bagi tubuh.",
            "Buncis (dari bahasa Belanda boontjes untuk kacang-kacangan secara umum), adalah sejenis polong-polongan yang dapat dimakan dari berbagai kultivar Phaseolus vulgaris. Buah, biji, dan daunnya dimanfaatkan orang sebagai sayuran. Sayuran ini kaya dengan kandungan protein. Ia dipercaya berasal dari Amerika Tengah dan Amerika Selatan.",
            "Nanas madu merupakan buah tropis yang terkenal akan kandungan enzim bromelain, terutama pada inti nanas yang cenderung tidak bisa dimakan karena keras. Bromelain juga banyak dijual di pasaran dalam bentuk suplemen yang memang tidak boleh dikonsumsi oleh ibu hamil.",
            "Salak adalah sejenis palma dengan buah yang biasa dimakan. Ia dikenal juga sebagai sala (Min., Mak., Bug.,[1] dan Thai). Dalam bahasa Inggris disebut salak atau snake fruit, sementara nama ilmiahnya adalah Salacca zalacca. Buah ini disebut snake fruit karena kulitnya mirip dengan sisik ular.",
            "Pisang tanduk adalah salah satu kultivar pisang yang populer di Indonesia sebagai bahan dasar pisang goreng. Pisang ini juga dikenal sebagai \"pisang byar\" di Kudus.",
            "Jambu batu (Psidium guajava) atau sering juga disebut jambu biji, jambu siki dan jambu klutuk adalah tanaman tropis yang berasal dari Brasil, disebarkan ke Indonesia melalui Thailand. Jambu batu memiliki buah yang berwarna hijau dengan daging buah berwarna putih atau merah dan berasa asam-manis. Buah jambu batu dikenal mengandung banyak vitamin C."
    };

    private static int[] image = {
            R.drawable.wortel,
            R.drawable.kembang_kol,
            R.drawable.brokoli,
            R.drawable.sawi_hijau,
            R.drawable.bayam_hijau,
            R.drawable.buncis,
            R.drawable.nanas_madu,
            R.drawable.salak,
            R.drawable.pisang_tanduk,
            R.drawable.jambu_biji
    };

    private static int[][] image_small = {
            {
                R.drawable.wortel_small1,
                R.drawable.wortel_small2,
                R.drawable.wortel_small3,
                R.drawable.wortel_small4,
            },
            {
                R.drawable.kembangkol_small1,
                R.drawable.kembangkol_small2,
                R.drawable.kembangkol_small3,
                R.drawable.kembangkol_small4
            },
            {
                R.drawable.brokoli_small1,
                R.drawable.brokoli_small2,
                R.drawable.brokoli_small3,
                R.drawable.brokoli_small4,
            },
            {
                R.drawable.sawihijau_small1,
                R.drawable.sawihijau_small2,
                R.drawable.sawihijau_small3,
                R.drawable.sawihijau_small4,
            },
            {
                R.drawable.bayamhijau_small1,
                R.drawable.bayamhijau_small2,
                R.drawable.bayamhijau_small3,
                R.drawable.bayamhijau_small4,
            },
            {
                R.drawable.buncis_small1,
                R.drawable.buncis_small2,
                R.drawable.buncis_small3,
                R.drawable.buncis_small4
            },
            {
                R.drawable.nanasmadu_small1,
                R.drawable.nanasmadu_small2,
                R.drawable.nanasmadu_small3,
                R.drawable.nanasmadu_small4,
            },
            {
                R.drawable.salak_small1,
                R.drawable.salak_small2,
                R.drawable.salak_small3,
                R.drawable.salak_small4,
            },
            {
                R.drawable.pisangtanduk_small1,
                R.drawable.pisangtanduk_small2,
                R.drawable.pisangtanduk_small3,
                R.drawable.pisangtanduk_small4,
            },
            {
                R.drawable.jambubiji_small1,
                R.drawable.jambubiji_small2,
                R.drawable.jambubiji_small3,
                R.drawable.jambubiji_small4,
            }
    };

    public static ArrayList<VegetableModel> listData() {
        ArrayList<VegetableModel> list = new ArrayList<>();
        for (int i=0; i < name.length; i++) {
            VegetableModel vegetableModel = new VegetableModel();
            vegetableModel.setName(name[i]);
            vegetableModel.setCategory(category[i]);
            vegetableModel.setPrice(price[i] + "/kg");
            vegetableModel.setDetail(detail[i]);
            vegetableModel.setImage(image[i]);
            list.add(vegetableModel);
        }

        return list;
    }

    public static ArrayList detailData(int vKey) {

        ArrayList list = new ArrayList();
        list.add(0, sku[vKey]);
        list.add(1, name[vKey]);
        list.add(2, stock[vKey]);
        list.add(3, category[vKey]);
        list.add(4, price[vKey]);
        list.add(5, detail[vKey]);
        list.add(6, image[vKey]);
        list.add(7, image_small[vKey][0]);
        list.add(8, image_small[vKey][1]);
        list.add(9, image_small[vKey][2]);
        list.add(10, image_small[vKey][3]);

        return list;
    }


}
