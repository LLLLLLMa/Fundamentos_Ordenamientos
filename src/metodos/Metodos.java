/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos;
import java.util.Scanner;
/**
 *
 * @author pclab0.pc10
 */
public class Metodos {
    static Scanner leer;
    public static void main(String[] args) {
        leer = new Scanner(System.in);
        MostrarMenu();
    }
    
    public static void MostrarMenu()
    {
        Ordenamientos m = new Ordenamientos();
        boolean continuar = true;
        int array[] = new int[6];
        for(int i = 0;i<array.length ;i++){
            System.out.println("Ingrese los numeros del array (son 6)");
            int x = leer.nextInt();
            array[i]= x;
        }
        System.out.println("Ingrese un numero para ver \n1- BubleSort\n2- SelectionSort\n3- InsertionSort \n4- ShellSort\n5- MergeSort\n6- QuickSort\n7- Salir");
        int op = leer.nextInt();
        switch (op){
            case 1:
                m.BubleSort(array);
                System.out.println("La complejidad para Bubble Sort es de On^2");
                break;
                
            case 2:
                m.SelectionSort(array);
                System.out.println("La complejidad para Selection Sort es de On^2");
                break;

            case 3:
                m.InsertionSort(array);
                System.out.println("La complejidad para Insert Sort es de On^2");
                break;
                
            case 4:
                m.ShellSort(array);
                System.out.println("La complejidad para Shell Sort varia entre O(n^log2n) y On^2");
                break;

            case 5:
                m.mergeSort(array);
                System.out.println("La complejidad para Merge Sort es de O(n^log(n)) en el peor caso");
                break;

            case 6:
                m.quickSort(array);
                System.out.println("La complejidad para Quick Sort es de On^2 en el peor caso y Olog(n) en el mejor caso");
                break;
                
            case 7:
                System.out.println("Saliendo...");
                continuar = false;
                break;
        }
        if (continuar)
        {
            MostrarMenu();
        }
    }
}