# Laboratorio 1 #
El objetivo de este laboratorio es implementar una Lista Enlazada (*LinkedList*), para guardar datos con los cuales posteriormente se calculara la Media y la Desviación Estándar

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
