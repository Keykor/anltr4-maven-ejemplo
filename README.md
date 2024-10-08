# ANTLR4 Maven Ejemplo
Este es un proyecto de ejemplo que utiliza [ANTLR4](https://www.antlr.org/) con Maven y la gramática "Bython". Se implementa un **code sniffer** que no detecta olores (Anosmic Code Sniffer) y uno que busca todos los llamados a sentencias `print`. Además, se incluyen tests de unidad para validar su funcionamiento.

## Requerimientos

Asegurate de tener instalados y configurados los **paths** de:
- **Java 21**
- **Maven**

## Estructura del proyecto

El árbol de archivos se ve de la siguiente manera:

```tree
.
├── documentation
│   ├── Anosmic Code Sniffer
│   │   └── Anosmic Code Sniffer.md
│   ├── Bython
│   │   ├── Bython.md
│   │   └── Examples
│   │       ├── bank_account.by
│   │       ├── binary_search.by
│   │       ├── example.by
│   │       ├── factorial_recursivo.by
│   │       ├── lineal_search.by
│   │       └── priority_queue.by
│   └── Print Sniffer
│       └── Print Sniffer.md
├── pom.xml
├── README.md
└── src
    ├── main
    │   ├── antlr4
    │   │   ├── BythonLexer.g4
    │   │   └── BythonParser.g4
    │   └── java
    │       └── oo2
    │           └── redictado
    │               ├── AnosmicCodeSniffer
    │               │   ├── AnosmicCodeSniffer.java
    │               │   └── AnosmicVisitor.java
    │               ├── antlr4
    │               │   ├── BythonLexer.java
    │               │   ├── BythonLexer.tokens
    │               │   ├── BythonParserBaseListener.java
    │               │   ├── BythonParserBaseVisitor.java
    │               │   ├── BythonParser.java
    │               │   ├── BythonParserListener.java
    │               │   ├── BythonParser.tokens
    │               │   └── BythonParserVisitor.java
    │               ├── Aroma.java
    │               ├── AromaReport.java
    │               ├── CodeSniffer.java
    │               ├── PrintSniffer
    │               │   ├── PrintSniffer.java
    │               │   └── PrintSnifferVisitor.java
    │               └── SnifferPipeline.java
    └── test
        └── java
            └── oo2
                └── redictado
                    ├── AnosmicCodeSnifferTest.java
                    └── PrintSnifferTest.java
```

- Las clases deben ubicarse en la carpeta `src/main/java/oo2/redictado`.

  - La interfaz `CodeSniffer` define el protocolo que debe seguir un **code sniffer**.

  - También hay carpetas/paquetes de ejemplo para el "Anosmic Code Sniffer" y "Print Sniffer". Cada nuevo **code sniffer** que se implemente debe estar en su propia carpeta.

  - La clase `SnifferPipeline` es la encargada de ejecutar los **code sniffers** en un orden específico y configurable.

  - La clase `Aroma` representa un mensaje de olor, que contiene información sobre el olor detectado (si lo hubiera).

  - La clase `AromaReport` es un reporte que contiene todos los `Aroma` generados por los **code sniffers** de un `SnifferPipeline`.

- Las clases de prueba deben ir en `src/test/java/oo2/redictado`.

  - El proyecto incluye clases de test para probar el "Anosmic Code Sniffer" y "Print Sniffer".

- Las gramáticas para ANTLR4 deben colocarse en la carpeta `src/main/antlr4`.

- La carpeta `documentation` está destinada a almacenar la documentación de los **code sniffers** implementados.
  - En el ejemplo, se incluyen carpetas para el "Anosmic Code Sniffer" y "Print Sniffer". También hay una carpeta que documenta la gramática "Bython", explicando su origen y mostrando ejemplos.

## Cómo utilizar ANTLR4

Para generar las clases de Java correspondientes al **Lexer**, **Parser**, **Listener** y **Visitor** de una gramática específica, seguí estos pasos:

1. Colocá la gramática en la carpeta `src/main/antlr4`.
2. Ejecutá el comando:
   ```bash
   mvn antlr4:antlr4
   ```

## Cómo compilar y ejecutar los tests

Para compilar las clases y ejecutar las pruebas con JUnit, usá el siguiente comando:

```bash
mvn test
```
