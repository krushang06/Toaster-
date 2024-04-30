package com.example.mytoasty

import android.content.Context
import android.widget.Toast

object Toaster {
    fun s(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}