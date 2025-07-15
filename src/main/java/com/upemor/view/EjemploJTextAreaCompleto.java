// -----------------------------------------------------------------------------
// Clase EjemploJTextAreaCompleto
// Ejemplo completo de uso de JTextArea en Java Swing, mostrando cómo crear un área de texto multilínea, personalizarla y gestionar su contenido.
// Nota pedagógica: Esta clase ilustra cómo usar JTextArea para entrada y visualización de información, y cómo interactuar con su contenido.
// -----------------------------------------------------------------------------
package com.upemor.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EjemploJTextAreaCompleto extends JFrame {
    // -------------------------------------------------------------------------
    // Variable de instancia: areaTexto
    // Área de texto multilínea para entrada y visualización de información.
    // -------------------------------------------------------------------------
    // Funcional: Permite al usuario escribir y ver texto en varias líneas.
    private JTextArea areaTexto;
    // Técnica: JTextArea es un componente de Swing para áreas de texto multilínea.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Variable de instancia: botonLimpiar
    // Botón para limpiar el contenido del área de texto.
    // -------------------------------------------------------------------------
    // Funcional: Permite borrar rápidamente el texto ingresado.
    private JButton botonLimpiar;
    // Técnica: JButton es un componente de Swing para botones.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Variable de instancia: botonMostrar
    // Botón para mostrar el contenido del área de texto en consola.
    // -------------------------------------------------------------------------
    // Funcional: Permite visualizar el texto ingresado por el usuario.
    private JButton botonMostrar;
    // Técnica: JButton es un componente de Swing para botones.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Constructor EjemploJTextAreaCompleto
    // Inicializa la ventana y sus componentes.
    // -------------------------------------------------------------------------
    public EjemploJTextAreaCompleto() {
        // Funcional: Crea la ventana y llama al método de inicialización.
        init();
        // Técnica: El constructor invoca el método privado init().
    }
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Método init
    // Inicializa el área de texto, botones y configura el JFrame.
    // -------------------------------------------------------------------------
    private void init() {
        // Inicialización de JTextArea con scroll
        areaTexto = new JTextArea(8, 30);
        areaTexto.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane scroll = new JScrollPane(areaTexto);

        // Inicialización de botones
        botonLimpiar = new JButton("Limpiar");
        botonMostrar = new JButton("Mostrar en consola");

        // Panel inferior para los botones
        JPanel panelBotones = new JPanel();
        panelBotones.add(botonLimpiar);
        panelBotones.add(botonMostrar);

        // Configuración del JFrame
        this.setLayout(new BorderLayout());
        this.add(scroll, BorderLayout.CENTER); // Área de texto al centro
        this.add(panelBotones, BorderLayout.SOUTH); // Botones abajo
        this.setTitle("Ejemplo completo de JTextArea");
        this.setSize(450, 250);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        // Listener para limpiar el área de texto
        botonLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.setText(""); // Borra el contenido
            }
        });

        // Listener para mostrar el contenido en consola
        botonMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Texto ingresado:\n" + areaTexto.getText());
            }
        });
        // Técnica: Se utilizan ActionListener para manejar eventos de los botones.
    }
    // -------------------------------------------------------------------------
    // Fin de la clase EjemploJTextAreaCompleto
    // -------------------------------------------------------------------------
}
