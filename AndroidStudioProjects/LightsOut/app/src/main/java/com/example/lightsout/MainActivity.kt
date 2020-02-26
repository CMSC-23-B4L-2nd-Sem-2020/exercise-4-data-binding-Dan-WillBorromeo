package com.example.lightsout

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var clickCount = 0

    private var falseArray = arrayOf(true, true, true, true, true)
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

        findViewById<ViewGroup>(R.id.layoutApp).setBackgroundColor(Color.DKGRAY)

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

        retry.setOnClickListener{
            reset(it)
        }

        box1.setOnClickListener {
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box2.setOnClickListener {
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box3.setOnClickListener {
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box4.setOnClickListener {
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box5.setOnClickListener{
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box6.setOnClickListener{
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box7.setOnClickListener{
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box8.setOnClickListener{
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box9.setOnClickListener{
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box10.setOnClickListener{
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box11.setOnClickListener {
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box12.setOnClickListener {
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box13.setOnClickListener {
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box14.setOnClickListener {
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box15.setOnClickListener{
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box16.setOnClickListener{
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box17.setOnClickListener{
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box18.setOnClickListener{
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box19.setOnClickListener{
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box20.setOnClickListener{
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box21.setOnClickListener {
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box22.setOnClickListener {
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box23.setOnClickListener {
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box24.setOnClickListener {
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
        box25.setOnClickListener{
            clickUp(it)
            toggleLights(it)
            retry.visibility = View.VISIBLE
        }
    }

    private fun addNickname (view: View) {
        val editText = findViewById<EditText>(R.id.enter_nickname)
        val nicknameTextView = findViewById<TextView>(R.id.nicknameText)
        val counter = findViewById<TextView>(R.id.clickCounter)
        val clickAmount = findViewById<TextView>(R.id.clickAmount)
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
        val editText = findViewById<EditText>(R.id.enter_nickname)
        val done = findViewById<Button>(R.id.doneButtonr)

        view.visibility = View.GONE
        done.visibility = View.VISIBLE
        editText.visibility = View.VISIBLE

        editText.requestFocus()
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(editText, 0)
    }

    private fun clickUp (view: View) {
        val clickAmount = findViewById<TextView>(R.id.clickAmount)
        clickCount++

        if (clickAmount !== null) {
            clickAmount.text = clickCount.toString()
        }
    }

    private fun reset (view: View) {
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

        var firstRow = arrayOf (box1, box2, box3, box4, box5)
        var secondRow = arrayOf(box6, box7, box8, box9, box10)
        var thirdRow = arrayOf(box11, box12, box13, box14, box15)
        var fourthRow = arrayOf (box16, box17, box18, box19, box20)
        var fifthRow = arrayOf(box21, box22, box23, box24, box25)
        var lightbulbs = arrayOf(firstRow, secondRow, thirdRow, fourthRow, fifthRow)

        val clickAmount = findViewById<TextView>(R.id.clickAmount)
        clickCount = 0

        if (clickAmount !== null) {
            clickAmount.text = clickCount.toString()
        }

        for (i in 0.. 4) {
            for (j in 0.. 4) {
                board[i][j] = true
                lightbulbs[i][j].setBackgroundColor(Color.WHITE)
            }
        }
    }

    private fun toggleLights (view: View) {
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

        var firstRow = arrayOf (box1, box2, box3, box4, box5)
        var secondRow = arrayOf(box6, box7, box8, box9, box10)
        var thirdRow = arrayOf(box11, box12, box13, box14, box15)
        var fourthRow = arrayOf (box16, box17, box18, box19, box20)
        var fifthRow = arrayOf(box21, box22, box23, box24, box25)
        var lightbulbs = arrayOf(firstRow, secondRow, thirdRow, fourthRow, fifthRow)

        val j = when (view.id) {
            R.id.box_1 -> 0
            R.id.box_6 -> 0
            R.id.box_11 -> 0
            R.id.box_16 -> 0
            R.id.box_21 -> 0
            R.id.box_2 -> 1
            R.id.box_7 -> 1
            R.id.box_12 -> 1
            R.id.box_17 -> 1
            R.id.box_22 -> 1
            R.id.box_3 -> 2
            R.id.box_8 -> 2
            R.id.box_13 -> 2
            R.id.box_18 -> 2
            R.id.box_23 -> 2
            R.id.box_4 -> 3
            R.id.box_9 -> 3
            R.id.box_14 -> 3
            R.id.box_19 -> 3
            R.id.box_24 -> 3
            R.id.box_5 -> 4
            R.id.box_10 -> 4
            R.id.box_15 -> 4
            R.id.box_20 -> 4
            else -> 4
        }

        val i = when (view.id) {
            R.id.box_1 -> 0
            R.id.box_2 -> 0
            R.id.box_3 -> 0
            R.id.box_4 -> 0
            R.id.box_5 -> 0
            R.id.box_6 -> 1
            R.id.box_7 -> 1
            R.id.box_8 -> 1
            R.id.box_9 -> 1
            R.id.box_10 -> 1
            R.id.box_11 -> 2
            R.id.box_12 -> 2
            R.id.box_13 -> 2
            R.id.box_14 -> 2
            R.id.box_15 -> 2
            R.id.box_16 -> 3
            R.id.box_17 -> 3
            R.id.box_18 -> 3
            R.id.box_19 -> 3
            R.id.box_20 -> 3
            R.id.box_21 -> 4
            R.id.box_22 -> 4
            R.id.box_23 -> 4
            R.id.box_24 -> 4
            else -> 4
        }

        if (board[i][j]){
            lightbulbs[i][j].setBackgroundColor(Color.BLACK)
        } else {
            lightbulbs[i][j].setBackgroundColor(Color.WHITE)
        }
        board[i][j] = !board[i][j]

        if (i-1 >= 0){
            if (board[i-1][j]){
                lightbulbs[i-1][j].setBackgroundColor(Color.BLACK)
            } else {
                lightbulbs[i-1][j].setBackgroundColor(Color.WHITE)
            }
            board[i-1][j] = !board[i-1][j]
        }
        if (i+1 <= 4) {
            if (board[i+1][j]){
                lightbulbs[i+1][j].setBackgroundColor(Color.BLACK)
            } else {
                lightbulbs[i+1][j].setBackgroundColor(Color.WHITE)
            }
            board[i+1][j] = !board[i+1][j]
        }
        if ((j-1)>=0) {
            if (board[i][j-1]){
                lightbulbs[i][j-1].setBackgroundColor(Color.BLACK)
            } else {
                lightbulbs[i][j-1].setBackgroundColor(Color.WHITE)
            }
            board[i][j-1] = !board[i][j-1]
        }
        if ((j+1)<=4) {
            if (board[i][j+1]){
                lightbulbs[i][j+1].setBackgroundColor(Color.BLACK)
            } else {
                lightbulbs[i][j+1].setBackgroundColor(Color.WHITE)
            }
            board[i][j+1] = !board[i][j+1]
        }
    }
}
