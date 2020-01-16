package edu.escuelaing.app;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.LinkedList;
/**
 * Media y Desviación Estandar
 *
 */
public class App{
    public static void main( String[] args ) throws FileNotFoundException, IOException {
        LinkedList<BigDecimal> lista = new LinkedList<BigDecimal>();
        //String ruta = "C:/Users/Jonatan Gonzalez/Desktop/ECI 2020-I/mi-primera-app/src/main/java/edu/escuelaing/app/datos.txt";
        //FileReader f = new FileReader(ruta);
        //BufferedReader b = new BufferedReader(f);

        lista.add(new BigDecimal(5));
        lista.add(new BigDecimal(15));
        lista.add(new BigDecimal(12));
        lista.add(new BigDecimal(18));
        lista.add(new BigDecimal(28));

        BigDecimal media = null;
        BigDecimal desviacionEstandafr = null;
    }
}
