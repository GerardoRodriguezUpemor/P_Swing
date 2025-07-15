
// -----------------------------------------------------------------------------
// Clase Run
// Clase principal del proyecto Maven. Muestra un mensaje de organización exitosa.
// Nota pedagógica: Este archivo es el punto de entrada del programa y sirve para verificar la estructura y funcionamiento básico del proyecto.
// -----------------------------------------------------------------------------
// Declaración:
package com.upemor;


import com.upemor.view.MiPrimerVentana;
import com.upemor.view.PruebaBorderLayout;
import com.upemor.view.PruebaFlowLayout;
import com.upemor.view.PruebaGridLayout;
import com.upemor.view.Swing;
// import com.upemor.view.OtraClaseEjemplo; // Si tienes otra clase

public class Run {
    // -------------------------------------------------------------------------
    // Método main
    // Punto de entrada del programa. Ejecuta la aplicación y muestra una ventana de ejemplo.
    // -------------------------------------------------------------------------
    public static void main(String[] args) {
        // Funcional: Muestra la ventana MiPrimerVentana.
        new MiPrimerVentana(); // Descomenta para probar esta ventana

        //new PruebaBorderLayout(); // Descomenta para probar esta ventana

        //new PruebaFlowLayout(); // Descomenta para probar esta ventana

        //new Swing(); // Descomenta para probar la ventana Swing

        //new PruebaGridLayout(); // Descomenta para probar la ventana con GridLayout

        // new OtraClaseEjemplo(); // Descomenta para probar otra ventana

        // Técnica: Instancia la clase seleccionada para mostrar la interfaz gráfica.

    }
    // -------------------------------------------------------------------------
    // Fin de la clase Run
    // -------------------------------------------------------------------------
}
