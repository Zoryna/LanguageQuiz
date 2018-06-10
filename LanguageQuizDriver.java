/*
The driver class for LanguageQuiz class
A quiz game to help teach
basic Spanish and Italian
Coded by Janeen Soria
Last modified June 9, 2018
*/

import java.util.Scanner;

public class LanguageQuizDriver
{
  public static void main (String [] args)
  {
    SpanishQuiz aSpanishQuiz = new SpanishQuiz();
    ItalianQuiz anItalianQuiz = new ItalianQuiz();
    String chooseQuiz; //, redo;
    Scanner keyboard = new Scanner (System.in);

    System.out.println("Do you want to take the Spanish or Italian quiz? Type 'Spanish' or 'Italian' or type 'done' to stop taking quizzes:");
    chooseQuiz = keyboard.nextLine().toLowerCase();

    if (chooseQuiz.equals("done"))
      {
        System.out.println("Ok :(");
      }

    if (chooseQuiz.equals("spanish"))
    {
      aSpanishQuiz.questionsAndOptions();
      aSpanishQuiz.inputAnswers();
      if (aSpanishQuiz.grade() < 7) //fix scores in grading?
      {
        aSpanishQuiz.corrections();
      }
      else //fix
      {
        System.out.println("¡Muy bien! You passed!");
      }
    }

    else if (chooseQuiz.equals("italian"))
    {
      anItalianQuiz.questionsAndOptions();
      anItalianQuiz.inputAnswers();
      if (anItalianQuiz.grade() < 7) //fix scores?
      {
        anItalianQuiz.corrections();
      }
      else //fix
      {
        System.out.println("Ottimo lavoro! You passed!");
      }
    }
  }
}
