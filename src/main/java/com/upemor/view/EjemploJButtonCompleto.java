// -----------------------------------------------------------------------------
// Clase EjemploJButtonCompleto
// Ejemplo completo de uso de JButton en Java Swing, mostrando cómo crear botones interactivos y manejar eventos de acción.
// Nota pedagógica: Esta clase ilustra cómo usar JButton para ejecutar acciones y cómo personalizar su comportamiento y apariencia.
// -----------------------------------------------------------------------------
package com.upemor.view;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EjemploJButtonCompleto extends JFrame {
    // -------------------------------------------------------------------------
    // Variable de instancia: botonSaludo
    // Botón que muestra un saludo al hacer clic.
    // -------------------------------------------------------------------------
    // Funcional: Permite interacción básica con el usuario.
    private JButton botonSaludo;
    // Técnica: JButton es un componente de Swing para botones.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Variable de instancia: botonContador
    // Botón que incrementa un contador cada vez que se presiona.
    // -------------------------------------------------------------------------
    // Funcional: Permite interacción y ejecución de acciones repetidas.
    private JButton botonContador;
    // Técnica: JButton es un componente de Swing para botones.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Variable de instancia: labelContador
    // Etiqueta que muestra el valor actual del contador.
    // -------------------------------------------------------------------------
    // Funcional: Permite mostrar información dinámica al usuario.
    private JLabel labelContador;
    // Técnica: JLabel es un componente de Swing para mostrar texto.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Variable de instancia: contador
    // Variable para almacenar el valor del contador.
    // -------------------------------------------------------------------------
    // Funcional: Permite llevar el registro de las veces que se presiona el botón.
    private int contador = 0;
    // Técnica: Variable de tipo int para contar eventos.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Constructor EjemploJButtonCompleto
    // Inicializa la ventana y sus botones.
    // -------------------------------------------------------------------------
    public EjemploJButtonCompleto() {
        // Funcional: Crea la ventana y llama al método de inicialización.
        init();
        // Técnica: El constructor invoca el método privado init().
    }
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Método init
    // Inicializa los botones, etiqueta y configura el JFrame.
    // -------------------------------------------------------------------------
    private void init() {
        // Inicialización de botones y etiqueta
        botonSaludo = new JButton("Saludar");
        botonSaludo.setFont(new Font("Arial", Font.BOLD, 16));
        botonSaludo.setBackground(new Color(173, 216, 230)); // Color azul claro

        botonContador = new JButton("Contar");
        botonContador.setFont(new Font("Arial", Font.BOLD, 16));
        botonContador.setBackground(new Color(144, 238, 144)); // Color verde claro

        labelContador = new JLabel("Contador: 0");
        labelContador.setFont(new Font("Arial", Font.PLAIN, 16));

        // Panel principal con FlowLayout
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(botonSaludo);
        panel.add(botonContador);
        panel.add(labelContador);

        // Configuración del JFrame
        this.setContentPane(panel);
        this.setTitle("Ejemplo completo de JButton");
        this.setSize(400, 120);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        // Listener para el botón de saludo
        botonSaludo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Muestra un saludo en la etiqueta
                labelContador.setText("¡Hola, usuario!");
            }
        });

        // Listener para el botón de contador
        botonContador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador++;
                labelContador.setText("Contador: " + contador);
            }
        });
        // Técnica: Se utilizan ActionListener para manejar eventos de los botones.
    }
    // -------------------------------------------------------------------------
    // Fin de la clase EjemploJButtonCompleto
    // -------------------------------------------------------------------------
}
