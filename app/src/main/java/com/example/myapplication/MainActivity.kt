package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {

    private lateinit var bookAdapter: BookAdapter
    private lateinit var bookList: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val books = listOf(
            Book("Author1", "Genre1", "Title1", 5000, R.drawable.book1),
            Book("Author2", "Genre2", "Title2", 8000, R.drawable.book2),
            Book("Author2", "Genre2", "Title2", 11000, R.drawable.book2),
        ).filter { it.circulation <= 10000 }

        bookList = findViewById(R.id.bookList)
        bookAdapter = BookAdapter(books)
        bookList.layoutManager = LinearLayoutManager(this)
        bookList.adapter = bookAdapter
    }
}