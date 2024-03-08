package com.example.ernstapp

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.net.URL
import javax.net.ssl.HttpsURLConnection

class ApiHandler {

  companion object {
    suspend fun fetchRandomUserData(): String {
      val url = URL("https://randomuser.me/api/")
      val connection = url.openConnection() as HttpsURLConnection
      return withContext(Dispatchers.IO) {
        connection.inputStream.bufferedReader().use { it.readText() }
      }
    }
  }


}