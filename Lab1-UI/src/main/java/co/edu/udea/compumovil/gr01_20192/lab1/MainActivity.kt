package co.edu.udea.compumovil.gr01_20192.lab1

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_next.setOnClickListener {

            val intent: Intent = Intent(this, ContactInfo::class.java)
            startActivity(intent)

        }


        //Spinner
        val grades = arrayOf("Primaria","Secundaria","Universidad","Otro")
        text_grade_schol.adapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,grades)
        text_grade_schol.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {

            }

        }


        //

        //calendario

        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        //Spinner



        //boton

        button_change.setOnClickListener{
            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener{ view, mYear, mMonth, mDay ->
                date.setText(""+ mDay + "/" + (mMonth+1)+ "/"+ mYear)
            },year,month,day)
            dpd.show()
        }
    }}
