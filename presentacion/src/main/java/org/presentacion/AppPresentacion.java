package org.presentacion;



import java.io.IOException;
import org.servicio.ServicioInicial;


public class AppPresentacion{
      
	
	public static void main(String[] args) throws IOException{
	 
		ServicioInicial inicio = new ServicioInicial();
		inicio.probarInstrumentos();
	}


}
