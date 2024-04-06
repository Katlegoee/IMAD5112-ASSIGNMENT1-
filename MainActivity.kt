package com.example.myhistoryapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


//@Suppress("UNUSED_EXPRESSION", "KotlinConstantConditions")
class MainActivity : AppCompatActivity() {
    @SuppressLint("CutPasteId", "MissingInflatedId", "WrongViewCast", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)
        //declaring variables for our application//
        val editText = findViewById<EditText>(R.id.editText)
        val clickMeButton: Button = findViewById(R.id.clickMeButton)
        val txtResult =findViewById<TextView>(R.id.txtResult)
        val clearTextBtn:Button=findViewById(R.id.clear_text_btn)
        clickMeButton.setOnClickListener {
           val age = editText.text.toString().toIntOrNull()
            if(age!=null){
                val result = when(age){//age range for South African historic figures//
                    in 23 .. 23->"Solomon Mahlangu"
                    in 25..25->"Sara Bartmann"
                    in 30..30->"Steve Biko"
                    in 50..50->"Chris Hani"
                    in 75..75->"Oliver Tambo"
                    in 81..81->"Winnie Madikizela-Mandela"
                    in 87..87->"Ahmed Kathrada"
                    in 90..90->"Desmond Tutu"
                    in 94..94->"Albertina Sisulu"
                    in 95..95->"Nelson Mandela"
                    else->"Invalid age,no historic figure found around that age.Please try again"
                }
                txtResult.text="Age:$age\n${
                    when(result){
                        //ages in which 10 of the South African historic figures died//
                        "Solomon Mahlangu"->"Solomon Mahlangu(1956–1979) -  died at the age of 23."
                        "Sara Bartmann"->"Sara Bartmann(1789–1815) - Died at the age of 25."
                        "Steve Biko"->"Steve Biko(1946–1977) -  died at the age of 30."
                        "Chris Hani"->"Chris Hani(1942–1993) - died at the age of 50."
                        "Oliver Tambo"->"Oliver Tambo(1917–1993) - died at the age of 75."
                        "Winnie Madikizela-Mandela"->"Winnie Madikizela-Mandela(1936–2018) -  died at the age of 81."
                        "Ahmed Kathrada"->"Ahmed Kathrada(1929–2017) - died at the age of 87."
                        "Desmond Tutu"->"Desmond Tutu(1931–2021) - died at the age of 90."
                        "Albertina Sisulu"->"Albertina Sisulu(1918–2011)  - died at the age of 92."
                        "Nelson Mandela"->"Nelson Mandela(1918–2013) - died at the age of 95."
                        else->"Invalid age! No historic figure found around that age.Please try again"
                    }
                }"
            }else {//error message shown when nothing is entered by the user//
                    txtResult.text = "Please enter a VALID age"

            }
        }//This is for the clear button//
    clearTextBtn.setOnClickListener {
        editText.text.clear()
        txtResult.text = ""

    }

    }
}

