import java.util.Scanner;
import java.lang.Math;

public class Area {
        public static void main(String[] args) {
            while(true) {
                try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Uzun-kenar : ");
                double uzunKenar = scanner.nextDouble();
                System.out.println("Kısa-kenar : ");
                double kisaKenar = scanner.nextDouble();
                System.out.println("Alan : "+ area(uzunKenar,kisaKenar));
                System.out.println("Enter Radius - Value : ");
                double radius = scanner.nextDouble();
                System.out.println(areaDaire(radius));
                }
                catch(Exception fail) {
                    System.out.println("Invalid - Input Value !");
                }
            }
        }
        public static double areaDaire(double rad) {
            if(rad<0){
                return  -1;
            }
            else {
                return  rad*rad*Math.PI;
            }
        }
        public static double area(double a, double b) {
            if(a<0 || b<0){
                return  -1;
            }
            else {
                return  a*b;
            }
        }
    }
