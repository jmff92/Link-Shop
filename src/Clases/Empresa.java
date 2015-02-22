package Clases;

/*
 * Clase: Empresa
 * Descripcion: Organización dedicada a actividades comerciales para satisfacer 
 * las necesidades de bienes o servicios de los consumidores
 */
public class Empresa {

	private String nombre;
	private String telefono;
	private String direccion;
	private int num_clientes;
		
	public Empresa(String nombre, String telefono, String direccion,
			int num_clientes) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.num_clientes = num_clientes;
	}

	public Empresa() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNum_clientes() {
		return num_clientes;
	}

	public void setNum_clientes(int num_clientes) {
		this.num_clientes = num_clientes;
	}	
	
}

// END Empresa.java
