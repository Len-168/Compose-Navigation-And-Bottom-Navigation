package com.example.onlineshopping.feature.LoginRoute

import android.util.Log
import androidx.lifecycle.ViewModel

class LoginVM : ViewModel() {
    fun Login(username: String) {
        Log.d("Message", username)
    }
}