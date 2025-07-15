# JLabel en Java Swing

## ¿Qué es JLabel?
JLabel es un componente de Java Swing que permite mostrar texto o imágenes estáticas en una interfaz gráfica. Es fundamental para informar, identificar o decorar secciones de la ventana.

## Características Clave
- Puede mostrar texto, iconos o ambos.
- Permite personalizar la fuente, el color y la alineación del texto.
- No es interactivo: no responde a clics ni acciones del usuario.
- Se puede usar como etiqueta descriptiva para otros componentes (por ejemplo, campos de texto).

## Importancia
- Facilita la comunicación visual con el usuario.
- Permite identificar y organizar la interfaz de manera clara y profesional.
- Es esencial para crear interfaces informativas y accesibles.

## Ejemplo Básico
```java
import javax.swing.*;

public class EjemploLabelBasico {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejemplo JLabel");
        JLabel etiqueta = new JLabel("Texto de ejemplo");
        ventana.add(etiqueta);
        ventana.setSize(300, 100);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
```

## Ejemplo con Imagen
```java
import javax.swing.*;

public class EjemploLabelImagen {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("JLabel con imagen");
        ImageIcon icono = new ImageIcon("ruta/imagen.png");
        JLabel etiqueta = new JLabel("Texto", icono, JLabel.CENTER);
        ventana.add(etiqueta);
        ventana.setSize(400, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
```

## Métodos Importantes
- `setText(String)`: Cambia el texto de la etiqueta.
- `setIcon(Icon)`: Asigna una imagen a la etiqueta.
- `setHorizontalAlignment(int)`: Cambia la alineación horizontal del contenido.
- `setFont(Font)`: Personaliza la fuente del texto.
- `setForeground(Color)`: Cambia el color del texto.

## Limitaciones
- No es interactivo; no responde a eventos de usuario.
- Solo muestra información, no permite edición ni interacción.

## Buenas Prácticas
- Usar JLabel para identificar campos y secciones de la interfaz.
- Personalizar la apariencia para mejorar la legibilidad y el diseño.
- Documentar el propósito de cada etiqueta en el código.

## Resumen
JLabel es esencial para mostrar información estática y mejorar la organización visual de las interfaces en Java Swing. Su uso correcto facilita la comunicación y la experiencia del usuario.
