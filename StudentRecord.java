//Anthony Foley 2313898
//Stevens 231 Class --> Assignment Part 2

public class StudentRecord{

  //Declare private member variables
  private double m_quiz1;
  private double m_quiz2;
  private double m_quiz3;
  private double m_midterm;
  private double m_final;
  private double m_overall;
  private char m_letter;

  //default constructor
  public StudentRecord(){
    m_quiz1 = 8.5;
    m_quiz2 = 9.0;
    m_quiz3 = 9.5;
    m_midterm = 90;
    m_final = 88;
    m_overall = 89.2;
    m_letter = 'B';
  }

  //overloaded constructor
  public StudentRecord(double quiz1, double quiz2, double quiz3, double midterm, double finnal){
    m_quiz1 = quiz1;
    m_quiz2 = quiz2;
    m_quiz3 = quiz3;
    m_midterm =midterm;
    m_final = finnal;
  }

  //mutators AKA setters
  public void setQuiz1(double quiz1){
    m_quiz1 = quiz1;
  }
  public void setQuiz2(double quiz2){
    m_quiz2 = quiz2;
  }
  public void setQuiz3(double quiz3){
    m_quiz3 = quiz3;
  }
  public void setMidterm(double midterm){
    m_midterm = midterm;
  }
  public void setFinnal(double finnal){
    m_final = finnal;
  }
  public void setOverall(double overall){
    m_overall = overall;
  }
  public void setLetter(char letter){
    m_letter = letter;
  }

  //accessors AKA setters
  public double getQuiz1(){
    return m_quiz1;
  }
  public double getQuiz2(){
    return m_quiz2;
  }
  public double getQuiz3(){
    return m_quiz3;
  }
  public double getMidterm(){
    return m_midterm;
  }
  public double getFinnal(){
    return m_final;
  }
  public double getOverall(){
    return m_overall;
  }
  public char getLetter(){
    return m_letter;
  }

  //toString
  public String toString(){
    return ("Quizzes 1,2,3: " + m_quiz1*10+"%, "+m_quiz2*10+"%, "+m_quiz3*10+"%" + "\n" +
            "Midterm:  " + m_midterm+"%"+ "\nFinal Exam:   " + m_final+"%"+ "\nOverall Grade:   " + m_overall+"%" + "\nLetter Grade:  "+m_letter+"\n");
  }

  //equals

  public boolean equals(StudentRecord student2){

    return (m_quiz1 == student2.getQuiz1() && m_quiz2 == student2.getQuiz2() && m_quiz3 == student2.getQuiz3()
         && m_midterm == student2.getMidterm() && m_final == student2.getFinnal());
  }


  //Computes overall grade
  public double computeNumericScore(StudentRecord x){

    //Get scores from student
    double quiz1 = x.getQuiz1();
    double quiz2 = x.getQuiz2();
    double quiz3 = x.getQuiz3();
    double midterm = x.getMidterm();
    double finnal = x.getFinnal();

    double answer = 0.0;
    double sumQuiz = 0.0;

    //Here I add the quizes together to simplify the math and multipy by 3.3 to adjust scale
    sumQuiz += quiz1 + quiz2 + quiz3;
    sumQuiz *= 3.333333;
    sumQuiz *= 0.25;

    midterm *= 0.35;
    finnal *= 0.40;

    answer = answer + sumQuiz + midterm + finnal;

    //I return the weighted average and record the score into mutator
    setOverall(answer);
    return answer;
  }


  //Computes letter grade
  public char letterGrade(StudentRecord x){

    //Declare variables and assign student to grade variable
    double grade = x.computeNumericScore(x);
    char answer;

    //Simple if-else if branch to see where the grade stands on GPA scale
    if (grade >= 90) {
      answer = 'A';
    }
    else if (grade >= 80) {
      answer = 'B';
    }
    else if (grade >= 70) {
      answer = 'C';
    }
    else if (grade >= 60) {
      answer = 'D';
    }
    else {
      answer = 'F';
    }

    //Return answer and record it in mutator
    setLetter(answer);
    return answer;
  }


  //Main
  public static void main(String[] args) {

    //Here I use overloaded constructor
    StudentRecord S1 = new StudentRecord(9,7,10,85,93);

    //Here I use default constructor but set new values to test mutators and accessors
    StudentRecord S2 = new StudentRecord();
    S2.setQuiz1(8);
    S2.setQuiz2(9.5);
    S2.setQuiz3(9);
    S2.setMidterm(89);
    S2.setFinnal(95);

    //Output first student's info
    System.out.println("\nHere is the infomation regarding the first student: ");

    //Compute actual Numeric score
    System.out.println("\nThe student's overall weighted average is:  " + S1.computeNumericScore(S1));

    //Compute Actual letter grade
    System.out.println("The student's letter grade is:  " + S1.letterGrade(S1));

    //Prints the 1st student's overall statistics
    System.out.println("\nHere are the statistics" + "\n" + S1.toString());

    //Output second student's info
    System.out.println("\nHere is the infomation regarding the second student");

    System.out.println("\nThe student's overall weighted average is:  " + S2.computeNumericScore(S2));

    System.out.println("The student's letter grade is:  " + S2.letterGrade(S2));

    System.out.println("\nHere are the statistics" + "\n" + S2.toString());

    //See if the 2 students are equal
    System.out.println("\nDo students 1 and 2 have the same grades?" + " " + S1.equals(S2) + "\n");
  }

}
