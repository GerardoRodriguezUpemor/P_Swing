// -----------------------------------------------------------------------------
// Clase EjemploBorderLayoutCompleto
// Ejemplo completo de uso de BorderLayout en Java Swing, mostrando cómo organizar componentes en las cinco regiones principales.
// Nota pedagógica: Esta clase ilustra cómo usar BorderLayout para distribuir componentes de manera profesional y clara.
// -----------------------------------------------------------------------------
package com.upemor.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EjemploBorderLayoutCompleto extends JFrame {
    // -------------------------------------------------------------------------
    // Variable de instancia: panelPrincipal
    // Panel principal que utiliza BorderLayout para organizar los componentes.
    // -------------------------------------------------------------------------
    // Funcional: Permite distribuir los componentes en cinco regiones.
    private JPanel panelPrincipal;
    // Técnica: JPanel con BorderLayout para disposición profesional.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Constructor EjemploBorderLayoutCompleto
    // Inicializa la ventana y sus componentes.
    // -------------------------------------------------------------------------
    public EjemploBorderLayoutCompleto() {
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
        // Inicialización del panel principal con BorderLayout
        panelPrincipal = new JPanel(new BorderLayout());

        // Componentes para cada región
        JLabel labelNorte = new JLabel("NORTE", JLabel.CENTER);
        labelNorte.setOpaque(true);
        labelNorte.setBackground(new Color(220, 220, 250));

        JButton botonEste = new JButton("ESTE");
        JButton botonOeste = new JButton("OESTE");
        JLabel labelSur = new JLabel("SUR", JLabel.CENTER);
        labelSur.setOpaque(true);
        labelSur.setBackground(new Color(250, 220, 220));

        JLabel labelCentro = new JLabel("CENTRO", JLabel.CENTER);
        labelCentro.setOpaque(true);
        labelCentro.setBackground(new Color(220, 250, 220));
        labelCentro.setFont(labelCentro.getFont().deriveFont(18f));

        // Agregar componentes a las regiones
        panelPrincipal.add(labelNorte, BorderLayout.NORTH);
        panelPrincipal.add(botonEste, BorderLayout.EAST);
        panelPrincipal.add(labelCentro, BorderLayout.CENTER);
        panelPrincipal.add(botonOeste, BorderLayout.WEST);
        panelPrincipal.add(labelSur, BorderLayout.SOUTH);

        // Configuración del JFrame
        this.setContentPane(panelPrincipal);
        this.setTitle("Ejemplo completo de BorderLayout");
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    // -------------------------------------------------------------------------
    // Fin de la clase EjemploBorderLayoutCompleto
    // -------------------------------------------------------------------------
}
