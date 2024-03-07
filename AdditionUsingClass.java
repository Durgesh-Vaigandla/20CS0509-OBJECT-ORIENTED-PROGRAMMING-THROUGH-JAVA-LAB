public class AdditionUsingClass {
    //class
    static class Add {
       void sum(int a,int b) {
            System.out.println("Sum is: " + (a + b));
        }
    }
    //main method
    public static void main(String[] args) {
        Add obj = new Add();
        obj.sum(20, 30);
    }
}