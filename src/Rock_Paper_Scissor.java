import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER: 0 for ROCK , 1 for PAPER , 2 for SCISSOR");
        int usersChoice = sc.nextInt();

        Random rn = new Random();
        int computersChoice = rn.nextInt(3);

        if(usersChoice==computersChoice){
            System.out.println("Draw");
        }else if(usersChoice==0&&computersChoice==2||usersChoice==1&&computersChoice==0||usersChoice==2&&computersChoice==1){
            System.out.println("you win! ;^)");
        }else{
            System.out.println("computer win! :(");
        }
        System.out.println("computers choice is " +computersChoice);
    }
}
