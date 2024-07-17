package dev.josegaldamez.counterlivedata.counter.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.Observer
import androidx.lifecycle.compose.LocalLifecycleOwner
import dev.josegaldamez.counterlivedata.counter.viewmodel.CounterViewModel

@Composable
fun CounterValue(counterViewModel: CounterViewModel) {

    var localCounterValue by rememberSaveable {
        mutableIntStateOf(0)
    }

    counterViewModel.counter.observe(LocalLifecycleOwner.current) { newValue ->
        localCounterValue = newValue
    }

    Text(text = localCounterValue.toString(),
        fontSize = 50.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding( vertical = 54.dp))
}