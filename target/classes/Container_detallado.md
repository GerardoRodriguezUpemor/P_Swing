# java.awt.Container en Java

## ¿Qué es Container?
`Container` es una subclase de `Component` que puede contener otros componentes y organizarlos mediante un layout manager. Es la base de todos los paneles y ventanas que agrupan elementos.

## Métodos principales de Container
- `add(Component)`: Agrega un componente.
- `remove(Component)`: Elimina un componente.
- `removeAll()`: Elimina todos los componentes.
- `getComponent(int)`: Obtiene el componente en la posición dada.
- `getComponentCount()`: Número de componentes.
- `getComponents()`: Arreglo de todos los componentes.
- `setLayout(LayoutManager)`: Asigna el layout manager.
- `getLayout()`: Obtiene el layout manager.
- `invalidate()`: Marca el contenedor para revalidación.
- `validate()`: Valida el contenedor y sus hijos.
- `doLayout()`: Realiza el layout de los componentes.
- `paintComponents(Graphics)`: Dibuja los componentes.
- `addContainerListener(ContainerListener)`: Listener para eventos de contenedor.
- `transferFocusBackward()`: Transfiere el foco hacia atrás.
- `transferFocusDownCycle()`: Transfiere el foco a un ciclo descendente.

> Nota: Container hereda de Component, por lo que tiene muchos métodos adicionales.
