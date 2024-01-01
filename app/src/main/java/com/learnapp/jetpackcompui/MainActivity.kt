package com.learnapp.jetpackcompui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.learnapp.jetpackcompui.ui.theme.JetpackcompuiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackcompuiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    screenInfo()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun screenInfo() {
    var value1 by remember { mutableStateOf("") }
    var value2 by remember { mutableStateOf("") }
    Column(modifier = Modifier.padding(top=80.dp, bottom=24.dp, start=24.dp, end=24.dp)) {
        Text(
            text = "Sign In",
            style = TextStyle(
                fontSize = 28.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold,
            ),
        );

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = value1,
                onValueChange = { value1 = it },
                label = { Text("Email ID", style = TextStyle(color = Color.Gray),) },
                maxLines = 1,
                textStyle = TextStyle(color = Color.Blue, fontWeight = FontWeight.Bold),
                shape = RoundedCornerShape(100.dp),
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Gray,
                    disabledIndicatorColor = Color.Gray,
                    unfocusedIndicatorColor = Color.Gray,
                    containerColor = Color.White,

                    ),
                modifier = Modifier
                    .padding(bottom = 20.dp, top = 45.dp)
                    .height(60.dp)
                    .width(300.dp),
            );
            OutlinedTextField(
                value = value2,
                onValueChange = { value2 = it },
                label = { Text("Password", style = TextStyle(color = Color.Gray),) },
                maxLines = 1,
                textStyle = TextStyle(color = Color.Blue, fontWeight = FontWeight.Bold),
                shape = RoundedCornerShape(100.dp),
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Gray,
                    disabledIndicatorColor = Color.Gray,
                    unfocusedIndicatorColor = Color.Gray,
                    containerColor = Color.White,

                    ),
                modifier = Modifier
                    .padding(bottom = 0.dp)
                    .height(60.dp)
                    .width(300.dp),
            );

            TextButton(
                modifier = Modifier.padding(start = 190.dp),
                onClick = { }
            ) {
                Text("Forgot Password?")
            }

            Button(
                modifier = Modifier.width(250.dp).height(120.dp).padding(top = 70.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),
                onClick = { }
            ) {
                Text("Submit")
            }

            Row(modifier = Modifier.padding(start = 25.dp, top = 0.dp),
               ){
                Text(
                    modifier = Modifier.padding(end = 0.dp, top = 15.dp),
                    text = "New Here?",
                    style = TextStyle(
                        fontSize = 14.sp,
                        color = Color.Blue,

                    ),
                );

                TextButton(
                    onClick = { }
                ) {
                    Text("Register")
                }
            }
        }//Input Column Scope Ends

    }

    }


