# JFrame en Java Swing

## ¿Qué es JFrame?
JFrame es la clase principal para crear ventanas en aplicaciones Java Swing. Actúa como el contenedor raíz donde se agregan y organizan todos los componentes gráficos de la interfaz.

## Características Clave
- Proporciona una ventana con barra de título, controles de minimizar, maximizar y cerrar.
- Permite agregar menús, paneles, botones, etiquetas y cualquier componente Swing.
- Se puede personalizar el tamaño, el título, el icono y el comportamiento de cierre.

## Importancia
- Es el punto de entrada visual de la mayoría de aplicaciones de escritorio en Java.
- Permite estructurar la interfaz gráfica de manera profesional y modular.
- Facilita la integración de layouts y componentes para crear interfaces complejas.

## Ejemplo Básico
```java
import javax.swing.JFrame;

public class MiVentana extends JFrame {
    public MiVentana() {
        this.setTitle("Mi ventana principal");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new MiVentana();
    }
}
```

## Métodos Importantes
- `setTitle(String)`: Cambia el título de la ventana.
- `setSize(int, int)`: Define el tamaño de la ventana.
- `setDefaultCloseOperation(int)`: Controla el comportamiento al cerrar la ventana.
- `setContentPane(Container)`: Establece el panel principal de la ventana.
- `setVisible(boolean)`: Muestra u oculta la ventana.
- `setLocationRelativeTo(Component)`: Centra la ventana en pantalla.

## Limitaciones
- Solo debe haber una ventana principal visible a la vez.
- No es recomendable para diálogos secundarios; para eso se usan `JDialog` o `JOptionPane`.
- No soporta animaciones avanzadas ni efectos modernos sin librerías externas.

## Buenas Prácticas
- Usar layouts para organizar los componentes dentro del JFrame.
- Separar la lógica de la interfaz en paneles (`JPanel`) y controladores.
- Documentar el código y seguir una estructura profesional.

## Ejemplo Avanzado con Paneles y Layouts
```java
import javax.swing.*;
import java.awt.*;

public class VentanaAvanzada extends JFrame {
    public VentanaAvanzada() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JLabel("Norte"), BorderLayout.NORTH);
        panel.add(new JButton("Centro"), BorderLayout.CENTER);
        panel.add(new JLabel("Sur"), BorderLayout.SOUTH);
        this.setContentPane(panel);
        this.setTitle("Ventana avanzada");
        this.setSize(500, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new VentanaAvanzada();
    }
}
```

## Resumen
JFrame es la base para cualquier ventana en Java Swing. Dominar su uso y configuración es esencial para crear aplicaciones gráficas robustas, modernas y bien organizadas.
