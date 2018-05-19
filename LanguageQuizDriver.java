/*
The driver class for LanguageQuiz class
A quiz game to help teach
basic Spanish and Italian

Coded by Janeen Soria
Last modified May 18, 2018

*/

import java.util.ArrayList;
import java.util.Scanner;

public class LanguageQuizDriver //implements Quizaroo
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
      aSpanishQuiz.inputAnswers();
    }
    else if (chooseQuiz.equals("Italian"))
    {
      anItalianQuiz.quizQuestions();
      anItalianQuiz.inputAnswers();
    }


  }


}
