package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String digits = String.valueOf(t);
        int sumOfDigits = 0;
        for (char c : digits.toCharArray())
        {
            if(Character.isDigit(c))
                sumOfDigits += c - '0';
        }
        System.out.println(sumOfDigits);
    }
}
