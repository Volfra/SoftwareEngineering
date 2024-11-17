package co.edu.poli.facadeback.model;


class Iphone implements MobileShopInterface {

	private String model;
	private String price;
	
	public Iphone(String model, String price) {
		this.model = model;
		this.price = price;
	}

	@Override
	public String modelNo() {
		return getModel();
	}

	@Override
	public String price() {
		return getPrice();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
}