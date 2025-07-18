# java.awt.Component en Java

## ¿Qué es Component?
`Component` es la clase base para todos los elementos gráficos de AWT y Swing. Define las propiedades y comportamientos comunes de cualquier elemento visual.

## Métodos principales de Component
- `setSize(int, int)`: Define el tamaño del componente.
- `getSize()`: Obtiene el tamaño.
- `setLocation(int, int)`: Establece la posición.
- `getLocation()`: Obtiene la posición.
- `setBounds(int, int, int, int)`: Define posición y tamaño.
- `getBounds()`: Obtiene posición y tamaño.
- `setBackground(Color)`: Cambia el color de fondo.
- `getBackground()`: Obtiene el color de fondo.
- `setForeground(Color)`: Cambia el color de primer plano.
- `getForeground()`: Obtiene el color de primer plano.
- `setFont(Font)`: Cambia la fuente.
- `getFont()`: Obtiene la fuente.
- `setVisible(boolean)`: Muestra u oculta el componente.
- `isVisible()`: Indica si está visible.
- `setEnabled(boolean)`: Habilita o deshabilita el componente.
- `isEnabled()`: Indica si está habilitado.
- `setFocusable(boolean)`: Permite recibir foco.
- `isFocusable()`: Indica si puede recibir foco.
- `requestFocus()`: Solicita el foco.
- `add(Component)`: Agrega un componente hijo (solo en contenedores).
- `remove(Component)`: Elimina un componente hijo.
- `repaint()`: Redibuja el componente.
- `paint(Graphics)`: Dibuja el componente.
- `addComponentListener(ComponentListener)`: Listener para eventos de componente.

> Nota: Component es la base de todos los elementos gráficos, por lo que sus métodos están presentes en todos los componentes Swing y AWT.
