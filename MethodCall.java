public class MethodCall {
    public static void main(String[] args) {
        System.out.println("Called before 1");
        method1();
        System.out.println("called after 1");
    }
    public static void method1()
    {
        System.out.println("called before 2 from 1");
        method2();
        System.out.println("called after 2 from 1");
    }    
    public static void method2()
    {
        System.out.println("Executing 2 from 1");
    }

}