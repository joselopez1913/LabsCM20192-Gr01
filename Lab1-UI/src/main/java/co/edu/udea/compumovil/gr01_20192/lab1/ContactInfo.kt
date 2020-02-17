package co.edu.udea.compumovil.gr01_20192.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ContactInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_info)



        val textphone = findViewById<EditText>(R.id.text_phone)
        val textemail = findViewById<EditText>(R.id.text_email)
        val textcountry = findViewById<EditText>(R.id.text_country)
        val textcity = findViewById<EditText>(R.id.text_city)
        val textcarrer = findViewById<EditText>(R.id.text_carrer)
        val nextb = findViewById<Button>(R.id.buttonnext2)

        nextb.setOnClickListener{
            var phone =textphone.text.toString()
            var email =textemail.text.toString()
            var country =textcountry.text.toString()
            var city =textcity.text.toString()
            var address =textcarrer.text.toString()

            val intent = Intent(this@ContactInfo,View2::class.java)
            intent.putExtra("Phone",phone)
            intent.putExtra("Email",email)
            intent.putExtra("Country",country)
            intent.putExtra("City",city)
            intent.putExtra("Address",address)
            startActivity(intent)


            /**Log.i("", "Información Personal: ")
            Log.i("Nombre: ", phone.toString())
            Log.i("Correo: ", email.toString())
            Log.i( "Pais: ", radioGerder.toString())
            Log.i( "ciudad: " , radioDatePersona.toString())
    **/

        }
}
}
