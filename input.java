import java.util.Scanner;
class Faith{
    public static void main(String[]args){
        int score;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Score");
        score=input.nextInt();
        if(score>=80){
            System.out.println("First class upper Division");
        }else if(score<=79 && score>=70){
            System.out.println("First class Lower Division");
        }else if(score<=69 && score>=60){
            System.out.println("Second Class Upper Division");
        }else if(score<=59 && score>=50){
            System.out.println("Second class lower Division");
        }else if(score<=49 && score>=40){
            System.out.println("Pass");
        }else{
            System.out.println("Fail!!!!!!!!!!!");
        }
    }
}