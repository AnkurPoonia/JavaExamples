public class Programming{
    public static void main(String[] args) {
        for (int index = 0; index < args.length; index++) {
            System.out.println(args[index]);
        }
        if(args.length>0){
            System.out.println(args.length);
        }
        else{
            System.out.print("0");
        }
        int value = args.length;
        while(value>0)
        {
            System.out.println(args[value-1]);
            value--;
            
        }
    }
}