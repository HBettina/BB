public class Main {
    public static void main(String[] args) {

        int[] randomNumbers = new int[20];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) ((Math.random() * 100) + 1);
        }
        System.out.println(getMinimum(randomNumbers));
        System.out.println("hello world!");
        System.out.println("new git version");
    }
    public static int getMinimum(int[] randomnumbers){
        int minNumber = randomnumbers[0];
        for (Integer number: randomnumbers) {
            if(number < minNumber) {
                minNumber = number;
            }
        }
        return minNumber;
    }
}