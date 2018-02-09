package com.company;
import javax.swing.*;
import java.awt.*;
public class Ventana extends JFrame{
    private JButton etiqueta  = new JButton("Nombre1");
    private JButton etiqueta2 = new JButton("Nombre2");
    private JButton etiqueta3 = new JButton("Nombre3");
    private JButton etiqueta4 = new JButton("Nombre4");
    private JButton etiqueta5 = new JButton("Nombre5");

    public Ventana(){
        super("Ejemplo de BorderLayout");
        setLayout(new BorderLayout());
        add(etiqueta, BorderLayout.NORTH);
        add(etiqueta2, BorderLayout.CENTER);
        add(etiqueta3, BorderLayout.SOUTH);
        add(etiqueta4, BorderLayout.WEST);
        add(etiqueta5, BorderLayout.EAST);
    }
}