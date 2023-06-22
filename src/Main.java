public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");

        /*
        Бухгалтеры попросили посчитать сумму всех выплат за месяц.

        Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
        «Сумма трат за месяц составила … рублей».
         */

        int[] arr = generateRandomArray();
        int sum1 = 0, sum2 = 0;

        // for
        for (int i = 0; i < arr.length; i++){
            sum1 += arr[i];
        }
        System.out.println("Сумма трат за месяц составила: " + sum1 + " рублей");

        // for-each
        for(int i : arr){
                sum2 += i;
        }
        System.out.println("Сумма трат за месяц составила: " + sum2 + " рублей\n");

    }


    public static void task2() {
        System.out.println("Задача 2");

        /*
        Также бухгалтерия попросила найти минимальную и максимальную трату за день.

        Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
        «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
         */

        int[] arr = generateRandomArray();
        int maxElement = Integer.MIN_VALUE;         // Константа - минимальное возможное значение int
        int minElement = Integer.MAX_VALUE;         // Константа - максимальное возможное значение int

        System.out.println("Ежемесячные траты: ");
        for (int i = 0; i < arr.length; i++){
            if (i != 0){
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("\n");

        // for
        for (int i = 0; i < arr.length; i++){
            final int current = arr[i];
            if (current > maxElement){				// Ищем максимальный элемент
                maxElement = current;
            } else if (current < minElement){		// Ищем минимальный элемент
                minElement = current;
            }
        }
        System.out.println("Максимальная сумма трат за месяц: " + maxElement + " рублей");
        System.out.println("Минимальная сумма трат за месяц: " + minElement + " рублей\n");

        //for-each
        maxElement = Integer.MIN_VALUE;             // Обнуляем переменные для запуска след.способа
        minElement = Integer.MAX_VALUE;

        for (int current : arr) {                   // Ищем максимальный элемент
            if (current > maxElement) {
                maxElement = current;
            } else if (current < minElement){
                minElement = current;
            }
        }
        System.out.println("Максимальная сумма трат за месяц: " + maxElement + " рублей");
        System.out.println("Минимальная сумма трат за месяц: " + minElement + " рублей\n");
    }

    public static void task3() {
        System.out.println("Задача 3");

        /*
        Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.

        Напишите программу, которая посчитает среднее значение трат за месяц
        (то есть сумму всех трат за месяц поделить на количество дней), и выведите в консоль результат в формате:
        «Средняя сумма трат за месяц составила … рублей».

        Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.
         */

        int[] arr = generateRandomArray();
        double sum = 0, average;

        //for
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        average = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + String.format("%.2f", average) + " рублей");

        // for-each
        sum = 0;
        for (int i : arr){
            sum += i;
        }
        average = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + String.format("%.2f", average) + " рублей\n");

    }

    public static void task4() {
        System.out.println("Задача 4");

        /*
        В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена сотрудников начали отображаться в обратную сторону.
        Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников хранятся в виде массива символов — char[ ].

        Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде.
        В качестве данных для массива используйте:

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        В результате в консоль должно быть выведено: Ivanov Ivan.

        Важно: не используйте дополнительные массивы для решения этой задачи.
        Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.
         */

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}