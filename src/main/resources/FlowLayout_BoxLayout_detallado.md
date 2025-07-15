# FlowLayout y BoxLayout en Java Swing

## ¿Qué es FlowLayout?
FlowLayout es un gestor de diseño (layout manager) sencillo que organiza los componentes en línea, de izquierda a derecha, y los ajusta automáticamente cuando el contenedor cambia de tamaño.

### Características Clave de FlowLayout
- Los componentes se agregan en orden y se alinean horizontalmente.
- Permite cambiar la alineación (izquierda, centro, derecha).
- El espaciado entre componentes se puede personalizar.
- Es el layout por defecto de `JPanel`.

### Ejemplo Básico de FlowLayout
```java
import javax.swing.*;
import java.awt.*;

public class EjemploFlowLayout {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo FlowLayout");
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 10));
        panel.add(new JButton("Botón 1"));
        panel.add(new JButton("Botón 2"));
        panel.add(new JButton("Botón 3"));
        ventana.setContentPane(panel);
        ventana.setSize(350, 100);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
```

### Métodos Importantes de FlowLayout
- `setAlignment(int)`: Cambia la alineación de los componentes.
- `setHgap(int)`: Espacio horizontal entre componentes.
- `setVgap(int)`: Espacio vertical entre componentes.

### Limitaciones de FlowLayout
- No permite organización en filas o columnas múltiples.
- Los componentes pueden desbordarse si hay muchos en el panel.

## ¿Qué es BoxLayout?
BoxLayout es un layout manager que organiza los componentes en una sola fila (horizontal) o columna (vertical).

### Características Clave de BoxLayout
- Permite organizar componentes en línea recta, horizontal o vertical.
- Se puede combinar con `Box.createRigidArea`, `Box.createGlue` y `Box.createVerticalStrut` para controlar el espaciado.
- Es ideal para menús, barras de herramientas y formularios simples.

### Ejemplo Básico de BoxLayout
```java
import javax.swing.*;
import java.awt.*;

public class EjemploBoxLayout {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo BoxLayout");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Vertical
        panel.add(new JButton("Botón 1"));
        panel.add(Box.createVerticalStrut(10)); // Espacio vertical
        panel.add(new JButton("Botón 2"));
        panel.add(Box.createVerticalStrut(10));
        panel.add(new JButton("Botón 3"));
        ventana.setContentPane(panel);
        ventana.setSize(200, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
```

### Métodos Importantes de BoxLayout
- `BoxLayout(Container, int)`: Crea el layout en horizontal o vertical.
- `Box.createRigidArea(Dimension)`: Espacio fijo entre componentes.
- `Box.createGlue()`: Espacio flexible que se expande.
- `Box.createVerticalStrut(int)`: Espacio vertical fijo.

### Limitaciones de BoxLayout
- Solo permite una fila o columna; para organización más compleja se deben anidar paneles.
- El espaciado y alineación requieren componentes adicionales (`Box`).

## Buenas Prácticas
- Usar FlowLayout para paneles simples y menús horizontales.
- Usar BoxLayout para formularios, menús verticales y barras de herramientas.
- Combinar layouts y anidar paneles para interfaces flexibles.
- Documentar la estructura y el propósito de cada panel.

## Resumen
FlowLayout y BoxLayout son layouts sencillos y útiles para organizar componentes en línea. Su uso correcto permite crear interfaces ordenadas, limpias y fáciles de mantener en Java Swing.
