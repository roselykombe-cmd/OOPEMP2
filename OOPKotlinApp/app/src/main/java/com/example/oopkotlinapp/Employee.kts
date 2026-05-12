package com.example.oopkotlinapp

class Employee : Person() {

    // Additional properties
    private var employeeId: String = ""
    private var department: String = ""

    // Getter and Setter for employeeId
    fun getEmployeeId(): String = employeeId
    fun setEmployeeId(newId: String) {
        employeeId = newId
    }

    // Getter and Setter for department
    fun getDepartment(): String = department
    fun setDepartment(newDept: String) {
        department = newDept
    }

    // Override method from Person
    override fun getNameWithTitle(): String {
        return "Employee: ${getName()}" // Adds a job title prefix
    }
}