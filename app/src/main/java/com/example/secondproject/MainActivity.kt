package com.example.secondproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.secondproject.ui.theme.SecondProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SecondProjectTheme {
                MiniAgeCheckerLayout()
                }
            }
        }
    }


@Composable
fun MiniAgeCheckerLayout(){
    val names = arrayOf("Mildred", "favour", "Paula", "Maureen")
    val ages = arrayOf(70, 23, 5, 18)

    Column( modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)){
        for ( i in names.indices){
            val name = names[i]
            val age = ages[i]

            Box( modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
            ){
                Column {
                    Text(text = "Name: $name", fontSize = 30.sp)
                    Text(text = "Aga: $age", fontSize= 25.sp)


                    if (age < 18) {
                        Text(text = "$name is a child")
                    } else if (age in 18..60) {
                        Text(text = "$name is an adult")
                    } else {
                        Text(text = "$name is a senior")
                    }
                }
            }
        }
    }
    
}


@Preview
@Composable
fun Preview(){
    
}