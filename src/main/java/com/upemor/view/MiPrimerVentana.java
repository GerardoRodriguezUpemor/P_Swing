

// -----------------------------------------------------------------------------
// Clase MiPrimerVentana
// Ventana de ejemplo con Swing. Muestra una etiqueta y un área de texto.
// Nota pedagógica: Ejemplo básico para estudiantes sobre cómo crear interfaces gráficas con Swing y organizar componentes.
// -----------------------------------------------------------------------------
// Declaración:
package com.upemor.view;

import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MiPrimerVentana extends JFrame {
    // -------------------------------------------------------------------------
    // Variable de instancia: label01
    // Etiqueta de texto que se muestra en la ventana.
    // -------------------------------------------------------------------------
    // Funcional: Permite mostrar información estática al usuario.
    private JLabel label01;
    // Técnica: JLabel es un componente de Swing para mostrar texto.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Variable de instancia: textarea01
    // Área de texto donde el usuario puede escribir o visualizar información.
    // -------------------------------------------------------------------------
    // Funcional: Permite la entrada y visualización de texto.
    private JTextArea textarea01;
    // Técnica: JTextArea es un componente de Swing para áreas de texto multilínea.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Constructor MiPrimerVentana
    // Inicializa la ventana y sus componentes.
    // -------------------------------------------------------------------------
    public MiPrimerVentana() {
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
        // Funcional: Inicializa los componentes y configura el diseño de la ventana.
        label01 = new JLabel("Esta es una etiqueta"); // Crea la etiqueta
        textarea01 = new JTextArea(); // Crea el área de texto

        JPanel contenedor = new JPanel(new GridBagLayout()); // Crea el panel con GridBagLayout
        contenedor.add(label01); // Agrega la etiqueta al panel
        contenedor.add(textarea01); // Agrega el área de texto al panel

        this.setContentPane(contenedor); // Establece el panel como contenido principal
        this.setTitle("Mi primer ventana"); // Asigna el título de la ventana
        this.setSize(500, 250); // Define el tamaño de la ventana
        this.setVisible(true); // Hace visible la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la aplicación al cerrar la ventana
        // Técnica: Se utilizan métodos de JFrame para configurar la ventana y sus componentes.
    }
    // -------------------------------------------------------------------------
    // Fin de la clase MiPrimerVentana
    // -------------------------------------------------------------------------
}