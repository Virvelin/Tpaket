package com.example.tpaket

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tpaket.ui.theme.CustomTypography

import com.example.tpaket.ui.theme.TpaketTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TpaketTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Tpaket(innerPadding)

                }
            }
        }
    }
}






@Preview(showBackground = true)
@Composable
fun TpaketPreview() {
    TpaketTheme {
        Tpaket(PaddingValues())
    }
}
@Composable
fun Tpaket(innerPadding: PaddingValues) {
    val appModifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)

    Column(
        modifier = Modifier.fillMaxSize().padding(innerPadding),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "My Title",
            style = MaterialTheme.typography.headlineSmall,
            modifier = appModifier
        )

        OutlinedTextField(
            value = "", //
            onValueChange = { }, //
            modifier = appModifier
        )

        Button(
            onClick = { /* jotain */},
            modifier = appModifier
        ) {
            Text(text = "Submit")
        }
    }
}
