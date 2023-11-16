import java.util.Scanner;
class PrimeNum{
    public static void main (String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number:");
       int num=sc.nextInt();
       boolean isPrime=true;
       for (int i=2;i<num;i++){
        if(num%i==0){
            isPrime=false;
            break;
        }
       }
       if(isPrime){
        System.out.println("Is a Prime number");
       }else{
        System.out.println("Not a Prime number");
       }
       

    }
}