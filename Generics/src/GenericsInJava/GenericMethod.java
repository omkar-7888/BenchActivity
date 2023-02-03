package GenericsInJava;

public class GenericMethod {

	//Generic Method
	static <T> void genMethod(T element){
		  System.out.println(element.getClass().getName() +"="+element);
	}
	
	//Driver MEthod
	public static void main(String[] args) {
		//Calling Generic method with Integer Argument
		genMethod(1);
		
		//Calling Generic method with Integer Argument
		genMethod("Omkar");
		
		
		
		
	}
}
