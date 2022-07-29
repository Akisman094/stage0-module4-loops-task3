package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci)
    {
        if(lastFibonacci >= 2)
        {
            System.out.println("0\n1");
        }
        else if(lastFibonacci == 1)
        {
            System.out.println("0");
            return;
        }

        int first = 0, second = 1, third;

        for(int i = 3; i <= lastFibonacci; i++)
        {
            third = second + first;
            first = second;
            second = third;
            System.out.println(third);
        }
    }
}
