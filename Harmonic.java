//Anthony Foley 2313898
//Stevens 231 Recursion --> Assignment Part 1

public class Harmonic {

//This method will print harmonic series using for loop
  public static double calcIterativeHarmonic(int n){

    //I will add numbers to answer variable to check math later on
    double sumNumbers = 0.00;

    //This for loop will perform/print the sequence to 'n' and stop there
    for (int i=1; i<=n; ++i) {
      sumNumbers+=(1.0/i);
    }

    return sumNumbers;
  }

  public static double calcRecursiveHarmonic(int n){

    //Here I declare + initialize variables
    double sumNumbers = 0.00;

    //This stops recursion from going downwards forever
    if (n == 1) {
      return 1.0;
    }

    //Here the recursion subtracts 1 from n until it reaches 1
    else {
    sumNumbers+=(1.0/n) + Harmonic.calcRecursiveHarmonic(n-1);
    return sumNumbers;
    }
  }

  public static void main(String[] args) {

    //Print using for-loop
    System.out.println("\nHere is the Harmonic Sequence using the for loop printing the first 20 values: \n");

    //Use for loop to print 20 values
    for (int i = 1;i<=20 ;++i) {
    System.out.println(Harmonic.calcIterativeHarmonic(i));
    }

    //Print using recursion and use another for-loop to print 20 values
    System.out.println("\nHere is the Harmonic Sequence using Recursion printing the first 20 values: \n");

    for (int j = 1;j<=20 ;++j) {
    System.out.println(Harmonic.calcRecursiveHarmonic(j));
    }
    System.out.println();
  }
}
