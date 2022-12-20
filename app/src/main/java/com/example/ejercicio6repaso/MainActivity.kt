package com.example.ejercicio6repaso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import com.example.ejercicio6repaso.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val texto :String= "Finalizar"

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