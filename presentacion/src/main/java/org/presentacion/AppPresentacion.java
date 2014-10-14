package org.presentacion;


import org.servicio.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AppPresentacion{

	public static ApplicationContext context = new AnnotationConfigApplicationContext("applicationContext.xml");
	public static BeanFactory factory = context;
	
	
	public static String Preguntar(String preguntar) throws IOException
	{
		System.out.println(preguntar);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String linea = br.readLine(); 
		return linea;
	}
	
	public static boolean isInteger(String str) {
	    try {
	        Integer.parseInt(str);
	        return true;
	    } catch (NumberFormatException nfe) {}
	    return false;
	}
	
	public static int PreguntaEntero(String preguntar) throws IOException
	{
		String linea;
		do{
		System.out.println(preguntar);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 linea = br.readLine();
		
		}while (isInteger(linea)==false);
		return Integer.parseInt(linea);
	}
		
	
	public static void main(String[] args) throws IOException{
		/*ApplicationContext context = new AnnotationConfigApplicationContext(claseConfiguracion.class);
				//El detalle es que no hace falta castear IMateria 

				//IMateria historia = context.getBean(Historia.class); 
				Musico musico= context.getBean(Musico.class);
				Banda banda= context.getBean(Banda.class);
				Instrumento instrumento= context.getBean(Instrumento.class);
				//IMateria geografia = context.getBean(Geografia.class); 

				//La implementacion del metodo mostrarDetalles por la clase Historia 

				System.out.println(banda.getNombre()); 

				//La implementacion del metodo mostrarDetalles por la clase Geografia 

				//System.out.println(geografia.mostrarDetalles());**/
		 
		System.out.println("hola");
		
		ISaveInstrumentoServicioView instrumento;
		String tipoInstrumento;
		
		do{
			tipoInstrumento = Preguntar("que tipo de instrumento quiere");
	        }while(!tipoInstrumento.equals("Bajo")&&!tipoInstrumento.equals("Trompeta")&&!tipoInstrumento.equals("Bateria"));
		
		instrumento = (ISaveInstrumentoServicioView) factory.getBean(tipoInstrumento);//instancia del objeto
		instrumento.setMarca(Preguntar("ingrese la marca del instrumento"));
		instrumento.setModelo(Preguntar("ingrese el modelo del instrumento"));
		instrumento.setColor(Preguntar("ingrese el color del instrumento"));
		
		if (tipoInstrumento.equals("Bajo")){
		    //  instrumento.setCantCuerdas(   Preguntar("ingrese la cantida de cuerda"));
		}
		
		if (tipoInstrumento.equals("Trompeta")){
		     // instrumento.setCantCuerdas(   Preguntar("ingrese la cantida de cuerda"));
		}
		
		if (tipoInstrumento.equals("Bateria")){
		   //   instrumento.setCantCuerdas(   Preguntar("ingrese la cantida de cuerda"));
		}
		
		/*
		 * ingreasar musico
		 */
		
		ISaveMusicoServicioView musico = null;
		
		musico.setNombre(Preguntar("ingrese el nombre del musico"));
		musico.setApellido(Preguntar("ingrese el apellido del musico"));
	//	musico.setInstrumento(Preguntar("ingrese el instrumento"));
	//	musico.setBanda(Preguntar("ingrese el nombre de la banda"));
		
		/*
		 * ingreasar banda
		 */
		
		ISaveBandaServicioView banda = null;
		
		banda.setNombre(Preguntar("ingrese el nombre de la banda"));
		//banda.setListaMusicos(Preguntar("ingrese la marca del instrumento"));
		
			
		
	}


}
