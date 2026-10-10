//OPERADORES

//Aritmreticos

System.out.println("Suma: 10 + 10 = "  + (10 + 10));
System.out.println("Resta: 10 - 10 = "  + (10 - 10));
System.out.println("Multiplica: 10 * 10 = "  + (10 * 10));
System.out.println("Divide: 10 / 10 = "  + (10 / 10));
System.out.println("Resto: 10 % 10 = "  + (10 % 10));

int n=10;
System.out.println("Suma 1 = "  + (n++)); //asi muetrs y luego opera
n=10;
System.out.println("Resta 1 = "  + (--n)); //asi primero opera y luego muestra

//Comprobacion

System.out.println("Igualdad: 10 == 10 es " + (10==10));
System.out.println("Difernte de: 10 != 10 es " + (10!=10));
System.out.println("Mayor que: 10 > 10 es " + (10>10));
System.out.println("Menor que: 10 < 10 es " + (10<10));
System.out.println("Mayor o igual: 10 >= 10 es " + (10>=10));
System.out.println("Menor o igual: 10 <= 10 es " + (10<=10));

//Logicos

int edad=10;
System.out.println("And: edad>5 && edad<15 " + (edad>5 && edad<15));
edad=10;
System.out.println("Or: edad>5 || edad>15 " + (edad>5 || edad<15));
edad=10;
System.out.println("Not: !edad>5 " + !(edad>5));

//Asignacion

int numero=10; // = Ya cueta como uno pero no modifica nada solo asigna
numero += 5; //Sumas 5
  System.out.prinln(numero);
numero=10;
numero -= 5; //Resta 5
  System.out.prinln(numero);
numero=10;
numero *= 5; //Multiplica por 5
  System.out.prinln(numero);
numero=10;
numero /= 5; //Divide entre 5
  System.out.prinln(numero);
numero=10;
numero %= 5; //Hace el resto de 5
  System.out.prinln(numero);

//Bit a bit

int a=10;
int b=15;

  System.out.println("And: a & b = " + (a & b));
  System.out.println("Or: a | b = " + (a | b));
  System.out.println("Not: ~a = " + (~a));
  System.out.println("Desplazamiento a la izquierda: a << b = " + (a << b));
  System.out.println("Desplazamiento a la dereca: a >> b = " + (a >> b));
  System.out.println("Desplazamiento a la derecha sin signo: a >>> b = " + (a >>> b));

//Operador condicional terniario

edad=10;
String mensaje = edad >= 18 ? "Eres mayor de edad" : "Eres menor de edad";

//ESTRUCTURAS DE CONTROL

//Seleccion o desicion

//Solo if
edad=10;
  if(edad>=18){
    System.out.println("Eres mayor de edad");
  }

//if-else
edad=10; 
  if(edad>=18){
    System.out.println("Eres mayor de edad");0000000000     0
  } else {
    System.out.println("Eres menor de edad");
  }

//switch
int año=2026;
  switch(año) {
    case 2025:
      System.out.println("eres del pasado");
      break;
    case 2026:
      System.out.println("eres del present");
      break;
    case 2027:
      System.out.println("eres del futuro");
      break;
      default;
        System.out.println("No se de donde eres");
  }
 
//Bucles o ciclos

//for
for(int i = 10; i<=18; i++){
  System.out.println("Cumples años:" + i);}
System.out.println("No cumples años");

//while
edad=10;
while(edad<=18){
  System.out.println("Aver si asi eres mayor:" + edad);
  edad++
    }
System.out.println("No alcanzaste");

//do-while
año=2026;
do{
  System.out.println("Nuevo año:" + año);
  año++;
}
  while(año<=2026);

//Salto o inetrupcion

//break
for(int i = 10; i<=18; i++){
  if(i == 12){
    break;
  }
  System.out.println(i);
    }
System.out.println("No llego");

//continue
for(int i = 10; i<=18; i++){
  if(i == 12){
    continue;
  }
  System.out.println(i);
    }

//return
public class sinValorDeVoid {
  public static void main (String[]args) {
    System.out.println("Dia 1");
    boolean quieroAprenderAProgramar=true;
      if(quieroAprenderAProgramar) {
      System.out.println("1 dia mas");
      return;
    }
    System.out.println("Fracaso");
  }
}

// Ejermplo con valor
  public static int sumar(int a , int b) {
    int resultado = a + b;
    return resultado;
  }
  public static void main (String[]args) {
    int total = sumar (5,3);
    System.out.println("Total:" + total);
  }

//EXTRA

public class NumerosFiltarados {
  public static void main(String[]args) {
    System.out.println("Numeros pares del 10 al 55, sin el 16 y sin multiplos de 3:");
    for(int i = 10; i<=55; i++) {
     if(i % 2 == 0 && i != 16 && i % 3 != 0) {
       System.out.println(i);
     }
    }
  }
}



  
    
    
      



