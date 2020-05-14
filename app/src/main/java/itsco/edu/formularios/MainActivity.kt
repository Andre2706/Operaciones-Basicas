package itsco.edu.formularios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var hin_numero1 = findViewById<View>(R.id.numero1) as EditText
        var hin_numero2 = findViewById<View>(R.id.numero2) as EditText
        var btn_suma = findViewById<View>(R.id.btn_suma) as Button
        var btn_resta = findViewById<View>(R.id.btn_resta) as Button
        var btn_multi = findViewById<View>(R.id.btn_multi) as Button
        var btn_division = findViewById<View>(R.id.btn_division) as Button

        btn_suma.setOnClickListener(View.OnClickListener {

            var resultado= hin_numero1.text.toString().toInt()+hin_numero2.text.toString().toInt()

            Toast.makeText(this, "El total de la suma es: "+resultado,Toast.LENGTH_LONG).show()
        })

        btn_resta.setOnClickListener(View.OnClickListener {


            var resultado = hin_numero1.text.toString().toInt() - hin_numero2.text.toString().toInt()

            Toast.makeText(this, "El total de la resta es: " + resultado, Toast.LENGTH_LONG).show()
        })

        btn_multi.setOnClickListener(View.OnClickListener {


            var resultado = hin_numero1.text.toString().toInt() * hin_numero2.text.toString().toInt()

            Toast.makeText(this, "El total de la Multiplicacion es: " + resultado, Toast.LENGTH_LONG).show()
        })

        btn_division.setOnClickListener(View.OnClickListener {


            var resultado = hin_numero1.text.toString().toInt() / hin_numero2.text.toString().toInt()

            Toast.makeText(this, "El total de la division es: " + resultado, Toast.LENGTH_LONG).show()
        })
    }
}
