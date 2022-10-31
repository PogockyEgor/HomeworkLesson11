import java.util.InputMismatchException;
import java.util.Scanner;

public class Massive {

    private static int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    static void elementOfMassive() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(numbers[scanner.nextInt()]);
        }
        catch(Exception e){
            System.out.println("Произошла ошибка");
        }
    }

    static void elementOfMassive2() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(numbers[scanner.nextInt()]);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Такого элемента массива нет");
        }
        catch (InputMismatchException e){
            System.out.println("Необходимо ввести число");
        }
    }

    static void elementOfMassive3(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(numbers[scanner.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException exception) {
            System.out.println("Неверно введены данные");
        }
    }

    static void elementOfMassive4(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(numbers[scanner.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException exception) {
            System.out.println("Неверно введены данные");
        }
        finally {
            System.out.println("Необходимо вводить число от 0 до "+numbers.length);
        }
    }
}
