import java.util.Scanner;

class ar{
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int i,size;
        System.out.println("enter the size of the array :");
        size=sc.nextInt();
        int ar[]= new int[size];
       
        for( i=0;i<=size;i++){
            System.out.println("enter the "+i+"value");
            ar[i]= sc.nextInt();
        }
        System.out.println(ar);
    }
}