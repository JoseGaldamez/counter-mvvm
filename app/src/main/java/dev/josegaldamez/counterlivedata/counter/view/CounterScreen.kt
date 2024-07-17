package dev.josegaldamez.counterlivedata.counter.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import dev.josegaldamez.counterlivedata.counter.viewmodel.CounterViewModel

@Composable
fun CounterScreen(){


    val counterViewModel = CounterViewModel(LocalContext.current)

    Scaffold { paddingValues ->

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(paddingValues)
                .fillMaxWidth()
        ) {

            CounterValue(counterViewModel)
            CounterButtons(counterViewModel)

        }

    }

}