// -----------------------------------------------------------------------------
// Clase EjemploGridBagLayoutCompleto
// Ejemplo completo de uso de GridBagLayout en Java Swing, mostrando cómo organizar componentes en una cuadrícula flexible con posiciones y tamaños personalizados.
// Nota pedagógica: Esta clase ilustra cómo usar GridBagLayout para crear interfaces avanzadas y bien organizadas.
// -----------------------------------------------------------------------------
package com.upemor.view;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EjemploGridBagLayoutCompleto extends JFrame {
    // -------------------------------------------------------------------------
    // Variable de instancia: panelPrincipal
    // Panel principal que utiliza GridBagLayout para organizar los componentes.
    // -------------------------------------------------------------------------
    // Funcional: Permite distribuir los componentes en posiciones y tamaños personalizados.
    private JPanel panelPrincipal;
    // Técnica: JPanel con GridBagLayout para disposición avanzada.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Constructor EjemploGridBagLayoutCompleto
    // Inicializa la ventana y sus componentes.
    // -------------------------------------------------------------------------
    public EjemploGridBagLayoutCompleto() {
        // Funcional: Crea la ventana y llama al método de inicialización.
        init();
        // Técnica: El constructor invoca el método privado init().
    }
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Método init
    // Inicializa los componentes y configura el JFrame con GridBagLayout.
    // -------------------------------------------------------------------------
    private void init() {
        // Inicialización del panel principal con GridBagLayout
        panelPrincipal = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Espaciado entre componentes

        // Etiqueta en la primera fila, primera columna
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panelPrincipal.add(new JLabel("Ejemplo de GridBagLayout"), gbc);

        // Botón en la segunda fila, primera columna
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panelPrincipal.add(new JButton("Botón 1"), gbc);

        // Botón en la segunda fila, segunda columna
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        panelPrincipal.add(new JButton("Botón 2"), gbc);

        // Etiqueta en la tercera fila, ocupa dos columnas
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panelPrincipal.add(new JLabel("Fila inferior, ocupa dos columnas"), gbc);

        // Configuración del JFrame
        this.setContentPane(panelPrincipal);
        this.setTitle("Ejemplo completo de GridBagLayout");
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    // -------------------------------------------------------------------------
    // Fin de la clase EjemploGridBagLayoutCompleto
    // -------------------------------------------------------------------------
}
