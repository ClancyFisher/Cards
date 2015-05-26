import java.util.*;
import java.io.*;

public class ReadTest
{
    // instance variables
    ArrayList<String> greencards = new ArrayList<String>();
    ArrayList<String> yellowcards = new ArrayList<String>();
    ArrayList<String> bluecards = new ArrayList<String>();
    ArrayList<String> currCards = null;

   
    public ReadTest()
    {
        Scanner filein = null;
        try {
            filein = new Scanner(new File("CardsList.csv"));
        } catch(IOException ioe) {
        }
        
        while(filein.hasNextLine())
        {
            process(filein.nextLine());
        }

    }
    
    public void process(String data)
    {
        
        if(data.startsWith("#")) return;
        if(data.startsWith("BLUE"))
        {
            currCards = bluecards;
            return;
        }
        else
        {
            Scanner input = new Scanner(data);
            input.useDelimiter(",");
            String color = input.next();
            int cnum = -1;
            switch(color)
            {
                case "blue": cnum = 1; break;
                case "red": cnum = 2; break;
                case "green": cnum = 3; break;
                case "white": cnum = 4; break;
                case "black": cnum = 5; break;
            }
            int vp = input.nextInt();
            int bluecost = input.nextInt();
            int greencost = input.nextInt();
            int whitecost = input.nextInt();
            int redcost = input.nextInt();      
            int blackcost = input.nextInt();
        }
    }

   
    public static void main(String[] args)
    {
        new ReadTest();
    }
}
