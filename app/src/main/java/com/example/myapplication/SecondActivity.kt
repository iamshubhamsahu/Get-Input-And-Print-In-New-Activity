package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.myapplication.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var textname : TextView
    private lateinit var textfathername : TextView
    private lateinit var textmothername : TextView
    private lateinit var textaddress : TextView
    private lateinit var textmobile : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textname = findViewById(R.id.edit_savename)
        textfathername = findViewById(R.id.edit_savefathername)
        textmothername = findViewById(R.id.edit_savemothername)
        textaddress = findViewById(R.id.edit_saveaddress)
        textmobile = findViewById(R.id.edit_savemobile)

        val username = intent.getStringExtra("username")
        val fathername = intent.getStringExtra("fathername")
        val mothername = intent.getStringExtra("mothername")
        val address = intent.getStringExtra("address")
        val mobile = intent.getStringExtra("mobile")

        textname.text = "Name : "  +username
        textfathername.text = "Father Name : "  +fathername
        textmothername.text = "Mother Name : "  +mothername
        textaddress.text = "Address : "  +address
        textmobile.text = "Mobile : "  +mobile

    }
}


