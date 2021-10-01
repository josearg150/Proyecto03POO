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
class Flash extends Accion {
    //Atributo propio
    private String actor; 
    //Constructor por defecto
    public Flash() {
        super();
        setSuperHeroe("Flash");
        actor = "Erza Miller";
    }
    //Constructor datos de usuario
    public Flash(String nombre, int anio, String director) {
        super(nombre, anio, director, "Flash");
        actor = "Erza Miller";
    }

    public String getActor() {
        return actor;
    }
    
    
           
    @Override
    public String mostrar() {
        return super.mostrar()+"\nActor: "+actor; //To change body of generated methods, choose Tools | Templates.
    }

    public void dibujar(int x,Component c){
        //x == 100 para dibujar en el centro
        Graphics dibujar = c.getGraphics();//Obtenemos los graficos para dibujar
        //Rectangulo para evitar barrido
        dibujar.setColor(c.getBackground());
        dibujar.fillRect(0, 0, c.getWidth(), 300);
        //Circulos
        dibujar.setColor(Color.yellow);
        dibujar.fillOval(x+50, 50, 200, 200);
        dibujar.setColor(Color.red);
        dibujar.fillOval(x+56, 54, 189, 189);
        dibujar.setColor(Color.yellow);
        //Rayo
        //Parte izquierda
        dibujar.drawLine(x+120, 130, x+200, 20); 
        dibujar.drawLine(x+120, 130, x+150, 130);//
        dibujar.drawLine(x+150, 130, x+110, 180);//
        dibujar.drawLine(x+110, 180, x+154, 180);
        dibujar.drawLine(x+154, 180, x+90, 260);
        //Parte derecha 
        dibujar.drawLine(x+150, 110, x+200, 20); 
        dibujar.drawLine(x+150, 110, x+190, 110);
        dibujar.drawLine(x+190, 110, x+154, 160);
        dibujar.drawLine(x+154, 160, x+210, 160);
        dibujar.drawLine(x+210, 160, x+90, 260);
        //Titulo
        dibujar.setFont(new Font("Courier", Font.ITALIC,40));
        dibujar.drawString("Flash", x+100, 150);
       
        
    }

   
    public void mover(Component c) {
        for (int x = 500; x != -300; x--) {//Enviamos x y la decrementamos
               dibujar(x, c);
            try {
                Thread.sleep(10);//Esperamos 10 milesimas para repetir
            } catch (InterruptedException ex) {
                Logger.getLogger(Flash.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     
       
    }
    
      
}
