# Ciclos en java 

## Ciclo for 
- Estructura convencional 
- Para separar los 3 bloques se usa " ; " 
``` bash 
for(inicio o desde ; fin o hasta ; con paso, salto o incremento) 
``` 
- El i++ significa 
```bash 
i=i+1;
``` 
- Ejemplo
``` bash 
for (int k = 1 ; k<=5 ; k++){
    System.out.println(k);

}
```

## Ciclo while 
- Estructura convencional 
``` bash 
while(condicion) {
    hacer 
}
```
- No olvidar incrementar/decrementar tu variable dentro del while para no caer en ciclo infinito!

- Ejemplo
``` bash 
int contador = 1 ;
while (contador<=5 ){
    System.out.println(contador);
    contador++; // esta parte no olvidar o queda en ciclo infinito!!
}
```

## Ciclo do while
- Estructura convencional 
``` bash 
do {
    codigo; // Este codigo se va ejecutar al menos 1 vez  
    incremento/decremento;
} while (condicion); // aqui recien se verificar el true o false!
```
- Ejemplo
``` bash 
int a = 1;
El do abre y cierra llaves
El while abre y cierra parentesis y luego ;
do {  
    System.out.println("hola");
    a++             // no olvidar esta parte!
    }while(a<5);  
```

 







