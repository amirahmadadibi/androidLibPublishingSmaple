package com.eddietest.mylibrary

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun ComposeTest(){
    Box(
     modifier = Modifier.clip(RoundedCornerShape(16.dp)).size(100.dp).background(Color.Red)
    )
}

object ToastUtil {

    fun show(
        context: Context,
        message: String,
        lengthLong: Boolean = false
    ) {
        Toast.makeText(
            context,
            message,
            if (lengthLong) Toast.LENGTH_LONG else Toast.LENGTH_SHORT
        ).show()
    }

}