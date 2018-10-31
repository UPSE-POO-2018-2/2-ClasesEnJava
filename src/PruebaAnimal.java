
public class PruebaAnimal {

	public static void main(String[] args) {
		Animal guatusa = new Animal("guatusa", "roedor");
		guatusa.setNombre("GuatusinForEver");
		guatusa.setClasificacion("hibrido espacial");
		System.out.println("Cargando datos de..." + guatusa.getNombre());
		guatusa.print();
		
		
		Animal delfin = new Animal("delfin", "cetaceo");
		delfin.print();
		delfin.comer();
		delfin.beber();
		delfin.defecar();
		
		Animal gallinazo = new Animal("gallinazo", "ave");
		gallinazo.print();
		gallinazo.comer(guatusa);
		
		
	}

}
