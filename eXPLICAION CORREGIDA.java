Forma 1: if / else

Se revisa si un número ingresado es mayor o igual a 0; si lo es, se dice que es positivo; si no, que es negativo.

Se verifica si la edad ingresada es mayor o igual a 18; si lo es, se indica que es mayor de edad; si no, menor de edad.

Se comparan dos números; si el primero es mayor, se imprime; de lo contrario, se imprime el segundo; si son iguales, se dice que son iguales.

Se revisa si la nota es mayor o igual a 60; si es así, se aprueba; si no, se reprueba.

Se verifica si un número es divisible entre 2; si lo es, es par; si no, impar.

Se ingresan tres números; se guarda uno como máximo y se compara con los otros dos para encontrar el mayor.

Se analiza el año: si cumple con la regla de ser divisible entre 4 y no entre 100, o divisible entre 400, se dice que es bisiesto; si no, no lo es.

Se comprueba si una contraseña tiene más de 8 caracteres, al menos un número y una mayúscula; si cumple todo, es válida; si no, inválida.

Se revisa si un número es divisible entre 3 y 5 (FizzBuzz), solo entre 3 (Fizz), solo entre 5 (Buzz) o ninguno (se imprime el número).

Se tiene un saldo inicial; si el monto a retirar es menor o igual al saldo, se descuenta y se muestra el nuevo saldo; si no, se informa que no hay fondos.

Forma 2: if / else if / else

Se revisa si el número ingresado es mayor a 0 (positivo), si es igual a 0 (cero) o si no cumple, entonces es negativo.

Se evalúa la edad: si es mayor a 18, es mayor de edad; si es igual a 18, se indica exactamente esa edad; si no, es menor de edad.

Se comparan dos números: si el primero es mayor, se imprime; si el segundo es mayor, se imprime ese; si no, son iguales.

Se evalúa la calificación: si es mayor o igual a 90, es excelente; si es mayor o igual a 60, aprobado; si no, reprobado.

Se revisa el número: si es divisible entre 2, es par; si no, impar (se puede incluir un else para casos inválidos).

Se comparan tres números directamente: si el primero es el mayor, se imprime; si el segundo es el mayor, se imprime; si no, el tercero es el mayor.

Se evalúa el año: si es divisible entre 400, es bisiesto; si no, se revisa si es divisible entre 4 pero no entre 100, también es bisiesto; en cualquier otro caso, no lo es.

Se revisa la contraseña por partes: primero si no cumple el largo, luego si no tiene número, después si no tiene mayúscula; si pasa todas, es válida.

Se analiza un número: si es divisible entre 3 y 5, se imprime FizzBuzz; si solo es divisible entre 3, se imprime Fizz; si solo es divisible entre 5, Buzz; si no, se imprime el número.

Se revisa el monto a retirar: si es negativo, inválido; si es 0, no se retiró nada; si es menor o igual al saldo, retiro exitoso; si es mayor, fondos insuficientes.

Forma 3: Operador ternario

Se guarda un mensaje con la evaluación: positivo, cero o negativo, dependiendo del número ingresado.

La edad se evalúa con un ternario: si es mayor de 18, mayor de edad; si es exactamente 18, se indica; si no, menor de edad.

Se comparan dos números: si uno es mayor, se muestra; si no, el otro; si son iguales, se indica.

La nota se evalúa: si es mayor o igual a 90, excelente; si es mayor o igual a 60, aprobado; si no, reprobado.

Se determina si un número es par o impar con un ternario simple.

Se anidan ternarios para elegir cuál de los tres números es el mayor.

Se evalúa el año: si cumple con la condición de bisiesto, guarda el mensaje "bisiesto"; si no, "no bisiesto".

La contraseña se evalúa con condiciones lógicas en un ternario: válida si cumple todas las reglas; si no, inválida.

Se usan ternarios anidados: si el número es divisible por 3 y 5, es FizzBuzz; si solo por 3, Fizz; si solo por 5, Buzz; si no, el número mismo.

Se usa un ternario anidado: si el retiro es menor a 0, inválido; si es 0, no retiró nada; si es menor o igual al saldo, retiro exitoso; si no, fondos insuficientes.
    
    
    Forma 1: if / else

Explicación:
Se usa cuando hay dos opciones posibles. Si la condición es verdadera, se ejecuta un bloque; si es falsa, otro.

Ejemplo en código:

int num = -5;

if(num >= 0){
    System.out.println("El número es positivo");
} else {
    System.out.println("El número es negativo");
}

Forma 2: if / else if / else

Explicación:
Se usa cuando hay más de dos opciones posibles. Permite evaluar condiciones múltiples de forma ordenada.

Ejemplo en código:

int num = 0;

if(num > 0){
    System.out.println("El número es positivo");
} else if(num == 0){
    System.out.println("El número es cero");
} else {
    System.out.println("El número es negativo");
}

Forma 3: Operador ternario ? :

Explicación:
Es una forma abreviada del if/else. Devuelve un valor según la condición, y puede anidarse para más casos.

Ejemplo en código (simple):

int num = 7;
String mensaje = (num % 2 == 0) ? "Es par" : "Es impar";
System.out.println(mensaje);


Ejemplo en código (anidado para 3 casos):

int num = 0;
String mensaje = (num > 0) ? "Positivo" : (num == 0 ? "Cero" : "Negativo");
System.out.println(mensaje);