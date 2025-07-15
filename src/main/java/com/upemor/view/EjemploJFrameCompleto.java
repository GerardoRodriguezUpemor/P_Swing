// -----------------------------------------------------------------------------
// Clase EjemploJFrameCompleto
// Ejemplo completo de uso de JFrame en Java Swing, mostrando cómo crear una ventana principal con varios componentes y gestionar eventos.
// Nota pedagógica: Esta clase ilustra las mejores prácticas para crear interfaces gráficas robustas y bien organizadas usando JFrame.
// -----------------------------------------------------------------------------
package com.upemor.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;

public class EjemploJFrameCompleto extends JFrame {
    // -------------------------------------------------------------------------
    // Variable de instancia: labelTitulo
    // Etiqueta principal que muestra el título de la ventana.
    // -------------------------------------------------------------------------
    // Funcional: Permite mostrar información estática al usuario.
    private JLabel labelTitulo;
    // Técnica: JLabel es un componente de Swing para mostrar texto.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Variable de instancia: areaTexto
    // Área de texto para entrada y visualización de información.
    // -------------------------------------------------------------------------
    // Funcional: Permite al usuario escribir y ver texto.
    private JTextArea areaTexto;
    // Técnica: JTextArea es un componente de Swing para áreas de texto multilínea.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Variable de instancia: botonMostrar
    // Botón que muestra el contenido del área de texto en un cuadro de diálogo.
    // -------------------------------------------------------------------------
    // Funcional: Permite interacción y ejecución de acciones.
    private JButton botonMostrar;
    // Técnica: JButton es un componente de Swing para botones.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Variable de instancia: panelPrincipal
    // Panel principal que organiza los componentes usando BorderLayout.
    // -------------------------------------------------------------------------
    // Funcional: Agrupa y organiza los componentes en la ventana.
    private JPanel panelPrincipal;
    // Técnica: JPanel permite usar diferentes layouts para organizar componentes.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Constructor EjemploJFrameCompleto
    // Inicializa la ventana y sus componentes.
    // -------------------------------------------------------------------------
    public EjemploJFrameCompleto() {
        // Funcional: Crea la ventana y llama al método de inicialización.
        init();
        // Técnica: El constructor invoca el método privado init().
    }
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Método init
    // Inicializa los componentes y configura el JFrame.
    // -------------------------------------------------------------------------
    private void init() {
        // Inicialización de componentes
        labelTitulo = new JLabel("Ejemplo completo de JFrame"); // Título
        areaTexto = new JTextArea(5, 30); // Área de texto con tamaño inicial
        botonMostrar = new JButton("Mostrar texto"); // Botón para mostrar texto

        // Panel principal con BorderLayout
        panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.add(labelTitulo, BorderLayout.NORTH); // Título arriba
        panelPrincipal.add(areaTexto, BorderLayout.CENTER); // Área de texto al centro
        panelPrincipal.add(botonMostrar, BorderLayout.SOUTH); // Botón abajo

        // Configuración del JFrame
        this.setContentPane(panelPrincipal); // Establece el panel como contenido principal
        this.setTitle("Ventana Principal - Ejemplo JFrame"); // Título de la ventana
        this.setSize(400, 250); // Tamaño de la ventana
        this.setLocationRelativeTo(null); // Centra la ventana en pantalla
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la aplicación al cerrar la ventana
        this.setVisible(true); // Hace visible la ventana

        // Agrega el listener al botón
        botonMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Muestra el contenido del área de texto en un cuadro de diálogo
                JOptionPane.showMessageDialog(EjemploJFrameCompleto.this,
                        areaTexto.getText(),
                        "Texto ingresado", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        // Técnica: Se utiliza ActionListener para manejar eventos de botón.
    }
    // -------------------------------------------------------------------------
    // Fin de la clase EjemploJFrameCompleto
    // -------------------------------------------------------------------------
}
