import java.util.Scanner;
public class Start {
    public static void mode() {
        while (true) {
            int modeChoice = mode("Выберите режим (1-обычный; 2-комплексные числа; 3-выход): ");
            if (modeChoice == 1) {
                ICalculableFactory calculableFactory = new CalculableFactory();
                ViewCalculator view = new ViewCalculator(calculableFactory);
                view.run();


            }
            if (modeChoice == 2) {
                ComplexCalculator.complexRun();
            }
            if (modeChoice == 3) {
                System.out.println("\nРабота завершена\n");
                break;
            }
            if (modeChoice != 1 || modeChoice != 2 || modeChoice != 3 ) {
                System.out.println("\nНеверный ввод");

            }


        }
    }



    private static int mode(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
