public class Main {
    public static void main(String[] args) {

        int[] randomNumbers = new int[20];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) ((Math.random() * 100) + 1);
        }
        System.out.println("hello world!");
    }
}