package co.edu.poli.mediator.model;

public class Client {

	public static void main(String[] args) {

		ConcreteMediator m = new ConcreteMediator();
        
        ComponentA a = new ComponentA(m);  
        a.setname("Component A");  
              
        ComponentB b = new ComponentB(m);  
        b.setname("Component B");  

        ComponentC c = new ComponentC(m);  
        c.setname("Component C");  
        
        System.out.println(a.sendMsg("Morning",b));  
        System.out.println(b.sendMsg("Morning",a));  
        System.out.println(c.sendMsg("Hi",a));
        System.out.println(c.sendMsg("Hi",b));
        System.out.println(a.sendMsg("bye",c));
        System.out.println(b.sendMsg("bye",c));

	}

}
