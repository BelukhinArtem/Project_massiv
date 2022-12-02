public class Main {
    public static void main(String[] args) {
        int[] array = {53, 78, 13, 9, 5, 17, 28, 719, 214};
        for (int i = 0; i < array.length; i++) {
//          array[i] = (i+1)*2;
//             System.out.println("Чётные значения = " + array[i]);

            if (array[i] % 2 == 0) {
                System.out.println("Number: " + array[i]);
                System.out.println("Number: " + array[i] + " 1");
            }
        }
    }
}