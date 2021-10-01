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
class It extends Terror {
    private String autor;//Atributo propio
   //Constructor por defecto
   public It(){
       super();
       setPersonaje("Pennywaise");
        autor = "Stephen King";
   }
   //Constructor datos de usuario
    public It(String nombre, int anio, String director) {
        super(nombre, anio, director, "Pennywaise");
        autor = "Stephen King";
    }

    public String getAutor() {
        return autor;
    }
   
    
   
 
    @Override
    public String mostrar() {
        return super.mostrar()+"\nAutor del libro "+autor; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dibujar(int x, Component c) {
       Graphics dibujar =  c.getGraphics();//obtener graficos para dibujar
       //Rectangulo para evitar barrido
        dibujar.setColor(c.getBackground());
        dibujar.fillRect(0, 0, c.getWidth(), 300);
        //Globo
       dibujar.setColor(Color.red);
       dibujar.fillOval(x+110, 50, 80, 120);
       dibujar.fillRect(x+145, 167, 10, 15);
       dibujar.setColor(Color.black);
       dibujar.drawLine(x+138, 200, x+150, 180);
       dibujar.drawLine(x+138, 200, x+150, 220);
       dibujar.drawLine(x+150, 220, x+138, 240);
       dibujar.drawLine(x+138, 240, x+150, 260);
       
       //Barco
       dibujar.setColor(Color.yellow);
       dibujar.fillOval(x+215, 245, 15, 37);
       dibujar.fillRect(x+190, 270, 65, 13); 
       //Titulo
        dibujar.setColor(Color.black);
        dibujar.setFont(new Font("Courier", Font.ITALIC,40));
        dibujar.drawString("It", x+130, 40);

    }

    @Override
    public void mover(Component c) {
            for (int x = 500; x != -300; x--) {//Enviamos x y la decrementamos
               dibujar(x, c);
                try {
                    Thread.sleep(10);//Esperamos 10milesimas para repetir
                } catch (InterruptedException ex) {
                    Logger.getLogger(It.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
      
}
