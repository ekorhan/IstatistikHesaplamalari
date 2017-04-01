package uc;

import java.util.Scanner;

public class frekans {
    public static void main(String[] args){
        int a,n,sayac;
        Scanner k = new Scanner(System.in);
        System.out.print("Kaç tane değer girileceğini giriniz: ");
        n=k.nextInt();
        int[] arrays=new int[n];
        int[] arrayf=new int[n];
        for (int i=0;i<n;i++){
            System.out.println(i+1+". Sayıyı giriniz: ");
            a=k.nextInt();
            arrays[i]=a;
        }

        for (int i=0;i<n;i++) {
            sayac=0;
            for (int j=0;j<n;j++) {
                {
                    if(arrays[i]==arrays[j])
                        sayac++;
                }
            }
            arrayf[i]=sayac;
        }
        for(int i=0;i<n;i++){
            System.out.println("Sayilar"+"    "+"Frekanslar");
            System.out.println("    "+arrays[i]+"           "+arrayf[i]);

        }
    }
}
