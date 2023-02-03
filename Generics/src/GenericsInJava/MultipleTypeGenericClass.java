package GenericsInJava;

class MultipleTest<T,U>{
	T obj1;
	U obj2;
	public MultipleTest(T obj1, U obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);
		
	}
	
	
}
public class MultipleTypeGenericClass {

	public static void main(String[] args) {
		MultipleTest<String,Integer> obj=new MultipleTest<String,Integer>("Omkar",29);
		obj.print();
	}
}
