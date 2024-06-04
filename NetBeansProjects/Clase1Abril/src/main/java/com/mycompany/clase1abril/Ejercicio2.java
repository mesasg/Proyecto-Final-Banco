/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase1abril;

/**
 *
 * @author saram
 */
import javax.swing.*;
import java.awt.*;

public class Ejercicio2 extends JFrame {
 
 
  private Container panel;

  public Ejercicio2() {
    //super("Ejemplo de colores");
    panel = this.getContentPane();
    panel.add(new MiPanel());
    setSize(500, 500);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String args[]) {
    Ejercicio2 ventana = new Ejercicio2();
  }
 
 
 
}


class MiPanel extends JPanel {

  @Override
  public void paintComponent(Graphics gr) {
     super.paintComponent(gr);
int r,g,b;
  int x=0,y=0;
  for (r=255;r>=0;r-=20)
    for (g=255;g>=0;g-=20)
     for (b=255;b>=0;b-=20) {
       Color c=new Color(r,g,b);
       gr.setColor(c);
       gr.drawString("@",x,y);
       x+=10;
       if (x>=400) {
              x=0;
              y+=10;
          }
       }  
  }
}
