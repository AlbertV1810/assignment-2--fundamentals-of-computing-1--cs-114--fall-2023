import java.util.Scanner;
public class Diamond {
  public static void main(String[] args) {
    System.out.print("Enter input: ");
    Scanner input = new Scanner(System.in);
    int diamondInput = input.nextInt();

    if (diamondInput%2 == 1)
    {
      for(int spaceChars = 1; spaceChars<diamondInput; spaceChars+=2)
      {
        for(int charInput = 0; charInput<diamondInput-1-spaceChars/2; charInput++)
        {
          System.out.print(" ");
        }
        for(int charInput=0; charInput<=spaceChars; charInput++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
      for(int spaceChars = diamondInput; spaceChars>0; spaceChars-=2)
      {
        for(int charInput = 0; charInput<(diamondInput-spaceChars)/2; charInput++)
        {
          System.out.print(" ");
        }
        for(int charInput=0; charInput<spaceChars; charInput++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
    }

    input.close();
  }
}
