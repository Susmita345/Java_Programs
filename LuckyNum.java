import java.util.Scanner;
class LuckyNum{
    public static void main(String args[]){
        Scanner ip=new Scanner(System.in);

        System.out.print("Enter num1:");
        int A=ip.nextInt();

        System.out.print("Enter num2:");
        int B=ip.nextInt();

        System.out.print("Enter num3:");
        int C=ip.nextInt();

        System.out.print("Enter num4:");
        int D=ip.nextInt();
        
        if (A+B==C+D){
            System.out.println("Number is Lucky :)");
        }else{
            System.out.println("Number is not Lucky :(");
            
        }
        //scanner.close();
    }
}