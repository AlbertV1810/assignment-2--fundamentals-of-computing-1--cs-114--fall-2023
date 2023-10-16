import java.util.Scanner;
public class Diamond {
  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner input = new Scanner(System.in);
    int diamondNum = input.nextInt();

    if (diamondNum%2 == 1)
    {
      for(int spaceChars = 1; spaceChars<diamondNum; spaceChars+=2)
      {
        for(int charOutput = 0; charOutput<(diamondNum-spaceChars)/2; charOutput++)//Ensures right number of spaces
        {
          System.out.print(" ");
        }
        for(int charOutput=0; charOutput<spaceChars; charOutput++)//Prints * depending on input
        {
          System.out.print("*");
        }
        System.out.println();
      }
      for(int spaceChars = diamondNum; spaceChars>0; spaceChars-=2)
      {
        for(int charOutput = 0; charOutput<(diamondNum-spaceChars)/2; charOutput++)
        {
          System.out.print(" ");
        }
        for(int charOutput=0; charOutput<spaceChars; charOutput++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
    }
    else if(diamondNum%2==0)
    {
      for(int spaceChars = 1; spaceChars<diamondNum; spaceChars+=2)
      {
        for(int charOutput = 0; charOutput<(diamondNum-1-spaceChars); charOutput++)
        {
          System.out.print(" ");
        }
        for(int charOutput = 0; charOutput<=spaceChars; charOutput++)
        {
          System.out.print(" *");
        }
        System.out.println();
      }
      for(int spaceChars = diamondNum-2; spaceChars>0; spaceChars-=2)
      {
        for(int charOutput = 0; charOutput<(diamondNum-spaceChars); charOutput++)
        {
          System.out.print(" ");
        }
        for(int charOutput = 0; charOutput<spaceChars; charOutput++)
        {
          System.out.print(" *");
        }
        System.out.println();
      }
    }

    input.close();
  }
}
