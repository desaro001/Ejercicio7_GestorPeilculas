package com.fernandopaniagua.ejercicio7;

public class Pelicula {
    private String titulo;
    private String director;
    private int duracion;//90 y 180
    private String argumento;
    
    public Pelicula(String titulo, String director, int duracion, String argumento) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.argumento = argumento;
    }
    
    protected void imprimir(){
        System.out.println("Título:" + titulo);
        System.out.println("Director:" + director);
        System.out.println("Duración:" + duracion);
        System.out.println("Argumento:" + argumento);
    }
}
