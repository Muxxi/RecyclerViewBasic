package com.example.recyclerviewbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewbasic.Data.PersonDataAdapter
import com.example.recyclerviewbasic.Model.PersonDetails
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: PersonDataAdapter
    private lateinit var personListData : ArrayList<PersonDetails>
    private lateinit var layoutManager : RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        personListData = ArrayList<PersonDetails>()
        personListData.add(PersonDetails(R.drawable.boy,"Muzammil",21))
        personListData.add(PersonDetails(R.drawable.girl,"Alishba",39))
        personListData.add(PersonDetails(R.drawable.woman,"Jamela",63))
        personListData.add(PersonDetails(R.drawable.old,"Jameel",78))
        personListData.add(PersonDetails(R.drawable.oldfemale,"Hayat",68))

        layoutManager = LinearLayoutManager(this)
        adapter = PersonDataAdapter(personListData,this)

        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = adapter




    }
}
