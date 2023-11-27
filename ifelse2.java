
import java.util.*;
public class ifelse2 {
    public static void main(String[] args) {
        Scanner scnNum1 = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num1 = scnNum1.nextInt();
        if (num1 <= 0) {
            System.out.println("Digite um número maior que zero");
            System.exit(0);
        }
        Scanner scnNum2 = new Scanner(System.in);
        System.out.println("Digite o segundo número");
        int num2 = scnNum2.nextInt();
        if (num2 <= 0) {
            System.out.println("Digite um número maior que zero");
            System.exit(0);
        }
        System.out.println("A soma dos números digitados é: " + (num1 + num2));
        scnNum1.close();
        scnNum2.close();
    }
}
