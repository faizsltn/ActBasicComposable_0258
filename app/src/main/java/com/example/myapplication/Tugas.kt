package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

/**
 * Halaman Utama Tugas Praktikum.
 * Menggabungkan gambar latar belakang full-screen dengan overlay elemen UI.
 */
@Composable
fun HalamanTugas(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        // 1. Gambar Background Full Screen
        Image(
            painter = painterResource(id = R.drawable.gedung), // Ganti dengan resource background bangunan/arsitektur
            contentDescription = "Background Halaman Login",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // 2. Container Konten Utama (Posisi Tengah secara Horizontal)
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp)
                .padding(top = 48.dp, bottom = 24.dp)
        ) {
            // Header Section: Judul & Subjudul
            HeaderSection()

            Spacer(modifier = Modifier.height(32.dp))

            // Logo Section: Logo Kampus/Organisasi
            LogoSection()

            Spacer(modifier = Modifier.height(28.dp))

            // Identity Section: Detail Identitas Mahasiswa
            IdentitySection(
                label = "Nama",
                nama = "Faiz Sulthon Daud Muhammad",
                nim = "20240140258"
            )

            Spacer(modifier = Modifier.height(28.dp))

            // Profile Image Section: Gambar Lingkaran di Bagian Bawah
            ProfileImageSection()
        }
    }
}

/**
 * Komponen Header (Judul "Login" dan Subjudul).
 */
@Composable
private fun HeaderSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Login",
            fontSize = 32.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFF0033CC), // Warna Biru Tegas
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = "Ini adalah halaman login,",
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
}

/**
 * Komponen Logo Kampus UMY.
 */
@Composable
private fun LogoSection() {
    Image(
        painter = painterResource(id = R.drawable.logoumy), // Ganti dengan resource logo UMY
        contentDescription = "Logo Universitas Muhammadiyah Yogyakarta",
        modifier = Modifier
            .size(140.dp),
        contentScale = ContentScale.Fit
    )
}

/**
 * Komponen Informasi Identitas (Nama & NIM).
 */
@Composable
private fun IdentitySection(
    label: String,
    nama: String,
    nim: String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        // Label "Nama"
        Text(
            text = label,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFCC0000) // Warna Merah Tegas
        )

        Spacer(modifier = Modifier.height(4.dp))

        // Value Nama Mahasiswa
        Text(
            text = nama,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF0033CC), // Warna Biru
            textAlign = TextAlign.Center
        )