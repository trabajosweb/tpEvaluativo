package org.presentacion;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import org.dominio.Banda;
import org.dominio.Instrumento;
import org.dominio.Musico;
import org.servicio.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class AppPresentacion {

	public static void main(String[] args){
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
		ApplicationContext context = new AnnotationConfigApplicationContext(claseConfiguracion.class);
        BandaServicio servicio= new BandaServicio();
        System.out.println("hola");
        servicio.guardar(context.getBean(Banda.class));
        
	}

}
