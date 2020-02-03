
public class Callby{
    public static void main(String[] args) {
        int PrimitiveValue = 100;
        int intArray[] = new int[10];
        byvalue(PrimitiveValue);
        System.out.println("the value of primitivevalue after execution : "+PrimitiveValue);

        byrefernce(intArray);
        System.out.println("the value of array element after execution : "+intArray[0]);

    }
    public static void byvalue(int value)
    {
        ++value;
                                        
   }
    public static void byrefernce(int[] array){
        System.out.println("within the byrefernce method the value of array is : "+array[0]);
        array[0]=15;
        System.out.println("within the byrefernce method after setting the value of array is : "+array[0]);

    }
}