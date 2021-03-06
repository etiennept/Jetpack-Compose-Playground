package de.jensklingenberg.jetpackcomposeplayground.ui.samples.other

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.TextFieldValue


@ExperimentalFoundationApi
@Composable
fun TextFieldDemo() {
    Column {
        var state =  TextFieldValue("")
        BasicTextField(
            value = state,
            onValueChange = {value-> state= value  }
        )
        Text("The textfield has this text: "+state)
    }
}