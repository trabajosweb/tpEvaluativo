package org.presentacion;


import org.dominio.Bajo;
import org.dominio.Banda;
import org.dominio.Bateria;
import org.dominio.Instrumento;
import org.dominio.Musico;
import org.dominio.Trompeta;
import org.servicio.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Controller
public class AppPresentacion{

	//public static ApplicationContext context = new ClassPathXmlApplicationContext("classpath*: resources/applicationContext.xml");
	public static ApplicationContext context= new AnnotationConfigApplicationContext(claseConfiguracion.class);
	//public static BeanFactory factory = context;
	
	
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
		 
		Instrumento instrumento;
		//ISaveInstrumentoServicioView instrumento;
		String tipoInstrumento;
		
		do{
			tipoInstrumento = Preguntar("¿Que tipo de instrumento quiere?: ");
			System.out.println(tipoInstrumento);
	        }while(!tipoInstrumento.equals("bajo")&&!tipoInstrumento.equals("trompeta")&&!tipoInstrumento.equals("bateria"));
		
		instrumento = (Instrumento) context.getBean(tipoInstrumento);//instancia del objeto
		instrumento.setMarca(Preguntar("Ingrese la marca del instrumento: "));
		instrumento.setModelo(Preguntar("Ingrese el modelo del instrumento: "));
		instrumento.setColor(Preguntar("Ingrese el color del instrumento: "));
		
		if (tipoInstrumento.equals("bajo")){
		    
			Bajo bajo = (Bajo)instrumento; 
			int cantidadCuerda;
			
			do{
				cantidadCuerda =  PreguntaEntero("ingrese cantidad de cuerda");
        	}while(!bajo.checkSum(cantidadCuerda)==false);
			bajo.setCantCuerdas(cantidadCuerda);
			//IBandaServicio servi= new BandaServicio();
			//servi.guardar(banda);
			IInstrumentoServicioBajo servi= new InstrumentoServicioBajo();
			servi.guardar(bajo);
			System.out.println(servi.listarbaBajos());
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
		
		Musico musico;
		
		musico = (Musico) context.getBean("Musico");//instancia del objeto
		musico.setNombre(Preguntar("ingrese el nombre del musico"));
		musico.setApellido(Preguntar("ingrese el apellido del musico"));
	//	musico.setInstrumento(Preguntar("ingrese el instrumento"));
	//	musico.setBanda(Preguntar("ingrese el nombre de la banda"));
		
		/*
		 * ingreasar banda
		 */
		
		//ISaveBandaServicioView banda;
		Banda banda;
		
		//banda = (ISaveBandaServicioView) context.getBean("Banda");//instancia del objeto
		banda = (Banda) context.getBean("Banda");
		banda.setNombre(Preguntar("ingrese el nombre de la banda"));
		//banda.setListaMusicos(Preguntar("ingrese la marca del instrumento"));
		
			
		
	}


}
