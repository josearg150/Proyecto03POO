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
class Accion extends Pelicula {
    //Atributo propio de la clase
    private String superHeroe;
    //Constructor por defecto
    public Accion(){
        super();
        superHeroe = "NoId";
    }
    //Constructor datos de usario
    public Accion(String nombre, int anio, String director, String superHeroe) {
        super(nombre, anio, director);
        this.superHeroe = superHeroe;
    }

    public String getSuperHeroe() {
        return superHeroe;
    }

    public void setSuperHeroe(String superHeroe) {
        this.superHeroe = superHeroe;
    }
    
    @Override
    public String mostrar() {
        return "Nombre: "+getNombre()+"\nAño: "+getAnio()+"\nDirector: "+getDirector()+ "\nSuper Heroe: "+getSuperHeroe();
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
