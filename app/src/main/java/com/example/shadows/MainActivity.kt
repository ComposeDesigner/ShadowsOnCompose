package com.example.shadows

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.shadows.ui.theme.ShadowsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShadowsTheme {
                ShadowRenderBlack()


            }
        }
    }
}

@Composable
fun ShadowRenderBlack() {
    Surface(
        color = Color(0xFFFFFFFF),
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(220.dp)
                    .clip(CircleShape)
                    .background(
                        brush = Brush.radialGradient(
                            colors = listOf(
                                Color(0xFFE0F7FA),
                                Color(0xFF4DD0E1),
                                Color(0x0)
                            )
                        )
                    )
                    .padding(0.dp)
                    .graphicsLayer {
                        translationX = 50f
                        translationY = -20f
                        cameraDistance = 5f
                    },
                contentAlignment = Alignment.Center
            ) {
                Card(
                    modifier = Modifier.size(200.dp),
                    shape = CircleShape,
                    backgroundColor = Color(0xFFE0F7FA),
                    elevation = 5.dp
                ) {

                }
            }

        }
    }
}

@Composable
fun ShadowRenderWhite() {
    Surface(
        color = Color(0xFF000000),
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(contentAlignment = Alignment.Center) {

                Card(modifier = Modifier
                    .size(160.dp)
                    .graphicsLayer {
                        alpha = 0.75f
                    }
                    .background(
                        brush = Brush.radialGradient(
                            colors = listOf(
                                Color(0x58EB),
                                Color(0xFF8D8D8D),
                                Color(0xECEFF5)
                            )
                        )
                    ),
                    backgroundColor = Color.Transparent,
                    elevation = 0.dp
                ) {

                }

                Card(
                    modifier = Modifier
                        .size(140.dp)
                        .graphicsLayer {
                            cameraDistance = 1f
                            shape = CircleShape
                        }
                        .offset(x = 10.dp),
                    shape = CircleShape,
                    backgroundColor = Color(0xFF000000),
                    elevation = 10.dp
                ) {

                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DarkShadow() {
    ShadowsTheme {
        ShadowRenderBlack()

    }
}

@Preview(showBackground = true)
@Composable
fun BrightShadow() {
    ShadowsTheme {
        ShadowRenderWhite()
    }
}