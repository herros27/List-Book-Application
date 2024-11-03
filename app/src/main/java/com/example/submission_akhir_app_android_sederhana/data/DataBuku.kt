package com.example.submission_akhir_app_android_sederhana.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataBuku(
    val judul: String?= null,
    val penulis: String?= null,
    val phtoUrl: String?= null,
    val penerbit: String?= null,
    val deskripsi: String?= null,
    val jumHal: Int?= null,
    val bahasa: String?= null,
    val dimensi: String?= null,
    val tanggalTerbit: String?= null,
    val berat: Float?= null,
    val isbn: String?= null,

): Parcelable{
    companion object {
        fun getListBuku(): List<DataBuku> {
            return listOf(
                DataBuku(
                    judul = "Cantik Itu Luka",
                    penulis = "Eka Kurniawan",
                    phtoUrl = "https://www.gramedia.com/blog/content/images/2021/12/Cantik-itu-Luka-Cover-Besar.jpg",
                    penerbit = "Gramedia Pustaka Utama",
                    deskripsi = """Hidup di era kolonialisme bagi para wanita dianggap sudah setara seperti hidup di neraka. Terutama bagi para wanita berparas cantik yang menjadi incaran tentara penjajah untuk melampiaskan hasrat mereka. Itu lah takdir miris yang dilalui Dewi Ayu, demi menyelamatkan hidupnya sendiri Dewi harus menerima paksaan menjadi pelacur bagi tentara Belanda dan Jepang selama masa kedudukan mereka di Indonesia.

Kecantikan Dewi tidak hanya terkenal dikalangan para penjajah saja, seluruh desa pun mengakui pesona parasnya itu. Namun bagi Dewi, kecantikannya ini seperti kutukan, kutukan yang membuat hidupnya sengsara, dan kutukan yang mengancam takdir keempat anak perempuannya yang ikut mewarisi genetik cantiknya.

Tapi tidak dengan satu anak terakhir Dewi, si Cantik, yang lahir dengan kondisi buruk rupa. Tak lama setelah mendatangkan Cantik ke dunia, Dewi harus berpulang. Tapi di satu sore, dua puluh satu tahun kemudian, Dewi kembali, bangkit dari kuburannya. Kebangkitannya menguak kutukan dan tragedi keluarga.

Bagaimana takdir yang akan menghampiri si Cantik? Apa yang membuat Dewi harus kembali ke dunia bak neraka ini? Ungkap rahasia dibalik misteri kisah masa kolonial dalam novel Cantik Itu Luka karya Eka Kurniawan.
                        """,
                    jumHal = 489,
                    bahasa = "Indonesia",
                    dimensi = "14 x 21",
                    tanggalTerbit = "30 Januari 2015",
                    berat = 0.30F,
                    isbn = "9786020312583"

                ),
                DataBuku(
                    judul = "Laut Bercerita",
                    penulis = " Leila S. Chudori",
                    phtoUrl = "https://www.gramedia.com/blog/content/images/2022/01/Laut-Bercerita4-1.jpg",
                    penerbit = "Kepustakaan Populer Gramedia",
                    deskripsi = """Buku ini terdiri atas dua bagian. Bagian pertama mengambil sudut pandang seorang mahasiswa aktivis bernama Laut, menceritakan bagaimana Laut dan kawan-kawannya menyusun rencana, berpindah-pindah dalam pelarian, hingga tertangkap oleh pasukan rahasia. Sedangkan bagian kedua dikisahkan oleh Asmara, adik Laut. Bagian kedua mewakili perasaan keluarga korban penghilangan paksa, bagaimana pencarian mereka terhadap kerabat mereka yang tak pernah kembali.
Buku ini ditulis sebagai bentuk tribute bagi para aktivis yang diculik, yang kembali, dan yang tak kembali dan keluarga yang terus menerus sampai sekarang mencari-cari jawaban.

Novel ini merupakan perwujudan dalam bentuk fiksi bahwa kita sebagai bangsa Indonesia tidak boleh melupakan sejarah yang telah membentuk sekaligus menjadi tumpuan bangsa Ini. Novel ini juga mengajak pembaca menguak misteri-misteri bangsa ini yang mana tidak diajarkan di sekolah. Walaupun novel ini adalah fiksi, laut bercerita menunjukkan kepada pembaca bahwa negeri ini pernah memasuki masa pemerintahan yang kelam.

Sinopsis
Laut Bercerita, novel terbaru Leila S. Chudori, bertutur tentang kisah keluarga yang kehilangan, sekumpulan sahabat yang merasakan kekosongan di dada, sekelompok orang yang gemar menyiksa dan lancar berkhianat, sejumlah keluarga yang mencari kejelasan makam anaknya, dan tentang cinta yang tak akan luntur.""",
                    jumHal = 400,
                    bahasa = "Indonesia",
                    dimensi = "14 x 20",
                    tanggalTerbit = "21 Desember 2017",
                    berat = 0.315F,
                    isbn = "9786024246945"
                ),
                DataBuku(
                    judul = "Bumi Manusia",
                    penulis = " Pramoedya Ananta Toer",
                    phtoUrl = "https://www.gramedia.com/blog/content/images/2022/01/Bumi-Manusia-1.jpg",
                    penerbit = "Lentera Dipantara",
                    deskripsi = """Sinopsis Buku
Roman Tetralogi Buru mengambil latar belakang dan cikal bakal nation Indonesia di awal abad ke-20. Dengan membacanya waktu kita dibalikkan sedemikian rupa dan hidup di era membibitnya pergerakan nasional mula-mula, juga pertautan rasa, kegamangan jiwa, percintaan, dan pertarungan kekuatan anonim para srikandi yang mengawal penyemaian bangunan nasional yang kemudian kelak melahirkan Indonesia modern.

Roman bagian pertama; Bumi Manusia, sebagai periode penyemaian dan kegelisahan dimana Minke sebagai aktor sekaligus kreator adalah manusia berdarah priyayi yang semampu mungkin keluar dari kepompong kejawaannya menuju manusia yang bebas dan merdeka, di sudut lain membelah jiwa ke-Eropa-an yang menjadi simbol dan kiblat dari ketinggian pengetahuan dan peradaban.


Pram menggambarkan sebuah adegan antara Minke dengan ayahnya yang sangat sentimentil: Aku mengangkat sembah sebagaimana biasa aku lihat dilakukan punggawa terhadap kakekku dan nenekku dan orangtuaku, waktu lebaran. Dan yang sekarang tak juga diturunkan sebelum Bupati itu duduk enak di tempatnya.

Dalam mengangkat sembah serasa hilang seluruh ilmu dan pengetahuan yang kupelajari tahun demi tahun belakangan ini. Hilang indahnya dunia sebagaimana dijanjikan oleh kemajuan ilmu. Sembah pengagungan pada leluhur dan pembesar melalui perendahan dan penghinaan diri! Sampai sedatar tanah kalau mungkin! Uh, anak-cucuku tak kurelakan menjalani kehinaan ini. "Kita kalah, Ma," bisikku. "Kita telah melawan, Nak, Nyo, sebaik-baiknya, sehormat-hormatnya."""",
                    jumHal = 538,
                    bahasa = "Indonesia",
                    dimensi = "13.5 x 20.0",
                    tanggalTerbit = "Juli 2015",
                    berat = 0.4F,
                    isbn = "9789799731234"
                ),
                DataBuku(
                    judul = "Saman",
                    penulis = "Ayu Utami",
                    phtoUrl = "https://www.gramedia.com/blog/content/images/2022/01/9786024243999_Saman-2018.jpg",
                    penerbit = "Kepustakaan Populer Gramedia",
                    deskripsi = """" SAMAN " Pemenang sayembara Roman Dewan Kesenian Jakarta 1998

Pembicaraan tentang seks, cinta, politik, dan agama serta perasaan-perasaan yg saling bertaut antar para tokoh digambarkan tanpa rigiditas, tanpa beban, bebas sebebas-bebas bagai seorang Ursula Brangwen - tokoh utama penulis D.H. Lawrence - yg menari diatas bukit sembari bertelanjang tanpa persoalan. tapi sikap para tokoh yg mempertanyakan Tuhan, persenggamaan, hubungan antar manusia itu, juga sangat diperhitungkan dan sangat menarik lagi, dengan begitu banyak fakta sehari-hari dan berbagai perbenturan pemikiran, roman ini tak jatuh kepada sebuah karya yg sekadar cerebral dan intelektual belaka, tapi ia berhasil menyentuh emosi. Superb, splendid .Novel ini dapat dinikmati dan berguna sejati ha bagi pembaca yg dewasa. Bahkan amat dewasa. Dan jujur, khusus mengenai dimensi-dimensi politik, antropologi sosial, dan teristimewa lagi agama dan iman.

Kisah suka-duka generasi muda Indonesia menjelang keruntuhan Orde Baru. Cara Ayu menyajikan cerita tergolong baru dalam khazanah sastra Indonesia."""".trimMargin(),
                    jumHal = 216,
                    bahasa = "Indonesia",
                    dimensi = "13.5 x 20.0",
                    tanggalTerbit = "Juli 2015",
                    berat = 0.4F,
                    isbn = "9789799731234"
                ),
                DataBuku(
                    judul = "Ronggeng Dukuh Paruk",
                    penulis = "Ahmad Tohari",
                    phtoUrl = "https://www.gramedia.com/blog/content/images/2022/01/9789792201963_Ronggeng-Dukuh-Paruk.jpg",
                    penerbit = "Gramedia Pustaka Utama",
                    deskripsi = """Ronggeng Dukuh Paruk adalah sebuah judul novel dari trilogi novel karya Ahmad Tohari yang merupakan novel pertama dari trilogi tersebut. Dua judul lainnya adalah Lintang Kemukus Dini Hari dan Jantera Bianglala. Novel ini–Ronggeng Dukuh Paruk, membuka ceritanya dengan mendeskripsikan suatu keadaan sebuah perkampungan di daerah Jawa. Memuat cerita kehidupan dan adat kebiasaan masyarakat di Dukuh Paruk, dukuh ini terletak pada sebuah wilayah di Jawa dengan kondisi memprihatinkan: terbelakang dan melarat, serta memiliki penduduk yang memelihara kebodohan dan rasa malas. Namun, pedukuhan ini memiliki suatu kebiasaan yang menjadi ciri khasnya, yaitu ronggeng.

Sinopsis
Semangat Dukuh Paruk kembali menggeliat sejak Srintil dinobatkan menjadi ronggeng baru, menggantikan ronggeng terakhir yang mati dua belas tahun yang lalu. Bagi pedukuhan yang kecil, miskin, terpencil, dan bersahaja itu, ronggeng adalah perlambang. Tanpanya, dukuh itu merasa kehilangan jati diri. Dengan segera Srintil menjadi tokoh yang amat terkenal dan digandrungi. Cantik dan menggoda. Semua ingin pernah bersama ronggeng itu. Dari kaula biasa hingga pejabat-pejabat desa maupun kabupaten.

Namun malapetaka politik tahun 1965 membuat dukuh tersebut hancur, baik secara fisik maupun mental. Karena kebodohannya, mereka terbawa arus dan divonis sebagai manusia-manusia yang telah mengguncangkan negara ini. Pedukuhan itu dibakar. Ronggeng beserta para penabuh calungnya ditahan.

Hanya karena kecantikannya lah Srintil tidak diperlakukan semena-mena oleh para penguasa di penjara itu. Namun pengalaman pahit sebagai tahanan politik membuat Srintil sadar akan hakikatnya sebagai manusia.

Seri Lainnya:
Lintang Kemukus Dini Hari
Jantera Bianglala""".trimMargin(),
                    jumHal = 406,
                    bahasa = "Indonesia",
                    dimensi = "15.0 x 20.0",
                    tanggalTerbit = "12 November 2009",
                    berat = 0.65F,
                    isbn = "9789792201963"
                ),
                DataBuku(
                    judul = "Entrok",
                    penulis = "Okky Madasari",
                    phtoUrl = "https://www.gramedia.com/blog/content/images/2022/01/9786020652191_entrok_cu_cov.jpg",
                    penerbit = "Gramedia Pustaka Utama",
                    deskripsi = """Marni, perempuan Jawa buta huruf yang masih memuja leluhur. Melalui sesajen dia menemukan dewa-dewanya, memanjatkan harapannya. Tak pernah dia mengenal Tuhan yang datang dari negeri nun jauh di sana. Dengan caranya sendiri dia mempertahankan hidup. Menukar keringat dengan sepeser demi sepeser uang. Adakah yang salah selama dia tidak mencuri, menipu, atau membunuh?

Rahayu, anak Marni. Generasi baru yang dibentuk oleh sekolah dan berbagai kemudahan hidup. Pemeluk agama Tuhan yang taat. Penjunjung akal sehat. Berdiri tegak melawan leluhur, sekalipun ibu kandungnya sendiri.

Adakah yang salah jika mereka berbeda?
Marni dan Rahayu, dua orang yang terikat darah namun menjadi orang asing bagi satu sama lain selama bertahun-tahun. Bagi Marni, Rahayu adalah manusia tak punya jiwa. Bagi Rahayu, Marni adalah pendosa. Keduanya hidup dalam pemikiran masing-masing tanpa pernah ada titik temu.

Lalu bunyi sepatu-sepatu tinggi itu, yang senantiasa mengganggu dan merusak jiwa. Mereka menjadi penguasa masa, yang memainkan kuasa sesuai keinginan. Mengubah warna langit dan sawah menjadi merah, mengubah darah menjadi kuning. Senapan teracung di mana-mana.

Marni dan Rahayu, dua generasi yang tak pernah bisa mengerti, akhirnya menyadari ada satu titik singgung dalam hidup mereka. Keduanya sama-sama menjadi korban orang-orang yang punya kuasa, sama-sama melawan senjata.
Novel ini dengan jujur menggambarkan bagaimana sebagian masyarakat kita masih belum bisa menerima adanya perbedaan.
—Hendardi, aktivis demokrasi dan hak asasi manusia
                    """.trimIndent(),
                    jumHal = 206,
                    bahasa = "Indonesia",
                    dimensi = "12.0 x 19.0",
                    tanggalTerbit = "11 Mei 2021",
                    berat = 0.35F,
                    isbn = "9789792255898"

                ),
                DataBuku(
                    judul = "Sumur",
                    penulis = "Eka Kurniawan",
                    phtoUrl = "https://www.gramedia.com/blog/content/images/2022/01/9786020653242_SUMUR--1-.jpg",
                    penerbit = "Gramedia",
                    deskripsi = """Kisah kekeringan berkepanjangan di suatu kampung, membuat satu per satu orang meninggalkan kampung ini dan pindah ke tempat lain. Bagi yang pindah, ada dari mereka yang pergi ke kota hanya untuk mencari pekerjaan atau memilih menetap di sana. Sementara itu bagi yang tersisa, mereka harus bisa bertahan memperoleh air bersih setiap harinya dari sumur ini. Selain itu, sumur ini juga merupakan saksi bisu dari sebuah kisah romansa sekaligus tragedi kelam yang mengiringinya.
                    """.trimIndent(),
                    jumHal = 206,
                    isbn = "9786020653242"
                ),
                DataBuku(
                    judul = "Laskar Pelangi",
                    penulis = "Andrea Hirata",
                    phtoUrl = "https://www.gramedia.com/blog/content/images/2022/01/img212.jpg",
                    penerbit = "Bentang Pustaka",
                    deskripsi = """Andrea Hirata adalah pemenang pertama penghargaan sastra New York Book Festival 2013 untuk The Rainbow Troops, Laskar Pelangi edisi Amerika, penerbit Farrar, Straus & Giroux, New York, kategori general fiction, dan pemenang pertama Buchawards 2013, Jerman, untuk Die Regenbogen Truppe, Laskar Pelangi edisi Jerman, penerbit Hanser Berlin. Dia juga pemenang seleksi short story majalah sastra terkemuka di Amerika, Washington Square Review, New York University, edisi winter/spring 2011 untuk short story pertamanya Dry Season. Tahun 2015 dia dianugerahi gelar Doktor Honoris Causa di bidang sastra oleh University of Warwick, UK dan Tahun 2017 menerima penghargaan budaya dari pemerintah Perancis untuk karyanya Les Guerriers de L'arc-en-ciel (Laskar Pelangi edisi Prancis, penerbit Mercure de France). Laskar Pelangi telah diadaptasi dalam bentuk film, musikal, lagu, serial TV dan koreografi oleh City Dance Company, Washington, DC serta dilayarkan di Berlinale dan Smithsonian.

Laskar Pelangi telah menjadi international bestseller, diterjemahkan ke-40 bahasa asing, telah terbit dalam 22 bahasa, dan diedarkan di lebih dari 130 negara. Melalui program beasiswa, Hirata meraih Master of Science (Msc) bidang teori ekonomi dari Sheffield Hallam University, UK. Hirata juga mendapat beasiswa pendidikan sastra di IWP (International Writing Program), University of Iowa, USA. Karya Hirata berbahasa Indonesia: Laskar Pelangi, Sang Pemimpi, Edensor, Maryamah Karpov, Padang Bulan, Cinta di dalam Gelas, Sebelas Patriot, Laskar Pelangi Song Book, Ayah, Sirkus Pohon, dan Guru Aini. Karya dalam bahasa asing The Rainbow Troops, Der Träumer, Dry Season. Sejak Tahun 2010, secara mandiri Hirata mempromosikan minat baca, minat menulis, dan mendirikan museum sastra pertama dan satu-satunya di Indonesia, yaitu Museum Kata Andrea Hirata di Belitung.
                    """.trimIndent(),
                    jumHal = 340 ,
                    bahasa = "Indonesia",
                    dimensi = "13  x 20",
                    tanggalTerbit = "2 Februari 2020",
                    berat = 272F,
                    isbn = "9786022916628"
                ),
                DataBuku(
                    judul = "Perjalanan Menuju Pulang",
                    penulis = "Lala Bohang, Lala Noberg",
                    phtoUrl = "https://www.gramedia.com/blog/content/images/2022/01/WhatsApp_Image_2021-07-12_at_16.09.11.jpeg",
                    penerbit = "Gramedia Pustaka Utama",
                    deskripsi = """Di dalam buku “Perjalanan Menuju Pulang”, Lala Bohang dan Lara Nuberg berkisah serta mencoba untuk menelusuri garis keturunan mereka. Dikemas dalam bentuk cerita, surat, serta ilustrasi yang memanjakan mata.

Sinopsis Buku

Perjalanan Menuju Pulang – Kisah Perempuan di Antara Ruang & Waktu menghimpun banyak cerita, surat, ilustrasi, serta pertanyaan yang dieksplorasi bersama oleh Lala Bohang, penulis dan seniman visual Indonesia, dan Lara Nuberg, sejarawan dan penulis Indo Belanda, dalam suatu program yang mempertemukan dan membawa mereka dalam penjelajahan batin yang bermakna.

Apakah kisah kehidupan mereka terkait dengan keberadaan Belanda selama 350 tahun di kepulauan Indonesia? Ataukah sejarah kolonial tersebut nyaris tak meninggalkan jejak dalam kehidupan kedua perempuan muda ini?

Pada saat dunia sudah meninggalkan kolonialisme dan pascakolonialisme, kita memasuki tahap baru dalam sejarah. Di masa depan, imperialisme Eropa akan tampak demikian jauh, seperti kekaisaran Romawi bagi kita sekarang. Pada tahun-tahun mendatang, anak-anak yang dilahirkan pada abad setelah Perang Dunia Kedua akan memandang sejarah dengan lebih luas dan lebih terang. Lala, Lara, beserta buku mereka ini merupakan bukti nyata. – Ayu Utami, penulis.

Dalam masa polarisasi yang melanda seluruh dunia, penting bagi warga negara-negara merdeka yang terbelit dan terjalin oleh kolonisasi berpuluh tahun lalu untuk menjaga jalur dialog terbuka. Dekolonisasi merupakan proses yang jauh lebih panjang ketimbang momen proklamasi kemerdekaan dan perjuangan akan pengakuan yang mengikutinya. Apakah Peranakan yang hidup di negara mantan penjajah menghadapi persoalan yang berbeda perihal akar campuran dan masa lalu mereka dibandingkan dengan Peranakan yang hidup di negara bekas jajahan yang sudah merdeka? Sungguh menarik mengetahui bagaimana dua penulis dari generasi ketiga, Lara (lahir di Belanda) dan Lala (lahir di Indonesia), berdialog tentang ikatan mereka masing-masing dengan masa lalu leluhurnya. – Marion Bloem, penulis.
                    """.trimIndent(),
                    jumHal = 172 ,
                    bahasa = "Indonesia",
                    dimensi = "14.8  x 21.0",
                    tanggalTerbit = "19 Agustus 2021",
                    berat = 0.3F,
                    isbn = "9786020654850"
                ),
                DataBuku(
                    judul = "Tenggelamnya Kapal Van Der Wijck",
                    penulis = " Abdul Malik Karim Amrullah (Buya Hamka)",
                    phtoUrl = "https://www.gramedia.com/blog/content/images/2022/01/img067.jpg",
                    penerbit = "Gema Insani",
                    deskripsi = """Zainuddin, seorang pemuda yang berdarah Minang dari ayah dan berdarah Bugis dari ibu–dengan hati penuh harapan dan angan akan sambutan gembira dari keluarga ayahnya–dari tanah kelahirannya, Mengkasar, pergi ke Padang Panjang, kampung halaman sang ayah. Namun, apa yang diinginkannya tidak terjadi. Di kampung halaman dan oleh keluarganya dia dianggap orang asing. Ketidaknyamanan hidup di kampung halamannya terobati karena perkenalannya dengan Hayati. Mereka saling jatuh cinta dalam keikhlasan dan kesucian jiwa.

Tenggelamnya Kapal Van Der Wijk merupakan salah satu novel yang cukup populer, saking populernya novel sampai dibuatkan sebuah film dengan judul yang sama dan hasilnya juga cukup banyak penikmat yang semakin suka dengan cerita tersebut. Novel yang ditulis oleh Abdul Malik Karim Amrullah ini berkisah tentang persoalan adat yang berlaku di daerah Minangkabau (Sumatera Barat). Selain masalah adat, dalam novel ini juga digambarkan tentang adanya diskriminasi yang terjadi di masyarakat Minangkabau pada waktu itu.
Perbedaan latar belakang / status sosial yang menghalangi kisah cinta dua anak manusia bernama Hayati dan Zainudin hingga berakhir dengan kematian tragis berupa tenggelam dalam sebuah kapal yang mereka berdua naiki saat itu. Dalam novel ini terdapat banyak majas-majas yang digunakan terutama oleh Zainudin saat sedang bercakap.
                    """.trimIndent(),
                    jumHal = 268 ,
                    bahasa = "Indonesia",
                    dimensi = "14.5  x 20.5",
                    tanggalTerbit = "4 Desember 2017",
                    berat = 0.28F,
                    isbn = "9786022504160"
                )
            )
        }
    }
}
