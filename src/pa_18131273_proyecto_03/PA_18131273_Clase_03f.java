/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_18131273_proyecto_03;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose angel
 */
class Slenderman extends Terror {
    //Atributo propio
    private String compositor;
    //Constructor por defecto
    public Slenderman(){
        super();
        setPersonaje("Slender");
        compositor = "Brandon Campbell";
    }
    //Constructor datos de usuario
    public Slenderman(String nombre, int anio, String director) {
        super(nombre, anio, director, "Slender");
    }

    public String getCompositor() {
        return compositor;
    }
      
    @Override
    public String mostrar() {
        return super.mostrar()+"\nCompositor de musica: "+compositor; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dibujar(int x, Component c) {
       Graphics dibujar =  c.getGraphics();//Obtener graficos para dibujar
       //Rectangulo para evitar barrido
        dibujar.setColor(c.getBackground());
        dibujar.fillRect(0, 0, c.getWidth(), 300);
        //Cara       
       dibujar.setColor(Color.white);
       dibujar.fillOval(x+130, 30, 50, 80);
       //Cuerpo
       dibujar.setColor(Color.black);
       dibujar.fillRect(x+100, 110, 100, 250);
       dibujar.fillRect(x+70, 110, 30, 150);
       dibujar.fillRect(x+200, 110, 30, 150);
       //Camisa
       dibujar.setColor(Color.white);
       dibujar.fillRect(x+135, 110, 40, 50);
       //Corbata
       dibujar.setColor(Color.black);
       dibujar.fillRect(x+150, 110, 10, 20);
       dibujar.fillRect(x+145, 120, 20, 50);
       //Titulo
        dibujar.setFont(new Font("Courier", Font.ITALIC,40));
        dibujar.drawString("SlenderMan", x+50, 40);
     
    }

    @Override
    public void mover(Component c) {
            for (int x = 500; x != -300; x--) {//Enviamos x y la decrementamos
               dibujar(x, c);
                try {
                    Thread.sleep(10);//Esperamos 10milesimas para repetir
                } catch (InterruptedException ex) {
                    Logger.getLogger(Slenderman.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    
    
    
}
