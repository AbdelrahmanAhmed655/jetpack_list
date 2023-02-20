package com.example.jetpackcompase_list

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jetpackcompase_list.response.SampleData
import com.example.jetpackcompase_list.ui.theme.JetpackCompase_ListTheme
import com.example.jetpackcompase_list.view.SampleDataDetails
import com.example.jetpackcompase_list.view.SampleList
import com.google.gson.Gson

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompase_ListTheme {
                navigatePage()

            }
        }
    }
    @Composable
    fun navigatePage() {
        val navHostController= rememberNavController()
        NavHost(navController = navHostController, startDestination = "sample_data" ){
            composable("sample_data"){ SampleList(navController = navHostController)}
            composable("sample_detail/{item}", arguments = listOf(
                navArgument("item"){
                    type= NavType.StringType
                }
            )){
                    backStackEntry ->
                backStackEntry?.arguments?.getString("item")?.let {
                        json->
                    val item=Gson().fromJson(json, SampleData::class.java)
                    SampleDataDetails(data = item )
                }
            }

        }
    }


}



