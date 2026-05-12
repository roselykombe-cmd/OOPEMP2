package com.example.oopkotlinapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.oopkotlinapp.ui.theme.OOPKotlinAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OOPKotlinAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
package com.example.oopkotlinapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create a new Person object
        val person = Person()

        // Set values using setters
        person.setName("Alice")
        person.setAge(25)
        person.setAddress("123 Kotlin Street")

        // Access values using getters
        Log.d("OOPKotlinApp", "Name: ${person.getName()}")
        Log.d("OOPKotlinApp", "Age: ${person.getAge()}")
        Log.d("OOPKotlinApp", "Address: ${person.getAddress()}")
    }
}
package com.example.oopkotlinapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Create a Person object
        val person = Person()
        person.setName("Alice")
        person.setAge(25)
        person.setAddress("123 Kotlin Street")
        Log.d("OOPKotlinApp", "Person Name: ${person.getNameWithTitle()}")

        // Create an Employee object
        val employee = Employee()
        employee.setName("Bob")
        employee.setAge(30)
        employee.setAddress("456 Android Avenue")
        employee.setEmployeeId("EMP001")
        employee.setDepartment("Engineering")

        // Using overridden method
        Log.d("OOPKotlinApp", "Employee Name with Title: ${employee.getNameWithTitle()}")
        Log.d("OOPKotlinApp", "Employee ID: ${employee.getEmployeeId()}")
        Log.d("OOPKotlinApp", "Department: ${employee.getDepartment()}")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    OOPKotlinAppTheme {
        Greeting("Android")
    }
}