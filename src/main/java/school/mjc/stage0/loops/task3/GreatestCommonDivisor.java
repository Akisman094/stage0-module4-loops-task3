package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = 1;
        for(int i = second / 2; i >=2; i--)
        {
            if(second % i == 0 && first % i == 0)
            {
                gcd *= i;
                second /= i;
                first /= i;
            }
        }
        System.out.println(gcd);
    }
}
