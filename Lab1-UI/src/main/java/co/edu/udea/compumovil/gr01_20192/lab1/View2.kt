package co.edu.udea.compumovil.gr01_20192.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class View2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view2)


        var intent = intent
        val phone = intent.getStringExtra("Phone")
        val email = intent.getStringExtra("Email")
        val country = intent.getStringExtra("Country")
        val city = intent.getStringExtra("City")
        val address = intent.getStringExtra("Address")

        val phonev = findViewById<TextView>(R.id.phonev)

        phonev.text = "Phone: "+phone+"\nEmail: "+email+"\nCountry: "+country+"\nCity: "+city+"\nAddress: "+address


    }
}
