package com.ekibet.messagerandroidlibrary

interface MessagerAndroidLibrary {

    fun<T> iToast(context: T, message: String)

    fun <T> iSnackbar(view: T, message: String)

    fun <T> iAlertDialog(context: T, title: String, message: String)
}