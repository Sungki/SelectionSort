/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

/**
 *
 * @author cstuser
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] input = {11, 3, 8, 22, 6};
        System.out.println("Input:");
        printArray(input);
        selectionSort(input, input.length);
        System.out.println("Sorted Iuput:");
        printArray(input);        
    }
    
    public static void printArray(int[] input) {
        for(int n:input){
            System.out.print(n+", ");            
        }
        System.out.println("");
    }
    
    public static void swap(int[] input, int iLeft, int iRight) {
        int temp = input[iLeft];
        input[iLeft] = input[iRight];
        input[iRight] = temp;
    }
    
    public static void selectionSort(int[] input, int size) {
        for (int i=0; i< size; ++i) {
            
            int indexMinSoFar = i;
            
            for(int j=i+1; j<size; ++j) {
                if(input[j] < input[indexMinSoFar]) {
                    indexMinSoFar = j;
                }
            }
            swap(input, i, indexMinSoFar);
        }
    }
    
}
