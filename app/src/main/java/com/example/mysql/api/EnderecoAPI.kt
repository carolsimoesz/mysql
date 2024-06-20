package com.example.mysql.api
import com.example.mysql.model.Aluno
import com.example.mysql.model.Professor
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface EnderecoAPI {
    //Listando dados
    @GET("aluno/listar")
    fun getAlunos(): Call<List<Aluno>>

    //Cadastrondo Dados
    @POST("aluno/inserir")
    fun inserirAluno(@Body aluno: Aluno): Call<Void>

    //Apagando dados
    @DELETE("aluno/excluir/{id}")
    fun excluirAluno(@Path("id") id: Int): Call<Void>

    //Editando dados
    @PUT("aluno/alterar")
    fun alterarAluno(@Body aluno: Aluno): Call<Void>


    //Listando dados
    @GET("professor/listar")
    fun getProfessor(): Call<List<Professor>>
    //Cadastrondo Dados
    @POST("profressor/inserir")
    fun inserirProfessor(@Body aluno: Professor): Call<Void>
    //Apagando dados
    @DELETE("professor/excluir/{id}")
    fun excluirProfessor(@Path("id") id: Int): Call<Void>
    //Editando dados
    @PUT("aluno/alterar")
    fun alterarProfessor(@Body aluno: Professor): Call<Void>
}