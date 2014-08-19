
package hoja.de.trabajo.pkg4;

import java.util.Scanner;

public class HojaDeTrabajo4 {

    public static void main(String[] args) {
        ListadoblementeEnlazada _lista = new ListadoblementeEnlazada(-1);
        ListaCircular _lista1 = new ListaCircular();
        Lista _lista2 = new Lista();
        
        Scanner _in  = new Scanner(System.in);
        
        int opcion =0;
        int i =0;
        
        int opp = 0;
        
        while (opcion!= 5){
            System.out.print("1. Agregar\n");
            System.out.print("2. Mostrar Lista doblemente enlazada\n");            
            System.out.print("3. Mostrar Lista Ciruclar(ADVERTENCIA CICLO INFINITO)\n ");            
            System.out.print("4. Mostrar Lista enlazada\n");
            System.out.print("5. Salir\n");
            opcion = _in.nextInt();
            opp = opcion;
            
            switch(opcion)
            {               
                case 1:
                    _lista.agregarNodo(i);
                    _lista1.agregarNodo(i);
                    _lista2.agregarNodo(i);
                    break;
                case 2:
                    System.out.println(_lista.toString());
                    System.out.println("\n");
                    break;                    
                    
                case 3: 
                    System.out.println(_lista1.toString());
                    System.out.println("\n");
                    break;                    
                case 4:
                    System.out.println(_lista2.toString());
                    System.out.println("\n");
                    break;                    
            }
            
            i++;
        } 

    }
}
