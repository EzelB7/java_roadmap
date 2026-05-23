public class Operadores {
    public static void main(String[] args) {
	// Operadores en java 
	int a = 50;
	int b = 10; 
	int suma= a+b;
	int resta= a-b;
	int multi= a*b;
	int div= a/b; 
	int modulo= a%b; //calcula el resto 
	System.out.println("a : "+ a + "\nb : "+ b );
	System.out.println("La suma es : " + suma + "\nLa resta es : " + resta + 
		"\nLa multiplicacion es :" + multi + 
		"\nLa division es : "+ div + 
		"\nEl modulo es : "+ modulo);
	// comparadores en java
	System.out.println();
	System.out.println("a>b? : "+ (a>b) );
	System.out.println("a<b? : "+ (a<b));
	System.out.println("a=b? "+ (a==b));
	System.out.println("a!=b? "+ (a!=b));
	System.out.println();
	
	// operadores logicos 
	
	System.out.println("operadores logicos");
	System.out.println("operador AND &&");
	System.out.println("a && b > 100 ? " + (((a > 100) && (b>100))));
	
	System.out.println();
	
	System.out.println("operador OR ||");
	System.out.println("a || b < 100? :" +(((a < 100) || (b<100)) ) );
    }
}
