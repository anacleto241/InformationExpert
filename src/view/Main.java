package view;
import model.*;

public class Main {
	 public static void main(String[] args) {
		 Product rice = new Product();
	        rice.setDescription("Arroz");
	        rice.setPrice(30);

	        Product beans = new Product();
	        beans.setDescription("Feijao");
	        beans.setPrice(20);

	        Product pasta = new Product();
	        pasta.setDescription("Pasta");
	        pasta.setPrice(15);

//	        SaleItem itemRice = new SaleItem();
//	        itemRice.setProduct(rice);
//	        itemRice.setQuantity(2);
//
//	        SaleItem itemBeans = new SaleItem();
//	        itemBeans.setProduct(beans);
//	        itemBeans.setQuantity(1);
//
//	        SaleItem itemPasta = new SaleItem();
//	        itemPasta.setProduct(pasta);
//	        itemPasta.setQuantity(6);
//
//	        Sale sale = new Sale();
//	        sale.addSaleItem(itemRice);
//	        sale.addSaleItem(itemBeans);
//	        sale.addSaleItem(itemPasta);
	        
	        Sale sale = new Sale();
	        sale.addSaleItem(rice, 2);
	        sale.addSaleItem(beans, 1);
	        sale.addSaleItem(beans, 1);

	        for(SaleItem item : sale.getItems())
	             System.out.println(item);

	        System.out.println("Total: " + sale.getTotal());
	}
}
