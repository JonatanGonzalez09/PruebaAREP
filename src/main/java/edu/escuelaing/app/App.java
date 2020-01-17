package edu.escuelaing.app;

import java.util.LinkedList;

/**
 * Clase principal de la aplicación
 */
public class App 
{
	
	private LinkedList<Double> crearLista(String data) {
		LinkedList<Double> lista = new LinkedList<Double>();
		
		for (String d : data.split(",")) {
			lista.add(Double.parseDouble(d));
		}
		
		return lista;
	}
	
	public void calcular(String rutaArchivo) {
		DataSource ds = new DataSource();
		ds.cargarArchivo(rutaArchivo);
		String[] properties = ds.getDatos();
		
		if (properties != null) {
			int cont=1;
			for (String property : properties) {
				Calc calc = new Calc(crearLista(property));
				System.out.println("Caso "+cont+" :");
				System.out.println("Media aritmetica: " + calc.calcularMedia());
				System.out.println("Desviación estandar: " + calc.calcularDesviacion());
				System.out.println("---------#---------#---------#---------#--------#");
				cont+=1;
			}	
		}
	}
	
    public static void main( String[] args )
    {
        App app = new App();
        app.calcular("/home/jonatan.gonzalez/Downloads/PruebaAREP/mi-primera-app/data/datos.txt");
    }
}