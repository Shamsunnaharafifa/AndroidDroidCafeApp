package com.example.afifa123.androiddroidcafeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val intent = intent

        var message = "Order: " +intent.getStringExtra("EXTRA_MESSAGE")
        var textView: TextView = findViewById(R.id.order_text_view)
        textView.text = message

    }
}
