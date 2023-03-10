package com.example.jetpackcompase_list.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetpackcompase_list.R
import com.example.jetpackcompase_list.response.SampleData
import com.example.jetpackcompase_list.ui.theme.Purple500

@Composable
fun SampleDataDetails(data:SampleData){
    Column (horizontalAlignment = Alignment.CenterHorizontally
        ,verticalArrangement = Arrangement.Center
        ,modifier = Modifier.fillMaxWidth()){
        Column(modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Purple500),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) { 
            Text(text = "JetpackCompose List Detail",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.padding(20.dp))

        Image(painterResource(id = R.drawable.icon), contentDescription = "Image" ,modifier = Modifier
            .width(70.dp)
            .height(70.dp)
            .clip(RoundedCornerShape(5.dp)))
        
        Text(text = data.name, fontSize = 15.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.padding(5.dp))
        Text(text =data.desc, fontSize = 15.sp,fontWeight=FontWeight.Normal)


    }
}