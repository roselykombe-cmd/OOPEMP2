package com.example.oopkotlinapp

class Person {

    // Private variables
    private var name: String = ""
    private var age: Int = 0
    private var address: String = ""

    // Getter for name
    fun getName(): String {
        return name
    }

    // Setter for name
    fun setName(newName: String) {
        name = newName
    }

    // Getter for age
    fun getAge(): Int {
        return age
    }

    // Setter for age
    fun setAge(newAge: Int) {
        if (newAge >= 0) { // basic validation
            age = newAge
        } else {
            println("Age cannot be negative")
        }
    }

    // Getter for address
    fun getAddress(): String {
        return address
    }

    // Setter for address
    fun setAddress(newAddress: String) {
        address = newAddress
    }
}

package com.example.oopkotlinapp

open class Person {

    // Private variables
    private var name: String = ""
    private var age: Int = 0
    private var address: String = ""

    // Getter and Setter for name
    fun getName(): String = name
    fun setName(newName: String) {
        name = newName
    }

    // Getter and Setter for age
    fun getAge(): Int = age
    fun setAge(newAge: Int) {
        if (newAge >= 0) age = newAge
        else println("Age cannot be negative")
    }

    // Getter and Setter for address
    fun getAddress(): String = address
    fun setAddress(newAddress: String) {
        address = newAddress
    }

    // Method to be overridden
    open fun getNameWithTitle(): String {
        return getName()
    }
}

