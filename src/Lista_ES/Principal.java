
package Lista_ES;

public class Principal {

    public static void main(String[] args) {
          
        Lista lista1 = new Lista();
        lista1.Insertar_Inicio(26);
        lista1.Insertar_Inicio(50);
        lista1.Insertar_Inicio(34);
        lista1.Insertar_Inicio(37);
        lista1.Insertar_Inicio(21);
        lista1.Insertar_Inicio(10);
        System.out.println(lista1.Mostrar());
        lista1.Inserta_Ultimo(100);
        System.out.println(lista1);
        lista1.Eliminar_Inicio();
        System.out.println(lista1);
        lista1.Eliminar_Ultimo();
        System.out.println(lista1);
         System.out.println(lista1.Mostrar());
    }
    
}
