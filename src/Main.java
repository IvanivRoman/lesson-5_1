public class Main {


    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;

        for (int i = 2; i < Math.floor(Math.sqrt(number) + 1); i++) {
            if (isPrime(i)) {
                if (number % i == 0)
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }
}
