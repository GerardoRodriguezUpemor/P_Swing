// -----------------------------------------------------------------------------
// Clase EjemploJLabelCompleto
// Ejemplo completo de uso de JLabel en Java Swing, mostrando cómo presentar texto e imágenes estáticas en una interfaz gráfica.
// Nota pedagógica: Esta clase ilustra cómo usar JLabel para mostrar información visual y cómo personalizar su apariencia.
// -----------------------------------------------------------------------------
package com.upemor.view;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EjemploJLabelCompleto extends JFrame {
    // -------------------------------------------------------------------------
    // Variable de instancia: labelTexto
    // JLabel para mostrar texto estático en la ventana.
    // -------------------------------------------------------------------------
    // Funcional: Permite mostrar mensajes o títulos al usuario.
    private JLabel labelTexto;
    // Técnica: JLabel es un componente de Swing para mostrar texto.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Variable de instancia: labelImagen
    // JLabel para mostrar una imagen estática en la ventana.
    // -------------------------------------------------------------------------
    // Funcional: Permite mostrar imágenes decorativas o informativas.
    private JLabel labelImagen;
    // Técnica: JLabel puede mostrar imágenes usando ImageIcon.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Constructor EjemploJLabelCompleto
    // Inicializa la ventana y sus etiquetas.
    // -------------------------------------------------------------------------
    public EjemploJLabelCompleto() {
        // Funcional: Crea la ventana y llama al método de inicialización.
        init();
        // Técnica: El constructor invoca el método privado init().
    }
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Método init
    // Inicializa los JLabel y configura el JFrame.
    // -------------------------------------------------------------------------
    private void init() {
        // Inicialización de JLabel para texto
        labelTexto = new JLabel("Ejemplo de JLabel mostrando texto", JLabel.CENTER);
        labelTexto.setFont(new Font("Arial", Font.BOLD, 18)); // Personaliza la fuente

        // Inicialización de JLabel para imagen
        // Puedes usar una imagen local, aquí se usa un icono por defecto
        labelImagen = new JLabel();
        labelImagen.setIcon(new ImageIcon()); // Si tienes una imagen, pon la ruta: new ImageIcon("ruta/imagen.png")
        labelImagen.setText("(Aquí iría una imagen)"); // Texto alternativo si no hay imagen
        labelImagen.setHorizontalAlignment(JLabel.CENTER);

        // Panel principal con BorderLayout
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(labelTexto, BorderLayout.NORTH); // Texto arriba
        panel.add(labelImagen, BorderLayout.CENTER); // Imagen al centro

        // Configuración del JFrame
        this.setContentPane(panel);
        this.setTitle("Ejemplo completo de JLabel");
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    // -------------------------------------------------------------------------
    // Fin de la clase EjemploJLabelCompleto
    // -------------------------------------------------------------------------
}
