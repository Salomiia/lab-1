package com.example.animals

import Animal
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val animal = intent.getParcelableExtra<Animal>("animal")

        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageResource(animal?.imageId ?: R.drawable.ic_launcher_background)

        val nameView = findViewById<TextView>(R.id.nameView)
        nameView.text = animal?.name ?: "No Name"

        val shortD = findViewById<TextView>(R.id.shortD)
        shortD.text = animal?.shortDescription ?: "No Description"

        val descriptionView = findViewById<TextView>(R.id.descriptionView)
        descriptionView.text = animal?.detailedDescription ?: "No Description"
    }
}

