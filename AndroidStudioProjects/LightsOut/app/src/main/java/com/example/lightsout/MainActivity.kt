package com.example.lightsout

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val editText = findViewById<EditText>(R.id.enter_nickname)
    private val nicknameTextView = findViewById<TextView>(R.id.nicknameText)
    private val counter = findViewById<TextView>(R.id.clickCounter)
    private val clickAmount = findViewById<TextView>(R.id.clickAmount)
    private val retry = findViewById<Button>(R.id.retryButton)

    private var clickCount = 0;

    private val box1 = findViewById<TextView>(R.id.box_1)
    private val box2 = findViewById<TextView>(R.id.box_2)
    private val box3 = findViewById<TextView>(R.id.box_3)
    private val box4 = findViewById<TextView>(R.id.box_4)
    private val box5 = findViewById<TextView>(R.id.box_5)
    private val box6 = findViewById<TextView>(R.id.box_6)
    private val box7 = findViewById<TextView>(R.id.box_7)
    private val box8 = findViewById<TextView>(R.id.box_8)
    private val box9 = findViewById<TextView>(R.id.box_9)
    private val box10 = findViewById<TextView>(R.id.box_10)
    private val box11 = findViewById<TextView>(R.id.box_11)
    private val box12 = findViewById<TextView>(R.id.box_12)
    private val box13 = findViewById<TextView>(R.id.box_13)
    private val box14 = findViewById<TextView>(R.id.box_14)
    private val box15 = findViewById<TextView>(R.id.box_15)
    private val box16 = findViewById<TextView>(R.id.box_16)
    private val box17 = findViewById<TextView>(R.id.box_17)
    private val box18 = findViewById<TextView>(R.id.box_18)
    private val box19 = findViewById<TextView>(R.id.box_19)
    private val box20 = findViewById<TextView>(R.id.box_20)
    private val box21 = findViewById<TextView>(R.id.box_21)
    private val box22 = findViewById<TextView>(R.id.box_22)
    private val box23 = findViewById<TextView>(R.id.box_23)
    private val box24 = findViewById<TextView>(R.id.box_24)
    private val box25 = findViewById<TextView>(R.id.box_25)

    private var falseArray = arrayOf(false, false, false, false, false)
    private var board = arrayOf (falseArray, falseArray, falseArray, falseArray, falseArray)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.doneButtonr).setOnClickListener {
            addNickname(it)
        }

        findViewById<TextView>(R.id.nicknameText).setOnClickListener{
            editNickname(it)
        }

        box1.setOnClickListener {
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box2.setOnClickListener {
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box3.setOnClickListener {
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box4.setOnClickListener {
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box5.setOnClickListener{
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box6.setOnClickListener{
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box7.setOnClickListener{
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box8.setOnClickListener{
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box9.setOnClickListener{
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box10.setOnClickListener{
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box11.setOnClickListener {
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box12.setOnClickListener {
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box13.setOnClickListener {
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box14.setOnClickListener {
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box15.setOnClickListener{
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box16.setOnClickListener{
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box17.setOnClickListener{
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box18.setOnClickListener{
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box19.setOnClickListener{
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box20.setOnClickListener{
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box21.setOnClickListener {
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box22.setOnClickListener {
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box23.setOnClickListener {
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box24.setOnClickListener {
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
        box25.setOnClickListener{
            clickUp(it)
            retry.visibility = View.VISIBLE
        }
    }

    private fun addNickname (view: View) {
        nicknameTextView.text = editText.text

        editText.visibility = View.GONE
        view.visibility = View.GONE

        nicknameTextView.visibility = View.VISIBLE
        counter.visibility = View.VISIBLE
        clickAmount.visibility = View.VISIBLE
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

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun editNickname (view: View) {
        val done = findViewById<Button>(R.id.doneButtonr)

        view.visibility = View.GONE
        done.visibility = View.VISIBLE
        editText.visibility = View.VISIBLE

        editText.requestFocus()
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(editText, 0)
    }

    private fun clickUp (view: View) {
        clickCount++

        if (clickAmount !== null) {
            clickAmount.text = clickCount.toString()
        }
    }
}
