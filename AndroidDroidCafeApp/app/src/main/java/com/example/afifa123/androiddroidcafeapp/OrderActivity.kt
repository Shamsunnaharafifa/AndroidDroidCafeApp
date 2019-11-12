package com.example.afifa123.androiddroidcafeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity(),AdapterView.OnItemSelectedListener{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val intent  = intent

        var message = intent.getStringExtra("EXTRA_MESSAGE")
        var textView: TextView = findViewById(R.id.order_text_view)
        textView.text  = message

        val label_array = arrayOf("Home","Mobile","Work","Other")
        var spinner: Spinner= findViewById(R.id.level_spinner)
        /*if(spinner!=null){
            spinner.onItemSelectedListener
        }*/
        if (spinner!=null) {
            val arrayAdapter = ArrayAdapter(
                this,
                R.layout.support_simple_spinner_dropdown_item,
                label_array
            )
           spinner.adapter = arrayAdapter
        }
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
    override fun onNothingSelected(parent: AdapterView<*>?) {

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        level_spinner.setSelection(position)
        
    }
}

