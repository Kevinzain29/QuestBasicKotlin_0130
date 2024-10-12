package com.example.activity1_0130

class Motor()

class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "mary@gmail.com")

    println(contact.email)

    contact.email = "jane@gmail.com"

    println(contact.email)
}