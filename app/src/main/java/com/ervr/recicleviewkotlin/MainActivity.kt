package com.ervr.recicleviewkotlin
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val itemList = returnItemList()
        adapter = ItemAdapter(itemList)
        recyclerView.adapter = adapter
    }

    private fun returnItemList(): List<Item> {
        val listItem = mutableListOf<Item>()

        val item1 = Item("Item 1")
        listItem.add(item1)

        val item2 = Item("Item 2", "Descripción del item 2")
        listItem.add(item2)

        val item3 = Item("Item 3")
        listItem.add(item3)

        val item4 = Item("Item 4", "Descripción del item 4")
        listItem.add(item4)

        val item5 = Item("Item 5")
        listItem.add(item5)

        return listItem
    }
}
