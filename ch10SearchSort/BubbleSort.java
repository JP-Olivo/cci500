/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10SortingSearching;

import java.util.Arrays;

/**
 *
 * @author JUANO
 */
public class BubbleSort {
    
    public static void bubblesort(int[] list) {
        int unsorted = list.length;
        boolean swap = false;
        int temp ;
        
        for(int i = 0; i < list.length - 1; i++) {
            System.out.println(i);
            for(int j = 0; j < unsorted - 1; j++) {
                if(list[j] > list[j+1]) {
                   temp = list[j];
                   list[j] = list[j+1];
                   list[j+1] = temp;
                   swap = true;
                }
            }
            unsorted--;
            if (!swap) break;
            swap = false;
        }
    }
    
    public static void main(String[] args) {
        int[] listy = {5,4,3,7,8,2,1,6};
        int[] listy2 = {1,2,4,3,5,6,7,8};
        bubblesort(listy);
        System.out.print(Arrays.toString(listy));
        
        bubblesort(listy2);
        System.out.print(Arrays.toString(listy2));
        
    }
}
