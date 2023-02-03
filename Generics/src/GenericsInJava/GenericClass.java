package GenericsInJava;

class Test<T>{
	T obj;
	Test(T obj){
		this.obj=obj;
	}
	public T getObject() {
		return this.obj;
	}
}
public class GenericClass {
 public static void main(String[] args) {
	Test<Integer> iobj= new Test<Integer>(11);
	System.out.println(iobj.getObject());
	
	Test<String> sobj = new Test<String>("Hello");
	
	System.out.println(sobj.getObject());
}
}
