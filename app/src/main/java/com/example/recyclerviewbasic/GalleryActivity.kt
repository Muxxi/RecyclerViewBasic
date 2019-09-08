package com.example.recyclerviewbasic

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_gallery.*

class GalleryActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        Log.d("Running","Successful Running")

        getDataIntent()
    }

    fun getDataIntent(){

        if(intent.hasExtra("Image") && intent.hasExtra("Name")){

            var bundle : Bundle? = intent.extras
            var img = bundle!!.getInt("Image")
            var name = bundle!!.getString("Name")
            setData(img,name)
        }
    }

    fun setData(imgUrl:Int,imgName:String?){

        image.setImageResource(imgUrl)
        tvName.text = imgName
    }
}

