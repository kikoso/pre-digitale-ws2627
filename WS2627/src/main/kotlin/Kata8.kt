package org.example

data class City(val name: String) {
    override fun toString(): String {
        return name
    }
}

data class Product(val name: String, val price: Double) {
    override fun toString(): String {
        return "'$name for '$price'"
    }
}

data class Order(val products: List<Product>, val isDelivered: Boolean)

data class Customer(val name: String, val city: City, val orders: List<Order>) {
    override fun toString(): String {
        return "'$name from '$city'"
    }
}

data class Shop(val name: String, val customers: List<Customer>)

fun Shop.getSetOfCustomers(): Set<Customer> = TODO()