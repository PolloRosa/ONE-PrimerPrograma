# ONE: PrimerPrograma

![Versión: 1.3.0](https://img.shields.io/badge/VERSIÓN-1.3.0-blue) ![Fecha de lanzamiento: OCTUBRE 2025](https://img.shields.io/badge/Fecha_de_lanzamiento-21/10/2025-blue)

![Java](https://img.shields.io/badge/Java-b07219)

## Introducción

El programa [Oracle Next Education (ONE)](https://www.oracle.com/latam/education/oracle-next-education/) es un programa de educación, inclusión y empleabilidad que forma a personas en tecnología y las conecta con el mercado laboral con el apoyo de empresas asociadas.

Es un programa gratuito que dura 12 meses. Abre inscripciones 2 veces al año donde las personas pueden postular mediante un formulario. Cada generación es enumerada con números arábigos.

El proyecto PrimerPrograma es el primero de los proyectos en Java del programa ONE de Oracle y Alura Latam del grupo G9 que inició en julio 2025. Es el proyecto donde se desarrollan los ejercicios del primer curso *Java: creando tu primera aplicación* de la primera formación *Java Orientado a Objetos G9 - ONE* de la especialización de Back-end.

En esta primera parte de la tercera etapa del programa ONE, las clases han cubierto lo básico sobre la programación en Java: comentarios, estructuras condicionales e iterativas, operaciones aritméticos, relacionales, lógicos y auto-incrementales, uso de variables, tipos de datos, Casting, convenciones de nombres, imprimir texto en consola y obtención de datos con la clase Scanner, la clase String, bloques de texto y formato de textos.

## Descripción del proyecto

PrimerPrograma es una compilación de ejercicios para aplicar lo cubierto en el curso. La mayoría son simples y básicos, pero te invito a revisar la clase Ejercicio2 donde está el *Desafío: juego de adivinación* y la clase Bancaria donde está el *Desafío: aplicación bancaria*.

## Estado del proyecto

El día 21 de octubre del 2025 se lanzó la versión 1.0.0 del proyecto, con la versión operativa del desafío Aplicación Bancaria en la clase Bancaria.

El proyecto actualmente se encuentra en su [versión 1.3.0](#registro-de-cambios).

## Demostración de funcionalidad

La clase PrimeraClase contiene ejercicios de asignación de variables, bloques de texto, impresión en pantalla (consola), formato de textos.

![Captura de la funcionalidad en PrimeraClase](funcionalidad1.png)

La clase Ejercicio1 contiene el ejercicio del Conversor de temperaturas.

El valor a convertir se encuentra ya ingresado en una variable, el programa aplica una fórmula para convertir de grados Celsius a Fahrenheit, muestra en pantalla el resultado, convierte a entero el resultado y lo muestra en patanlla también.

![Captura de la funcionalidad en Ejercicio1](funcionalidad2.png)

La clase Lectura contiene un ejercicio para practicar el uso de la clase Scanner para el ingreso de datos mediante el teclado.

Se solicita al usuario el ingreso de 3 datos que se almacenan en variables, se imprimen en pantalla y se cierra el objeto de la clase Scanner.

![Gif de la funcionalidad en Lectura](funcionalidad3.gif)

La clase Ejercicio2 contiene el desarrollo del *Desafío: juego de adivinación* donde se aplican todo los temas estudiados en el curso.

El usuario tiene 5 intentos para adivinar un número secreto generado al azar por el programa entre 1 y 100, tras cada intento fallido el programa da pistas si el número secreto es mayor o menor que el ingresado. El programa realiza 2 validaciones adicionales: que el valor ingresado sea un número entero y, que el número ingresado se encuentre entre 1 y 100.

![Gif de la funcionalidad en Ejercicio2](funcionalidad4.gif)

La clase Bancaria contiene el desarrollo del *Desafío: aplicativo bancario* donde se aplican todos los temas cubiertos en el curso, a pesar de que el curso ofrece acompañamiento para la programación del desafío, se optó por desarrollarlo primero y revisar el material de apoyo después, incluyéndose en el proyecto solo 2 consejos: usar un bloque de texto para el menú y agregar el bloque default en el switch para opciones no válidas.

El programa simula ser un cajero de banco, donde el cliente tiene un nombre, tipo de cuenta y saldo. El programa ofrece 4 opciones: 1 - Consultar saldo, 2 - Retirar, 3 - Depositar y 9 - Salir, donde las opciones de retiro y depósito afectan el saldo disponible, deben solicitar un monto válido mayor a cero y menor al saldo para el caso del retiro, y deben mostrar el saldo actualizado así como los mensajes de error. El menú se seguirá mostrando hasta que el cliente ingrese la opción 9 - Salir.   

![Gif de la funcionalidad en Bancaria](funcionalidad5.gif)

## Instalación local

1. Clona el código fuente del repositorio.

```
git clone https://github.com/PolloRosa/ONE-PrimerPrograma.git
```

2. Abrir el proyecto con el IDE IntelliJ IDEA.

3. Ejecutar la clase de su elección, ya que todas tienen método main.

## Tecnologías utilizadas

* JDK 17.0.13
* IntelliJ IDEA Community Edition 2025.2.3
* Git para control de versiones

## Registro de cambios

1.3.0 *22 octubre 2025*

* :sparkles: Agrega bloque default en el switch para el ingreso de opciones no válidas en la clase Bancaria.

1.2.0 *22 octubre 2025*

* :pencil2: Corrige el menú para usar bloque de texto en una variable en la clase Bancaria.

1.1.0 *22 octubre 2025*

* :pencil2: Corrige bug que no permite el ingreso de la opción mediante ingreso por teclado después de hacer un retiro o depósito en la clase Bancaria.

1.0.0 *21 octubre 2025*

* :sparkles: Agrega desafío de Aplicación Bancaria en la clase Bancaria, versión testeada y operativa.

0.4.3 *20 octubre 2025*

* :sparkles: Agrega el cierre del scanner al final en la clase Ejercicio2.

0.4.2 *20 octubre 2025*

* :no_entry_sign: Borra el continue del bloque catch en la clase Ejercicio2.

0.4.1 *20 octubre 2025*

* :pencil2: Corrige constante de número máximo en la clase Ejercicio2.
* :sparkles: Agrega constantes para los mensajes de éxito, error y fracaso en la clase Ejercicio2.

0.4.0 *20 octubre 2025*

* :white_check_mark: Agrega desafío de Juego de adivinación en la clase Ejercicio2.

0.3.0 *19 octubre 2025*

* :white_check_mark: Agrega ejercicio para el ingreso de datos usando la clase Scanner en la clase Lectura.

0.2.1 *19 octubre 2025*

* :pencil2: Corrige código en la clase Ejercicio1.

0.2.0 *19 octubre 2025*

* :white_check_mark: Agrega desafío de Conversión de temperaturas en la clase Ejercicio1.

0.1.1 *19 octubre 2025*

* :white_check_mark: Agrega ejercicio de formateo de textos en la clase PrimeraClase.

0.1.0 *17 octubre 2025*

* :white_check_mark: Agrega ejercicios en la clase PrimeraClase:
* Ejercicio sobre asignación en variables.
* Ejercicio sobre operadores auto-incrementales.
* Ejercicio sobre convenciones de código en Java.
* Ejercicio sobre uso de variables de tipo String.

## Autor

Angela Cáceres @PolloRosa :baby_chick:

## Licencia

El proyecto está bajo la licencia MIT. Puedes usarlo, compartirlo y modificarlo libremente, incluso con fines comerciales. La única condición es que conserves el aviso de derechos de autor original y el texto de la licencia en todas las copias o partes sustanciales del software. 