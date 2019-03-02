/*Alex Sluborski
 * 
 */

package test;
import java.util.Scanner;
public class test {
public static void main(String [] args) {
	int a;
	int b;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers to calculate the GCD ");
	a = sc.nextInt(); // user inputs two numbers
	b = sc.nextInt();
	
	int []matrixArray1={1,0,a}; // the matrix array for a and b
    int []matrixArray2={0,1,b};
    while(matrixArray1[2]!=0 && matrixArray2[2]!=0) // while a and b do not equal 0 
    {
        for(int i=0;i<matrixArray1.length;i++) // for length of first array
        {
            matrixArray1[i]=matrixArray1[i]-((matrixArray1[2]/matrixArray2[2])*matrixArray2[i]); //index of first array, subtract first row from second rfow
        }
        if(matrixArray1[2]!=0) // if first array a does not equal 0 
        {
            for(int i=0;i<matrixArray1.length;i++) // length of first array
            {
                matrixArray2[i]=matrixArray2[i]-((matrixArray2[2]/matrixArray1[2])*matrixArray1[i]); //subtract second row with first row 
            }
        }
    }
    if(matrixArray2[2]==0)
    {
        int s=matrixArray1[0];
        int t=matrixArray1[1];
        int gcd = matrixArray1[2];
        System.out.println("t =" + t);
        System.out.println("s =" + s);
        System.out.println("gcd =" + gcd);
    }
    else
    {
    int s=matrixArray2[0];
    int t=matrixArray2[1];
    int gcd=matrixArray2[2];
    System.out.println("t =" + t);
    System.out.println("s=" + s);
    System.out.println("gcd =" + gcd);
}
}
}
