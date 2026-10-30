//PRACTICA 3

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections; //Tambiem se usa en el AeerayList
import java.util.HashMap;
import java.util.HashSet;
public class Areglos {
  public static void main(String[]args) {

  //1 Areglo normal
  String[]nombres={"Hugo","Brandon","Izac"};
  String[]nombres2={"Patricia","Candelaria"};  
    //No se puede insertar
    //Actualizar
  nombres[2]="Luz"; //Hugo, Brandon, Luz
    //Ordenar
  Arrays.sort(nombres); //Brandon, Hugo, Luz
    //No se puede eliminar
    //EXTRAS
  String[]copia = Arrays.copyOf(nombres , 1);
    System.out.println("Copia " + Arrays.toString(copia));//Brandon, Hugo
  System.out.println("¿Son iguales? " + Arrays.equals(nombres , nombres2)); //False
  System.out.println("El primer nombres es " + nombres[0]); //Brandon
    System.out.println(Arrays.toString(nombres)); //Imprime, Brandon, Hugo, Luz

  //2 ArrayList
  ArrayList<String>apeidos=new ArrayList<>();
    apeidos.add("Flores");
    apeidos.add("Huerta");
    apeidos.add("Gerrero");
    ArrayList<String>apeidos2=new ArrayList<>();
    apeidos2.add("Flores");
    apeidos2.add("Huerta");
    apeidos2.add("Gerrero");
  //Insertar
    apeidos.add("Ruiz"); //Flores, Huerta, Gerrero, Ruiz (lo pone al final)
    apeidos.add(0 ; "Martinez"); //Martinez, Flores, Huerta, Gerrero, Ruiz (lo pone en el lugar asignado) 
  //Actualizar
    apeidos.set(4 , "Snchez Ruiz"); //Martinez, Flores, Huerta, Gerrero, Sanchez Ruiz 
  //Eliminar
    apeidos.remove(4); //Martinez, Flores, Huerta, Gerrero (elimina por posicion)
    apeidos.remove("Martinez"); //Flores, Huerta, Gerrero (elimina por nombre)
  //Ordenar
    Collections.sort(apeidos); //Flores, Guerrero, Huerta (previamente se importo el Collections ariva)
  //EXTRAS
    apeidos.get(2); //Huerta (te dice lo que hay en ese lugar) 
    apeidos.size(); //3 (te dice cuanto eslementos hay)
    apeidos.index0f("Flores"); //0 (busca en que posicion esta el nombre)
    apeidos.contains("Gerrero"); //True (verifica si esta en la lista)
    apeidos.isEmpty(); //False (verifica si esta vacia la lista)
    apeidos.equals(apeidos2); //False (verifuaca si son igualaes pero en este caso no porque no es el mismo orden)
    apeidos.clear(); // (elimina todo en la lsita)
    System.out.println(apeidos); //no imprime [] porque se elimino todo por el .clear

  //3 HashMap
  HashMap<Stirng , Integer>edades=new HashMap<>();
    edades.put("Alice" , 6);
    edades.put("Mini" , 4);
    edades.put("Hyena" , 4);
    edades.put("Wera" , 7);
  HashMap<Stirng , Integer>edades2=new HashMap<>();
    edades2.put("Alice" , 6);
    edades2.put("Mini" , 4);
    edades2.put("Hyena" , 4);
    edades2.put("Wera" , 7);
  //Insertar
    edades.put("Solovino" , 8); //Alice,6 , Mini,4 , Hyena,4 , Wera,7 , Solovino,8
  //Actualizar
    edades.put("Alice" , 5); //Alice, 5 ( es como insertar solo pones el nuevo valor solo ese se puede cambiar)
  //Eliminar
    edades.remove("Solovino"); //Alice,5 , Mini,4 , Hyena,4 , Wera,7
  //No se pede ordenar
  //EXTRAS
    edades.get("Mini"); //4(cosulya el valor de la clave, de no existir la clavve sale (null))
    edades.size(); //4(ve caunatos datos hay)
    edades.isEmpty(); //False(verifica si esta vacioa la lista)
    edades.containsKey("Wera"); //True(Verifica sie esxite la clave)
    edades.containsValue(5); //True(Verifica si existe ese valor)
    edades.keySet(); //[Alice, Mini, Hyena, Wera](da las claves)
    edades.values(); //[5, 4, 4, 7](da los valores)
    edades.equals(edades2); //False(verifica si son iguales da igual el orde en este caso alse por la eada de alice)
    edades2.clear(); //(elimina todo el contenido)
    System.out.println(edades); // Imprime Alice,5 , Mini,4 , Hyena,4 , Wera,7

  //4 HashSet 
  HashSet<String>colores=new HashSet<>();
    colores.add("Rojo");
    colores.add("Azul");
    colores.add("Verde");
  HashSet<String>colores2=new HashSet<>();
    colores2.add("Rojo");
    colores2.add("Azul");
    colores2.add("Verde"); 
  //Insertar
    colores.add("Amarillo"); //Rojo, Azul, Verde, Amarillo (el orden en el que sale es normal que varie)
  //Actualiza no existe directamente pero se soluciona asi
    colores.remove("Amarillo"); //eliminas el que quieres "actualizar"
    colores.add("Dorado"); // y agregas el nuevo y asi "actualiza" Rojo, Azul, Verde, Dorado
  //Eliminar
    colores.remove("Dorado"); //Rojo, Azul, Verde
  //No se puede ordenar
  //EXTRAS
    colores.size(); //3(dice cuantos datos hay)
    colores.isEmpty(); //False(varifica si la sista esta vacia)
    colores.contains(Negro); //False(verifica si existe ese valor en la lista)
    colores.equals(colores2); //True(Vrivica sie el contenido es igual sin importar el orden)
    colores2.clear(); //(Elimina los datos de ese HashSet)    
  }
}

