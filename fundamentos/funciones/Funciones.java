public class Funciones {
    // las funciones van dentro de la clase y fuera del main.
    // retorno vacio o void 
    public static void saludar (){
	System.out.println("hola esto es una funcion invocada! ");
    }
    // retorno int 
    public static int sumar(int a , int b) {
	return a+b;
    }
    // retorno boolean 
    public static boolean es_par (int numero){
	return numero%2==0;
    }


    public static void main(String[] args) { 
	// funcion main principal
	saludar();
	System.out.println("la suma es " + sumar(1, 2));
	System.out.println("el 4 es par ? "+es_par(4) );

}// del main
}// de la clase
