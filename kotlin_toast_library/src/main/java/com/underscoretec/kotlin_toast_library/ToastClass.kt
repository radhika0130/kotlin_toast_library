package com.underscoretec.kotlin_toast_library

import android.content.Context
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ToastClass :AppCompatActivity(){

    companion object {
        @JvmStatic

        fun s(c: Context, msg: String) {

            val myToast = Toast.makeText(c, msg, Toast.LENGTH_SHORT)
            myToast.show()

        }
    }

}