package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val foods: ArrayList<Food> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val food = ArrayList<Food>()
        food.add(Food("Coffee", R.string.coffee, R.drawable.coffee_pot))
        food.add(Food("Espresso", R.string.espersso, R.drawable.espresso))
        food.add(Food("French fries", R.string.frenchFires, R.drawable.french_fries))
        food.add(Food("Honey", R.string.honey, R.drawable.honey))
        food.add(Food("Icecream", R.string.icecream, R.drawable.strawberry_ice_cream))
        food.add(Food("Sugar", R.string.sugarcubes, R.drawable.sugar_cubes))

        // Set the Layout Manager
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        // Create an object for the MyAdapter
        val adapter = MyAdapter(food)
        recyclerView.adapter = adapter
    }
}