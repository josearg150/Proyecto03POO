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
class Avengers extends Accion {
    //Atributo propio
    private int ventas;// 1000,000,000 millones
    //Constructor por defecto
    public Avengers(){
        super();
        setSuperHeroe("Iron Man");
        ventas = 1000000000;
    }
    //Constructor datos de usuario
    public Avengers(String nombre, int anio, String director) {
        super(nombre, anio, director, "Iron Man");
        ventas = 1000000000;
    }

    public int getVentas() {
        return ventas;
    }
    
    
    @Override
    public String mostrar() {
        return super.mostrar()+"\nVentas: "+ventas; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dibujar(int x,Component c) {
        Graphics dibujar = c.getGraphics();//Obtenemos graficos para dibujar
        //Rectangulo para evitar barrido
        dibujar.setColor(c.getBackground());
        dibujar.fillRect(0, 0, c.getWidth(), 300);
        
        //Cara
        dibujar.setColor(Color.red);
        dibujar.fillOval(x+40, 50, 180, 200);
        dibujar.setColor(Color.yellow);
        dibujar.fillOval(x+50, 60, 160, 180);
        dibujar.setColor(Color.red);
        dibujar.fillRect(x+120, 60, 30, 40);
        //ojos
        dibujar.setColor(Color.cyan);
        dibujar.fillRect(x+150, 120, 50, 20);
        dibujar.fillRect(x+70, 120, 50, 20);
        //Boca
        dibujar.setColor(Color.black);
        dibujar.drawLine(x+90, 220, x+170, 220);
        dibujar.drawLine(x+90, 220, x+55, 180);
        dibujar.drawLine(x+170, 220, x+205, 180);
        //Titulo
        dibujar.setFont(new Font("Courier", Font.ITALIC,40));
        dibujar.drawString("Avengers", x+50, 50);
    }

    @Override
    public void mover(Component c) {
       for (int x = 500; x != -300; x--) {//Enviamos x y la decrementamos
               dibujar(x, c);
               try {
                Thread.sleep(10);//Esperamos 10milesimas para repetir
               } catch (InterruptedException ex) {
                Logger.getLogger(Flash.class.getName()).log(Level.SEVERE, null, ex);
              }
    }        
}
}
