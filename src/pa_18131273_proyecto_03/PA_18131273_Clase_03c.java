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
class Terror extends Pelicula {
    //Atributo propio de la clase
    private String personaje;
    //Constructor por defecto
    public Terror(){
        super();
        personaje = "NoId";
    }
    //Constructor por datos de usuario
    public Terror(String nombre, int anio, String director, String personaje) {
        super(nombre, anio, director);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }
 
    @Override
    public String mostrar() {
        return "Nombre: "+getNombre()+"\nAño: "+getAnio()+"\nDirector: "+getDirector()+ "\nPersonaje: "+getPersonaje();
    }
    
    @Override
    public void dibujar(int x, Component c) {
        throw new UnsupportedOperationException("No hay dibujo de la pelicula"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mover(Component c) {
        throw new UnsupportedOperationException("No hay movimiento definido"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
