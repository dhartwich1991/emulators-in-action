package com.jdapplications.emulatorsdroidconpl

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.change_text_text as changeText
import kotlinx.android.synthetic.main.activity_main.press_me_button as pressMeButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstText = "First"
        val secondText = "Second"
        pressMeButton.setOnClickListener {
            if (changeText.text.equals(firstText)) {
                changeText.text = secondText
            } else {
                changeText.text = firstText
            }
        }
    }
}
