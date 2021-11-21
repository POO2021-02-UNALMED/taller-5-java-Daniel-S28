package zooAnimales;

import java.util.*;

public class Ave extends Animal {
	
	private static List<Ave> listado = new ArrayList<Ave>();
	public static int halcones; 
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas=colorPlumas;
		listado.add(this);
	}
	
	public Ave() {
		listado.add(this);
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		halcones++;
		return new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		aguilas++;
		return new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
	}
	
	public static int cantidadAves() {
		return listado.size();
	}

	public static List<Ave> getListado() {
		return listado;
	}

	public static void setListado(List<Ave> listado) {
		Ave.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
}
