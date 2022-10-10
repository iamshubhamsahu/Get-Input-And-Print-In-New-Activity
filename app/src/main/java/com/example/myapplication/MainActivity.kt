package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {

    private lateinit var btnSendData : Button
    private lateinit var edit_name : EditText
    private lateinit var edit_fathername : EditText
    private lateinit var edit_mothername : EditText
    private lateinit var edit_address : EditText
    private lateinit var edit_mobile : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSendData = findViewById(R.id.save)
        edit_name = findViewById(R.id.edit_Name)
        edit_fathername = findViewById(R.id.edit_Fathername)
        edit_mothername = findViewById(R.id.edit_Mothername)
        edit_address = findViewById(R.id.edit_Address)
        edit_mobile = findViewById(R.id.edit_Mobile)
        btnSendData.setOnClickListener{
            startActivity(Intent(this,SecondActivity::class.java)
                .putExtra("username",edit_name.text.toString())
                .putExtra("fathername",edit_fathername.text.toString())
                .putExtra("mothername",edit_mothername.text.toString())
                .putExtra("address",edit_address.text.toString())
                .putExtra("mobile",edit_mobile.text.toString()))




        }

        edit_mobile.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
                if (mobileValidate(edit_mobile.text.toString()))
                    btnSendData.isEnabled = true
                else{
                    btnSendData.isEnabled = false
                    edit_mobile.setError("Invalid Mobile")

                }
            }
        })

    }

    private fun mobileValidate(text: String?): Boolean {
        var p = Pattern.compile("[6-9][0-9]{9}")
        var m = p.matcher(text)
        return m.matches()

    }
}