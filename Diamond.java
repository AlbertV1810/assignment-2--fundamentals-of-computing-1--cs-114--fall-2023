import java.util.Scanner;
public class Diamond {
  public static void main(String[] args) {
    System.out.print("Enter input: ");
    Scanner input = new Scanner(System.in);
    int diamondInput = input.nextInt();

    if (diamondInput%2 == 1)
    {
      for(int spaceInput = 0;spaceInput<diamondInput;spaceInput++)
      {
        for(int charInput = 0;charInput<diamondInput-spaceInput;charInput++)
        {
          System.out.print(" ");
        }
        for(int charInput=0;charInput<=spaceInput;charInput++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
      

    }

    input.close();
  }
}