/*
NOTAS:
-Los exreas que coloque puse en espesifico los quie son compatibles cobn cada uno ya que no todos se pueden usar con todos
-En HashSet, HashMap y ArrayList los dadots de tipo (String) seusan de la misma manera que el Arreglo normal pero 
 para datos numericos como int la forma de declarar que te regresarn ese tivo de valor es difernete la forma en como se scribe
 int= Integer
 double= Double
 char= Character
 boolean= Boolean
 long= Long
 float= Float
 algunos solo se pone con mayuscula y otros agregan mas texto
*/

//EJERSICIO EXTRA

import java.util.Scanner;
import java.util.HashMap;    
public class Agenda {
  public static boolean esTelefonoValido(String telefono) {
      if(!telefono.matches("\\d+")) {
      return false;
    }
      if(telefono.length() >11 ) {
      return false;
    }
    return true;
  }
  public static void main(String[]args) {
  Scaner teclado = new Scanner (System.in);
  HashMap<Strng, String> agenda = new HashMap<>();
  int opcion;
  do {
  System.out.ptrintln("\n==== AGENDA DE CONTACTOS ====");
  System.out.ptrintln("1. Agregar contacto");
  System.out.ptrintln("2. Buscar contacto");
  System.out.ptrintln("3. Actualizar telefono");
  System.out.ptrintln("4. Elimina contacto");
  System.out.ptrintln("5. Mostrar todos los contactos");
  System.out.ptrintln("6. Salir");
  System.out.ptrint("Elige una opcion");
  opcion = teclado.nextInt();
  teclado.nextInt();
  switch (opcion) {
    case 1:
      System.out.ptrint("Nombre del contacto: ");
      String nombrAgregar = teclado.nextLne();
      if(agenda.containsKey(nombreAgregar)) {
        System.out.ptrintln("Ese contacto ya existe");
      } else {
        System.out.ptrintln("Numero de telefono: ");
        String telAgregar = teclado.nextLne();
        if(esTelefonoValido(telAgregar)) {
          agenda.put(nombreAgregar, telAgregar);
          System.out.println("Contacto agregado");
        } else {
          System.out.println("Telefono no valido. Solo numeros, max 11 digitos");
      }
      }
      break;
    case 2:
      System.out.ptrint("Nombre a buscar:");
      String nombreBuscar = teclado.nextLne();
      if(agenda.containsKey(nombreBuscar)) {
        System.out.ptrintln("Telefono: "+ agenda.get(nombreBuscar));
      } else {
        System.out.ptrintln("Contacto no encontrado");
      }
      break;
    case 3:
      System.out.ptrint("Nombre del contacto: ");
      String nombreActualizar = teclado.nextLne();
      if(!agenda.containsKey(nombreActualizar)) {
        System.out.ptrintln("Contacto no encontrado");
      } else {
      System.out.ptrint("Nuevo nuemero de telefono: ");
      String telNuevo = teclado.nextLne();
      if(esTelefonoValido(telValido)) {
        agenda.put(nombreActualizar, telNuevo);
        System.out.println("Telefono actualizado");
      } else {
        System.ourt.println("Telefono no valido");
      }
      }
      break;
    case 4:
      System.out.ptrint("Nombre a eliminar: ");
      String nombreEliminar = teclado.nextLne();
       if(agenda.containsKey(nombreEliminar)) {
         agenda.remove(nombreEliminar);
         System.out.ptrintln("Contacto eliminado");
          } else {
        System.out.println("Contacto no eliminado");
      }
      break;
    case 5:
      if(agenda.isEmpty()) {
        System.ourt.println("La agenda esta vacia");
      } else {
         System.out.ptrintln("\n Lista de contactos: ");
        for(String nombre : agenda.keySet()) {
           System.out.ptrintln("nombre" + agenda.get(nombre));
        }
      }
      break;
    case 6:
       System.out.ptrintln("programa finalizado. ¡Hasta luego!");
      break;
    default:
       System.out.ptrintln("Opcion no valida, intenta de nuevo");
  }
} while (opcion != 6);
teclado.close();
}
}

        
        
      
        
      

      
      
        
      
  
  

    

    
    
    
    

  
    
