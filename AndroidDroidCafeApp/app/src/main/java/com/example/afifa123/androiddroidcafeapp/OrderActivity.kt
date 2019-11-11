package com.example.afifa123.androiddroidcafeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        intent = getIntent()
        var message = "Order: "+intent.getStringExtra(EXTRA_MESSAGE)
        var textView: TextView = findViewById(R.id.order_text_view)
        textView.setText(message)
    }
}
