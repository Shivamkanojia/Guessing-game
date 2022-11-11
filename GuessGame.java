import java.util.Scanner;

public class GuessGame{
    public static void GG()
    {
        int CompNum = (int)(Math.random()*10+1);
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Welcome to the Game"+"\n"+
        "Guess A number between 1 to 10");
        int Num=sc.nextInt();
        int Count=1;
        while(Num!= CompNum)
        {
            Count++;
            if(Num>CompNum)
            {
                System.out.println("your guess is higher");
            }
            else 
            {
                System.out.println("your guess is lower");
            }
            System.out.println("Guess another Number");
            Num=sc.nextInt();

        }
        

        if(Count==1)
        {
            System.out.println("~~Congratulations~~"+"\n"+
            "Your Guess is correct in First Attempt"+
            "You won 100$");
        }
        else if (Count==2)
        {
            System.out.println("Good Job u got it correct in second attempt"+"\n"+
            "You Won 50$");
        }
        else if(Count ==3)
        {
            System.out.println("Haash Finally in 3rd attempt"+"\n"+
            "You won 25$");
        }else{
            System.out.println("You lose your attempts are over");
        }
    }
    
    }
}