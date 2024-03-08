package com.example.ernstapp

object SameStatyzcneRzeczy {
  fun String.hexStringToByteArray(): ByteArray {
    return this.chunked(2)
      .map { it.toInt(16).toByte() }
      .toByteArray()
  }
}