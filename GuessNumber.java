import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner guess = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100);

        for(int i = 0; i <=5; i++){
            System.out.println("Adivinhe um número de 0 a 100");
            int attempt = guess.nextInt();
            if (attempt < randomNumber) {
                System.out.println("The number is less than " + attempt);
            } else if (attempt > randomNumber){
                System.out.println("The number is greater than");
            } else{
                System.out.println("Congratulations, you got it right!");
                break;
            }
        }
    }
}
