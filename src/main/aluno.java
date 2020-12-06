/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Marcos
 */


public class aluno {
    
    ArrayList<String> materiasAluno = new ArrayList<>();
    
    private String nome, email;

    public aluno(String nome, String email, ArrayList<String> materiaisAluno) {
        this.nome = nome;
        this.email = email;
        this.materiasAluno = materiaisAluno;
    }

    public ArrayList<String> getMateriasAluno() {
        return materiasAluno;
    }

    public void setMateriasAluno(ArrayList<String> materiasAluno) {
        this.materiasAluno = materiasAluno;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
