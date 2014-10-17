package org.presentacion;



import java.io.IOException;
import org.servicio.ServicioInicial;


public class AppPresentacion{
      
	
	public static void main(String[] args) throws IOException{
	 
		ServicioInicial inicio = new ServicioInicial();
		inicio.probarInstrumentos();
		ServicioInicial inicio1 = new ServicioInicial();
		inicio1.probarMusico();
		ServicioInicial inicio2 = new ServicioInicial();
		inicio2.probarBanda();
	}


}
