package org.presentacion;


import org.dominio.Bajo;
import org.dominio.Banda;
import org.dominio.Bateria;
import org.dominio.Instrumento;
import org.dominio.Musico;
import org.dominio.Trompeta;
import org.servicio.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
		//ISaveInstrumentoServicioView instrumento; 
		Instrumento instrumento;
		String tipoInstrumento;
		
<<<<<<< HEAD
		do{
			tipoInstrumento = Preguntar("***¿Que tipo de instrumento quiere?: ***");
			System.out.println(tipoInstrumento);
	        }while(!tipoInstrumento.equals("bajo")&&!tipoInstrumento.equals("trompeta")&&!tipoInstrumento.equals("bateria"));
		
		instrumento = (Instrumento) context.getBean(tipoInstrumento);//instancia del objeto
		instrumento.setMarca(Preguntar("***Ingrese la marca del instrumento: ***"));
		instrumento.setModelo(Preguntar("***Ingrese el modelo del instrumento: ***"));
		instrumento.setColor(Preguntar("***Ingrese el color del instrumento: ***"));
		
		if (tipoInstrumento.equals("bajo")){
		    
			Bajo bajo = (Bajo)instrumento; 
			int cantidadCuerda;
			
			do{
				cantidadCuerda =  PreguntaEntero("***Ingrese cantidad de cuerda: ***");
        	}while(!bajo.checkSum(cantidadCuerda)==false);
			bajo.setCantCuerdas(cantidadCuerda);
			IInstrumentoServicioBajo servi= new InstrumentoServicioBajo();
			servi.guardar(bajo);
		}
		
		if (tipoInstrumento.equals("trompeta")){
		    
          Trompeta trompeta = (Trompeta)instrumento; 
		  String tipoTrompeta;
			
			do{
				tipoTrompeta =  Preguntar("***Ingrese tipo trompeta: ***");
        	}while(!trompeta.checkSum(tipoTrompeta)==false);
			trompeta.setTipo(tipoTrompeta);
			IInstrumentoServicioTrompeta servi= new InstrumentoServicioTrompeta();
			servi.guardar(trompeta);
			
		}
		
		if (tipoInstrumento.equals("bateria")){
		   
			 Bateria bateria = (Bateria)instrumento; 
				
				int cantidaPlatos;
				
				do{
					cantidaPlatos =  PreguntaEntero("ingrese cantida de platos");
	        	}while(!bateria.checkSum(cantidaPlatos)==false);
				bateria.setCantPlatos(cantidaPlatos);
				IInstrumentoServicioBateria servi= new InstrumentoServicioBateria();
				servi.guardar(bateria);
			
		}
		
=======
>>>>>>> 0c6d57f0bb58ca99a60f679dbbba968411e197c2
		/*
		 *
		 */
		IMusicoServicio servi= new MusicoServicio();
		IBandaServicio servibanda= new BandaServicio();
		IInstrumentosServicio serviinServicio= new InstrumentoServicio();
		
		System.out.println("*******   BANDA   ***********");
		
		Banda banda;
		banda = (Banda) context.getBean("banda");
<<<<<<< HEAD
		banda.setNombre(Preguntar("***ingrese el nombre de la banda***"));
=======
		banda.setNombre(Preguntar("***Ingrese el nombre de la banda***"));

>>>>>>> 0c6d57f0bb58ca99a60f679dbbba968411e197c2
		int numint= PreguntaEntero("***Ingrese la cantidad de integrantes de la banda***");
		
		for (int i=0;i< numint;i++){
			Musico musico;
<<<<<<< HEAD
			System.out.println("*******   musico   ***********");
=======
>>>>>>> 0c6d57f0bb58ca99a60f679dbbba968411e197c2
			musico = (Musico) context.getBean("musico");//instancia del objeto
			musico.setNombre(Preguntar("***Ingrese el nombre del musico***"));
			musico.setApellido(Preguntar("***Ingrese el apellido del musico***"));
			
			/*ingresar el intrumento del musico*/
			do{
				tipoInstrumento = Preguntar("***Ingrese el instrumento: ***");
		        }while(!tipoInstrumento.equals("bajo")&&!tipoInstrumento.equals("trompeta")&&!tipoInstrumento.equals("bateria"));
			
			instrumento = (Instrumento) context.getBean(tipoInstrumento);//instancia del objeto
			instrumento.setMarca(Preguntar("***Ingrese la marca del instrumento: ***"));
			instrumento.setModelo(Preguntar("***Ingrese el modelo del instrumento: ***"));
			instrumento.setColor(Preguntar("***Ingrese el color del instrumento: ***"));
			
			if (tipoInstrumento.equals("bajo")){
			    
				Bajo bajo = (Bajo)instrumento; 
				int cantidadCuerda;
				
				do{
					cantidadCuerda =  PreguntaEntero("***Ingrese cantidad de cuerda: ***");
	        	}while(!bajo.checkSum(cantidadCuerda)==false);
				bajo.setCantCuerdas(cantidadCuerda);
				IInstrumentoServicioBajo servicioBajo= new InstrumentoServicioBajo();
				servicioBajo.guardar(bajo);
			}
			
			if (tipoInstrumento.equals("trompeta")){
			    
	          Trompeta trompeta = (Trompeta)instrumento; 
			  String tipoTrompeta;
				
				do{
					tipoTrompeta =  Preguntar("***Ingrese tipo trompeta: ***");
	        	}while(!trompeta.checkSum(tipoTrompeta)==false);
				trompeta.setTipo(tipoTrompeta);
				IInstrumentoServicioTrompeta servicioTrompeta= new InstrumentoServicioTrompeta();
				servicioTrompeta.guardar(trompeta);
				
			}
			
			if (tipoInstrumento.equals("Bateria")){
			   
				 Bateria bateria = (Bateria)instrumento; 
					
					int cantidaPlatos;
					
					do{
						cantidaPlatos =  PreguntaEntero("ingrese cantida de platos");
		        	}while(!bateria.checkSum(cantidaPlatos)==false);
					bateria.setCantPlatos(cantidaPlatos);
					IInstrumentoServicioBateria servicioBateria= new InstrumentoServicioBateria();
					servicioBateria.guardar(bateria);
				
			}
			musico.setInstrumento(instrumento);
			musico.setBanda(banda);
			servi.guardar(musico);
			serviinServicio.guardar(instrumento);
		}
		servibanda.guardar(banda);
<<<<<<< HEAD
		//banda.setNombre(Preguntar("ingrese el nombre de la banda"));
		
			
		
		/*
		 * ingresar banda
		 */
		
		//ISaveBandaServicioView banda;
		
		//banda = (ISaveBandaServicioView) context.getBean("Banda");//instancia del objeto
=======
>>>>>>> 0c6d57f0bb58ca99a60f679dbbba968411e197c2
		
		
		System.out.println("***Lista de bandas***");
		servi.listarMusicos();
			
		
	}


}
