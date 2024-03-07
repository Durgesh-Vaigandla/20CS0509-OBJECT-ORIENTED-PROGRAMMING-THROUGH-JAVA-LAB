public class InfiniteWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (true) {
            System.out.println(i);
            i++;
            if (i > 100) {
                break;
            }
        }
    }
}   