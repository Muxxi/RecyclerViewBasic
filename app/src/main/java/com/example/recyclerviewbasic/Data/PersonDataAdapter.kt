package com.example.recyclerviewbasic.Data

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewbasic.GalleryActivity
import com.example.recyclerviewbasic.Model.PersonDetails
import com.example.recyclerviewbasic.R


class PersonDataAdapter(private var list : ArrayList<PersonDetails> ,
                        private var context: Context) : RecyclerView.Adapter<PersonDataAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.listrow_style,parent,false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(list[position])
    }

    inner class ViewHolder(var item : View) : RecyclerView.ViewHolder(item) {

        fun bindData(person : PersonDetails){
            var img : ImageView = item.findViewById(R.id.imageView)
            var name : TextView = item.findViewById(R.id.tvName)
            var age : TextView = item.findViewById(R.id.tvAge)

            img.setImageResource(person.img)
            name.text = person.name
            age.text = person.age.toString()

            item.setOnClickListener {
                Toast.makeText(context,name.text,Toast.LENGTH_SHORT).show()
                val intent = Intent(context,GalleryActivity::class.java)
                intent.putExtra("Image",person.img)
                intent.putExtra("Name",person.name)
                context.startActivity(intent)
            }

        }

    }

}