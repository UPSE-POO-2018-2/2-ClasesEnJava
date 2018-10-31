
public class Animal {

	//Datos Miembros
	private String nombre;
	private String clasificacion;
	private double peso;
	private double altura, longitud, ancho;
	
	//*************METODOS***************
	//Constructor
	public Animal(String nombre, String clasificacion)
	{
		this.nombre = nombre;
		this.clasificacion = clasificacion;
	}
	
	public Animal(String nombre, String clasificacion, double peso)
	{
		this.nombre = nombre;
		this.clasificacion = clasificacion;
		this.peso = peso;
	}
	
	//Otros Metodos
	public void comer()
	{
		System.out.println("Yum yum... comiendo! Yum!");
	}
	
	public void comer(Animal otro)
	{
		System.out.println("Yum yum, me devore un(a) " + otro.nombre 
				+ ". Me encantan l(@)s " + otro.clasificacion);
	}
	
	public void beber()
	{
		System.out.println("Glup Glup, bebiendo... 2 mas... Glup glup...");
	}
	
	public void defecar()
	{
		System.out.println("Pujando.... en proceso.... YAAAAA!" + "U+1F4A9");
	}
	
	public void print()
	{
		System.out.println("Hey, soy un(@) " + this.nombre + ". Y soy un " + this.clasificacion + ".");
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getClasificacion()
	{
		return clasificacion;
	}
	
	public void setClasificacion(String clasificacion)
	{
		this.clasificacion = clasificacion;
	}
}
