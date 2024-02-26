package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class BookAdapter(private val books: List<Book>) : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    class BookViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val authorView: TextView = view.findViewById(R.id.author)
        val genreView: TextView = view.findViewById(R.id.genre)
        val titleView: TextView = view.findViewById(R.id.title)
        val circulationView: TextView = view.findViewById(R.id.circulation)
        val imageView: ImageView = view.findViewById(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.book_item, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = books[position]
        holder.authorView.text = book.author
        holder.genreView.text = book.genre
        holder.titleView.text = book.title
        holder.circulationView.text = book.circulation.toString()
        holder.imageView.setImageResource(book.imageResId)
    }

    override fun getItemCount() = books.size
}
