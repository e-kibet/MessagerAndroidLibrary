package com.ekibet.messagerandroidlibrary

import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

class MessagerAndroidLibraryImpl: MessagerAndroidLibrary {

    lateinit var alertDialog: AlertDialog.Builder

    override fun<T> iToast(context: T, message: String){

        Toast.makeText(context as Context, message, Toast.LENGTH_SHORT).show()

    }

    override fun <T> iSnackbar(view: T, message: String) {
        Snackbar.make(view as View, message, Snackbar.LENGTH_SHORT).show()
    }

    override fun <T> iAlertDialog(context: T, title: String, message: String) {
        alertDialog = AlertDialog.Builder(context as Context)
        alertDialog.setTitle(title)
        alertDialog.setMessage(message)

        alertDialog.setPositiveButton("OK"){dialog, which ->

        }

        alertDialog.setNegativeButton("Cancel"){dialog, which ->

        }

        alertDialog.show()
    }
}