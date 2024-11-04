
package tong.so.le.va.so.chan;


public class TongSoLeVaSoChan {

    public static void main(String[] args) {
        int Tongsole = 0;
        int Tongsochan = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                Tongsochan += i; 
            } else {
                Tongsole += i;  
            }
        }

        System.out.println("Tong cac so chan tu 1 den 100: " + Tongsochan);
        System.out.println("Tong cac so le tu 1 den 100: " + Tongsole);
    }
        // TODO code application logic here
}
    
