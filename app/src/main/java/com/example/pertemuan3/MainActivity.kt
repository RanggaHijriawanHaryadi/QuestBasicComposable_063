package com.example.pertemuan3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pertemuan3.ui.theme.Pertemuan3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pertemuan3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicComposble(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BasicComposble(modifier: Modifier = Modifier){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Login",
            style = TextStyle(
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
            )
        )
        Text(
            text = "Ini adalah halaman login",
            fontSize = 20.sp,
        )

        Image(painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier.size(300.dp).padding(20.dp))//atau""
        Text(
            text = "Nama ",
            style = TextStyle(
                fontSize = 20.sp,
            )
        )
        Text(
            text = "Rangga Hijriawan Haryadi",
            fontSize = 15.sp,
            color = Color.Red,
        )
        Text(
            text = "20220140063",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
        )
        Image(painter = painterResource(id = R.drawable.a),
            contentDescription = null,
            modifier = Modifier.size(400.dp).padding(2.dp).clip(CircleShape))
    }
    //Text(text = "Hallo android")
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier){
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Pertemuan3Theme {
        Greeting("Android")
    }
}