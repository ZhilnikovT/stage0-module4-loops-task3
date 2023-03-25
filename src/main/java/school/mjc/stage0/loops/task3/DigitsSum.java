package school.mjc.stage0.loops.task3;

public class DigitsSum {
    
    public static void main(String[] arg){
        DigitsSum r = new DigitsSum();
        r.printDigitsSum(300);
    }
    
    public void printDigitsSum(int t){
        if (t < 0){t = -t;}
        int sum = 0;
        String s = Integer.toString(t);
        int d = 10;
        for(int i = s.length() - 1; i > 0; i--){
            
            int n = t - d*(int)(t / d);
            sum = sum + n;
            t = t / 10;
        }
        System.out.println(sum + t);
    }
}
