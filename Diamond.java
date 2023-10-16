import java.util.Scanner;
public class Diamond {
  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner input = new Scanner(System.in);
    int diamondInput = input.nextInt();

    if (diamondInput%2 == 1)
    {
      for(int spaceChars = 1; spaceChars<diamondInput; spaceChars+=2)
      {
        for(int charOutput = 0; charOutput<(diamondInput-spaceChars)/2; charOutput++)//Make right number of spaces
        {
          System.out.print(" ");
        }
        for(int charOutput=0; charOutput<spaceChars; charOutput++)//Prints * depending on input
        {
          System.out.print("*");
        }
        System.out.println();
      }
      for(int spaceChars = diamondInput; spaceChars>0; spaceChars-=2)
      {
        for(int charOutput = 0; charOutput<(diamondInput-spaceChars)/2; charOutput++)
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
    else if(diamondInput%2==0)
    {
      for(int spaceChars = 0; spaceChars<diamondInput; spaceChars+=2)
      {
        for(int charOutput = 0; charOutput<(diamondInput-spaceChars)/2; charOutput++)
        {
          System.out.print("  ");
        }
        for(int charOutput = 0; charOutput<spaceChars; charOutput++)
        {
          System.out.print(" *");
        }
        System.out.println();
      }
      for(int spaceChars = diamondInput; spaceChars>0; spaceChars-=2)
      {
        for(int charOutput = 0; charOutput<(diamondInput-spaceChars)/2; charOutput++)
        {
          System.out.print("  ");
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
