# Swing_Explication

This code is the entry point for a Java Swing application. It initializes the GUI by creating an instance of a specific class that contains the Swing components and layout. The commented lines indicate different classes that can be instantiated to display various GUI layouts and components, such as BorderLayout, FlowLayout, GridLayout, and others. Uncommenting these lines allows the user to test different Swing interfaces.

## How to Use
- Open `Run.java` in `src/main/java/com/upemor/Run.java`.
- Uncomment the line corresponding to the GUI class you want to test (e.g., `MiPrimerVentana`, `PruebaBorderLayout`, etc.).
- Run the project using Maven or your IDE.
- Each class demonstrates a different layout or set of Swing components.

## Available GUI Classes
- `MiPrimerVentana`: Basic window with label and text area.
- `PruebaBorderLayout`: Example using BorderLayout.
- `PruebaFlowLayout`: Example using FlowLayout.
- `PruebaGridLayout`: Example using GridLayout.
- `Swing`: Example window with custom components.
- *(Add more classes as needed)*

## Project Structure
```
P_Swing/
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── upemor/
│   │   │           ├── Run.java
│   │   │           └── view/
│   │   │               ├── MiPrimerVentana.java
│   │   │               ├── PruebaBorderLayout.java
│   │   │               ├── PruebaFlowLayout.java
│   │   │               ├── PruebaGridLayout.java
│   │   │               ├── Swing.java
│   │   │               └── ...
│   │   └── resources/
│   └── test/
│       ├── java/
│       └── resources/
```

## Documentation
- See the `resources` folder for detailed explanations of each Swing concept, layout, and component.
- Files like `JFrame_detallado.md`, `JPanel_detallado.md`, etc., provide in-depth guides and examples.

## Requirements
- Java 8 or higher
- Maven
- FlatLaf dependency (for modern Look and Feel)

## Getting Started
1. Clone the repository.
2. Run `mvn clean install` to download dependencies.
3. Open and run `Run.java` to test the different GUI classes.

---
Feel free to add new GUI classes or layouts to expand your Swing learning and experimentation!
