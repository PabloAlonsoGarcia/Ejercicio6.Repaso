package com.example.ejercicio6repaso

import android.content.Context
import android.graphics.Color
import android.graphics.Color.green
import android.graphics.Rect
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import com.example.ejercicio6repaso.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val texto :String= "Finalizar"
    private val texto2 :String= "Wayne"
    private val texto3 :String="Joker"

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Batman.isVisible = false


        binding.button.setOnClickListener(){
            binding.editTextTextPersonName.isEnabled=true
            binding.editTextTextPersonName.isVisible=true
            if(binding.button.text.equals(texto)){
                binding.editTextTextPersonName.isVisible=false
            }
            if(binding.editTextTextPersonName.text.contains(texto2)){
                binding.Batman.isVisible=true

            }else{
                if(binding.editTextTextPersonName.text.contains(texto3)){
                    //cambiar el fondo de la aplicacion al verde
                    binding.root.setBackgroundColor(Color.parseColor("#7CFC00"))

                }
            }
        }

        binding.editTextTextPersonName.setOnFocusChangeListener(){_,hasFocus ->
            if(hasFocus){
                binding.editTextTextPersonName.text.clear()

            }
        }



        binding.editTextTextPersonName.setOnClickListener(){
            binding.editTextTextPersonName.hint=""
        }


        binding.editTextTextPersonName.addTextChangedListener {
            if(it.toString().isNotEmpty()){
                binding.button.text = texto
            }
        }


    }


}