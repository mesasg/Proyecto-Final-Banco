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

public class Gui01 extends JFrame {
  Container panel;
  JButton miboton;

  public Gui01() {
    //super("Ejemplo 01 con botón");
    // Configurar componentes ;
    miboton = new JButton("Aceptar");
    panel = this.getContentPane();
    panel.add(miboton);
    setSize(200,100);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String args[]) {
    Gui01 ventana = new Gui01();
  }
}


