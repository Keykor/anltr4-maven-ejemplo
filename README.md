# ANTLR4 Maven Ejemplo
Este es un proyecto de ejemplo que utiliza ANTLR4 con Maven y la gramática "Bython". Se implementa un **code sniffer** que no detecta olores (Anosmic Code Sniffer) y se incluye un test para validar su funcionamiento.

----
### Requerimientos

Asegúrate de tener instalados y configurados los **paths** de:
- **Java 21**
- **Maven**
----
### Estructura del proyecto

- Las clases deben ubicarse en la carpeta `src/main/java/oo2/redictado`. 
  - La interfaz `CodeSniffer` define el protocolo que debe seguir un **code sniffer**.
  - También hay una carpeta para el "Anosmic Code Sniffer", como ejemplo. Cada nuevo **code sniffer** que se implemente debe estar en su propia carpeta.

- Las clases de prueba deben ir en `src/test/java/oo2/redictado`.
  - El proyecto incluye una clase de test para probar el "Anosmic Code Sniffer".

- Las gramáticas para ANTLR4 deben colocarse en la carpeta `src/main/antlr4`.

- La carpeta `documentation` está destinada a almacenar la documentación de los **code sniffers** implementados. 
  - En el ejemplo, se incluye una carpeta para el "Anosmic Code Sniffer" y una carpeta que documenta la gramática "Bython", explicando su origen y mostrando ejemplos.
----
### ¿Cómo utilizar ANTLR4?

Para generar las clases de Java correspondientes al **Lexer**, **Parser**, **Listener** y **Visitor** de una gramática específica, sigue estos pasos:

1. Coloca la gramática en la carpeta `src/main/antlr4`.
2. Ejecuta el comando:
   ```bash
   mvn antlr4:antlr4
----
### ¿Cómo compilar y ejecutar los tests?
Para compilar las clases y ejecutar las pruebas con JUnit, usa el siguiente comando:
```bash
mvn test