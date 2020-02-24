package com.example.lightsout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.doneButtonr).setOnClickListener() {
            addNickname(it)
        }
    }

    private fun addNickname (view: View) {
        val editText = findViewById<EditText>(R.id.enter_nickname)
        val nicknameTextView = findViewById<TextView>(R.id.nicknameText)
        val counter = findViewById<TextView>(R.id.clickCounter)
        val clickAmount = findViewById<TextView>(R.id.clickAmount)
        val retry = findViewById<Button>(R.id.retryButton)

        val box1 = findViewById<TextView>(R.id.box_1)
        val box2 = findViewById<TextView>(R.id.box_2)
        val box3 = findViewById<TextView>(R.id.box_3)
        val box4 = findViewById<TextView>(R.id.box_4)
        val box5 = findViewById<TextView>(R.id.box_5)
        val box6 = findViewById<TextView>(R.id.box_6)
        val box7 = findViewById<TextView>(R.id.box_7)
        val box8 = findViewById<TextView>(R.id.box_8)
        val box9 = findViewById<TextView>(R.id.box_9)
        val box10 = findViewById<TextView>(R.id.box_10)
        val box11 = findViewById<TextView>(R.id.box_11)
        val box12 = findViewById<TextView>(R.id.box_12)
        val box13 = findViewById<TextView>(R.id.box_13)
        val box14 = findViewById<TextView>(R.id.box_14)
        val box15 = findViewById<TextView>(R.id.box_15)
        val box16 = findViewById<TextView>(R.id.box_16)
        val box17 = findViewById<TextView>(R.id.box_17)
        val box18 = findViewById<TextView>(R.id.box_18)
        val box19 = findViewById<TextView>(R.id.box_19)
        val box20 = findViewById<TextView>(R.id.box_20)
        val box21 = findViewById<TextView>(R.id.box_21)
        val box22 = findViewById<TextView>(R.id.box_22)
        val box23 = findViewById<TextView>(R.id.box_23)
        val box24 = findViewById<TextView>(R.id.box_24)
        val box25 = findViewById<TextView>(R.id.box_25)


        nicknameTextView.text = editText.text

        editText.visibility = View.GONE
        view.visibility = View.GONE

        nicknameTextView.visibility = View.VISIBLE
        counter.visibility = View.VISIBLE
        clickAmount.visibility = View.VISIBLE
        retry.visibility = View.VISIBLE
        box1.visibility = View.VISIBLE
        box2.visibility = View.VISIBLE
        box3.visibility = View.VISIBLE
        box4.visibility = View.VISIBLE
        box5.visibility = View.VISIBLE
        box6.visibility = View.VISIBLE
        box7.visibility = View.VISIBLE
        box8.visibility = View.VISIBLE
        box9.visibility = View.VISIBLE
        box10.visibility = View.VISIBLE
        box11.visibility = View.VISIBLE
        box12.visibility = View.VISIBLE
        box13.visibility =View.VISIBLE
        box14.visibility = View.VISIBLE
        box15.visibility = View.VISIBLE
        box16.visibility = View.VISIBLE
        box17.visibility = View.VISIBLE
        box18.visibility = View.VISIBLE
        box19.visibility = View.VISIBLE
        box20.visibility = View.VISIBLE
        box21.visibility = View.VISIBLE
        box22.visibility = View.VISIBLE
        box23.visibility = View.VISIBLE
        box24.visibility = View.VISIBLE
        box25.visibility = View.VISIBLE
    }
}
