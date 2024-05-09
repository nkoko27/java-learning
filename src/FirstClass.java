import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {
        minMax();
        double x = (double) 11 / 3;
        System.out.println(Math.round((double) 11 / 3));

    }
        public static void switchTest(int value){
            switch (value) {
                case 1 -> System.out.println("Value was 1");
                case 2 -> System.out.println("Value was 2");
                case 3, 4, 5 -> {
                    System.out.println("Was a 3, a 4, ora 5");
                    System.out.println("Actually it was a " + value);
                }
                default -> System.out.println("Value was not 1 or 2");
            }
        }

        public static String gteQuarter(String month){
            return switch (month) {
                case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
                case "APRIL", "MAY", "JUNE" -> "2nd";
                case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
                case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
                default -> {
                    System.out.println("bad");
                yield "bad";
                }
            };
        }
        public static void getWord(char letter){
            switch (letter){
                case 'A':
                    System.out.println("Able");
                    break;
                case 'B':
                    System.out.println("Baker");
                    break;
                case 'C':
                    System.out.println("Charlie");
                    break;
                case 'D':
                    System.out.println("Dog");
                    break;
                case 'E':
                    System.out.println("Easy");
                    break;
                default:
                    System.out.println("Not a, b, c, d, or e");
            }
        }

        public static void printDayOfWeek(int day){
            switch (day){
                case 0 -> System.out.println("Sunday");
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                default -> System.out.println("Invalid Day");
            }
        }

        public static double calcInterest(double amount, double interestRate){
            return (amount * (interestRate/100));
        }
        public static void forLoopPractice(){
            for (double rate = 7.5; rate <= 10.0; rate += .25){
                System.out.println(calcInterest(100.0, rate));
            }
        }
        public static boolean isPrime(int number){
        if (number <= 2){
            return (number == 2);
        }
            for (int i = 2; i <= number/2; i++){
                if (number % i == 0){
                    return false;
                }
            }
            return true;
        }
        public static void primeCounter(int lower, int upper){
        if (upper >1000) {
            System.out.println("toomuch");
            return;
        }
            int count = 0;
            for (int i = lower; i <= upper; i++) {
                if (isPrime(i)){
                    count++;
                    System.out.println(i);
                }
                if (count == 3){
                    break;
                }
            }
        }
        public static void sum3And5(){
        int count = 0;
        int sum = 0;
            for (int i = 1; i <= 1000; i++){
                if (i % 15 == 0){
                    System.out.println(i);
                    count++;
                    sum += i;
                }
                if (count == 5){
                    break;
                }
            }
            System.out.println(sum);
        }

        public static boolean isEven(int number){
            return number % 2 == 0 ? true : false;
        }

        public static void isEvenWhile(int start, int end){
            int j = start;
            int count = 0;
            while(j <= end){
                j++;
                if (!isEven(j)) {
                    continue;
                }
                System.out.println(j);
                count++;
                if (count == 5){
                    System.out.println(count);
                    break;
                }
            }
        }
        public static int sumDigits(int number){
            if (number < 0){
                return -1;
            }
            int sum = 0;
            while (number > 9){
                sum += number % 10;
                number = number / 10;
            }
            sum += number;
            System.out.println(sum);
            return sum;
        }

        public static String getInputFromConsole(int currentYear){
            String name = System.console().readLine("Hi, What's your name?");
            System.out.println("Hi "+ name + " thanks for taking the class!");
            String dateOfBirth = System.console().readLine("What year were you born? ");
            int age = currentYear - Integer.parseInt((dateOfBirth));

        return "So you are " + age + " years old";
        }
        public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);

            System.out.println("Hi, What's your name?");
            String name = scanner.nextLine();
            System.out.println("Hi "+ name + " thanks for taking the class!");
            System.out.println("What year were you born? ");

            boolean validDOB= false;
            int age = 0;
            do {
                System.out.println("Enter a year of birth >= " + (currentYear -125) + " and <= " + (currentYear));
                try {
                    age = checkData(currentYear, scanner.nextLine());
                    validDOB = age < 0 ? false : true;
                } catch (NumberFormatException badUserData) {
                    System.out.println("Characters not allowed! Try again");
                }
            } while (!validDOB);
            return "So you are " + age + " years old";
        }

        public static int checkData(int currentYear, String dateOfBirth){
            int dob = Integer.parseInt((dateOfBirth));
            int minimumYear = currentYear -125;

            if ((dob < minimumYear) || (dob > currentYear)){
                return -1;
            }
            return currentYear-dob;
        }

        public static void inputChallenge(){
            int count = 1;
            int sum = 0;
            Scanner scanner = new Scanner(System.in);
            do {
                try {
                    System.out.println("Enter number " + count);
                    int num = Integer.parseInt(scanner.nextLine());
                    sum += num;
                    count++;
                } catch (NumberFormatException badUserData) {
                    System.out.println("Please type a number");
                }
            } while (count <= 5);
            System.out.println(sum);
        }

        public static void minMax(){
        Scanner scanner = new Scanner(System.in);
            int min = 0;
            int max = 0;
            int turns = 0;
            while (true) {
                try {
                    System.out.println("Enter a number: ");
                    int number = Integer.parseInt(scanner.nextLine());
                    if (turns == 0) {
                        min = number;
                        max = number;
                    }
                    if (number < min) {
                        min = number;
                    }
                    if (number > max) {
                        max = number;
                    }
                    turns++;
                } catch (NumberFormatException nfe) {
                    break;
                }
            }
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        }
    }
