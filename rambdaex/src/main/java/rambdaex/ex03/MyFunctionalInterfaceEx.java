package rambdaex.ex03;

public class MyFunctionalInterfaceEx {

	public static void main(String[] args) {
		
		MyFunctionalInterface fi;
		
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> x + y;
		System.out.println(fi.method(10, 5));
		
		
		
	}

}
