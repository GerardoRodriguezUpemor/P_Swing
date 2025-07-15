# JButton en Java Swing

## ¿Qué es JButton?
JButton es un componente interactivo de Java Swing que permite ejecutar acciones al hacer clic. Es fundamental para la interacción del usuario con la aplicación.

## Características Clave
- Permite mostrar texto, iconos o ambos.
- Puede personalizarse en color, fuente, tamaño y estilo.
- Soporta eventos de acción para ejecutar código cuando el usuario lo presiona.
- Se puede deshabilitar o habilitar según la lógica de la aplicación.

## Importancia
- Es el principal medio para que el usuario envíe comandos o realice acciones en la interfaz.
- Facilita la navegación, la confirmación y la ejecución de tareas.
- Es esencial para cualquier aplicación interactiva.

## Ejemplo Básico
```java
import javax.swing.*;
import java.awt.event.*;

public class EjemploBotonBasico {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo JButton");
        JButton boton = new JButton("Haz clic");
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("¡Botón presionado!");
            }
        });
        ventana.add(boton);
        ventana.setSize(300, 100);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
```

## Ejemplo Avanzado con Icono y Estado
```java
import javax.swing.*;
import java.awt.event.*;

public class BotonAvanzado {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Botón avanzado");
        ImageIcon icono = new ImageIcon("ruta/icono.png");
        JButton boton = new JButton("Aceptar", icono);
        boton.setEnabled(true); // Habilitado
        boton.addActionListener(e -> JOptionPane.showMessageDialog(ventana, "Acción realizada"));
        ventana.add(boton);
        ventana.setSize(350, 120);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
```

## Métodos Importantes
- `addActionListener(ActionListener)`: Asocia una acción al botón.
- `setText(String)`: Cambia el texto del botón.
- `setIcon(Icon)`: Asigna un icono al botón.
- `setEnabled(boolean)`: Habilita o deshabilita el botón.
- `setBackground(Color)`: Cambia el color de fondo.
- `setFont(Font)`: Personaliza la fuente del texto.

## Limitaciones
- Solo permite acciones simples; para interacción avanzada se usan otros componentes o patrones.
- No almacena información, solo ejecuta acciones.

## Buenas Prácticas
- Usar nombres claros y descriptivos en los botones.
- Asociar acciones relevantes y documentar el propósito de cada botón.
- Personalizar la apariencia para mejorar la experiencia del usuario.

## Resumen
JButton es esencial para la interacción en aplicaciones Java Swing. Su uso correcto permite crear interfaces intuitivas, funcionales y profesionales.
