public class Main {

    public static void main(String[] args) {

        printThreeWords();
        printColor();
        compareNumbers();
    }
        public static void printThreeWords() {

            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }
        public static void checkSumSign() {
        int a = 3;
        int b = -3;
        int c = a + b;

            if (c >= 0) {
                System.out.println("Сумма положительна");
            }
            if (c < 0) {
                System.out.println("Сумма отрицательная");
            }
            if (c <= 3) {
                System.out.println("Вы решили меньше половины, но Вы все равно молодец, надо же с чего-то начинать!!");
            }

            System.out.println("Проверка завершена");
        }
         public static void printColor() {

        int value = 3;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0){
            System.out.println("Желтый");
        }
         else if (value < 100){
            System.out.println("Желтый");
        }
         if (value > 100){
             System.out.println("Зеленый");
         }

}
    public static void compareNumbers() {
        int a = 2;
        int b = 3;
        if (a >= b) {
            System.out.println("a >= b");
        }
        if (a <= b) {
            System.out.println("a <= b");
        }
    }
}
