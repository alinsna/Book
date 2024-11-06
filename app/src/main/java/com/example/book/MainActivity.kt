package com.example.book

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var bookAdapter: BookAdapter
    private val bookList = mutableListOf<Book>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rvBookList)
        bookAdapter = BookAdapter(this, bookList)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = bookAdapter

        prepareBukuListData()
    }

    private fun prepareBukuListData() {
        bookList.add(Book("The Switch", R.drawable.buku1))
        bookList.add(Book("Happy & You Know It", R.drawable.buku2))
        bookList.add(Book("The Sun Is Also A Star", R.drawable.buku3))
        bookList.add(Book("The Midnight Library", R.drawable.buku4))
        bookList.add(Book("Anne", R.drawable.buku5))
        bookList.add(Book("Evvie Drake Starts Over", R.drawable.buku6))
        bookList.add(Book("Love & Gelato", R.drawable.buku7))
        bookList.add(Book("Almendra", R.drawable.buku8))
        bookList.add(Book("Ninth House", R.drawable.buku9))
        bookList.add(Book("Alice Harikalar Diyarinda", R.drawable.buku10))
        bookList.add(Book("Ikigai", R.drawable.buku11))
        bookList.add(Book("Mansfield Park", R.drawable.buku12))

        bookAdapter.notifyDataSetChanged()
    }
}
