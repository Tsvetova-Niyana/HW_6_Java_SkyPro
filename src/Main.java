public class Main {
    public static void main(String[] args) {

        task_1();
        task_2();
        task_3();
        task_4();
        task_5();
        task_6();
        task_7();
        task_8();
        task_9();
        task_10();
    }

    public static void task_1(){
        /*
        С помощью цикла for выведите в консоль все числа от 1 до 10.
         */

        System.out.println("Задание 1");

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }

    public static void task_2(){
        /*
        С помощью цикла for выведите в консоль все числа от 10 до 1.
         */

        System.out.println("\nЗадание 2");

        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }
    }

    public static void task_3(){
        /*
        Выведите в консоль все четные числа от 0 до 17.
         */

        System.out.println("\nЗадание 3");

        for (int i = 2; i <= 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task_4(){
        /*
        Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
         */

        System.out.println("\nЗадание 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task_5(){
        /*
        Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
        В консоль результат должен выводиться в формате: «… год является високосным».
         */

        System.out.println("\nЗадание 5");

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task_6(){
        /*
        Напишите программу, которая выводит в консоль последовательность чисел:

        7 14 21 28 35 42 49 56 63 70 77 84 91 98
         */

        System.out.println("\nЗадание 6");

        for (int i = 7; i < 100; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task_7(){
        /*
        Напишите программу, которая выводит в консоль последовательность чисел:

        1 2 4 8 16 32 64 128 256 512
         */

        System.out.println("\nЗадание 7");

        for (int i = 1; i < 600; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void task_8(){
        /*
        Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать
        по 29 000 рублей «в банку».

        Выведите сумму накоплений за каждый месяц в консоль в формате:
        «Месяц …, сумма накоплений равна … рублей».
         */

        System.out.println("\nЗадание 8");

        int money = 29000;
        int totalMoney = 0;

        for (int i = 1; i <= 12; i++) {
            totalMoney = totalMoney + money;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalMoney + " рублей");
        }
    }

    public static void task_9(){
        /*
        Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку», а в банк
        под проценты — 12% годовых. Выведите сумму накоплений за каждый месяц в консоль в формате:
        «Месяц …, сумма накоплений равна … рублей».
         */

        System.out.println("\nЗадание 9");

        int money = 29000;
        int totalMoney = 0;

        for (int i = 1; i <= 12; i++) {
            totalMoney = totalMoney + totalMoney / 100;
            totalMoney = totalMoney + money;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalMoney + " рублей");
        }
    }

    public static void task_10(){
        /*
        Напишите программу, которая выводит в консоль таблицу умножения на 2:

        2*1=2
        2*2=4
        2*3=6
        2*4=8
        2*5=10
        2*6=12
        2*7=14
        2*8=16
        2*9=18
        2*10=20
         */

        System.out.println("\nЗадание 10");

        int num = 2;
        int result = 1;

        for (int i = 1; i <= 10; i++) {
            result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }
    }
}