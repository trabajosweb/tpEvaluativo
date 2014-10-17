package org.servicio;

public class ServicioInicial {

	public void probarInstrumentos() {
		// TODO Auto-generated method stub
		IServicio si = new InstrumentoServicio();
		si.guardar();
	}
	public void probarMusico(){
	
		IServicio sm = new MusicoServicio();
		sm.guardar();
		
	}
	public void probarBanda() {
		IServicio sb = new BandaServicio();
		sb.guardar();		
	}
}
