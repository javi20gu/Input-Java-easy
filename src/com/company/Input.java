package com.company;
import java.io.*;


public class Input
{
    public static String input()
    {
        String sdato = "";

        try
        {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader flujoE = new BufferedReader(isr);

            sdato = flujoE.readLine();
        }
        catch(IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        return sdato;
    }

    public static short inputShort()
    {
        try
        {
            return Short.parseShort(input());
        }
        catch(NumberFormatException e)
        {
            return Short.MIN_VALUE;
        }
    }

    public static int inputInt()
    {
        try
        {
            return Integer.parseInt(input());
        }
        catch(NumberFormatException e)
        {
            return Integer.MIN_VALUE;
        }
    }

    public static long inputLong()
    {
        try
        {
            return Long.parseLong(input());
        }
        catch(NumberFormatException e)
        {
            return Long.MIN_VALUE;
        }
    }

    public static float inputFloat()
    {
        try
        {
            return Float.parseFloat(input());
        }
        catch(NumberFormatException e)
        {
            return Float.MIN_VALUE;
        }
    }


}
