package bai_9_Generic_Queue_Stack.bai_tap;

public class BracketTest {
    public static void main(String[] args) {
        Bracket bracket = new Bracket();
        boolean result = bracket.test("(– b + (b^2 – 4*a*c)^(0.5/ 2*a)))");

        if (result){
            System.out.println("Bracket");
        }else {
            System.out.println("Not Bracket");
        }
    }
}
