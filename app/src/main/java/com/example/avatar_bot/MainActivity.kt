package com.example.avatar_bot

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import android.os.Bundle
import androidx.compose.foundation.background
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFF3F6FA)
                ) {
                    PresentationCard()
                }
            }
        }
    }
}

@Composable
fun PresentationCard() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        // Fondo dividido en dos mitades horizontales
        Column(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color.Black) // Color de la mitad superior
            )
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .background(Color(0xFFD390C8)) // Color de la mitad inferior
            )
        }
        Card(
            modifier = Modifier
                .width(340.dp)
                .wrapContentHeight(),
            shape = RoundedCornerShape(24.dp),
            elevation = 8.dp,
            backgroundColor = Color.White
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(24.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.avatar),
                    contentDescription = "Avatar Bot",
                    modifier = Modifier
                        .size(130.dp)
                        .clip(RoundedCornerShape(18.dp)),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Mariii Sants",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFD390C8)
                )
                Text(
                    text = "Ingeniería en Software",
                    fontSize = 16.sp,
                    color = Color.Gray
                )
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    text = "Contacto: marisanti@gmail.com",
                    fontSize = 14.sp,
                    color = Color.DarkGray
                )
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    text = "Redes sociales:",
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFFD390C8)
                )
                Text(text = "LinkedIn: linkedin.com/in/mari")
                Text(text = "GitHub: github.com/mari")
                Text(text = "Instagram: @mari.s")
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    text = "Habilidades:",
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFFD390C8)
                )
                Text(text = "• Android (Kotlin, Compose)")
                Text(text = "• SQL, figma")
                Text(text = "• Python")
                Text(text = "• Habilidades blandas")
            }
        }
    }
}
