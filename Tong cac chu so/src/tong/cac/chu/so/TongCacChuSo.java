
package tong.cac.chu.so;

import java.util.Scanner;


public class TongCacChuSo {


    public static void main(String[] args) {
        System.out.println("Nhap so nguyen can tinh tong: ");
        Scanner ac = new Scanner(System.in);
        int a = ac.nextInt();
        int Tong = 0;
        while(a!=0){
            Tong+= a%10;
            a/=10;
        }
        System.out.println("Tong cac chu so do la: " + Tong);
        // TODO code application logic here
    }
    
}
