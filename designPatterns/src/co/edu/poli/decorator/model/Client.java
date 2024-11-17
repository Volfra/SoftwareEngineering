package co.edu.poli.decorator.model;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		
		Orchi bouquet1 = new Orchi();
		System.out.println(bouquet1.getDescription() + " : " + bouquet1.cost());

		Glitter glitter1 = new Glitter(bouquet1);
		System.out.println(glitter1.getDescription() + " : " + glitter1.cost());

		RibbonBow ribbon1 = new RibbonBow(glitter1);
		System.out.println(ribbon1.getDescription() + " : " + ribbon1.cost());
		
		PaperWrapped paper1 = new PaperWrapped(ribbon1);
		System.out.println(paper1.getDescription() + " : " + paper1.cost());
		
		Rouse bouquet2 = new Rouse();
		System.out.println(bouquet2.getDescription() + " : " + bouquet2.cost());
		
		RibbonBow ribbon2 = new RibbonBow(bouquet2);
		System.out.println(ribbon2.getDescription() + " : " + ribbon2.cost());

	}
}