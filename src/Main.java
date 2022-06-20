public class Main {
    public static void main(String[] args) {
//        Напишите пример перехвата и обработки исключения в блоке try-catch-метода.

        int[] number = {1, 2, 3, 4};

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(number[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e + " Выход за пределы массива!");
            throw e;
        }
    }
}