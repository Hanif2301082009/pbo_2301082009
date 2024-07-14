/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082009.p40319;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author N I P
 */
public class ProsesArray1D {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int i,n;
        int jum, max, min;
        int imax, imin; //indeks t4 nilai max min berada
        float rata;
        
        System.out.print("Masukkan banyak data : ");
        n = in.nextInt(); //menjadi ukuran array
        int[] A = new int[n];
        
        //isi Array A
        //System.out.println("\n***Mengisi Array***");
        for(i=0;i<=n-1;i++)
        {
            //System.out.println("Array["+i+" = ]");
            //A[i] = in.nextInt();
            A[i] = rand.nextInt(100)+1; //1-100
        }
        //proses isi array
        jum = A[0];
        max = A[0]; imax = 0;
        min = A[0]; imin = 0;
        for(i=1;i<=n;i++)
        {
            jum = jum + A[i];
            if(A[i]>max)
            {
                max = A[i];
                imax = i;
            }
            if(A[i]<min)
            {
                min = A[i];
                imin = i;
            }
        }
        rata = (float)jum/n;
        //menampilkan isi array A
        System.out.println("\n***Menampilkan isi Array A***");
        for(i=0;i<n;i++)
        {
            System.out.print(A[i]+"\t");
        }
        //menampilkan isi array B
        System.out.println("\n***MEnampilkan isi Array A yang Ganjil***");
        for(i=0;i<n;i++)
        {
            if(A[i]%2!=0)
                System.out.print(A[i]+"\t");
            //endif
        }
        //Menampilkan isi array A
        System.out.println("\n***Menampilkan isi Array A pada Indeks ganjil***");
        for(i=0;i<n;i++)
        {
            if(i%2!=0)
                System.out.println(A[i]+"\t");
        }
        System.out.println("\nJumlah     = "+jum);
        System.out.println("\nRata-rata     = "+rata);
        System.out.println("\nNilai terbesar    = "+max+"pada indeks"+imax);
        System.out.println("\nNilai terkecil   = "+min+"pada indeks"+imin);

    }
    
}
