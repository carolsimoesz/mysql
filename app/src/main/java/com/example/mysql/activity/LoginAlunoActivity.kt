package com.example.mysql.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.mysql.R
import com.example.mysql.databinding.ActivityListagemProfessorBinding
import com.example.mysql.databinding.ActivityLoginAlunoBinding
import com.example.mysql.databinding.ActivityLoginBinding

class LoginAlunoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginAlunoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginAlunoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEntrar2.setOnClickListener {
            val intent = Intent(this, ListagemAlunoActivity::class.java)
            startActivity(intent)
        }
    }
}

