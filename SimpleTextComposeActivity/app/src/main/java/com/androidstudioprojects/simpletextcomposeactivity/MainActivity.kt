package com.androidstudioprojects.simpletextcomposeactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.androidstudioprojects.simpletextcomposeactivity.ui.theme.SimpleTextComposeActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleTextComposeActivityTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingButton("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun GreetingButton(name: String) {
    Button({ /*TODO*/ }){
        Greeting(name)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() { // tells the compiler that this is a preview function used to simulate as it would be in the main activity
    SimpleTextComposeActivityTheme { // make sure the code is same as the main activity so that it can be previewed exactly the same as the main activity
        Greeting("Android")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingButtonPreview() { // tells the compiler that this is a preview function used to simulate as it would be in the main activity
    SimpleTextComposeActivityTheme { // make sure the code is same as the main activity so that it can be previewed exactly the same as the main activity
        GreetingButton("Android")
    }
}