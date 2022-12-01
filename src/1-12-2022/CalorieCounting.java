import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Scanner;

public class CalorieCounting
{
    public static void main(String args[])
    {
        int currentHighestTotal = 0;
        int currentCountingTotal = 0;


        try {
            File myObj = new File("src/1-12-2022/input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                if(data.equals("\n")||data.equals(""))
                {
                    if (currentCountingTotal > currentHighestTotal)
                    {
                        currentHighestTotal = currentCountingTotal;
                    }

                    currentCountingTotal = 0;
                }

                else
                {
                    currentCountingTotal += Integer.parseInt(data);
                }

            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println(currentHighestTotal);

    }
}
