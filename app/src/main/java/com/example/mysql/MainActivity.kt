package com.example.mysql

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mysql.activity.ListagemAlunoActivity
import com.example.mysql.activity.ListagemProfessorActivity
import com.example.mysql.activity.LoginActivity
import com.example.mysql.activity.LoginAluno
import com.example.mysql.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btnAluno.setOnClickListener {
            val intent = Intent(this, ListagemAlunoActivity::class.java)
            startActivity(intent)
        }

        binding.btnProfessor.setOnClickListener {
            val intent = Intent(this, ListagemProfessorActivity::class.java)
            startActivity(intent)
        }


        }

    }


