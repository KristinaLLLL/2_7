package com.example.a2_7

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    var msg3 = ""
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn : Button = findViewById(R.id.button)
        val edTxt : EditText = findViewById(R.id.editText)
        val text : TextView = findViewById(R.id.textView)
        val checkBox = findViewById<CheckBox>(R.id.checkBox)
        var msg1 = ""
        var msg2 = ""
        btn.setOnClickListener(){
            val t1: String = "EditText: " + edTxt.getText().toString()


            text.setText( t1 + "\n" + msg1 + "\n" + msg2 + "\n" + msg3)
        }

        val toggleButton : ToggleButton = findViewById(R.id.toggleButton)
        toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // The toggle is enabled/checked
                msg2 = "ToggleButton: ON"
            } else {
                // The toggle is disabled
                msg2 = "ToggleButton: OFF"
            }
        }

        checkBox?.setOnCheckedChangeListener{buttonView, isChecked ->
            msg1 = "CheckBox: " + (if (isChecked) "ON" else "OFF")}
    }

    fun onClicked1(view: View) {
        msg3 = "RadioGroup: RadioButton 1"
    }
    fun onClicked2(view: View) {
        msg3 = "RadioGroup: RadioButton 2"
    }
}