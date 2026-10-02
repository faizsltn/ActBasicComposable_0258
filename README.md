# 🚀 ActBasicComposable - Tugas Praktikum Jetpack Compose

Aplikasi Android sederhana yang dibangun menggunakan **Jetpack Compose** untuk memenuhi tugas praktikum Pemrograman Aplikasi Bergerak. Proyek ini menampilkan tata letak UI modern, modular, dan terstruktur dengan menyatukan elemen gambar, teks, serta identitas mahasiswa.

---

## 👨‍💻 Identitas Mahasiswa

* **Nama**: Faiz Sulthon Daud Muhammad
* **NIM**: 20240140258
* **Program Studi**: Teknologi Informasi / Teknik
* **Instansi**: Universitas Muhammadiyah Yogyakarta

---

## 📱 Fitur & Tampilan UI

Aplikasi ini menggunakan pendekatan **Modular Composable Architecture** yang terdiri dari:

* **Background Layer**: Menampilkan gambar latar belakang *full-screen* (`gedung`) dengan `ContentScale.Crop`.
* **HeaderSection**: Komponen judul dan subjudul aplikasi.
* **LogoSection**: Menampilkan logo resmi Universitas Muhammadiyah Yogyakarta (`logoumy`).
* **IdentitySection**: Menampilkan detail Nama dan NIM dengan custom typography serta warna kontras.
* **ProfileImageSection**: Menampilkan foto profil melingkar (`CircleShape`) berbingkai putih dengan efek *border*.

---

## 🛠️ Teknologi & Tools

| Komponen | Teknologi |
| :--- | :--- |
| **Bahasa Pemrograman** | Kotlin |
| **UI Framework** | Jetpack Compose |
| **IDE** | Android Studio |
| **VCS** | Git & GitHub |

---

## 📂 Struktur Kode Utama

```text
app/src/main/java/com/example/myapplication/
├── MainActivity.kt    # Entry point aplikasi yang memanggil HalamanTugas
└── Tugas.kt           # Implementasi modul UI Jetpack Compose & HalamanTugasPreview
