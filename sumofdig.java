

public class sumofdig{
    public static void main(String ar[])
    {
        int n=234;
        int sum=findsum();
        System.out.println(sum);
    }

private static int findsum()
{
    int sum=0;
    int i = 234;
    int n=i;
    while(n>0)
    {
        int r=n%10;
        sum=sum+r;
        n=n/10;

    }
    return sum;
} 
}