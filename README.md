# NavigationLab

Project praktikum Pemrograman Aplikasi Perangkat Bergerak (PAPB) dengan topik Navigation Compose.

## Deskripsi

NavigationLab merupakan aplikasi Android sederhana yang dibuat untuk mempraktikkan konsep navigasi multi-screen menggunakan Jetpack Compose Navigation. Aplikasi memiliki beberapa destination yang dapat diakses dari halaman Home dan menggunakan back stack untuk mengatur perpindahan antarhalaman.

## Fitur

Aplikasi memiliki empat halaman utama:

- **Home** — halaman awal aplikasi dan menu navigasi.
- **Detail** — menampilkan Student ID yang dikirim melalui navigation argument.
- **Profile** — menampilkan informasi profil mahasiswa.
- **About** — menampilkan informasi mengenai aplikasi dan teknologi yang digunakan.

Aplikasi juga menerapkan:

- `NavController`
- `NavHost`
- Route
- Navigation argument
- Back stack
- `popBackStack()`
- Satu `MainActivity` untuk seluruh destination

## Struktur Project

com.example.navigationlab
- MainActivity.kt
- NavigationLabApp.kt
- Routes.kt
- ui
  - theme
    - Color.kt
    - Theme.kt
    - Type.kt
  - screen
    - HomeScreen.kt
    - DetailScreen.kt
    - ProfileScreen.kt
    - AboutScreen.kt

## Navigation Flow

Alur utama aplikasi:

Home → Detail → Profile

Home → Profile

Home → About

Pada halaman Detail, `studentId` dikirim dari Home melalui navigation argument.

Student ID yang digunakan:

`245150201111042`

Karena nilai Student ID cukup besar, argument menggunakan tipe data `Long`.

## Back Stack

Navigation menggunakan back stack untuk menyimpan urutan destination yang telah dibuka.

Contoh alur:

Home → Detail → Profile

Ketika tombol Back ditekan dari Profile:

Profile → Detail

Ketika tombol Back ditekan lagi:

Detail → Home

Perpindahan kembali dilakukan menggunakan `popBackStack()`.

## Teknologi

- Kotlin
- Jetpack Compose
- Android Studio
- Navigation Compose
- Material 3

## Dependency

Navigation Compose yang digunakan:

`implementation("androidx.navigation:navigation-compose:2.9.8")`

## Cara Menjalankan Project

1. Clone repository ini ke komputer.
2. Buka project menggunakan Android Studio.
3. Tunggu proses Gradle Sync selesai.
4. Jalankan aplikasi menggunakan emulator atau perangkat Android.
5. Aplikasi akan dimulai dari halaman Home.

## Hasil Praktikum

Aplikasi berhasil menerapkan navigasi antara Home, Detail, Profile, dan About. Navigation argument berhasil digunakan untuk mengirim Student ID dari Home ke Detail. Tombol Back dan `popBackStack()` juga berhasil mengembalikan pengguna ke halaman sebelumnya sesuai urutan navigasi.

## Identitas

**Nama:** Anindhita Faiza Aulia

**NIM:** 245150201111042

**Program Studi:** Teknik Informatika

**Fakultas:** Fakultas Ilmu Komputer

**Universitas:** Universitas Brawijaya

## Praktikum

**Mata Kuliah:** Pemrograman Aplikasi Perangkat Bergerak

**Modul:** Praktikum 05 — Navigation Compose
