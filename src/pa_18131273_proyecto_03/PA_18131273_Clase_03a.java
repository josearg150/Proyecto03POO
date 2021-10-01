/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_18131273_proyecto_03;

import java.awt.Component;

/**
 *
 * @author Jose angel
 */
abstract class Pelicula  {
    //Atributos
    private String nombre;
    private int anio;
    private String director;
    //Constructores con algunos valores definidos como 0 y no id
    public Pelicula() {
        nombre = "NoId";
        anio = 0;
        director = "NoId";
    }
    //Constructor por datos del usuario
    public Pelicula(String nombre, int anio, String director) {
        this.nombre = nombre;
        this.anio = anio;
        this.director = director;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected int getAnio() {
        return anio;
    }

    protected void setAnio(int anio) {
        this.anio = anio;
    }

    protected String getDirector() {
        return director;
    }

    protected void setDirector(String director) {
        this.director = director;
    }
    //Metodos abstractos
    public abstract String mostrar();    
    public abstract void dibujar(int x, Component c);
    public abstract void mover(Component c);
 }

