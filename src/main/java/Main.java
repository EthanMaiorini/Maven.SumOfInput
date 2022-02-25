/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main_object = new Main();
        Scanner newscanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int newN = newscanner.nextInt();
        int result = main_object.sumOfNumbers(newN);
        System.out.println(result);
        newscanner.close();
    }

    public int sumOfNumbers(int n){
        int sum = 0;
        for(int i = 1; i<=n;i++){
            sum +=i;
        }
        return sum;
    }
}
