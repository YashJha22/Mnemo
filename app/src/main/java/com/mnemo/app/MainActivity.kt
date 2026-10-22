package com.mnemo.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.mnemo.app.ui.DeckViewModel
import com.mnemo.app.ui.theme.MnemoTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.material3.Text
import com.mnemo.app.data.local.DeckRepository
import com.mnemo.app.data.local.MnemoDatabase
import com.mnemo.app.ui.DeckViewModelFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val database = MnemoDatabase.getDatabase(this)
        val repository = DeckRepository(database.deckDao())
        val factory = DeckViewModelFactory(repository)

        setContent {
            MnemoTheme {
                val viewModel: DeckViewModel = viewModel(factory = factory)
                Scaffold(modifier = Modifier.fillMaxSize())
                { innerPadding ->
                    Text(
                        text = "Mnemo",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

