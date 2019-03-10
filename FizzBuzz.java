package refactoringVariable;

public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZBUZZ = "FizzBuzz";

    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        boolean isFizzBuzz = number % 3 == 0 && number % 5 ==0;

        if (isFizzBuzz)
        {
            return FIZZBUZZ;
        }
        if (isFizz)
        {
            return FIZZ;
        }
        if (isBuzz)
        {
            return BUZZ;
        }
        return number+ "";
    }
}
