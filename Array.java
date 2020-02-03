public class Array{
    static int rowc=4;
    static int value=3;
    static int colc=4;
    public static void main(String[] args)
     {
      
        int newarray[][] = new int[rowc][colc];

        initialize(newarray);
        display(newarray);

     }
           /*
        for (int i = 0; i <rowc; i++) {
            for (int j = 0; j < colc; j++) {
                newarray[i][j] = value++;
                
            }
        }
        for (int i = 0; i < rowc; i++) {
            for (int j = 0; j < colc; j++) {
                System.out.print("\t" + newarray[i][j]);
                
            }
            System.out.println();

        } */
        private static void initialize( int [][] newarray)
         {
            for (int i = 0; i <rowc; i++) {
                for (int j = 0; j < colc; j++) {
                    newarray[i][j] = value++;
                    
                }
            }

            
        }
        private static void display(int [][] newarray)
         {
            for (int i = 0; i < rowc; i++) {
                for (int j = 0; j < colc; j++) {
                    System.out.print("\t" + newarray[i][j]);
                    
                }
                System.out.println();
    
            }

            
        }
}