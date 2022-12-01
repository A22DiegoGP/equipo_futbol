package com.equipo_futbol;

import com.equipo_futbol.XogadorCampo.Posicion;

public class App {
    public static void main( String[] args ){
        XogadorCampo a = new XogadorCampo(null, null, 0, 0, 10, 100.00, Posicion.DELANTERO);
        Porteiro b = new Porteiro(null, null, 0, 0, 10, 10, 0, 0);
       /*  b.marcar(1);
        a.marcar(1); */
        System.out.println(a);
        System.out.println(b);
    }
}
