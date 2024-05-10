/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author pclab0.pc10
 */
public class Ordenamientos {
    public void MuestraArray(int [] a){
        for (int i=0;i<a.length;i++){
            System.out.print("["+a[i]+"]");
            }
        System.out.println("");
        System.out.println("");        
        }

    public void BubleSort(int [] a){
        this.MuestraArray(a);
        int contador = 0;
        int n = a.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(a[j-1] > a[j]){  
                    //Intercambio  
                    temp = a[j-1];  
                    a[j-1] = a[j];  
                    a[j] = temp;  
                    this.MuestraArray(a);
                    }
                contador++;
                }
            }
        System.out.println("El numero de operaciones fue de " + contador);
        }

    public void SelectionSort(int[] a) {
        this.MuestraArray(a);
        int contador = 0;
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[indiceMinimo]) {
                    indiceMinimo = j;
                    }
                contador ++;
                }
                int temp = a[i];
                a[i] = a[indiceMinimo];
                a[indiceMinimo] = temp;
                this.MuestraArray(a);
            }
        System.out.println("El numero de operaciones fue de " + contador);
    }
    
    public void InsertionSort(int[] a) {
        this.MuestraArray(a);
        int contador = 0;
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int valorActual = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > valorActual) {
                a[j + 1] = a[j];
                j--;
                contador++;
                }
            a[j + 1] = valorActual;
            this.MuestraArray(a);
            }
        System.out.println("El numero de operaciones fue de " + contador);
        }
    
    public void ShellSort(int[] a) {
        this.MuestraArray(a);
        int contador = 0;
        int n = a.length;
        int incremento = n;
        do {
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < n; i += incremento) {
                    int j = i;
                    while (j - incremento >= 0 && a[j] < a[j - incremento]) {
                        int tmp = a[j];
                        a[j] = a[j - incremento];
                        a[j - incremento] = tmp;
                        j -= incremento;
                        contador ++;
                        this.MuestraArray(a);
                        }
                    }
                }
            
            }
        while (incremento > 1);
        System.out.println("El numero de operaciones fue de " + contador);
        }
    
    public void mergeSort(int[] a) {
        if (a.length < 2) {return;}
        int mid = a.length / 2;
        int[] left = new int[mid];
        int[] right = new int[a.length - mid];
 
        System.arraycopy(a, 0, left, 0, mid);
        System.arraycopy(a, mid, right, 0, a.length - mid);
 
        mergeSort(left);
        mergeSort(right);
        merge(a, left, right);
        this.MuestraArray(a);  
        }
     
    
    public void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public void quickSort(int[] a) {
        if (a == null || a.length == 0) {
            return;
        }
        int length = a.length;
        sort(a, 0, length - 1);
        this.MuestraArray(a);
    }

    private void sort(int[] a, int low, int high) {
        if (low < high) {
            int p = partition(a, low, high);

            sort(a, low, p - 1);
            sort(a, p + 1, high);
            
        }
    }

    public int partition(int[] a, int low, int high) {
        int pivote = a[high];
        int i = (low - 1);  
        for (int j = low; j < high; j++) {
            if (a[j] < pivote) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                this.MuestraArray(a);
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;
        this.MuestraArray(a);

        return i + 1;
    }
                
}
