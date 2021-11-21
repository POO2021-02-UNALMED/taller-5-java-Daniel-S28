package gestion;

import java.util.*;

public class Zoologico {
	private String nombre; 
	private String ubicacion;
	private static ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico() {
	}
	
	public Zoologico(String nombre,String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
	
	public int cantidadTotalAnimales() {
		int total=0;
		for (Zona zona : zonas) {
			total+=zona.cantidadAnimales();
		}
		return total;
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public static ArrayList<Zona> getZona() {
		return zonas;
	}

	public static void setZonas(ArrayList<Zona> zonas) {
		Zoologico.zonas = zonas;
	}
}
