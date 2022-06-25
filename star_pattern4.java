import java.io.*;
import java.util.*;
class star_pattern4
{
    public void main()
    {
        for(int i = 0; i<=4;i++)
        {
            
                for(int j=0;j<=4;j++)
                {
                    if(i==0 || i==4||j==0|| j==4)
                    {
                        System.out.print("*");
                    }
                        else
                        {
                        System.out.print(" ");
                    }
                }
                
            
            System.out.println();
        }}
    }