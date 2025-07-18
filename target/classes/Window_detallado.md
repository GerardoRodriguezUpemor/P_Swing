# java.awt.Window en Java

## ¿Qué es Window?
`Window` es una clase abstracta de AWT que representa una ventana de nivel superior sin bordes ni barra de título. Es la superclase directa de `Frame`, `Dialog` y `JWindow`.

## Métodos principales de Window
- `setVisible(boolean)`: Muestra u oculta la ventana.
- `isVisible()`: Indica si la ventana está visible.
- `setLocation(int, int)`: Establece la posición de la ventana.
- `getLocation()`: Obtiene la posición de la ventana.
- `setSize(int, int)`: Define el tamaño de la ventana.
- `getSize()`: Obtiene el tamaño de la ventana.
- `setBounds(int, int, int, int)`: Define posición y tamaño.
- `getBounds()`: Obtiene posición y tamaño.
- `setAlwaysOnTop(boolean)`: Mantiene la ventana encima de las demás.
- `isAlwaysOnTop()`: Indica si está siempre encima.
- `toFront()`: Trae la ventana al frente.
- `toBack()`: Envía la ventana al fondo.
- `pack()`: Ajusta el tamaño al contenido preferido.
- `dispose()`: Libera los recursos y cierra la ventana.
- `addWindowListener(WindowListener)`: Añade un listener para eventos de ventana.
- `setOpacity(float)`: Cambia la opacidad (Java 7+).
- `getOpacity()`: Obtiene la opacidad.
- `setShape(Shape)`: Cambia la forma (Java 7+).
- `getShape()`: Obtiene la forma.
- `setFocusableWindowState(boolean)`: Permite o no recibir foco.
- `isFocusableWindow()`: Indica si puede recibir foco.

> Nota: Window hereda de Container y Component, por lo que tiene muchos métodos adicionales.
