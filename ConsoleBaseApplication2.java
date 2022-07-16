import java.util.Scanner;

public class ConsoleBaseApplication2 {
    public static void main(String[] args) {
        System.out.println("This is a Tic-Tac-Toe Game For Two Players :-\n");
        System.out.println("_|_|_\n_|_|_\n | |\n");
        System.out.println("Instructions :-");
       
        System.out.println("1) To put x or O on a Particular Position we need a Position Number so Position Number is given on the Tic-Tac-Toe chart Screen.");
        System.out.println("2) After Selecting the Position we Have to choose x or O ");
        System.out.println("3) Wait until the Reason is not Finalize.\n");
        System.out.println("Okk Let's Start the Game\n");
        String a,b;
        int syb1;
        String sb1="",sb2="";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Name of Player 1 :");
        a=sc.nextLine();
        System.out.print("\nEnter the Name of Player 2 :");
        b=sc.nextLine();
        System.out.println("\n\n Choose the Symbol You Want :-");
        System.out.println("\nPress :\n1) O\n2) x\n");
        System.out.print(a+" Press the Key To Achive the Symbol (Anyone) :");
        syb1=sc.nextInt();
        if(syb1==1)
        {
            System.out.println("\n"+a+": O");
            System.out.println(b+": x ");
            sb1="O";
            sb2="x";
        }
        if(syb1==2)
        {     
            System.out.println("\n"+a+": x");
            System.out.println(b+": O");
            sb1="x";
            sb2="O";
        }
        System.out.println("\nInstructions:-\n->This is the index below user wants to select where to Place Symbol.\n");
        System.out.println("0|1|2\n_|_|_\n3|4|5\n_|_|_\n6|7|8");
        String arr[]=new String[9];
        for(int k=0;k<9;k++)
        {
            arr[k]=" ";
        }
        System.out.println("Note :-\n1) You have to Enter the Index to print your Symbol in a Specific Box.\n2)Index Range Between 0 to 8 \n\n");
        int count=0;
        for(int i=0;i<9;i++)
        {
           if(i%2==0)
           {
            System.out.print("\n"+a+" Enter the Index So That You Can Print Your Symbol: ");
            int c=sc.nextInt();
            if(sb1=="O")
            {
                arr[c]="O";
                System.out.println("\n"+arr[0]+"|"+arr[1]+"|"+arr[2]+"\n_|_|_\n"+arr[3]+"|"+arr[4]+"|"+arr[5]+"\n_|_|_\n"+arr[6]+"|"+arr[7]+"|"+arr[8]);
            }
            if(sb1=="x")
            {
                arr[c]="x";
                System.out.println("\n"+arr[0]+"|"+arr[1]+"|"+arr[2]+"\n_|_|_\n"+arr[3]+"|"+arr[4]+"|"+arr[5]+"\n_|_|_\n"+arr[6]+"|"+arr[7]+"|"+arr[8]);
            }
           }
           if(i%2==1)
           {
            System.out.print("\n"+b+" Enter the Index So That You Can Print Your Symbol: ");
            int c=sc.nextInt();
            if(sb2=="O")
            {
                arr[c]="O";
                System.out.println("\n"+arr[0]+"|"+arr[1]+"|"+arr[2]+"\n_|_|_\n"+arr[3]+"|"+arr[4]+"|"+arr[5]+"\n_|_|_\n"+arr[6]+"|"+arr[7]+"|"+arr[8]);
            }
            if(sb2=="x")
            {
                arr[c]="x";
                System.out.println("\n"+arr[0]+"|"+arr[1]+"|"+arr[2]+"\n_|_|_\n"+arr[3]+"|"+arr[4]+"|"+arr[5]+"\n_|_|_\n"+arr[6]+"|"+arr[7]+"|"+arr[8]);
            }
           }
           if(sb1=="O")
           {
               if(arr[0]=="O" && arr[1]=="O" && arr[2]=="O" ||arr[0]=="O" && arr[3]=="O" && arr[6]=="O" ||arr[0]=="O" && arr[4]=="O" && arr[8]=="O" ||arr[1]=="O" && arr[2]=="O" && arr[0]=="O" ||arr[1]=="O" && arr[4]=="O" && arr[7]=="O" ||arr[2]=="O" && arr[1]=="O" && arr[0]=="O" ||arr[2]=="O" && arr[4]=="O" && arr[6]=="O" ||arr[2]=="O" && arr[5]=="O" && arr[8]=="O" ||arr[3]=="O" && arr[0]=="O" && arr[6]=="O" ||arr[3]=="O" && arr[4]=="O" && arr[5]=="O" ||arr[4]=="O" && arr[1]=="O" && arr[7]=="O" ||arr[4]=="O" && arr[3]=="O" && arr[5]=="O" ||arr[4]=="O" && arr[0]=="O" && arr[8]=="O"||arr[4]=="O" && arr[2]=="O" && arr[6]=="O"||arr[5]=="O" && arr[3]=="O" && arr[4]=="O"||arr[5]=="O" && arr[2]=="O" && arr[8]=="O"||arr[6]=="O" && arr[3]=="O" && arr[0]=="O"||arr[6]=="O" && arr[4]=="O" && arr[2]=="O"||arr[6]=="O" && arr[7]=="O" && arr[8]=="O"||arr[7]=="O" && arr[4]=="O" && arr[1]=="O"||arr[7]=="O" && arr[6]=="O" && arr[8]=="O"||arr[8]=="O" && arr[5]=="O" && arr[2]=="O"||arr[8]=="O" && arr[4]=="O" && arr[0]=="O"||arr[8]=="O" && arr[6]=="O" && arr[7]=="O")
               {
                   count=count+1;
                   System.out.println("\n"+"*****************************");
                   System.out.println("\t\tRESULT");
                   System.out.println("********************************");
                    System.out.println(a+" You Won a Game Hurray :)");
                    System.out.print("================================");
                   break;
               }
           }
          if(sb1=="x")
           {
               if(arr[0]=="x" && arr[1]=="x" && arr[2]=="x" ||arr[0]=="x" && arr[3]=="x" && arr[6]=="x" ||arr[0]=="x" && arr[4]=="x" && arr[8]=="x" ||arr[1]=="x" && arr[2]=="x" && arr[0]=="x" ||arr[1]=="x" && arr[4]=="x" && arr[7]=="x" ||arr[2]=="x" && arr[1]=="x" && arr[0]=="x" ||arr[2]=="x" && arr[4]=="x" && arr[6]=="x" ||arr[2]=="x" && arr[5]=="x" && arr[8]=="x" ||arr[3]=="x" && arr[0]=="x" && arr[6]=="x" ||arr[3]=="x" && arr[4]=="x" && arr[5]=="x" ||arr[4]=="x" && arr[1]=="x" && arr[7]=="x" ||arr[4]=="x" && arr[3]=="x" && arr[5]=="x" ||arr[4]=="x" && arr[0]=="x" && arr[8]=="x"||arr[4]=="x" && arr[2]=="x" && arr[6]=="x"||arr[5]=="x" && arr[3]=="x" && arr[4]=="x"||arr[5]=="x" && arr[2]=="x" && arr[8]=="x"||arr[6]=="x" && arr[3]=="x" && arr[0]=="x"||arr[6]=="x" && arr[4]=="x" && arr[2]=="x"||arr[6]=="x" && arr[7]=="x" && arr[8]=="x"||arr[7]=="x" && arr[4]=="x" && arr[1]=="x"||arr[7]=="x" && arr[6]=="x" && arr[8]=="x"||arr[8]=="x" && arr[5]=="x" && arr[2]=="x"||arr[8]=="x" && arr[4]=="x" && arr[0]=="x"||arr[8]=="x" && arr[6]=="x" && arr[7]=="x")
               {
                   count=count+1;
                   System.out.println("\n"+"******************************");
                   System.out.println("\t\tRESULT");
                   System.out.println("********************************");
                   System.out.println(a+" You Won a Game Hurray :)");
                   System.out.print("================================");
                   break;
               }
           }
          if(sb2=="O")
           {
               if(arr[0]=="O" && arr[1]=="O" && arr[2]=="O" ||arr[0]=="O" && arr[3]=="O" && arr[6]=="O" ||arr[0]=="O" && arr[4]=="O" && arr[8]=="O" ||arr[1]=="O" && arr[2]=="O" && arr[0]=="O" ||arr[1]=="O" && arr[4]=="O" && arr[7]=="O" ||arr[2]=="O" && arr[1]=="O" && arr[0]=="O" ||arr[2]=="O" && arr[4]=="O" && arr[6]=="O" ||arr[2]=="O" && arr[5]=="O" && arr[8]=="O" ||arr[3]=="O" && arr[0]=="O" && arr[6]=="O" ||arr[3]=="O" && arr[4]=="O" && arr[5]=="O" ||arr[4]=="O" && arr[1]=="O" && arr[7]=="O" ||arr[4]=="O" && arr[3]=="O" && arr[5]=="O" ||arr[4]=="O" && arr[0]=="O" && arr[8]=="O"||arr[4]=="O" && arr[2]=="O" && arr[6]=="O"||arr[5]=="O" && arr[3]=="O" && arr[4]=="O"||arr[5]=="O" && arr[2]=="O" && arr[8]=="O"||arr[6]=="O" && arr[3]=="O" && arr[0]=="O"||arr[6]=="O" && arr[4]=="O" && arr[2]=="O"||arr[6]=="O" && arr[7]=="O" && arr[8]=="O"||arr[7]=="O" && arr[4]=="O" && arr[1]=="O"||arr[7]=="O" && arr[6]=="O" && arr[8]=="O"||arr[8]=="O" && arr[5]=="O" && arr[2]=="O"||arr[8]=="O" && arr[4]=="O" && arr[0]=="O"||arr[8]=="O" && arr[6]=="O" && arr[7]=="O")
               {
                   count=count+1;
                   System.out.println("\n"+"******************************");
                   System.out.println("\t\tRESULT");
                   System.out.println("*******************************");
                   System.out.println(b+" You Won a Game Hurray :)");
                   System.out.print("================================");
                   break;
               }
           }
          if(sb2=="x")
           {
               if(arr[0]=="x" && arr[1]=="x" && arr[2]=="x" ||arr[0]=="x" && arr[3]=="x" && arr[6]=="x" ||arr[0]=="x" && arr[4]=="x" && arr[8]=="x" ||arr[1]=="x" && arr[2]=="x" && arr[0]=="x" ||arr[1]=="x" && arr[4]=="x" && arr[7]=="x" ||arr[2]=="x" && arr[1]=="x" && arr[0]=="x" ||arr[2]=="x" && arr[4]=="x" && arr[6]=="x" ||arr[2]=="x" && arr[5]=="x" && arr[8]=="x" ||arr[3]=="x" && arr[0]=="x" && arr[6]=="x" ||arr[3]=="x" && arr[4]=="x" && arr[5]=="x" ||arr[4]=="x" && arr[1]=="x" && arr[7]=="x" ||arr[4]=="x" && arr[3]=="x" && arr[5]=="x" ||arr[4]=="x" && arr[0]=="x" && arr[8]=="x"||arr[4]=="x" && arr[2]=="x" && arr[6]=="x"||arr[5]=="x" && arr[3]=="x" && arr[4]=="x"||arr[5]=="x" && arr[2]=="x" && arr[8]=="x"||arr[6]=="x" && arr[3]=="x" && arr[0]=="x"||arr[6]=="x" && arr[4]=="x" && arr[2]=="x"||arr[6]=="x" && arr[7]=="x" && arr[8]=="x"||arr[7]=="x" && arr[4]=="x" && arr[1]=="x"||arr[7]=="x" && arr[6]=="x" && arr[8]=="x"||arr[8]=="x" && arr[5]=="x" && arr[2]=="x"||arr[8]=="x" && arr[4]=="x" && arr[0]=="x"||arr[8]=="x" && arr[6]=="x" && arr[7]=="x")
               {
                   count=count+1;
                   System.out.println("\n"+"*****************************");
                   System.out.println("\t\tRESULT");
                   System.out.println("*******************************");
                   System.out.println(b+" You Won a Game Hurray :)");
                   System.out.print("================================");
                   break;
               }
           }
        }
        if(count==0)
        {
                System.out.println("\n"+"*****************************");
                System.out.println("\t\tRESULT");
                System.out.println("******************************");
                System.out.println("Game Tie Between "+a+" and "+b+" :)");
                System.out.print("================================");
        }
    }
}