package com.example.shadows

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.shadows.ui.theme.ShadowsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShadowsTheme {

            }
        }
    }
}

@Composable
fun Greeting() {
    Surface(color = MaterialTheme.colors.background) {
        Greeting()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ShadowsTheme {
        Greeting()
    }
}