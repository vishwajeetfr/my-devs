import java.util.Scanner;

public class mergeSortedArray {

    void merge(int[] a, int[] b,int aL,int bL)
    {
         int i=0;
         int j=0;
         int k=0;
         int[] c = new int[aL+bL];
         while(i<aL&&j<bL)
         {
             if(a[i]<=b[j])
             {
                 c[k]=a[i];
                 i++;
                 k++;
             }
             else {
                 c[k] = b[j];
                 k++;
                 j++;
             }
         }
        while (i < aL) {
            c[k] = a[i];
            i++;
            k++;
        }

        while (j < bL) {
            c[k] = b[j];
            j++;
            k++;
        }
        for(int l=0;l<c.length;l++)
        {
            System.out.println(c[l]);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of a");
        int aLength = in.nextInt();
        System.out.println("Enter Length of b");
        int bLength = in.nextInt();
        int[] a = new int[aLength];
        int[] b = new int[bLength];
        System.out.println("Enter elements of a");
        for(int i=0; i<aLength;i++)
        {
            a[i] = in.nextInt();
        }
        System.out.println("Enter elements of b");
        for(int j=0; j<bLength ; j++)
        {
            b[j] = in.nextInt();
        }
        mergeSortedArray ob1 = new mergeSortedArray();
        ob1.merge(a,b,aLength,bLength);
    }
}