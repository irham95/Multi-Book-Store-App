package example.com.tugasakhir020irham011yuni;

import java.util.ArrayList;

/**
 * Written by Irham Nurrahman on 8:04 AM 4/6/2020
 **/
public class HeroesData {
    private static String[] heroNames = {
            "Daddy Little Girl",
            "Pemrograman Mobile IDE",
            "Auguste Dupin",
            "Harry Potter and the Half Blood Prince",
            "Buku Ajar Sistem Mikroprosesor",
            "The Hobbit",
            "Laskar Pelangi",
            "The Pale Horse",
            "5 Hari menguasai AS & SQLite",
            "And Then There Were None",
            "Nightmare Hour",
            "The Mystery of the Yellow Room",
            "The Haunted Mask",
            "Harry Potter and the Sorcerers Stone",
            "The Hunger Games",
            "Twilight",
            "Divergent",
            "The Fault in our Stars",
            "The Maze Runner",
            "City of Bones",
            "Negeri 5 Menara",
            "5 CM",
            "Edensor",
            "Hapalan Shalat Delisa",
            "Perahu Kertas"

    };

    private static String[] heroDetails = {
            "Ketika Ellie Cavanaugh berusia delapan tahun, kakaknya, Andrea, tewas dibunuh di dekat rumah mereka di Oldham-on-the-Hudson, Ada tiga tersangka: Rob westerfield, pemuda tampan dari keluarga kaya setempat, yang diam-diam menjalin hubungan dengan Andrea; Paulie Stroebel, teman sekelas yang diam-diam mencintai Andrea; dan Will Nebels, pekerja serabutan yang suka menawarkan jasa kepada para tetangga.",
            "Belakangan ini, Android semakin digandrungi, Google Play kini sudah mencapai lebih dari 700.000 total aplikasi yang ditawarkan (berdasarkan data oktober 2012, Google Play sudah menembus angka 700.000), kebanyakan merupakan aplikasi yang gratis.",
            "Mungkin banyak yang mengira bahwa Sherlock Holmes adalah pionir tokoh detektif fiksi di dunia literasi. Tapi tahukah bahwasanya jauh sebelum Sherlock Holmes muncul, ada tokoh lain yang lebih dulu memulai dan menyandang predikat gentlemen detective?. Yup, tokoh detektif fiksi pertama di dunia literasi yang mengguncang dunia sastra pada eranya adalah C Auguste Dupin. Tokoh detektif ini merupakan rekaan sang penulis puisi dan cerita misteri beraliran gore, gothic dan macabre sekaligus kritikus sastra terkenal pada eranya, Edgar Allan Poe.",
            "Khawatir dengan pengalaman pertemuannya dengan Voldemort di Kementerian Sihir, Harry Potter merasa enggan untuk kembali ke Hogwarts. Dumbledore mendorongnya untuk kembali, setelah mengajaknya untuk menemui seorang mantan guru Hogwarts, Horace Slughorn. Dengan bantuan Harry, ia berhasil membujuk Slughorn agar mau kembali mengajar di Hogwarts.",
            "Buku Dasar Mikroprosesor ini ditulis berdasarkan silabus dalam kurikulum yang ada. Tentunya dengan imbuhan di sana-sini untuk menyesuaikan dengan perkembangan ilmu pengetahuan yang mutahir dan kebutuhan yang ada. Namun sudah barang tentu tidak dimaksudkan untuk menggantikan buku teks yang ada, melainkan hanya sebagai bahan pelengkap saja. ",
            "Kisah bermula ketika Bilbo baggins yang merupakan seorang hobbit yang ingin hidup nyaman, sejahtera di liang hobbitnya, dan hampir tidak pernah bepergian jauh dari rumahnya di shire. suatu hari Gandalf datang ke rumahnya dan mengajaknya untuk berpetualang, dan Bilbo dengan jelas menolaknya. hingga ketika Gandalf mengundang 13 Kurcaci untuk datang ke rumah Bilbo dan terjadilah sebuah pesta yang tak terduga.",
            "Laskar Pelangi Menceritakan tentang kisah masa kecil anak-anak desa dari suatu komunitas melayu yang bisa dikatakan sangat miskin di Belitung. Kisah orang-orang ‘kecil’ yang berusaha untuk memperbaiki masa depan mereka.",
            "Seorang wanita memanggil pastor di saat sedang sekarat untuk menceritakan rahasia kelam yang harus ia tanggung semasa hidupnya, termasuk memberikan sederet daftar nama pada sang pastor. Sepulang dari tempat wanita itu, Pastor Gorman dibunuh, meski daftar nama tadi selamat dari incaran si pembunuh.",
            "Database sangat dibutuhkan ketika akan membuat aplikasi yang berhubungan dengan pengolahan data, tidak terkecuali aplikasi android.",
            "Sepuluh orang diundang ke sebuah rumah mewah dan modern di Pulau Negro, di seberang pantai Devon. Walaupun masing-masing menyimpan rahasia, mereka tiba di pulau itu dengan penuh harapan, pada suatu sore musim panas yang indah.",
            "Setiap detak jam membaca kengerian lagi, Kengerian apa yang menunggu seorang anak yang terpaksa mondok di rumah sakit pada malam Halloween?Bagaimana kau mengecoh Hantu yang menginginkan kulitmu?Mengapa Nightmare Inn jadi penginapan yang paling seram?Inilah Sepuluh kisah yang akan menimbulkan kengerian setiap saat dan membawamu ke tempat yang paling seram - di dalam benak R.L. Stine.",
            "Jika di Inggris ada Sir Arthur Conan Doyle, di Amerika ada Edgar Allan Poe, di Perancis ada Gaston Leoux yang tak kalah piawai merangkai cerita detektif. Dan, Mystery of Yellow  Room ini adalah karya monumentalnya.",
            "Seseram apa sih topeng Halloween Carly Beth? Begitu seram sampai-sampai adik lelakinya ketakutan setengah mati. Begitu menakutkan sampai-sampai para sahabatnya seolah tersihir.",
            "Harry berhasil selamat dari pembunuhan yang akan dilakukan musuh orang tuanya, Lord Voldemort. Padahal umurnya baru 1 tahun. Lalu ia tinggal di rumah paman dan bibinya di Privet Drive no. 13 selama 11 tahun. selama ia tinggal ia belum pernah diperlakukan layak oleh paman dan bibinya. Paman dan bibinya punya anak bernama Dudley, dia pun sama seperti kedua orang tuanya jahat terhadap Harry.",
            "Katniss Everdeen. Dia adalah seorang remaja perempuan yang memiliki hobi berburu untuk mencari makanan. Ayahnya sudah meninggal, sehingga dia hanya tinggal dengan ibu dan adiknya Prim di Distrik 12 dari negara Panem. Dia sering berburu dengan Gale, seorang pria yang sangat menyukai Katniss, Setiap tahun, Ibu kota Panen menjadi tuan rumah untuk acara The Hunger Games. Acara tersebut diikuti oleh dua perwakilan dari masing-masing distrik.",
            "Seorang perempuan yang memutuskan untuk pindah ke kota Forks tempat ayahnya tinggal, karena dia tidak ingin merepotkan ibunya yang sedang menikmati bulan madu bersama suami barunya. Dia bernama Bella Swan.",
            "Kisah ini diawali dengan seorang gadis bernama Beatrice Prior yang hidup di kota Chicago versi masa depan. Pada masa itu, penduduk dibagi menjadi 5 golongan atau fraksi. Setiap  fraksi memiliki pemikiran masing-masing. Dauntless berfikir tentang keberanian, Erudite sangat mencintai ilmu pengetahuan dan penelitian, Abnegation selalu mengabdikan dirinya untuk orang lain, Amity selalu cinta perdamaian dan Candor selalu mengatakan yang benar.",
            "Kisah seorang remaja wanita bernama Hazel Grace. Dia merupakan seorang yang bertahan dari serangan kanker yang membuat paru-parunya tidak dapat berjalan normal. Orang tuanya menyarankan agar Hazel bisa pergi ke Support Group.",
            "Setiap hari mereka harus berlari. Menyusuri lorong Maze yang berkelok-kelok di luar dinding Glade, tempat mereka tinggal, hingga senja tiba. Dan, ketika kegelapan turun, para pelari harus sudah ada di dalam Glade. Ya, pada saat itulah Griever, monster buas dan ganas, tak segan menerkam siapa saja yang masih berkeliaran di dalam Maze.",
            "Selama ini Clary yang hampir berusia 16 tahun, mengira dirinya hanyalah anak seorang pelukis biasa. Tapi sejak ibunya diculik dan Clary hampir mati oleh serangan iblis, ia terpaksa masuk ke dalam dunia baru yang gelap sekaligus menawan, yaitu Dunia Bayangan.",
            "Dikisahkan sebuah cerita dari tanah Minangkabau, yaitu Alif. Sejak kecil Alif memiliki cita-cita untuk menjadi seseorang seperti B.J. Habibie, tetapi ibunya menginginkan Alif menjadi seseorang seperti Buya Hamka. Hal itulah yang menjadi penghalang bagi tercapainya cita-cita Alif.",
            "Kelima tokoh utama ini telah berada dalam lingkar persahabatan selama kurang lebih 7 tahun. Hingga suatu saat mereka diliputi kebosanan. Kehidupan yang monoton membuat mereka berpikir untuk berpisah selama 3 bulan. Dalam masa “berpisah tersebut”, mereka tidak diperkenankan melakukan komunikasi dalam bentuk apapun. Dalam kurun 3 bulan tersebutlah, mereka ditempa dengan hal baru.",
            "Tokoh utama pada novel ini masih Ikal dan juga Arai, sepupunya. Secara umum novel ini bercerita mengenai kehidupan pendidikan Arai juga Ikal yang berhasil melanjutkan kuliahnya di Eropa. Sebelum berangkat ke sana, mereka berpamitan pada gadis pujaan mereka yakni Zakia Nurmala juga A Ling. Meski Zakia cuek menanggapi kepergian Arai, tetapi gadis itu tetap terbawa di hatinya. Demikian pula dengan Ikal. Meski tak bertemu dengan A ling, ia tetap memendam cinta.",
            "Novel manis yang satu ini mengangkat kisah seorang bocah perempuan bermata hijau telaga yang baru berusia 6 tahun. Gadis cilik tersebut bernama Delisa. Ia merupakan anak bungsu di dalam keluarganya. Adapun kakak-kakan Delisa adalah Cut Fatimah, Cut Zahra dan juga Cut Aisyah. Keluarga Delisa berdomisili di Lhok Nga. Delisa dan saudara-saudaranya hanya tinggal bersama Ummi, sebab sang Abi bekerja sebagai mekanik kapal yang berbulan-bulan ikut di kapal yang berlayar.",
            "Dimulai dengan kisah seorang anak muda bernama Keenan. Ia seorang remaja yang baru saja menyelesaikan sekolah menengah atas-nya di Belanda, tepatnya di Amsterdam. Keenan menetap di Negara tersebut selama hampir 6 tahun lamanya, bersama sang nenek. Keenan terlahir dengan cita-cita menjadi pelukis. Namun, ia dipaksa untuk kembali ke Indonesia oleh sang Ayah."

    };

    private static int[] heroesImages = {
            R.drawable.sample_0,
            R.drawable.yunilogo,
            R.drawable.sample_1,
            R.drawable.sample_2,
            R.drawable.mikro2,
            R.drawable.sample_3,
            R.drawable.sample_4,
            R.drawable.sample_5,
            R.drawable.sample_6,
            R.drawable.sample_7,
            R.drawable.sample_8,
            R.drawable.sample_9,
            R.drawable.sample_10,
            R.drawable.sample_11,
            R.drawable.sample_12,
            R.drawable.sample_13,
            R.drawable.sample_14,
            R.drawable.sample_15,
            R.drawable.sample_16,
            R.drawable.sample_17,
            R.drawable.sample_18,
            R.drawable.sample_19,
            R.drawable.sample_20,
            R.drawable.sample_21,
            R.drawable.sample_22


    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;


    }
}

