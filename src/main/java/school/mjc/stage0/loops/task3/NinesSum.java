package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        String num = "";
        for(int i = 1; i <= lengthOfLastNumber; i++)
        {
            num += "9";
            sum += Integer.parseInt(num);
        }
        System.out.println(sum);
    }
}
