package com.androidstudioprojects.simpletextcomposeactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!"/*,
        modifier = modifier.width(100.dp).height(40.dp)
        modifier = modifier.size(width = 100.dp, height = 80.dp)
        modifier = modifier.size(size = 100.dp)
        modifier = modifier.fillMaxSize(.5f)
        modifier = modifier.fillMaxWidth(.5f)
        modifier = modifier.fillMaxHeight(.5f)*/
        /*, Modifier
            .width(200.dp)
            .height(240.dp)
            .padding(horizontal = 10.dp, vertical = 10.dp)
            .clickable {}*/,
        Modifier
            .clickable {}
            .padding(horizontal = 10.dp, vertical = 10.dp)
            .width(200.dp)
            .height(240.dp)
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