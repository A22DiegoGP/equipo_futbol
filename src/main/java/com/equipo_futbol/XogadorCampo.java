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
   
    public Posicion getPosicion() {
        return posicion;
    }


    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
    
    @Override
    public void marcar(int goles) {
         setSalario(getSalario() + 500*goles);
         setNum_goles(getNum_goles() + goles);
    }

    @Override
    public String toString() {
        return "XogadorCampo [nome=" + getNome() + ", apelidos=" + getApelidos() + ", idade=" + getIdade() + ", dorsal=" + getDorsal()
        + ", num_goles=" + getNum_goles() + ", salario=" + getSalario() + ", posicion=" + getPosicion() + "]";
    }

    
}
