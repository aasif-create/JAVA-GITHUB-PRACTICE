public class PYRAMIDPATTERNS
{       
    public static void main(String[] args)
    {
        System.out.print("LEFT HALF PYRAMID");
        int n=7;
        for(int i =1 ;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("<--------------------------------------------------------->");

        System.out.println("INVERTED HALF PYRAMID");

        int n1=7;
        for(int i=n1 ;i>0;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("<--------------------------------------------------------->");
        System.out.println("SPACE WITH STAR PYRAMID 1");

        int n2=7;
        for(int i=n1 ;i>0;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("<--------------------------------------------------------->");
    }
}