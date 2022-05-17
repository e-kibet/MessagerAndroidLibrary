package com.ekibet.messagerandroidlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var messagerAndroidLibraryImpl: MessagerAndroidLibraryImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * implementation of the toast
         */
        messagerAndroidLibraryImpl.iToast(this, "Successful response")

        /**
         * @author evans
         * implementation of the snackbar
         */

        //messagerAndroidLibraryImpl.iSnackbar(View(this@MainActivity), "Showing A Snackbar messsage")

    }
}