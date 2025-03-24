public class TestNum {
    static int num = 1;
    static {
        num = 2;
    }
    public static void main(String[] args){
        System.out.println(num);
    }
}
