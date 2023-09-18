import java.util.Scanner;
import java.util.Stack;

public class PlayerCat {
    public static void main(String[] args) {
        while (true){
            try {
                System.out.println("True || False --> Mevsim yaz mı ?");
                Scanner scanner = new Scanner(System.in);
                boolean mevsim = scanner.nextBoolean();
                System.out.println("Sıcaklık degerini giriniz : ");
                int temp = scanner.nextInt();
                System.out.println(isCatPlaying(mevsim,temp));
            }
            catch (Exception fail) {
                System.out.println("Invalid - Input !");
            }
        }
    }
    public static Boolean isCatPlaying(boolean val, int param){
        if(val){
            if(param>=25 && param<=45){
                return  true;
            }
            else return  false;
        }
        else {
            if(param>= 25 && param<=35){
                return  true;
            }
            else return  false;
        }
    }
}

