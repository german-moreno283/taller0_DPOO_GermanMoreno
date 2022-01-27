package uniandes.dpoo.taller0.modificacion;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Scanner;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import  uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;


public class Modificacion {
	private CalculadoraEstadisticas calculadora;


	private void ejecutarCargarAtletas()
	{
		System.out.println("\n" + "Cargar un archivo de atletas" + "\n");

		String archivo = input("Por favor ingrese el nombre del archivo CSV con los atletas");
		try
		{
			calculadora = LoaderOlimpicos.cargarArchivo(archivo);
			System.out.println("Se cargó el archivo " + archivo + " con información de los Juegos Olímpicos.");
			Collection<String> eventos = calculadora.darNombresDeportes();
			System.out.println("Los deportes para los que se tiene información son:");
			for (String dep : eventos)
			{
				System.out.println(" - " + dep);
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo indicado no se encontró.");
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo.");
			System.out.println(e.getMessage());
		}

	}
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}


public static void main(String[] args) throws IOException, Exception {

			CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("C:/Users/AQ02090/Downloads/Taller0_Olimpicos_esqueleto/Taller0_Olimpicos/data/atletas.csv");
			System.out.println(calc.paisConMasMedallistas());
		}

}
