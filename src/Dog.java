import java.util.Scanner;

public class Dog {
    public static void main(String[] args) {
        while (true){
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("True || False --> Köpek havlıyor mu ?");
                boolean status = scanner.nextBoolean();
                System.out.println("Saat giriniz :");
                int time = scanner.nextInt();
                System.out.println("Result : "+shouldWakeUp(status,time));
            }
            catch (Exception failDog){
                System.out.println("Parameter - Error !");
            }
        }
    }
    public static boolean shouldWakeUp(boolean state, int val){
        if(state) {
        if((val>=20 && val<=23)){
            return  true;
         }
        else if (val>=0 && val<8){
            return true;
         }
        else if(val<0 || val>23) {
            return  false;
         }
        }
        return  false;
    }
}

