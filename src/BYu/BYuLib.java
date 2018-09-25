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
    //i will add one every loop it will print out the int asf
    // which is also added to the base every loop until is less
    // than or equal to the range, the range is how many times the
    // loop will run
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
    //i will add 1 every loop, it will keep happening each loop
    //until i is less than or equal to num1, if the remainder of
    //num one divided by 3 is 0 the number will be replaced with foo
    //multiples of 5 are bar and multiples of 3 and 5 are baz



}


