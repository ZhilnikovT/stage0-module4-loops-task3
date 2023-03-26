package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int nextF = 0, first = 0, second = 1;
        System.out.println(first);
        System.out.println(second);
        for(int i = 2; i < lastFibonacci; i++){
            int third = first + second;
            System.out.println(third);
            first = second;
            second = third;
        }
    }
}
