package com.example.nusa_guide.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nusa_guide.R
import com.example.nusa_guide.ui.theme.Gray70


@Composable
fun ForgotPasswordScreen() {
    val emailState = remember { mutableStateOf(TextFieldValue()) }


    Box(
        Modifier
            .fillMaxSize()
            .padding(horizontal = 30.dp, vertical = 20.dp)
    ) {
        Text(
            text = "Lupa Kata Sandi?",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Gray70,
            textAlign = TextAlign.Center
        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Spacer(modifier = Modifier.height(16.dp))

        Image(
            painter = painterResource(R.drawable.ic_avatar), // Replace with your drawable resource
            contentDescription = "Avatar",
            modifier = Modifier.height(200.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Masukkan email yang kamu gunakan, kami akan mengirimkan kode OTP ke email yang kamu masukkan",
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            color = Color(0xFF6B7280)
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = emailState.value,
            onValueChange = { emailState.value = it },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Email, contentDescription = null)
            },
            singleLine = true,
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email),
            modifier = Modifier.fillMaxWidth(),

        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* TODO: Add navigation logic */ },
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF469CAD)),
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
        ) {
            Text(text = "Kirim")
        }
    }
}

@Preview
@Composable
fun PreviewForgotPasswordScreen() {
    ForgotPasswordScreen()
}