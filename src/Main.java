public class Main {
    public static void main(String[] args) {
        //Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096. В консоль результат должен выводиться в формате: «… год является високосным».
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("Следушее задание:");

        /*Напишите программу, которая выводит в консоль последовательность чисел:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98*/
        for (int i = 7; i < 99; i += 7) {
            System.out.println(i);
        }
        System.out.println("Следушее задание:");

        /*Напишите программу, которая выводит в консоль последовательность чисел:
        1 2 4 8 16 32 64 128 256 512*/
        for (int i = 1; i < 513; i += i) {
            System.out.println(i);



        }
    }
}
