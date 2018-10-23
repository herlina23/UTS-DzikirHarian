# UTS-DzikirHarian
Tugas UTS Android Menggunakan Fragments, Image processing library &amp; Firebase Cloud Messaging Notification
Aplikasi ini memiliki 3 fitur,
1. Dzikir harian menggunakan fragment
2. Mood hari ini, kita daapt melihat quote islami hari ini dengan foto selfie kita (menggunakan library google vision)
3. Notifikasi pengingat dzikir menggunakan FCM

Nama Aplikasi		: Dzikir Harian
Anggota		: 
-	Ferdi Septarianto H	1541180202 /11
-	Herlina Prastiwi		1541180166 / 13
-	TI-4E

1.	Splashscreen : sebagai halaman awal pembuka aplikasi
2.	Main activity : class ini berisi 3 button yang akan menyambungkan link ke halam lainnya
3.	Fragment : class yang mengatur fragment orientation yang dipengaruhi rotation dan juga memgatur fragment transaction
4.	DzikirMenuFragment :  Class Fragment berisi method untuk list view menu dzikir 
5.	DzikirDetailFragment :  Class Fragment berisi method untuk list view detail dzikir 
6.	Dzikir : Class yang berisi data yang akan ditampilkan pada fragment dzikir harian untuk list dan detail.
7.	Emoticon : class yang mengatur pengaturan camera utk capture gambar dan menyimpannya di file lokal
8.	Emojifier : class yang berisi tentang pengaturan pendeteksian wajah dan pemberian emoji yang cocok dengan ekspresi wajah
9.	BitmapUtils : class yang mengatur pengaturan gambar berupa ukuran dan format file dan penyimpanan
10.	Fbs : class yang akan menampilkan pesan berupa title dan body yang dikirim dengan notifikasi FCM
11.	MyFirebaseMessagingService : class yang mengatur request token dan menerima pesan dari FCM
12.	MyNotificationManager : class yang berfungsi untuk megatur notifikasi dari FCM

Spesifikasi perangkat :
Minimal menggunakan Android 6.0 (API Level 23)  Jelly Bean
MIT License
MIT license adalah lisensi perangkat lunak bebas guna yang berasal dari Massachusetts Institute of Technology (MIT). Lisensi ini ringkas dan to the point. Lisensi ini membolehkan pengguna untuk melakukan apapun pada kode program seperti pada Apache License. Lisensi ini hanya mewajibkan pengguna untuk menyertakan lisensi dan copyright si pembuat pada kode yang didistribusikan ulang dan tidak ada larangan untuk menggunakan trademark dari si pembuat asli. Selain itu pengguna juga tidak berhak untuk menuntut si pembuat ketika terjadi kerusakan pada perangkat lunak tersebut.

