package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    
    public static void main(String[] arg){
        AlphabetPrinter r = new AlphabetPrinter();
        r.printAlphabet();
    }
    
    public void printAlphabet() {
        for(int i = 97; i <= 122; i++){
            char c = (char) i;
            System.out.println(c);
        }
    }
}
