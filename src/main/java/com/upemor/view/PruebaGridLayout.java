
// -----------------------------------------------------------------------------
// Clase PruebaBorderLayout
// Ventana de ejemplo con BorderLayout. Muestra cinco botones en diferentes posiciones.
// Nota pedagógica: Ejemplo para estudiantes sobre el uso de BorderLayout en interfaces gráficas con Swing.
// -----------------------------------------------------------------------------
// Declaración:
package com.upemor.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**@author PC**/


public class PruebaGridLayout extends JFrame {
    // -------------------------------------------------------------------------
    // Variable de instancia: boton01
    // Botón ubicado en la parte superior (NORTH) de la ventana.
    // -------------------------------------------------------------------------
    // Funcional: Permite interacción en la zona superior.
    private JButton boton01;
    // Técnica: JButton es un componente de Swing para botones.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Variable de instancia: boton02
    // Botón ubicado en la parte derecha (EAST) de la ventana.
    // -------------------------------------------------------------------------
    // Funcional: Permite interacción en la zona derecha.
    private JButton boton02;
    // Técnica: JButton es un componente de Swing para botones.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Variable de instancia: boton03
    // Botón ubicado en el centro (CENTER) de la ventana.
    // -------------------------------------------------------------------------
    // Funcional: Permite interacción en la zona central.
    private JButton boton03;
    // Técnica: JButton es un componente de Swing para botones.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Variable de instancia: boton04
    // Botón ubicado en la parte izquierda (WEST) de la ventana.
    // -------------------------------------------------------------------------
    // Funcional: Permite interacción en la zona izquierda.
    private JButton boton04;
    // Técnica: JButton es un componente de Swing para botones.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Variable de instancia: boton05
    // Botón ubicado en la parte inferior (SOUTH) de la ventana.
    // -------------------------------------------------------------------------
    // Funcional: Permite interacción en la zona inferior.
    private JButton boton05;
    // Técnica: JButton es un componente de Swing para botones.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Constructor PruebaBorderLayout
    // Inicializa la ventana y sus componentes.
    // -------------------------------------------------------------------------
    public PruebaGridLayout() {
        // Funcional: Crea la ventana y llama al método de inicialización.
        init();
        // Técnica: El constructor invoca el método privado init().
    }
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Método init
    // Inicializa los componentes y configura el JFrame con BorderLayout.
    // -------------------------------------------------------------------------
    private void init() {
        // Funcional: Inicializa los botones y los agrega en posiciones específicas del BorderLayout.
        boton01 = new JButton("Crespusculo"); // Botón superior
        boton02 = new JButton("Luna Nueva"); // Botón derecho
        boton03 = new JButton("El dia esta muy AAAAAAAAAAAaaaaaaAaAAaAa"); // Botón central
        boton04 = new JButton("Eclipse"); // Botón izquierdo
        boton05 = new JButton("Amanecer"); // Botón inferior

        JPanel contenedor = new JPanel(new GridLayout(5,4)); // Panel con GridLayout
            contenedor.add(boton01);
            contenedor.add(boton02);
            contenedor.add(boton03);
            contenedor.add(boton04);
            contenedor.add(boton05);
            contenedor.add(jPanel2); // Agrega el panel con etiquetas al contenedor

        this.setContentPane(contenedor); // Establece el panel como contenido principal
        this.setTitle("Mi primer ventana"); // Asigna el título de la ventana
        this.setSize(500, 250); // Define el tamaño de la ventana
        this.setVisible(true); // Hace visible la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la aplicación al cerrar la ventana
        // Técnica: Se utilizan métodos de JFrame y BorderLayout para organizar los componentes.
    }
    // -------------------------------------------------------------------------
    // Fin de la clase PruebaBorderLayout
    // -------------------------------------------------------------------------
}