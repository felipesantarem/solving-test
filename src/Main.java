import java.util.Scanner;
//
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("The result of sum is:");
    sumValues();

    System.out.println("Insert how many fibonacci numbers you want to display: ");
    int num = input.nextInt();
    input.nextLine();
    fibonacci(num);


    System.out.println("Reverse your string here: ");
    String word = input.nextLine();
    String result = inverterString(word);
    System.out.println("Reversed word:\n" + result);
    }


    public static void sumValues() {
        int index = 13;
        int sum = 0, k = 0;

        while (k < index) {
            k = k + 1;
            sum = sum + k;
        }
        System.out.println(sum);
    }

    public static void fibonacci(int num){
        int numberOne = 0, numberTwo = 1, aux;
        for(int i = 0; i < num; i++) {
            System.out.printf("%d ", numberOne);
            aux = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = aux;
        }
        System.out.println();
    }

    public static String inverterString(String word) {
        StringBuilder aux = new StringBuilder();
        for(int i = word.length()-1; i >= 0; i--) {
            aux.append(word.charAt(i));
        }
        return aux.toString();
    }
}