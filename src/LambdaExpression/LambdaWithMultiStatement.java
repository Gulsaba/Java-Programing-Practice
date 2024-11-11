package LambdaExpression;

import java.util.Arrays;

@FunctionalInterface  
interface MultilineStatement{  
     abstract void beakeStringIntoMultilineSmt(String string); 
}
public class LambdaWithMultiStatement {
	public static void main(String[] args) {
		MultilineStatement multiStm = (smt) -> {
			String[] strArr = smt.split("\\s");
			Arrays.stream(strArr).forEach(str->{
				System.out.println(str);
			});
		};
		
		String multlineSmt = "Hello Gulsaba! How are you. What's going on?";
		multiStm.beakeStringIntoMultilineSmt(multlineSmt);
	}
}
