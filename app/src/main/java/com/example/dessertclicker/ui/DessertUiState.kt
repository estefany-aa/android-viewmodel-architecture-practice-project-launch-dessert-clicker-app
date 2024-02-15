package com.example.dessertclicker.ui

import com.example.dessertclicker.data.Datasource
import com.example.dessertclicker.data.Datasource.dessertList

data class DessertUiState(
    var revenue : Int = 0,
    var dessertsSold : Int = 0,
    val currentDessertIndex : Int = 0,
    val currentDessertPrice : Int =  dessertList[currentDessertIndex].price,
    val currentDessertImageId : Int = dessertList[currentDessertIndex].imageId
)