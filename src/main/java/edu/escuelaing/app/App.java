package edu.escuelaing.app;

import java.io.File;
import java.util.Scanner;

/**
 * Clase que calcula la media y la desviacion estandar de un conjunto de datos.
 */
public class App {

    /**
     * Programa principal que lee el archivo y ejecuta los metodos de media y desviacion estandar
     * @param args 
     * @throws Exception 
     */
    public static void main( String[] args ) throws Exception {
        Scanner reader = new Scanner(new File("src/main/java/edu/escuelaing/app/Casos/datos.txt"));
        int n= Integer.parseInt(reader.next());
        int casos = 1;
        while (n != 0) {
            LinkedList linkedList = new LinkedList();
            while (n!=0) {
                linkedList.add(1, new Nodo(reader.next()));
                n--;
            }
            double media = calcularMedia(linkedList);
            double desviacion = calcularDesviacion(linkedList, media);
            System.out.printf("Caso "+casos+": \n");
            System.out.printf("Media: "+media+"\n");
            System.out.printf("Desviacion Estandar: "+desviacion+"\n");
            System.out.println("--------#----------#---------#---------");
            System.out.println("");
            n= Integer.parseInt(reader.next());
            casos+=1;
        }
    }

    /**
     * Calculate the mean of a list of numbers
     * 
     * @param lista La LinkedList con los datos.
     * @return La media del conjunto de datos.
     * @throws Exception
     * @throws NumberFormatException
     */
    public static double calcularMedia(LinkedList lista) throws NumberFormatException, Exception {
        Nodo node = lista.getHead();
        double mean = Double.parseDouble(node.getDatos());
        int size = 1;
        while (node.nextNodo() != null) {
            mean += Double.parseDouble(lista.nextNodo(node.getId()).getDatos());
            node = node.nextNodo();
            size++;
        }
        return mean / size;
    }

    /**
     * Calcula la desviacion estandar de un coonjunto de datos.
     * 
     * @param lista La linkedList con los datos.
     * @param media La media sacada anteriormente para solucionar la desviacion
     *             estandar.
     * @return La desviacion estandar
     * @throws Exception
     */
    public static double calcularDesviacion(LinkedList lista, double media) throws Exception {
        Nodo node = lista.getHead();
        double sDeviation = Math.pow(Double.parseDouble(node.getDatos()) - media, 2);
        int size = 0;
        while (node.nextNodo() != null) {
            sDeviation += Math.pow(Double.parseDouble(lista.nextNodo(node.getId()).getDatos()) - media, 2);
            node = node.nextNodo();
            size++;
        }
        return Math.pow(sDeviation/size, 0.5);
    }
}

