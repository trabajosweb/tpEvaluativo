package org.servicio;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public interface IServicio {
	
	void guardar();	
	void borrar (Object objeto);
	public void listar();
}
