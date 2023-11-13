class LeapYear{
    public static void main(String args[]){
        int year=2023;
        boolean Ifyear=(year%4==0);
        if (Ifyear){
            System.out.println("It is a leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}