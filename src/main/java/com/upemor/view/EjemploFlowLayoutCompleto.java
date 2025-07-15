// -----------------------------------------------------------------------------
// Clase EjemploFlowLayoutCompleto
// Ejemplo completo de uso de FlowLayout en Java Swing, mostrando cómo organizar componentes en línea, de izquierda a derecha, y cómo personalizar el espaciado.
// Nota pedagógica: Esta clase ilustra cómo usar FlowLayout para crear interfaces simples y ordenadas.
// -----------------------------------------------------------------------------
package com.upemor.view;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EjemploFlowLayoutCompleto extends JFrame {
    // -------------------------------------------------------------------------
    // Variable de instancia: panelPrincipal
    // Panel principal que utiliza FlowLayout para organizar los componentes en línea.
    // -------------------------------------------------------------------------
    // Funcional: Permite organizar los componentes en una sola fila, alineados de izquierda a derecha.
    private JPanel panelPrincipal;
    // Técnica: JPanel con FlowLayout para disposición horizontal y ordenada.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Constructor EjemploFlowLayoutCompleto
    // Inicializa la ventana y sus componentes.
    // -------------------------------------------------------------------------
    public EjemploFlowLayoutCompleto() {
        // Funcional: Crea la ventana y llama al método de inicialización.
        init();
        // Técnica: El constructor invoca el método privado init().
    }
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Método init
    // Inicializa los componentes y configura el JFrame con FlowLayout.
    // -------------------------------------------------------------------------
    private void init() {
        // Inicialización del panel principal con FlowLayout
        panelPrincipal = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 10)); // Alineación izquierda, espaciado horizontal 20, vertical 10

        // Agregar botones al panel
        for (int i = 1; i <= 5; i++) {
            JButton boton = new JButton("Botón " + i);
            boton.setBackground(new Color(200 + i*10, 220 - i*10, 240 - i*5));
            panelPrincipal.add(boton);
        }

        // Configuración del JFrame
        this.setContentPane(panelPrincipal);
        this.setTitle("Ejemplo completo de FlowLayout");
        this.setSize(500, 120);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    // -------------------------------------------------------------------------
    // Fin de la clase EjemploFlowLayoutCompleto
    // -------------------------------------------------------------------------
}
