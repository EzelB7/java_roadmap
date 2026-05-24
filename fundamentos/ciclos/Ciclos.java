public class Ciclos {
    public static void main(String[] args) {
	// ciclos for, while y do while en java
	// ciclo for estructura convencional
	// for(inicio o desde ; fin o hasta; con paso,salto o incremento)
	
	for ( int i = 1; i <= 5; i++) {
	    System.out.println(i);
	}

	// ciclo while
	int valor = 1 ;
	while (valor<=5) {
	    System.out.println("hola "+valor+ " veces");
	    valor++; // no olvidar sumar el contador para no caer en ciclo infinito!
		
	}
	// ciclo do while 
	int a = 1;
	do {
	    System.out.println("ciclo do while repitiendo " + a + " veces");
	    a++; //este bloque de codigo va ejecutar por lo menos 1 vez ! 
		
	} while (a<=5); // aqui recien se evalua la condicion V o F

    } //del main 
    
}// de la clase 
