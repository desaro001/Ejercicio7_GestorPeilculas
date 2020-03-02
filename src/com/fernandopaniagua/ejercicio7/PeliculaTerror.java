package com.fernandopaniagua.ejercicio7;

public class PeliculaTerror extends Pelicula {
    private boolean haySangre;
    private boolean hayZombies;
    private int nivelTerror;//Entre 1 y 10

    public PeliculaTerror(boolean haySangre, boolean hayZombies, int nivelTerror, 
            String titulo, String director, int duracion, String argumento) {
        super(titulo, director, duracion, argumento);        
        this.haySangre = haySangre;
        this.hayZombies = hayZombies;
        this.nivelTerror = nivelTerror;
    }
    
    @Override
    protected void imprimir(){
        super.imprimir();
        if (haySangre){
            System.out.println("Hay sangre");
        } else {
            System.out.println("No hay sangre");
        }
        if (hayZombies) {
            System.out.println("Hay zombies");
        } else {
            System.out.println("No hay zombies");
        }
        System.out.println("Nivel de terror:" + this.nivelTerror);
    }
}
