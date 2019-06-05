import java.util.Scanner;

public class pt_test {
    // Function to print n x n Latin Square
    static void ex3(int[] v)
    {
        int max1=0,max2=1;
        for(int i=2;i<v.length;i++)
        {
            if(v[i]>v[max1]) {
                if(v[max2]<v[max1])
                    max2=max1;
                max1 = i;

            }

            else if(v[i]>v[max2]){
                if(v[max2]>v[max1])
                    max1=max2;
                max2=i;}
        }
        int suma=0;
        int start=  Math.min(max1,max2);
        int finish=Math.max(max1,max2);
        for(int i=start+1;i<finish;i++)
        {
            suma=suma+v[i];
        }
        System.out.println("suma este: "+suma);
       // System.out.println(max1);
        //System.out.println(max2);

    }

    static void printLatin(int n)
    {

        //exercise 1
        char[] arrayV={'A','B','C','D','E','F','G','H','I','J','K','L','M','O','P','Q','R','S','T','U','W','X','Y','Z'};

        int k = 0;

        // Loop to print rows
        for (int i = 1; i <= n; i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arrayV[k] + " ");
                k ++;
                if (k >= n)
                    k =0;
            }
            System.out.println("");
            k++;

        }
    }

    public static void main(String []args)
    {
    int k=7;
    int []vecr={1,2,3,1,2,5};

        for (int j=1;j<=k;j++)
        {
            printLatin(j);
            System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>>>");

        }

        ex3(vecr);

    }



}
