import java.util.Scanner;
public class Output {
    public static void main(String[] args){
        Square sq = new Square();

        System.out.println("Введите высоту пирамиды");
        Scanner scan = new Scanner(System.in);
        double height = scan.nextDouble();

        System.out.println("Введите длину стороны пирамиды");
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();

        //Вычисление площади пирамиды
        System.out.println(sq.formula(height, width));
    }
}
