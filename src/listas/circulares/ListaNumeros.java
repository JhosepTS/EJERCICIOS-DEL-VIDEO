
package listas.circulares;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaNumeros {

    public static void main(String[] args) {
        // TODO code application logic here
  
        ListaNumeros miLista = new ListaNumeros();
        miLista.listitaNumeros = new ArrayList();
        miLista.leerOpcion();
        
}
    private ArrayList listitaNumeros;

public void leerOpcion(){
    Scanner teclado = new Scanner (System.in);
    int opcion=0 ;
    do {
   System.out.println("/n lista de numeros");
   System.out.println("[1] Agregar ") ;
   System.out.println("[2] Buscar   ") ;
   System.out.println("[3] Modificar Elemento") ;
   System.out.println("[4] Eliminar Elemento");
   System.out.println("[5] Insertar Elemento") ;
   System.out.println("[6] Mostrar Elementos") ;
   System.out.println("[7] Salir\n  ") ;
   System.out.println("Ingrese opcion del 1 al 7 ") ;
   opcion = teclado.nextInt();
   switch (opcion) {
   case 1:
   ingresarValor();
   break;
   case 2 :
   buscarValor();
   break;
   case 3 :
   modificarValor();
   break;
   case 4 :
   eliminarValor();
   break;
   case 5 :
   insertarValor();
   break;
   case 6 :
   mostrarLista();
   break;
   
   
   
    }
    } while (opcion !=7);
}
   
 
 public void ingresarValor(){
     Scanner teclado = new Scanner(System.in);
     double valor=0;
     System.out.print("ingresa un valor:");
     valor = teclado.nextDouble();
     listitaNumeros.add(valor);
 }
public void buscarValor(){
    Scanner teclado = new Scanner(System.in);
    double valor;
    int indice;
    System.out.print("valor a buscar: ");
    valor = teclado.nextDouble();
    indice = listitaNumeros.indexOf(valor);
    if (indice != -1){
    System.out.println("Dato se encuentra en posicion:"+indice);
    }else{
    System.out.println("Dato no se encuentra ");
    }
    }
 
public void modificarValor(){
    Scanner teclado = new Scanner(System.in);
    double valor,nuevoValor;
    int indice;
    System.out.print("valor a modificar: ");
    valor = teclado.nextDouble();
    indice= listitaNumeros.indexOf(valor);
    nuevoValor= teclado.nextDouble();
    listitaNumeros.set(indice,valor);
    if (indice != -1){
    System.out.println("Nuevo valor");
    }else{
    System.out.println("Dato no se encuentra ");
    }
    }
    
public void eliminarValor(){
    Scanner entrada= new Scanner(System.in);
    double valor;
    int indice;
    System.out.print("valor a eliminar:");
    valor = entrada.nextDouble();
    indice=listitaNumeros.indexOf(valor);
    if (indice !=-1){
    listitaNumeros.remove(indice);
    System.out.println("Dato eliminado");
    }else{
    System.out.println("Dato no se encuentra");
    
    }
    }

public void insertarValor(){
    Scanner teclado= new Scanner(System.in);
    double valor;
    int indice;
    System.out.print("valor a insertar:");
    valor = teclado.nextDouble();
    System.out.println("Posicion donde sea insertar:");
    indice = teclado.nextInt();
    listitaNumeros.add(indice,valor);
    
    }

public void mostrarLista(){
   if (!listitaNumeros.isEmpty()) {
   System.out.println("Elementos de la lista:");
   for (int i= 0 ; i <listitaNumeros.size();i++){
   System.out.println(listitaNumeros.get(i));
   }
   } else {
   System.out.println("No existen valores en la lista");
   }
    }
    
}
