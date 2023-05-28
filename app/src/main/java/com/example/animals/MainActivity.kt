package com.example.animals

import Animal
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animals = listOf(
            Animal(
                R.drawable.elephant,
                "Слон",
                "Великий і дружелюбний травоїдний",
                "Слони - це найбільші суходолі тварини на Землі. Вони відомі своїм великим розумом, сильною пам'яттю та вражаючою довговічністю. Слони мають унікальну структуру соціальних зв'язків, проживаючи в сімейних групах, що складаються з самиць та їхніх дітей. Матері-слонихи показують неймовірну турботу про своїх малюків, виховуючи їх протягом багатьох років."
            ),
            Animal(
                R.drawable.lion,
                "Лев",
                "Відважний цар тварин",
                "Леви - це одні з найбільших хижаків на Землі та вони по праву заслуговують на назву 'царів тварин'. Вони живуть у групах, відомих як прайди, що складаються з самиць та їхніх дітей, та одного або кількох самців. Леви - це вражаючі тварини з потужними тілами, гучними ревами та великими гривами у самців. Вони є символами відваги та сили."
            ),
            Animal(
                R.drawable.penguin,
                "Пінгвін",
                "Милий і холодолюбний птах",
                "Пінгвіни - це група водоплавних, крилатих тварин, що не вміють літати, і вони проживають переважно у південній півкулі, особливо в Антарктиці. Вони відрізняються своєю чорно-білою окрасою та незграбним ходом на суші. Однак під водою вони перетворюються на граціозних плавців, які можуть швидко пересуватися у пошуках їжі."
            )
        )


        val imageView1 = findViewById<ImageView>(R.id.image1)
        imageView1.setImageResource(animals[0].imageId)

        val nameView1 = findViewById<TextView>(R.id.name1)
        nameView1.text = animals[0].name

        val descriptionView1 = findViewById<TextView>(R.id.description1)
        descriptionView1.text = animals[0].shortDescription

        val imageView2 = findViewById<ImageView>(R.id.image2)
        imageView2.setImageResource(animals[1].imageId)

        val nameView2 = findViewById<TextView>(R.id.name2)
        nameView2.text = animals[1].name

        val descriptionView2 = findViewById<TextView>(R.id.description2)
        descriptionView2.text = animals[1].shortDescription

        val imageView3 = findViewById<ImageView>(R.id.image3)
        imageView3.setImageResource(animals[2].imageId)

        val nameView3 = findViewById<TextView>(R.id.name3)
        nameView3.text = animals[2].name

        val descriptionView3 = findViewById<TextView>(R.id.description3)
        descriptionView3.text = animals[2].shortDescription


        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("animal", animals[0])
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("animal", animals[1])
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("animal", animals[2])
            startActivity(intent)
        }

    }
}
