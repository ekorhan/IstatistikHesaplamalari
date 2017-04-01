package dort;

import java.util.Scanner;

public class tablo {
    public static void main(String[] args){
        int a,n,R,S,L,k,h,gecici;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane değer girileceğini giriniz: ");
        n=input.nextInt();
        int[] arrays=new int[n];
        for (int i=0;i<n;i++){
            System.out.println(i+1+". Sayıyı giriniz: ");
            a=input.nextInt();
            arrays[i]=a;
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++) {
                if(arrays[i]<arrays[j]){
                    gecici=arrays[j];
                }
                else
                    gecici=arrays[i];
            }
        }
    }
}
