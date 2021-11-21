package zooAnimales;

import gestion.Zona;
import java.util.*;

public class Animal {
	private static int totalAnimales; 
	private String nombre; 
	private int edad;
	private String habitat; 
	private String genero;
	private Zona zona;
	
	public Animal (String nombre, int edad, String habitat, String genero) {
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;
		totalAnimales++;
	}
	
	public Animal() {
		totalAnimales++;
	}
	
	public String totalPorTipo() {
		//deveulve la cantidad de animales por cada subclase
		return "Mamiferos:" + Mamifero.cantidadMamiferos() + "\n" +
			   "Aves:"+ Ave.cantidadAves() + "\n" +
			   "Reptiles:"+ Reptil.cantidadReptiles() + "\n" +
			   "Peces:"+Pez.cantidadPeces() + "\n" +
			   "Anfibios:"+Anfibio.cantidadAnfibios() + "\n";
	}
	
	public String toString() {
		return "Mi nombre es " + this.nombre + " tengo una edad de" + this.edad + ", habito en" + 
				this.habitat + " y mi genero es" + this.genero + 
				", la zona en la que me ubico es" + zona + ", en el" + zona.getZoo();
	}
	
	public String movimiento() {
		return "desplazarse";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public static int getTotalAnimales() {
		return totalAnimales;
	}

	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}
}
