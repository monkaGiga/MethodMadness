// Brian Yu
package BYu;

public class BYuLib
{

    public static void println(String str)
    {
        System.out.println(str);
    }
    public static String cutOut(String mainStr, String subStr)
    {
        return(mainStr.replaceFirst(subStr,""));
    }
    //replaces first instance of subStr in mainStr with a blank space
    public static String sumUpTo(int sum)
    {
        int asf = 0;
        for(int i = sum; i > 0; i--)
        {
            asf += i;
        }

        return String.valueOf(asf);
    }
    //as long as i is equal to the sum i will get subtracted by one
    //then the int asf will add that integer, this will continue until
    //i becomes less than zero, in the end it will put out an integer
    // that is the sum from zero to the input
    public static void multiplicationTable(int base, int range)
    {
        int asf = 0;
        for(int i = 0; i <= range; i++)
        {
            System.out.println(asf);
            asf = base + asf;
        }
    }
    public static void  fooBarBaz(int num1)
    {
        for(int i = 1; i <= num1; i++)
        {
            if (i%3 == 0&& i%5 != 0)
            {
                System.out.println("foo");
            }
            if (i%3 != 0&& i%5 == 0)
            {
                System.out.println("bar");
            }
            if (i%3 == 0&& i%5 == 0)
            {
                System.out.println("baz");
            }
            if (i%3 != 0&& i%5 != 0)
            System.out.println(String.valueOf(i));
        }
    }



}


