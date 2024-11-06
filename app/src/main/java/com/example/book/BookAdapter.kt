package com.example.book

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter constructor(
    private val getActivity: MainActivity,
    private val bookList: List<Book>) :


    RecyclerView.Adapter<BookAdapter.MyViewHolder>() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.book_list, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: MyViewHolder,
        position: Int
    ) {
        holder.rvBookTitle.text = bookList[position].title
        holder.rvBookImg.setImageResource(bookList[position].image)
        holder.CardView.setOnClickListener{
            Toast.makeText(getActivity, bookList[position].title, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return bookList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val rvBookTitle : TextView = itemView.findViewById(R.id.rvBookTitle)
        val rvBookImg : ImageView = itemView.findViewById(R.id.rvBookImg)
        val CardView : CardView = itemView.findViewById(R.id.CardView)

    }


}