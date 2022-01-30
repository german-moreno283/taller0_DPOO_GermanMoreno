package uniandes.dpoo.taller0.modificacion;

import java.io.IOException;


import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import  uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;


public class Modificacion {
	private CalculadoraEstadisticas calculadora;


	public static void main(String[] args) throws IOException, Exception {

				CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
				System.out.println(calc.paisConMasMedallistas());
			}

}
