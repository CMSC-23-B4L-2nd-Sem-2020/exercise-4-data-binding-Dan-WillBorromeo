package com.example.borromeo_exer4_slambook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.borromeo_exer4_slambook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.doneButton.setOnClickListener {
            inputDone(it)
        }
    }

    private fun inputDone (view : View){
        var nameText = binding.nameQuestion.text
        var nicknameText = binding.nicknameQuestion.text
        var ageText = binding.ageQuestion.text

        binding.nameHolder.text = nameText
        binding.nicknameHolder.text = nicknameText
        binding.ageHolder.text = ageText

        binding.nameHolder.visibility = View.VISIBLE
        binding.nicknameHolder.visibility = View.VISIBLE
        binding.ageHolder.visibility = View.VISIBLE
        binding.thankYouMessage.visibility = View.VISIBLE

        view.visibility = View.GONE

        binding.headerGreeting.visibility = View.GONE
        binding.nameTag.visibility = View.GONE
        binding.nameQuestion.visibility = View.GONE
        binding.nicknameTag.visibility = View.GONE
        binding.nicknameQuestion.visibility = View.GONE
        binding.ageTag.visibility = View.GONE
        binding.ageQuestion.visibility = View.GONE
        binding.bdayTag.visibility = View.GONE
        binding.bdayQuestion.visibility = View.GONE
        binding.phoneTag.visibility = View.GONE
        binding.phoneQuestion.visibility = View.GONE
        binding.emailTag.visibility = View.GONE
        binding.emailQuestion.visibility = View.GONE
        binding.courseTag.visibility = View.GONE
        binding.courseQuestion.visibility = View.GONE
        binding.udreamTag.visibility = View.GONE
        binding.udreamQuestion.visibility = View.GONE
        binding.crushTag.visibility = View.GONE
        binding.crushQuestion.visibility = View.GONE
        binding.messageTag.visibility = View.GONE
        binding.messageQuestion.visibility = View.GONE
    }
}
