package com.jetbrains.handson.httpapi.models

import kotlinx.serialization.Serializable
//Instead of doing a post, just putting in some dummy data here
val orderStorage = listOf(Order(
    "2020-04-05-01", listOf(
        OrderItem("Ham Sandwich", 2, 5.50),
        OrderItem("Water",1, 1.50),
        OrderItem("Beer", 3, 2.50),
        OrderItem("Cookie", 1, 3.75)
    )),
    Order("2020-04-06-01", listOf(
        OrderItem("Cheeseburger", 1, 5.50),
        OrderItem("Fries", 2, 2.50),
        OrderItem("Coke", 1, 1.00),
        OrderItem("Shake", 1, 5.50)
    ))
)

@Serializable
data class Order(val number: String, val contents: List<OrderItem>)

@Serializable
data class OrderItem(val item: String, val amount: Int, val price: Double)
