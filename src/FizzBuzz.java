public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + ": Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + ": Buzz");
            }
        }
    
        for (int i = 0; i < 1000; i++) {
            String result = "";
            if (i % 3 == 0) {
                result += "Fizz";
            }
            if (i % 5 == 0) {
                result += "Buzz";
            }
            System.out.println(i + ": " + result);
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
