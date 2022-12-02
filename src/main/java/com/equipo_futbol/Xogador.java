package com.equipo_futbol;

public abstract class Xogador {
    private String nome;
    private String apelidos;
    private int idade;
    private int dorsal;
    private int num_goles;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getNum_goles() {
        return num_goles;
    }

    public void setNum_goles(int num_goles) {
        this.num_goles = num_goles;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
   public abstract void marcar(int goles);
   
   public Xogador(){}

    @Override
    public String toString() {
        return "Xogador [nome=" + nome + ", apelidos=" + apelidos + ", idade=" + idade + ", dorsal=" + dorsal
                + ", num_goles=" + num_goles + ", salario=" + salario + "]";
    }
    
}
