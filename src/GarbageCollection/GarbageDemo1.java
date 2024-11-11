package GarbageCollection;

class TestGarbage1{
	int a;
	int b;
	TestGarbage1(){
		this.a = 10;
		this.b = 12;
	}
}
public class GarbageDemo1 {
	 public void finalize(){System.out.println("object is garbage collected");}
	public static void main(String[] args) {
		GarbageDemo1 s1=new GarbageDemo1();  
		GarbageDemo1 s2=new GarbageDemo1();  
		  s1=null;  
		  s2=null;  
		  System.gc();  
		 }  
	}
