package com.equipo_futbol;

public class Porteiro extends Xogador {
    public int numParadas;
    public int golesEncaixados;

    public Porteiro(String nome, String apelidos, int idade, int dorsal, int num_goles, double salario, int numParadas,
            int golesEncaixados) {
        super()
        this.numParadas = numParadas;
        this.golesEncaixados = golesEncaixados;
    }

    public int getNumParadas() {
        return numParadas;
    }

    public void setNumParadas(int numParadas) {
        this.numParadas = numParadas;
    }

    public int getGolesEncaixados() {
        return golesEncaixados;
    }

    public void setGolesEncaixados(int golesEncaixados) {
        this.golesEncaixados = golesEncaixados;
    }

    @Override
    public void marcar(int goles) {
        setNum_goles(getNum_goles() + goles);
    }
    @Override
    public String toString() {
        return "Porteiro [nome=" + getNome() + ", apelidos=" + getApelidos() + ", idade=" + getIdade() + ", dorsal=" + getDorsal()
        + ", num_goles=" + getNum_goles() + ", salario=" + getSalario() +", numParadas=" + getNumParadas() + ", golesEncaixados=" + getGolesEncaixados() + "]";
    }
    
    
}
