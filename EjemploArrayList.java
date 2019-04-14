import java.util.ArrayList;

public class EjemploArrayList {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Pompin", "Jose", 'M', "1965-12-24");
		Persona p2 = new Persona("Villalba", "Daniel", 'M', "2001-01-28");
		Persona p3 = new Persona("Toledo", "Viviana", 'F', "1985-06-01");
		Persona p4 = new Persona("Pompin", "Jose", 'M', "2003-11-15");
		
		ArrayList<Persona> arrayList = new ArrayList<Persona>();
		
		arrayList.add(p1);
		arrayList.add(p2);
		arrayList.add(p3);
		arrayList.add(p4);
		
		arrayList.remove(p3);
				
		for (Persona persona : arrayList) {
			System.out.println(persona);
		}
	}

}
