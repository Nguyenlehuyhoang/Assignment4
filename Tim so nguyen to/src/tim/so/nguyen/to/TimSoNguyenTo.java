
package tim.so.nguyen.to;

public class TimSoNguyenTo {


    public static void main(String[] args) {
        
        System.out.println("Cac so nguyen to tu 2 den toi 100 la: ");
        for(int i = 2; i < 101; i++) {
            if(LaSoNguyenTo(i)) {
                System.out.print(i + " ");
            }
        }
        // TODO code application logic here
    }
    
    public static boolean LaSoNguyenTo(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
        
    }
    
}
