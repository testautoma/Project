import java.util.Scanner;

public class Hello {

    public static void main (String [] args) {
        selectTask();
    }

    static void selectTask() {
        System.out.println("Выберите задание: 1, 2 или 3");
        switch (scanInt()) {
            case 1:
                hello();
                break;
            case 2:
                helloName();
                break;
            case 3:
                multiplicity();
                break;
            default:
                System.out.println("Задание под таким номером отсутствует");
                break;
        }
        selectTask();
    }

//    1 Если введенное число больше 7, вывести "Привет"
    static void hello() {
        System.out.print("Введите любое целое число: ");
        //int a = scanner.nextInt();
        if (scanInt() > 7){
            System.out.println("Привет");
        }
    }

//    2 Если введенное имя совпадает с "Вячеслав", то вывести "Привет, Вячеслав", если нет, то вывести "Нет такого имени"
    static void helloName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        }
            else {
            System.out.println("Нет такого имени");
        }
    }

//    3 На входе есть числовой массив, необходимо вывести элементы массива кратные 3
    static void multiplicity() {
        System.out.print("Введите количество элементов массива: ");
        int arraySize = scanInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите " + i + " элемент массива (целое): ");
            array[i] = scanInt();
        }
        System.out.print("Элементы массива кратные 3: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    static int scanInt() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        try {
            return Integer.parseInt(line);
        } catch (Exception exception) {
            System.out.println("Пожалуйста введите целое значение в интервале [-2147483648, 2147483647]:");
            return scanInt();
        }
    }
}
