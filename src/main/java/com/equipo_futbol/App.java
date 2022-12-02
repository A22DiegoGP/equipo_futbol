package com.equipo_futbol;

import com.equipo_futbol.XogadorCampo.Posicion;

public class App {
    public static void main( String[] args ){
        Xogador a = new XogadorCampo("Pepito", "Grillo", 40, 10, 10, 100.00, Posicion.DELANTERO);
        Xogador b = new Porteiro("Luz", "Noceda", 15, 6, 10, 1000, 1, 1);
       /*  b.marcar(1);
        a.marcar(1); */
        System.out.println(a);
        System.out.println(b);
    }
}
