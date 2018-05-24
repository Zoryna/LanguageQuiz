/*
The driver class for LanguageQuiz class
A quiz game to help teach
basic Spanish and Italian

Coded by Janeen Soria
Last modified May 23, 2018
*/

import java.util.Scanner;

public class LanguageQuizDriver //make a while loop to retake quizzes?
{
  public static void main (String [] args)
  {
    SpanishQuiz aSpanishQuiz = new SpanishQuiz();
    ItalianQuiz anItalianQuiz = new ItalianQuiz();
    String chooseQuiz;
    Scanner keyboard = new Scanner (System.in);

    System.out.println("Do you want to take the Spanish or Italian quiz? Type 'Spanish' or 'Italian'");
    chooseQuiz = keyboard.nextLine();
    if (chooseQuiz.equals("Spanish"))
    {
      aSpanishQuiz.quizQuestions();
      aSpanishQuiz.wordBox();
      aSpanishQuiz.score();
      //aSpanishQuiz.testScore();

    }
    else if (chooseQuiz.equals("Italian"))
    {
      anItalianQuiz.quizQuestions();
      anItalianQuiz.wordBox();
      anItalianQuiz.score();

    }


  }


}
