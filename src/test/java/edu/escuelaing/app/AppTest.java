package edu.escuelaing.app;

import java.util.Locale;

import org.junit.Test;

import junit.framework.Assert;

public class AppTest{

    private LinkedList LlenarLinkedList() {
        LinkedList pruebaList = new LinkedList();
        pruebaList.add(1, new Nodo(160));
        pruebaList.add(1, new Nodo(591));
        pruebaList.add(1, new Nodo(114));
        pruebaList.add(1, new Nodo(229));
        pruebaList.add(1, new Nodo(230));
        pruebaList.add(1, new Nodo(270));
        pruebaList.add(1, new Nodo(128));
        pruebaList.add(1, new Nodo(1657));
        pruebaList.add(1, new Nodo(624));
        pruebaList.add(1, new Nodo(1503));
        return pruebaList;
    }

    @Test
    public void CalcularMediaTest() throws NumberFormatException, Exception {
        double media = App.calcularMedia(LlenarLinkedList());
        //String mediaDef = String.format(Locale.US, "%.2f", media);
        Assert.assertEquals(550.6, media);
    }

    @Test
    public void CalcularDesviacionEstandarTest() throws NumberFormatException, Exception {
        double media = App.calcularMedia(LlenarLinkedList());
        double desviacion = App.calcularDesviacion(LlenarLinkedList(), media);
        String desvDef = String.format(Locale.US, "%.2f", desviacion);
        Assert.assertEquals("572.03", desvDef);
    }

}
