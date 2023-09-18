import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        while (true){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.parametre : ");
            int param1 = scanner.nextInt();
            System.out.println("2.parametre : ");
            int param2 = scanner.nextInt();
            System.out.println("3.parametre : ");
            int param3 = scanner.nextInt();
            System.out.println("Result : " + hasTeen(param1, param2, param3));
            }
        catch (Exception failParam) {
            System.out.println("Parametre - Uyumsuz !");
            }
        }
    }
    public static boolean hasTeen(int... params) {
        for (int param : params) {
            if(param >= 13 && param <= 19) {
                return true;
            }
        }
       return  false;
    }
}





