# anltr4-maven-ejemplo

Proyecto de ejemplo que utiliza antlr4 con Maven y gramática "PJScript". 
Se crea un refactoring "nulo" (no aplica transformaciones al árbol pero cambia formato de texto) y se hace un test del mismo.

### Requerimientos
Tener instalado y paths configurados de:
- Java
- Maven

### Estructura del proyecto
Las clases deben ir en la carpeta "src/main/java/oo2/redictado". En el ejemplo hay tres clases que definen la estructura de un refactoring, una excepción de refactoring y utilidades para trabajar con el parseo de la gramática "PJscript". También hay una carpeta donde se encuentra el "NullRefactoring". La idea es crear una carpeta nueva por cada refactoring que se desee implementar.

Las clases de test deben ir en la carpeta "src/test/java/oo2/redictado". En el ejemplo hay una clase de test que corresponde al testeo de "NullRefactoring". Para poder utilizar recursos está la carpeta "src/test/resources" donde pueden colocarse ejemplos de código a leer por las clases de test.

Las gramáticas a utilizar con ANTLR4 deben ir en la carpeta "src/main/antlr4".

La idea de la carpeta "documentation" es dejar documentación sobre los refactorings que se vayan creando. En el ejemplo hay una carpeta llamada "NullRefactoring" para mostrar esta idea. También hay una carpeta para la gramática "PJscript" que cuenta su origen y un ejemplo.

### ¿Cómo utilizar ANTLR4?
Para generar las clases de Java que corresponden al Lexer, Parser, Listener y Visitor de una gramática deseada se debe:
- Colocar la gramática en la carpeta "src/main/antlr4"
- Ejecutar el comando "mvn antlr4:antlr4"
Las clases deseadas se generarán automáticamente en la carpeta "src/main/java/oo2/redictado/antlr4".

## ¿Cómo utilizo el proyecto?
Para compilar las clases y lanzar los test de junit utilizar el comando "mvn test".
