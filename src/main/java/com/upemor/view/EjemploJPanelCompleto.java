// -----------------------------------------------------------------------------
// Clase EjemploJPanelCompleto
// Ejemplo completo de uso de JPanel en Java Swing, mostrando cómo agrupar y organizar componentes con diferentes layouts y anidación de paneles.
// Nota pedagógica: Esta clase ilustra cómo usar JPanel para crear interfaces flexibles y bien estructuradas.
// -----------------------------------------------------------------------------
package com.upemor.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EjemploJPanelCompleto extends JFrame {
    // -------------------------------------------------------------------------
    // Variable de instancia: panelSuperior
    // Panel superior con FlowLayout para agrupar componentes de cabecera.
    // -------------------------------------------------------------------------
    // Funcional: Permite organizar componentes en una fila.
    private JPanel panelSuperior;
    // Técnica: JPanel con FlowLayout para disposición horizontal.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Variable de instancia: panelCentral
    // Panel central con BorderLayout para organizar componentes principales.
    // -------------------------------------------------------------------------
    // Funcional: Permite disposición flexible de componentes en regiones.
    private JPanel panelCentral;
    // Técnica: JPanel con BorderLayout para disposición en cinco regiones.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Variable de instancia: panelInferior
    // Panel inferior con FlowLayout para agrupar botones de acción.
    // -------------------------------------------------------------------------
    // Funcional: Permite organizar botones en una fila.
    private JPanel panelInferior;
    // Técnica: JPanel con FlowLayout para disposición horizontal.
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Constructor EjemploJPanelCompleto
    // Inicializa la ventana y sus paneles.
    // -------------------------------------------------------------------------
    public EjemploJPanelCompleto() {
        // Funcional: Crea la ventana y llama al método de inicialización.
        init();
        // Técnica: El constructor invoca el método privado init().
    }
    // -------------------------------------------------------------------------

    // -------------------------------------------------------------------------
    // Método init
    // Inicializa los paneles y configura el JFrame.
    // -------------------------------------------------------------------------
    private void init() {
        // Panel superior con etiqueta y campo de texto
        panelSuperior = new JPanel(new FlowLayout());
        panelSuperior.add(new JLabel("Nombre:"));
        panelSuperior.add(new JTextField(20));

        // Panel central con etiqueta
        panelCentral = new JPanel(new BorderLayout());
        panelCentral.add(new JLabel("Panel central con BorderLayout"), BorderLayout.CENTER);

        // Panel inferior con botones
        panelInferior = new JPanel(new FlowLayout());
        panelInferior.add(new JButton("Aceptar"));
        panelInferior.add(new JButton("Cancelar"));

        // Configuración del JFrame
        this.setLayout(new BorderLayout());
        this.add(panelSuperior, BorderLayout.NORTH); // Panel superior arriba
        this.add(panelCentral, BorderLayout.CENTER); // Panel central al centro
        this.add(panelInferior, BorderLayout.SOUTH); // Panel inferior abajo

        this.setTitle("Ejemplo completo de JPanel");
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    // -------------------------------------------------------------------------
    // Fin de la clase EjemploJPanelCompleto
    // -------------------------------------------------------------------------
}
