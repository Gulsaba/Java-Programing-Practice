package InterviewQuestions;

public class OperatorTrickyQuestions {

	public static void main(String[] args) {
		System.out.println("With '+' operator");
		System.out.println(10 + 20 + "Javatpoint");   
        System.out.println("Javatpoint" + 10 + 20);  
        
        System.out.println();
        
        System.out.println("With '*' operator");
        System.out.println(10 * 20 + "Javatpoint");   
        System.out.println("Javatpoint" + 10 * 20);   
        //Precedence of '*' higher than '+' so first multiplication will perform and then addition

	}

}
