package com.example.ejercicio6repaso

import android.content.Context
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

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.button.setOnClickListener(){
            binding.editTextTextPersonName.isEnabled=true
            binding.editTextTextPersonName.isVisible=true
            if(binding.button.text.equals(texto)){
                binding.editTextTextPersonName.isEnabled=false
            }
            if(binding.editTextTextPersonName.text.equals(texto2)){
                binding.button.text=texto
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