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

        System.out.print("RIGHT HALF PYRAMID");
    }
}