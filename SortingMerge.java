/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sorting;

import java.util.Scanner;

/**
 *
 * @author REFIN
 */
public class SortingMerge {
    public static void main(String[] args) {
        //Membuat Scanner
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Data : ");
        int jml_data = scan.nextInt();
        
        int[] data = new int[jml_data];
        
        System.out.println();
        for(int a = 0; a < jml_data; a++) {
            System.out.println("Nilai data ke-"+(a+1)+" : ");
            data[a] = scan.nextInt();
        }
        
        System.out.println("Sebelum di Urutkan merge sort ");
        for(int i = 0; i < jml_data; i++)
        {
           System.out.print(data[i]+" ");
        }
        System.out.println();

        initializemergeSort(data,0,data.length-1);
        System.out.println();   
        System.out.println("Setelah di Urutkan merge sort ");
        for(int i = 0; i < jml_data; i++)
        {
           System.out.print(data[i]+" ");
        }

   }
      public static void initializemergeSort(int data[], int l, int h)
     { 
        int low = l;
        int high = h;
        if (low>=high)
        {
           return;
        }
        int middle=(low+high)/2;
        initializemergeSort(data,low,middle);
        initializemergeSort(data,middle+1,high);
        int end_low=middle;
        int start_high=middle+1;
        while ((l<=end_low) && (start_high<=high))
        {
           if (data[low]<data[start_high])
           {
              low++;
           }
           else
         {
              int Temp=data[start_high];
              for (int k=start_high-1;k>=low;k--)
              {
                 data[k+1]=data[k];
              }
              data[low]=Temp;
              low++;
              end_low++;
              start_high++;
         }
       }   
    }
}
