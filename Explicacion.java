Forma 1: if / else

Explicación:
Se usa cuando hay dos opciones posibles.

Si la condición es verdadera, se ejecuta el bloque if.

Si la condición es falsa, se ejecuta el bloque else.

Ejemplo en código:

int num = 5;

if(num >= 0){
    System.out.println("El número es positivo");
} else {
    System.out.println("El número es negativo");
}

🔹 Forma 2: if / else if / else

Explicación:
Se usa cuando hay más de dos opciones posibles.

Se evalúa la primera condición (if).

Si no se cumple, se pasa al else if.

Si ninguna condición se cumple, se ejecuta el bloque else.

Ejemplo en código:

int num = 0;

if(num > 0){
    System.out.println("El número es positivo");
} else if(num == 0){
    System.out.println("El número es cero");
} else {
    System.out.println("El número es negativo");
}

🔹 Forma 3: Operador ternario ? :

Explicación:
Es una forma abreviada de escribir un if/else.
La sintaxis es:

variable = (condición) ? valor_si_verdadero : valor_si_falso;


Se puede usar para una condición simple o incluso anidarlo para manejar más de dos casos.

Ejemplo en código (simple):

int num = -3;

String mensaje = (num >= 0) ? "El número es positivo" : "El número es negativo";
System.out.println(mensaje);