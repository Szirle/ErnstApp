package com.example.ernstapp

import com.example.ernstapp.SameStatyzcneRzeczy.hexStringToByteArray

sealed class Car(name: String, brand: Brand) {

  data class Sedan(val name: String, val seats: Int, val brand: Brand): Car(name, brand)
  data class SUV(val name: String, val offRoadCapability: Boolean, val brand: Brand): Car(name, brand)
  data class Coupe(val name: String, val isSportModel: Boolean, val brand: Brand): Car(name, brand)

  // Nested sealed class for brand to make example more comprehensive
  sealed class Brand(val name: String) {
    object BMW : Brand("BMW")
    object Audi : Brand("Audi")
    object Mercedes : Brand("Mercedes")
    // Add more brands as needed
  }

  fun displayDetails() {
    when (this) {
      is Sedan -> println("Sedan: ${name.hexStringToByteArray()}, Seats: ${seats}, Brand: ${brand.name}")
      is SUV -> println("SUV: $name, Off-road: $offRoadCapability, Brand: ${brand.name}")
      is Coupe -> println("Coupe: $name, Sport Model: $isSportModel, Brand: ${brand.name}")
    }
  }
}
