package co.edu.poli.facadeback.model;

public class Instance { 
	private Blackberry blackberry;
    private Iphone iphone;
    private Samsung samsung;
    
    public Instance() {
        createMobiles();
    }
    
    private void createMobiles() {
        blackberry = new Blackberry("Blackberry Z10", "Rs 35000.00");
        iphone = new Iphone("Iphone 6", "Rs 65000.00");
        samsung = new Samsung("Samsung 4", "Rs 45000.00");
    }
    
    public Blackberry getBlackberry() {
        return blackberry;
    }
    
    public Iphone getIphone() {
        return iphone;
    }
    
    public Samsung getSamsung() {
        return samsung;
    }
}
//private static Iphone iphone = new Iphone(" Iphone 6 ", " Rs 65000.00 "); 
//private static Samsung samsung = new Samsung(" Samsung 4", " Rs 45000.00 "); 
//private static Blackberry blackberry = new Blackberry(" Blackberry Z10", " Rs 35000.00"); 
//
//public static Iphone getIphone() { 
//    return iphone; 
//} 
//
//public static Samsung getSamsung() { 
//    return samsung; 
//} 
//
//public static Blackberry getBlackberry() { 
//    return blackberry; 
//} 
//}
