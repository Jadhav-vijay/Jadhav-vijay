

public class sumarr{
/**
 * @param ar
 */
public static void main(String ar[])
{
    int []a=new int[] {1,2,3,4,5};
    int sum=0;
    for(int i=0;i<a.length;i++)
    {
        sum=sum+a[i];
    }
    System.out.println(sum);
}
}