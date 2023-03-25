package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    
    public static void main(String[] arg){
        GreatestCommonDivisor r = new GreatestCommonDivisor();
        r.printGCD(30, 30);
    }
    
    public void printGCD(int first, int second) {
        //int range = first > second ? first : second;
        int gCD = 1;
        for(int i = 2; i <= (first > second ? first : second); i++){
            if (((double)first)%i == 0 && ((double)second)%i == 0){gCD = i;}
        }    
        System.out.println(gCD);
    }
}
