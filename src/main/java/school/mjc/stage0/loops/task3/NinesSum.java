package school.mjc.stage0.loops.task3;

public class NinesSum {
    
    public static void main(String[] arg){
        NinesSum r = new NinesSum();
        r.calculateSum(3);
    }
    
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int nines = 1;
        int centry = 1;
        for(int i = 1; i <= lengthOfLastNumber; i++){
            sum += 9*nines;
            centry *= 10; 
            nines += centry;
            //System.out.println(nines);
        }
        System.out.println(sum);
    }
}
