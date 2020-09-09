package view;

import controller.Controller;
import model.logic.Cinema;

public class View 
{
		private Controller cont;
	    /**
	     * Metodo constructor
	     */
	    public View()
	    {
	    	
	    }
	    
		public void printMenu()
		{
			System.out.println("Seleccione la opcion a su gusto.");
			System.out.println("Opcion1. Ver informaci�n b�sica de la primer y �ltima pel�cula en una lista de los archivos ademas de, el total de pel�culas encontradas en las fuentes");
			System.out.println("Opcion2. Ver informaci�n b�sica de la primer y �ltima pel�cula en un arreglo de los archivos ademas de, el total de pel�culas encontradas en las fuentes");
			System.out.println("Opcion3. Ver el ranking de peliculas.");
			System.out.println("Opcion4. Conocer un director.");
			System.out.println("Opcion5. Conocer un actor.");
			System.out.println("Opcion6. Conocer un genero.");
			System.out.println("Opcion7. Ver el ranking de un genero.");
		}

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
		
		public void printModelo(Cinema modelo)
		{
			// TODO implementar
		}
		
}
