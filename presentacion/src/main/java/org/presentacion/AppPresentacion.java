package org.presentacion;


import org.dominio.Bajo;
import org.dominio.Bateria;
import org.dominio.Trompeta;
import org.servicio.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AppPresentacion{

	public static ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:resources/applicationContext.xml");
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
		    
			Bajo bajo = (Bajo)instrumento; 
			
			int cantidadCuerda;
			
			do{
				cantidadCuerda =  PreguntaEntero("ingrese cantidad de cuerda");
        	}while(!bajo.checkSum(cantidadCuerda));
			bajo.setCantCuerdas(cantidadCuerda);
			
		}
		
		if (tipoInstrumento.equals("Trompeta")){
		    
          Trompeta trompeta = (Trompeta)instrumento; 
			
			String tipoTrompeta;
			
			do{
				tipoTrompeta =  Preguntar("ingrese tipo trompeta");
        	}while(!trompeta.checkSum(tipoTrompeta));
			trompeta.setTipo(tipoTrompeta);
			
		}
		
		if (tipoInstrumento.equals("Bateria")){
		   
			 Bateria bateria = (Bateria)instrumento; 
				
				int cantidaPlatos;
				
				do{
					cantidaPlatos =  PreguntaEntero("ingrese cantida de platos");
	        	}while(!bateria.checkSum(cantidaPlatos));
				bateria.setCantPlatos(cantidaPlatos);
			
		}
		
		/*
		 * ingreasar musico
		 */
		
		ISaveMusicoServicioView musico;
		
		musico = (ISaveMusicoServicioView) factory.getBean("Musico");//instancia del objeto
		musico.setNombre(Preguntar("ingrese el nombre del musico"));
		musico.setApellido(Preguntar("ingrese el apellido del musico"));
	//	musico.setInstrumento(Preguntar("ingrese el instrumento"));
	//	musico.setBanda(Preguntar("ingrese el nombre de la banda"));
		
		/*
		 * ingreasar banda
		 */
		
		ISaveBandaServicioView banda;
		
		
		banda = (ISaveBandaServicioView) factory.getBean("Banda");//instancia del objeto
		
		banda.setNombre(Preguntar("ingrese el nombre de la banda"));
		//banda.setListaMusicos(Preguntar("ingrese la marca del instrumento"));
		
			
		
	}


}
