package com.fernandopaniagua.ejercicio7;

public class Ejecutador {
    public static void main(String[] args) {
        PeliculaTerror elexorcista = new PeliculaTerror(true, false, 10, 
        "El exorcista","Alejandro",95,"Una niña posesa");
        
        System.out.println("**********************************************");
        elexorcista.imprimir();
        System.out.println("**********************************************");
    }
}
