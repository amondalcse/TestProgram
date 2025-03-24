public class FlowProgram {
    public static void main(String[] args) {
        //simpleHelloProgram("Abhijit");
        //bonus(9000);
        prime(15);
    }


    public static void simpleHelloProgram(String name) {
        System.out.print("Hello" +" "+ name);
    }

    public static void bonus(int salary){
        int a =1000;
        int b=2000;
        if(salary>=10000){
            salary = salary+ b;
            System.out.println("Bonus should get the"+" "+salary);
        }else {
            salary = salary+a;
            System.out.println("Bonus should get the"+" " +salary);
        }
    }

    public static void prime(int no){
        int c=2;
        while(no<c){
            if(no%c==0){
                System.out.println("Not a prime");
            c =c+1;
            }
            System.out.println("prime no");

        }


           }

}
