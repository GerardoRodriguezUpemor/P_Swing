// -----------------------------------------------------------------------------
// Clase EjemploFlatLafCompleto
// Ejemplo completo de uso de FlatLaf en Java Swing, mostrando cómo aplicar un Look and Feel moderno y profesional a una ventana.
// Nota pedagógica: Esta clase ilustra cómo mejorar la apariencia visual de las aplicaciones Swing usando FlatLaf y cómo cambiar entre temas.
// -----------------------------------------------------------------------------
package com.upemor.view;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploFlatLafCompleto extends JFrame {
    // -------------------------------------------------------------------------
    // Variable de instancia: labelTema
    // Etiqueta que muestra el tema actual.
    // -------------------------------------------------------------------------
    // Funcional: Permite informar al usuario sobre el tema visual aplicado.
    private JLabel labelTema;
    // Técnica: JLabel es un componente de Swing para mostrar texto.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Variable de instancia: botonClaro
    // Botón para activar el tema claro de FlatLaf.
    // -------------------------------------------------------------------------
    // Funcional: Permite cambiar el Look and Feel a FlatLightLaf.
    private JButton botonClaro;
    // Técnica: JButton es un componente de Swing para botones.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Variable de instancia: botonOscuro
    // Botón para activar el tema oscuro de FlatLaf.
    // -------------------------------------------------------------------------
    // Funcional: Permite cambiar el Look and Feel a FlatDarkLaf.
    private JButton botonOscuro;
    // Técnica: JButton es un componente de Swing para botones.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Constructor EjemploFlatLafCompleto
    // Inicializa la ventana y sus componentes, aplicando FlatLaf.
    // -------------------------------------------------------------------------
    public EjemploFlatLafCompleto() {
        // Funcional: Crea la ventana y llama al método de inicialización.
        init();
        // Técnica: El constructor invoca el método privado init().
    }
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Método init
    // Inicializa los componentes y configura el JFrame con FlatLaf.
    // -------------------------------------------------------------------------
    private void init() {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf()); // Aplica el tema claro por defecto
        } catch (Exception ex) {
            System.err.println("No se pudo aplicar FlatLaf: " + ex);
        }

        labelTema = new JLabel("Tema actual: Claro", JLabel.CENTER);
        botonClaro = new JButton("Tema Claro");
        botonOscuro = new JButton("Tema Oscuro");

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(labelTema);
        panel.add(botonClaro);
        panel.add(botonOscuro);

        this.setContentPane(panel);
        this.setTitle("Ejemplo completo de FlatLaf");
        this.setSize(400, 120);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        // Listener para cambiar al tema claro
        botonClaro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel(new FlatLightLaf());
                    labelTema.setText("Tema actual: Claro");
                    javax.swing.SwingUtilities.updateComponentTreeUI(EjemploFlatLafCompleto.this);
                } catch (Exception ex) {
                    System.err.println("No se pudo aplicar FlatLightLaf: " + ex);
                }
            }
        });

        // Listener para cambiar al tema oscuro
        botonOscuro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                    labelTema.setText("Tema actual: Oscuro");
                    javax.swing.SwingUtilities.updateComponentTreeUI(EjemploFlatLafCompleto.this);
                } catch (Exception ex) {
                    System.err.println("No se pudo aplicar FlatDarkLaf: " + ex);
                }
            }
        });
        // Técnica: Se utilizan ActionListener para cambiar el Look and Feel en tiempo real.
    }
    // -------------------------------------------------------------------------
    // Fin de la clase EjemploFlatLafCompleto
    // -------------------------------------------------------------------------
}
