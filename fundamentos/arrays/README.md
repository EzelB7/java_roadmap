# Arrays en java 

## Declaracion de un array 
``` bash 
tipo_de_dato [] nombre_de_array = {elemento1, elemento2, elemento3, etc };
```
- Ejemplo 
``` bash 
int [] numeros = {1,2,3,4,5};
``` 
- Usar siempre por estandar moderno tipo_de_dato [] nombre_de_array 
- especificamos el tipo de dato y luego colocamos los " [ ] " y por ultimo el nombre 

## Inicializacion por medio de " new " 
``` bash 
tipo_de_dato [ ] nombre_de_array = new tipo_de_dato[numero de elementos];
```





## Formas de acceder a un Array 

### Manual
- Ingresamos de forma manual colocando el nombre del array y con " [ ] " luego del nombre  
``` bash
nombre_de_array[posicion];
array[posicion];
``` 

## Con ciclos 
### ciclo for 
- Podemos usar la funcion " .length " para la longitud del array 
``` bash 
for(int valor= 0; valor < array.length; valor ++) 
```

### ciclo while 
- inicializamos con un contador o variable auxiliar para recorrer
- Recordar aumentar el contador/aux en el ciclo while!
``` bash 
int aux = 0; 
while (aux<array.length){
    aux++
}
``` 

