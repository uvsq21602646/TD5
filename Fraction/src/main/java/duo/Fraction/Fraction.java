package duo.Fraction;


public class Fraction {
	private int num;
	private int den;
	
	
	
	
	Fraction(int a, int b){
		if (b == 0) {
			System.out.println("den cannot be 0");
			throw new IllegalArgumentException();
		}
		this.num = a;
		this.den = b;
	}
	
	Fraction(int a){
		this.num = a;
		this.den = 1;
	}
	
	Fraction(){
		this.num = 0;
		this.den = 1;
	}

	public String toString() {
		return "Fraction num=" + num + ", den=" + den + " ";
	}
	
}
