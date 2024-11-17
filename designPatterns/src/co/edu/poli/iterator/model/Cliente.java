package co.edu.poli.iterator.model;

/**
 * 
 */
public class Cliente {


    /**
     * @param args
     */
    public static void main(String [ ] args) {
        
    	Estudiante e1 = new Estudiante("2137","Luisa",23);
    	Estudiante e2 = new Estudiante("45342","Diana",45);
    	Estudiante e3 = new Estudiante("5435","Fernanda",27);
    	Estudiante e4 = new Estudiante("54534","Wilson",33);
    	
    	Estudiante es[] = new Estudiante[4];
    	
    	es[0] = e1;
    	es[1] = e2;
    	es[2] = e3;
    	es[3] = e4;
    	
    	Collection c = new Collection(es);
    	
    	Iterator it = c.getIterator();
    	while (it.hasNext()) {
			System.out.println(it.next());
		}
    	
    	
    	for (Iterator iterator = c.getIterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
    	
    }

}