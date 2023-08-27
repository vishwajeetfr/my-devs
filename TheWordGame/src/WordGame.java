import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordGame {
    String str;
    char[] ch;
    char[] out;
    int n;
    int guessed = 0;
    WordGame()
    {
        System.out.println("ENTER YOUR WORD");
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        ch = str.toCharArray();
        n = str.length();
        out = new char[n];
        for(int i = 0 ; i< n ;i++)
        {
            out[i] = '-';
        }
    }

    void guess(String s)
    {
        if(s.equals(str))
        {
            guessed = 1;
        }
        else {
            System.out.println("wrong guess!!");
        }
    }

    void iterate(char c)
    {
        for(int i=0;i<n;i++)
        {
            if(ch[i] == c)
            {
                out[i] = c;
            }
        }
        System.out.println(new String(out));

        for(char q : out)
        {
            int count = 0;
            if(q=='-')
            {
                count++;
            }
            if(count==n)
            {
                System.out.println("You guessed it!!");
            }
        }
    }

}
