public class PYRAMIDPATTERNS
{       
    public static void main(String[] args)
    {
        System.out.print("1.LEFT HALF PYRAMID");
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

        System.out.println("2.INVERTED HALF PYRAMID");

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
        System.out.println("3.SPACE WITH STAR PYRAMID 1");

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
        System.out.println("4.SPACE WITH STAR PYRAMID 2");
        int n3=7;
        for(int i=1;i<=n3;i++)
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