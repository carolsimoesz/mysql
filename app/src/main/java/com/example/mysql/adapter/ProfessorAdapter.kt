package com.example.mysql.adapter

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mysql.activity.CadastroAlunoActivity
import com.example.mysql.databinding.ActivityItemAlunoBinding
import com.example.mysql.databinding.ActivityItemProfessorBinding
import com.example.mysql.model.Aluno
import com.example.mysql.model.Professor

class ProfessorAdapter(
    private val context: Context,
    private val deleteCallback: (Int) -> Unit
) : RecyclerView.Adapter<ProfessorAdapter.ProfessorViewHolder>() {

    private var professores: List<Professor> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfessorAdapter.ProfessorViewHolder {
        val binding = ActivityItemProfessorBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProfessorViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProfessorAdapter.ProfessorViewHolder, position: Int) {
        val aluno = professores[position]
        holder.bind(aluno)

        holder.binding.btnDeletar.setOnClickListener {
            AlertDialog.Builder(holder.itemView.context)
                .setTitle("Excluir Aluno")
                .setMessage("Deseja realmente excluir o aluno ${aluno.nome}?")
                .setPositiveButton("Sim") { _, _ ->
                    deleteCallback(aluno.id)
                }
                .setNegativeButton("Não", null)
                .show()
        }

        holder.binding.btnEditar.setOnClickListener {
            val intent = Intent(context, CadastroAlunoActivity::class.java)
            intent.putExtra("ALUNO_ID", aluno.id)
            intent.putExtra("ALUNO_NOME", aluno.nome)
            intent.putExtra("ALUNO_CPF", aluno.cpf)
            intent.putExtra("ALUNO_EMAIL", aluno.email)
            context.startActivity(intent)
        }
    }
    override fun getItemCount(): Int {
        return professores.size
    }
    fun setData(professores: List<Professor>) {
        this.professores = professores
        notifyDataSetChanged()
    }

    inner class ProfessorViewHolder(val binding: ActivityItemProfessorBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(professor: Professor) {
            binding.apply {
                nomeTextView.text = professor.nome
                cpfTextView.text = professor.cpf
                emailTextView.text = professor.email

            }
        }
    }
}