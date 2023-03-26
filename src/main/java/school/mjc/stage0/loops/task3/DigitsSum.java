package school.mjc.stage0.loops.task3;

public class DigitsSum {
  
    public void printDigitsSum(int t){
        if (t < 0){t = -t;}
        int sum = 0;
        while(t > 0){
            int n = t - 10*(int)(t / 10);
            sum = sum + n;
            t = t / 10;
        }
        System.out.println(sum);
    }
}
