package co.edu.poli.facade.model;

import java.util.HashMap;
import co.edu.poli.facadeback.model.MobileShopInterface;


public class ShopKeeper {

	private HashMap<Integer, MobileShopInterface> arrayMobile;

	public ShopKeeper(HashMap<Integer, MobileShopInterface> a) {
		arrayMobile = a;
	}

	public String getMethods(int serial) {
		return arrayMobile.get(serial).modelNo() + " " +
				arrayMobile.get(serial).price();
	}
}
//	 public ShopKeeper() { 
//	        new Instance(); 
//	    } 
//	    
//	    private HashMap<Integer, MobileShopInterface> arrayMobile= new HashMap<Integer, MobileShopInterface>();
//	    
//	    	public ShopKeeper(HashMap<Integer, MobileShopInterface> a) {
//	    		arrayMobile = a;
//	    	}
//
//	    public String getMethods(int serial) {
//			return arrayMobile.get(serial).modelNo() + " " +
//					arrayMobile.get(serial).price();
//	    }
//}

//	MobileShopInterface mobileShop1;
//    MobileShopInterface mobileShop2;
//    MobileShopInterface mobileShop3;
//    
//    public ShopKeeper() {
//        mobileShop1 = Instance.mobileShopInstance();
//        mobileShop2 = Instance.mobileShopInstance1();
//        mobileShop3 = Instance.mobileShopInstance2();
//    }
//    public void iphoneSale() {
//        mobileShop1.modelNo();
//        mobileShop1.price();
//    }
//    public void samsungSale() {
//        mobileShop2.modelNo();
//        mobileShop2.price();
//    }
// 
//    public void blackberrySale() {
//        mobileShop3.modelNo();
//        mobileShop3.price();
//    }	
//}