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
			System.out.println("Opcion2. Conocer cu�ntas y cu�les pel�culas pertenecen a una compa��a de producci�n en un a�o espec�fico utilizando manejo de colisiones por Linear Probing.");
			System.out.println("Opcion3. Conocer cu�ntas y cu�les pel�culas pertenecen a una compa��a de producci�n en un a�o espec�fico utilizando manejo de colisiones por Separate Chaining.");
			System.out.println("Opcion4. Pruebas de desempe�o.");
			
		}

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
		
		public void printModelo(Cinema modelo)
		{
			// TODO implementar
		}
		
}
