package com.equipo_futbol;

public class XogadorCampo extends Xogador {
    public enum Posicion {
        DELANTERO,
        MEDIO,
        DEFENSA
    }
    public Posicion posicion;

    public XogadorCampo(String nome, String apelidos, int idade, int dorsal, int num_goles, double salario,
            Posicion posicion) {
                super();
    }

    
    @Override
    public void marcar(int newgoles) {
        salario = salario + 500*newgoles;
        num_goles = this.num_goles + newgoles;  
    }

    @Override
    public String toString() {
        return "XogadorCampo [nome=" + nome + ", apelidos=" + apelidos + ", idade=" + idade + ", dorsal=" + dorsal
        + ", num_goles=" + num_goles + ", salario=" + salario + ", posicion=" + posicion + "]";
    }
    
}
