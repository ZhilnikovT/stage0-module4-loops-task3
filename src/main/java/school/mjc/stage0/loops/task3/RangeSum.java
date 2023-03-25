package school.mjc.stage0.loops.task3;

public class RangeSum {
    
    public static void main(String[] arg){
        RangeSum r = new RangeSum();
        r.printSumInclusive(0, 110);
    }
    
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        long sum = 0;
        for(int i = firstBoarder; i <= secondBoarder; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
