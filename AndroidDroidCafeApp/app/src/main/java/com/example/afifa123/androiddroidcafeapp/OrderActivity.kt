package com.example.afifa123.androiddroidcafeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import android.widget.RadioButton

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val intent = intent

        var message = "Order: " +intent.getStringExtra("EXTRA_MESSAGE")
        var textView: TextView = findViewById(R.id.order_text_view)
        textView.text = message

    }
    private fun displayToast(message: String){
        Toast.makeText(applicationContext,message, Toast.LENGTH_SHORT).show()
    }

    fun onRadioButtonClicked(view: View) {
        val checked = (view as RadioButton).isChecked
        when (view.getId()) {
           R.id.same_day -> displayToast(getString(R.string.same_day_messenger_service_text))
            R.id.next_day -> displayToast(getString(R.string.next_messenger_service_text))
            R.id.pick_up -> displayToast(getString(R.string.pick_up_service_text))
        }
    }
}

