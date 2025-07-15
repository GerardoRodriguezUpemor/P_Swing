# BorderLayout en Java Swing

## ¿Qué es BorderLayout?
BorderLayout es un gestor de diseño (layout manager) en Java Swing que permite organizar los componentes en cinco regiones principales dentro de un contenedor: NORTH, SOUTH, EAST, WEST y CENTER.

## Características Clave
- Cada región puede contener un solo componente.
- El componente en CENTER ocupa el espacio restante.
- Permite crear interfaces claras y estructuradas.
- Es el layout por defecto de `JFrame` y `JDialog`.

## Importancia
- Facilita la organización visual de la ventana.
- Permite distribuir los componentes de manera profesional y lógica.
- Es ideal para interfaces con barra de menú, paneles laterales y área principal.

## Ejemplo Básico
```java
import javax.swing.*;
import java.awt.*;

public class EjemploBorderLayout {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo BorderLayout");
        ventana.setLayout(new BorderLayout());
        ventana.add(new JLabel("Norte"), BorderLayout.NORTH);
        ventana.add(new JButton("Centro"), BorderLayout.CENTER);
        ventana.add(new JLabel("Sur"), BorderLayout.SOUTH);
        ventana.add(new JButton("Este"), BorderLayout.EAST);
        ventana.add(new JButton("Oeste"), BorderLayout.WEST);
        ventana.setSize(400, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
```

## Métodos Importantes
- `add(Component, String)`: Agrega un componente en una región específica.
- `setHgap(int)`: Define el espacio horizontal entre componentes.
- `setVgap(int)`: Define el espacio vertical entre componentes.

## Limitaciones
- Solo un componente por región; si se agrega otro, reemplaza al anterior.
- No permite organización compleja dentro de una región sin paneles adicionales.

## Buenas Prácticas
- Usar paneles (`JPanel`) dentro de las regiones para agregar más de un componente.
- Documentar la función de cada región en el código.
- Combinar BorderLayout con otros layouts para interfaces flexibles.

## Ejemplo Avanzado con Paneles
```java
import javax.swing.*;
import java.awt.*;

public class BorderLayoutAvanzado {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("BorderLayout avanzado");
        ventana.setLayout(new BorderLayout());
        JPanel panelNorte = new JPanel();
        panelNorte.add(new JLabel("Barra superior"));
        ventana.add(panelNorte, BorderLayout.NORTH);
        JPanel panelCentro = new JPanel();
        panelCentro.add(new JButton("Botón central"));
        ventana.add(panelCentro, BorderLayout.CENTER);
        ventana.setSize(500, 250);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
```

## Resumen
BorderLayout es esencial para organizar interfaces en Java Swing de manera profesional y clara. Su uso correcto permite crear ventanas estructuradas y fáciles de usar.
