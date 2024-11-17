package co.edu.poli.memento.model;

/**
 * 
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String [ ] args) {
       
    	Originator ob = new Originator();
    	CareTaker histo = new CareTaker();
    	
    	ob.setState(12.4, 23.8, 11.4);
    	histo.addState(ob.saveToMemento());
    	
    	ob.setState(0.4, 1.8, 1.4);
    	histo.addState(ob.saveToMemento());
    	
    	ob.setState(1.4, 2.8, 2.4);
    	histo.addState(ob.saveToMemento());
    	
    	ob.setState(2.4, 3.8, 3.4);
    	histo.addState(ob.saveToMemento());
    	
    	ob.setState(9.4, 9.8, 9.4);    	
    	System.out.println(ob.printState());

    	ob.restoreStateFromMemento(histo.getState(3));
    	System.out.println(ob.printState());
    	
    	System.out.println(histo.printAllSavedState());
    	
    }

}