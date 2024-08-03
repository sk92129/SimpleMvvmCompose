package com.seankang.simplemvvmcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.seankang.simplemvvmcompose.di.appModules
import com.seankang.simplemvvmcompose.view.theme.SimpleMvvmComposeTheme
import com.seankang.simplemvvmcompose.view.PetList
import org.koin.compose.KoinApplication

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleMvvmComposeTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { 
                                Text(text = "Pets")
                            },
                            colors =  TopAppBarDefaults.topAppBarColors(
                                containerColor = MaterialTheme.colorScheme.primary,
                            )
                        )
                    },
                    content =  { paddingValues ->
                        PetList(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(paddingValues)
                        )
                    }
                )
            }
        }
    }
}


/**
 * Using preview with Koin DI .
 * https://medium.com/tech-takeaways/koin-dependent-composable-previews-in-android-jetpack-compose-dd25f57108ec
 *
 */
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun MainPreview() {

    KoinApplication(
        application = { modules(appModules) }
    ) {
        PetList(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        )
    }



}
