# Actualización Dinámica de la Interfaz (Ejercicio 3)

Este proyecto demuestra cómo modificar el estado de los componentes visuales en tiempo de ejecución, permitiendo que la interfaz responda a las acciones del usuario cambiando su propio contenido.

## 🚀 Funcionalidades
* **Uso de Labels:** Introduce el control `Label` para mostrar texto estático que puede ser manipulado programáticamente.
* **Modificación de Propiedades:** Utiliza el método `setText()` para actualizar el contenido de una etiqueta de forma dinámica tras un evento.
* **Gestión de Hijos en Contenedores:** Emplea `vbox.getChildren().addAll()` para añadir múltiples nodos al grafo de escena de manera eficiente.
* **Espaciado de Layout:** Configura el espaciado interno del contenedor `VBox` (10 píxeles) para mejorar la estética y legibilidad de la interfaz.

## 🛠️ Estructura técnica
El código se centra en la manipulación de nodos dentro del motor de renderizado de JavaFX:
* **Control de Estado:** La interacción ya no se limita a imprimir en consola, sino que altera el **Grafo de Escena** (Scene Graph), forzando un redibujado del componente afectado.
* **Separación de Nodos:** Se establece una jerarquía clara donde el `VBox` actúa como padre de un `Label` (salida de texto) y un `Button` (entrada de usuario).
* **Propiedades de Ventana:** Se ajustan las dimensiones de la `Scene` a 400x200 píxeles para acomodar el nuevo diseño.
* **EventHandler Moderno:** Mantiene el uso de Lambdas para una gestión de eventos limpia y directa sobre las propiedades del objeto `Label`.