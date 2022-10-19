package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_recipe.*
import kotlinx.android.synthetic.main.mylist.*

class Recipe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)

        val rIntent = intent
        val title = rIntent.getStringExtra("title")
        foodTitle.text = title
        val recipe = rIntent.getIntExtra("recipe", 0)
        txtrecipe.setText(recipe)
        val imageId = rIntent.getIntExtra("image", 0)
        recipeImage.setImageResource(imageId)
    }
}