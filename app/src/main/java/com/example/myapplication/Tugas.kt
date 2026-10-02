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
