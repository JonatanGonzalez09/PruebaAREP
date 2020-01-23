# Laboratorio 1 #
El objetivo de este laboratorio es implementar una Lista Enlazada (*LinkedList*), para almacenar datos con los cuales posteriormente se calculara la media y la desviación estándar.

## Prerrequisitos ##
Se debe tener conocimientos claros de la programación Orientada a objetos y de las fórmulas para hallar la media y la desviación estándar, también es necesario tener instalado Java 1.8 y también Apache Maven 3.6.0 en el equipo donde se ejecutara la aplicación.

## Ejecutando Pruebas ##
Al ejecutar el comando ```mvn test``` se podrá ver la ejecución de las pruebas de unidad realizadas con **JUnit**

## Construido con ##
[Maven](https://maven.apache.org/): Para la gestión de dependencias.

## Modelo ##
![myimage-alt-tag](https://github.com/JonatanGonzalez09/AREP-Lab1/blob/master/src/resources/Modelo.PNG)

## Documentación Javadoc ##
Para generar la documentacion javadoc, fue necesario ejecutar los siguientes comandos:

```
- mvn javadoc:javadoc
- mvn javadoc:jar
- mvn javadoc:aggregate
- mvn javadoc:aggregate-jar
- mvn javadoc:test-javadoc
- mvn javadoc:test-jar
- mvn javadoc:test-aggregate
- mvn javadoc:test-aggregate-jar
```
La ruta donde encontrara la documentacion es la siguiente: **target\site\apidocs\edu\escuelaing\app**

## Descripción del diseño ##
En el siguiente vinculo encontrara el respectivo PDF de la descripción del diseño desarrollado en LaTeX.
[Click](https://github.com/JonatanGonzalez09/AREP-Lab1/blob/master/src/resources/Lab1.pdf)

## Ejecución ##
Para empaquetar el proyecto se ejecuta el comando:
```
mvn package
```
Para ejecutar las pruebas se ejecuta el comando:
```
mvn test
```
Para ejecutar el programa que calcula la media y la desviación estándar se ejecuta el comando:
```
java -cp target/mi-primera-app-1.0-SNAPSHOT.jar edu.escuelaing.app.App
```

## Licencia ##
Este proyecto cuenta con la licencia [**GNU General Public License v3.0**](https://github.com/JonatanGonzalez09/AREP-Lab1/blob/master/LICENSE)

## Autor ##
Jonatan Esteban Gonzalez Rodriguez 
