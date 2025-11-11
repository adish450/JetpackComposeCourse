package com.androidstudioprojects.corecomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.androidstudioprojects.corecomposeapplication.ui.theme.CoreComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoreComposeApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    Surface(color = Color.Cyan,
        modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    HorizontalColoredBar(Color.Red)
                    HorizontalColoredBar(Color.Black)
                }
                HorizontalColoredBar(Color.Blue)
                HorizontalColoredBar(Color.Magenta)
                HorizontalColoredBar(Color.Green)
                HorizontalColoredBar(Color.Yellow)
            }
    }
}

@Composable
fun HorizontalColoredBar (color: Color) {
    Surface(color = color,
        modifier = Modifier.size(600.dp, 100.dp)) { }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CoreComposeApplicationTheme {
        MainScreen()
    }
}