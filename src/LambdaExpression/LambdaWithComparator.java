package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
    
    public String toString() {
    	return "[Id: "+id+", Name: "+name+", price: "+price+"]";
    }
}  
public class LambdaWithComparator {

	public static void main(String[] args) {
		//Adding Products  
		List<Product> list = new ArrayList<Product>();
        list.add(new Product(1,"HP Laptop",25000f));  
        list.add(new Product(3,"Keyboard",300f));  
        list.add(new Product(2,"Dell Mouse",150f));  
          
        System.out.println("Sorting on the basis of name...");
        Collections.sort(list, (l1, l2)->{
        	return l1.name.compareTo(l2.name);
        });
        list.forEach(
		 (product)->{
			System.out.println(product);
		 });


	}

}
