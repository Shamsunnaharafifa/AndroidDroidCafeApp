package com.example.afifa123.androiddroidcafeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private var EXTRA_MESSAGE = " com.example.afifa123.androiddroidcafeapp.extra.MESSAGE"
    private lateinit var mOrderMessage:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var toolbar = findViewById<Toolbar>(R.id.toolbar) as MaterialToolbar?
        setSupportActionBar(toolbar)

        val fab_button = findViewById<FloatingActionButton>(R.id.fab_button)
        fab_button.setOnClickListener{
            val intent = Intent(this@MainActivity, OrderActivity::class.java)
            intent.putExtra(EXTRA_MESSAGE, mOrderMessage)
            startActivity(intent)
        }
    }
    private fun displayToast(message: String){
        Toast.makeText(applicationContext,message, Toast.LENGTH_SHORT).show()
    }

    fun showDonutOrder(view: View) {
        mOrderMessage = getString(R.string.donut_order_message)
        displayToast(getString(R.string.donut_order_message))
    }
    fun showIceCreamOrder(view: View) {
        mOrderMessage = getString(R.string.ice_order_message)
        displayToast(getString(R.string.ice_order_message))
    }
    fun showFroyoOrder(view: View) {
        mOrderMessage = getString(R.string.froyo_order_message)
        displayToast(getString(R.string.froyo_order_message))
    }
}
