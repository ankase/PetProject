package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.item_deatils.*

class MainActivity : AppCompatActivity() {
    private lateinit var flowerAdapter:FlowerRecyclerAdapter

    val flowerDataBase = listOf(
        Flower("Роза", R.drawable.rose, "Розы — самые популярные виды цветов. Их история очень красочна."),
        Flower("Астра", R.drawable.astra, "Астры, популярный вид цветов, которые у нас считаются осенними."),
        Flower("Хризантема", R.drawable.chrisantem, "Хризантемы — популярный сорт цветов, который возник в Китае более 3000 лет назад."),
        Flower("Георгины", R.drawable.georgin, "Георгины, популярный сорт цветов, которые ярко цветут."),
        Flower("Гвоздики", R.drawable.gvozdiki, "Георгины, популярный сорт цветов, которые ярко цветут."),
        Flower("Крокус", R.drawable.krokus, "Крокусы - популярные цветы, потому что весной они появляются одними из первых."),
        Flower("Пион", R.drawable.pion, "Пионы — всемирно популярные цветы, которые также пользуются особой любовью в Украине и России")
    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        item_container.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_homeFragment_to_detailsFragment)
        }

        recycler_view.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = flowerAdapter
            flowerAdapter.addItems(flowerDataBase)
        }
    }
}



