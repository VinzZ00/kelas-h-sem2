package pert6;

public class Generic<T extends Number> {

	T object1;
	
	public Generic(T number) {
		// TODO Auto-generated constructor stub
		this.object1 = number;
		int a = number.intValue();
		System.out.println(a);
		int b = (int) Math.pow(a, 2);
		System.out.println(b);
		System.out.println("pangkat 2 dari int tersebut adalah " + b);
	}
	
	public Integer addition(Generic<?> Number) {
		
		int add = object1.intValue() + Number.object1.intValue();
		
		return add;
	}

}
