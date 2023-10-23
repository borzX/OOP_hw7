import java.util.Scanner;

public class ComplexCalculator{
    public static void complexRun(){
        Scanner input = new Scanner(System.in);
        ComplexNumber complex1;
        ComplexNumber complex2;
        ComplexNumber complex3;
        float a;
        float b;
        int choice = 0;
        //Main menu
        System.out.println("\n***Калькулятор комплексных чисел***");
        while(choice != 5){
            System.out.println("\nВведите команду\n");
            System.out.println("1: Сложение");
            System.out.println("2: Вычитание");
            System.out.println("3: Умножение");
            System.out.println("4: Деление");
            System.out.println("5: Выход\n");
            choice = input.nextInt();
            //Сложение
            if(choice == 1){
                System.out.println("\n i = (-1)^1/2,\n");
                System.out.println("(a + bi) + (c + di)\n");
                System.out.println("Введите a:");
                a = input.nextFloat();
                System.out.println("Введите b:");
                b = input.nextFloat();
                complex1 = new ComplexNumber(a, b);
                System.out.println("Введите c:");
                a = input.nextFloat();
                System.out.println("Введите d:");
                b = input.nextFloat();
                complex2 = new ComplexNumber(a, b);
                complex3 = complex1.add(complex2);
                System.out.println("Результат: " + complex3.toString());
            }
            //Вычетание
            if(choice == 2){
                System.out.println("\n i = (-1)^1/2,\n");
                System.out.println("(a + bi) - (c + di)\n");
                System.out.println("Введите a:");
                a = input.nextFloat();
                System.out.println("Введите b:");
                b = input.nextFloat();
                complex1 = new ComplexNumber(a, b);
                System.out.println("Введите c:");
                a = input.nextFloat();
                System.out.println("Введите d:");
                b = input.nextFloat();
                complex2 = new ComplexNumber(a, b);
                complex3 = complex1.subtract(complex2);
                System.out.println("Результат: " + complex3.toString());
            }
            //Умножение
            if(choice == 3){
                System.out.println("\n i = (-1)^1/2,\n");
                System.out.println("(a + bi)(c + di)\n");
                System.out.println("Введите a:");
                a = input.nextFloat();
                System.out.println("Введите b:");
                b = input.nextFloat();
                complex1 = new ComplexNumber(a, b);
                System.out.println("Введите c:");
                a = input.nextFloat();
                System.out.println("Введите d:");
                b = input.nextFloat();
                complex2 = new ComplexNumber(a, b);
                complex3 = complex1.multiply(complex2);
                System.out.println("Результат: " + complex3.toString());
            }
            //Деление
            if(choice == 4){
                System.out.println("\n i = (-1)^1/2,\n");
                System.out.println("(a + bi)/(c + di)\n");
                System.out.println("Введите a:");
                a = input.nextFloat();
                System.out.println("Введите b:");
                b = input.nextFloat();
                complex1 = new ComplexNumber(a, b);
                System.out.println("Введите c:");
                a = input.nextFloat();
                System.out.println("Введите d:");
                b = input.nextFloat();
                complex2 = new ComplexNumber(a, b);
                complex3 = complex1.divide(complex2);
                System.out.println("Результат: " + complex3.toString());
            }
        }
        System.out.println("\nРабота завершена\n");
    }
}
