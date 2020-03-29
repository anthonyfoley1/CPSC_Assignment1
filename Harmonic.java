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
      System.out.println(sumNumbers);
    }

    System.out.println("\nThe sum is: ");
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
    System.out.println(sumNumbers+=(1.0/n) + Harmonic.calcRecursiveHarmonic(n-1));
    return sumNumbers;
    }
  }

  public static void main(String[] args) {

    System.out.println("\nHere is the Harmonic Sequence using the for loop printed out to the 20th sequence: ");
    System.out.println("\n" + Harmonic.calcIterativeHarmonic(20));

    System.out.println("\nHere is the Harmonic Sequence using Recursion printed out to the 20th sequence: ");
    System.out.println("\nThe sum is:  \n\n" + Harmonic.calcRecursiveHarmonic(20) + "\n");
  }
}
