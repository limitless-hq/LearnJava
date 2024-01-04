package learningjava;

public class variables{
	public static void main(String[] args) {
		
		String math = "I love Calculus!";
		int myNum = 5;
		Boolean isProgrammingFun = true;
		float decimalNum = 4.99f;
		char myLetter = 'B';
		
		System.out.println(math);
		System.out.println(myNum);
		System.out.println(decimalNum);
		System.out.println(myLetter);
		
		if (isProgrammingFun == true){
			System.out.println("Is programming fun? - Yes");
		}else {
			System.out.println("Is programming fun? - No");
		}
		
		typeCasting();
	}
	public static void typeCasting() {
		
		//automatic casting (smaller to larger data value)
		int myInt = 100;
		double myDouble = myInt;
		
		System.out.println(myInt);
		System.out.println(myDouble);
		
		//narrowing casting (larger to smaller data value)
		double myDouble2 = 100.00;
		int myInt2 = (int)myDouble2;
		
		System.out.println(myDouble2);
		System.out.println(myInt2);
	}
}
