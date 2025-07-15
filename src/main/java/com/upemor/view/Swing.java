/* **Summary personal**
   En este archivo, la clase Swing muestra un ejemplo básico de uso de Java Swing para crear una ventana con componentes gráficos.
   Se utiliza un JFrame como contenedor principal, un JPanel para organizar los componentes, y se emplea GridBagLayout para centrar los elementos.
   Los componentes JLabel y JTextArea permiten mostrar un mensaje y recibir texto del usuario, respectivamente.
   Este diseño ilustra cómo se pueden organizar y conectar los elementos visuales en una aplicación Java, siguiendo principios de encapsulamiento y reutilización.
*/
package com.upemor.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;

/** @author gera_ **/
public class Swing {
    // Método para crear y mostrar la ventana
    public void mostrarVentana() {
        // componente JFrame
        JFrame miJFrame = new JFrame("Ejemplo - Java Swing"); /* DECLARACION OBJETO = (<tipo> = JFrame, {nombre} = miJFrame)
           Explicación: Crea la ventana principal de la aplicación con el título especificado.
        */
        miJFrame.setSize(500, 300); /*
           Explicación: Define el tamaño de la ventana principal (ancho=500, alto=300).
        */

        // componente JPanel
        JPanel miJPanel = new JPanel(); /* DECLARACION OBJETO = (<tipo> = JPanel, {nombre} = miJPanel)
           Explicación: Panel que sirve para organizar los componentes dentro del JFrame.
        */
        miJPanel.setSize(300, 300); /*
           Explicación: Define el tamaño del panel (ancho=300, alto=300).
        */
        // usamos este diseño para centrar los componentes de JPanel
        miJPanel.setLayout(new GridBagLayout()); /*
           Explicación: Establece el layout del panel para centrar los componentes.
        */

        // componente JLabel
        JLabel miJLabel = new JLabel(); /* DECLARACION OBJETO = (<tipo> = JLabel, {nombre} = miJLabel)
           Explicación: Etiqueta que muestra un mensaje al usuario.
        */
        miJLabel.setText("Dime tu opinión acerca de Java Swing: "); /*
           Explicación: Define el texto que se mostrará en la etiqueta.
        */

        // componente JTextArea
        JTextArea miJTextArea = new JTextArea(5, 20); /* DECLARACION OBJETO = (<tipo> = JTextArea, {nombre} = miJTextArea)
           Explicación: Área de texto donde el usuario puede escribir su opinión. Se define con 5 filas y 20 columnas.
        */

        // conecta los componentes JLabel y JTextArea en JPanel
        miJPanel.add(miJLabel); /*
           Explicación: Agrega la etiqueta al panel.
        */
        miJPanel.add(miJTextArea); /*
           Explicación: Agrega el área de texto al panel.
        */

        // conectar JPanel a JFrame
        miJFrame.add(miJPanel); /*
           Explicación: Agrega el panel (con sus componentes) a la ventana principal.
        */
        // hacer visible JFrame
        miJFrame.setVisible(true); /*
           Explicación: Hace visible la ventana principal para el usuario.
        */
    }
}
