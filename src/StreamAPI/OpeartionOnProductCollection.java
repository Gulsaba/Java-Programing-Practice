package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
    
    public String toString() {
        return "[Id: " + id + ", Name: " + name + ", Price: " + price+"]";
    }
    
}  
public class OpeartionOnProductCollection {
	public static void main(String[] args) {
		List<Product> lsProducts = listOfProducts();
		System.out.println("Filtering Product whose price is less than 30000 without using Stream");
		List<Product> filterProduct1 = filteringCollectionWithoutStreamAPI(lsProducts);
		for(Product product : filterProduct1) {
			System.out.println(product.toString());
		}
		
		System.out.println();
		System.out.println("Filtering Product whose price is more than 30000 by using Stream");
		List<Product> filterProduct2 = filteringCollectionWithStreamAPI(lsProducts);
		for(Product product : filterProduct2) {
			System.out.println(product.toString());
		}
		
		System.out.println();
		System.out.println("Filtering Price list only whose value is less than 30000 by using Stream");
		
		List<Float> priceList = filterListOfPriceUsingStreamAPI(lsProducts);
		//print price list using stream api
		priceList.stream().forEach(price ->{
			System.out.print(price + " ");
		});
		
		System.out.println();
		System.out.println();
		
	    float totalPrice = sumOfTotalProductPrice(lsProducts);
		System.out.println("Sum of all product's price : "+totalPrice);
		
		System.out.println();
		System.out.println("Total number of products whose price is less than 30000");
		int count = countOfProduct(lsProducts);
		System.out.println(count);
		
		System.out.println();
		System.out.println("lowest price product");
		Product lowestPriceProduct = findLowestPriceProduct(lsProducts);
		System.out.println("Product name : "+lowestPriceProduct.name);
		System.out.println("Product price : "+lowestPriceProduct.price);
		
		System.out.println();
		System.out.println("Larget price product");
		Product largestPriceProduct = findlargestPriceProduct(lsProducts);
		System.out.println("Product name : "+largestPriceProduct.name);
		System.out.println("Product price : "+largestPriceProduct.price);
		
		System.out.println();
		System.out.println("Convert List into Map");
		Map<String, Float> productMap = productMap(lsProducts);
		for(Map.Entry<String, Float> product : productMap.entrySet()) {
			System.out.println(product.getKey()+" : "+product.getValue());
		}
		
		System.out.println();
		System.out.println("Convert product price list into Set");
		Set<Float> productPriceList = findListOfPriceIntoSet(lsProducts);
		
		
	}
	
	//Filtering Product whose price is less than 30000 without using Stream
	public static List<Product> filteringCollectionWithoutStreamAPI(List<Product> products) {
		List<Product> filteredProductList = new ArrayList<>();
		for(Product product : products) {
			if(product.price < 30000){
				filteredProductList.add(product);
			}
		}
		return filteredProductList;
	}

	//Filtering Product whose price is more than 30000 by using Stream
	public static List<Product> filteringCollectionWithStreamAPI(List<Product> products) {
		List<Product> filteredProductList =
			products.stream().filter(product -> product.price>30000).collect(Collectors.toList());
		return filteredProductList;
	}
	
	//Filtering Price list only whose value is less than 30000 by using Stream
	public static List<Float> filterListOfPriceUsingStreamAPI(List<Product> products) {
		List<Float> priceList =
			products.stream().filter(product -> product.price < 30000)
			.map(product -> product.price)
			.collect(Collectors.toList());
		return priceList;
	}
	
	public static float sumOfTotalProductPrice(List<Product> products) {
		float totalProductPrice = 
				products.stream().map(product->product.price).reduce(0.0f, (sum, price) ->sum+price);
		return totalProductPrice;		
	}
	
	public static int countOfProduct(List<Product> products){
		int count = (int) products.stream().filter(product -> product.price < 30000).count();
		return count;
	}
	
	public static Product findLowestPriceProduct(List<Product> products) {
		return products.stream()
			    .min((product1, product2) ->product1.price < product2.price ? 1:-1)
			    .get();
	}
	
	public static Product findlargestPriceProduct(List<Product> products) {
		return products.stream().max((product1, product2)->{
			if(product1.price < product2.price) return 1;
			else return -1;
		}).get();
	}
	
	//Convert products into map with name as a key and price as avalue
	public static Map<String, Float> productMap(List<Product> products){
		Map<String, Float> productMap =  new HashMap<String, Float>();
				products.stream().forEach(product->{
					productMap.put(product.name, product.price);
				});
		return productMap;
	}
	
	public static Set<Float> findListOfPriceIntoSet(List<Product> products){
		
		return null;
	}
	
	
	public static List<Product> listOfProducts() {
		List<Product> productsList = new ArrayList<Product>();  
		
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f)); 
        
        return productsList;
	}
}
