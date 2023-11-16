import java.util.Scanner;
class ArmstrongNum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num:");
        int num=sc.nextInt();
        int temp=num;
        int pow=0;
        while(num>0){
            int rem=num%10;
            pow=pow+(rem*rem*rem);
            num/=10;
        }  
    if (temp==pow){
        System.out.print("Armstrong");
    }else{
        System.out.println("Not a Armstrong number");
    }  }
}