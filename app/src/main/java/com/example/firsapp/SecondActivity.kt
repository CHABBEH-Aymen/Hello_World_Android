package com.example.firsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.firsapp.ui.theme.FirsAppTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirsAppTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    Page(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Page(modifier: Modifier = Modifier)
{
    Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        Image(painter = painterResource(R.drawable.androidparty), contentDescription = "Hello", contentScale = ContentScale.Crop, alpha = 0.8F)
        Text("Happy Birth Day Ayoub!", fontSize = 60.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
    }
}
