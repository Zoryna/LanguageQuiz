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
    String chooseQuiz, redo;
    Scanner keyboard = new Scanner (System.in);

    while (true)
    {
      System.out.println("Do you want to take the Spanish or Italian quiz? Type 'Spanish' or 'Italian' or type 'done' to stop taking quizzes:");
      chooseQuiz = keyboard.nextLine().toLowerCase();

      if (chooseQuiz.equals("done"))
        break;

      if (chooseQuiz.equals("spanish"))
      {
        aSpanishQuiz.questionsAndOptions();
        aSpanishQuiz.inputAnswers();
        if (aSpanishQuiz.grade() < 7)
        {
          aSpanishQuiz.corrections();
          System.out.println("Type 'done' if you want to stop taking quizzes, or enter any key to continue:");
          redo = keyboard.nextLine().toLowerCase();
          if (redo.equals("done"))
            break;
        }
        else //fix
        {
          System.out.println("¡Muy bien! You passed!");
          System.out.println("Type 'done' if you want to stop taking quizzes, or enter any key to continue:");
          redo = keyboard.nextLine().toLowerCase();
          if (redo.equals("done"))
            break;
        }
      }

      else if (chooseQuiz.equals("italian"))
      {
        anItalianQuiz.questionsAndOptions();
        anItalianQuiz.inputAnswers();
        if (anItalianQuiz.grade() < 7)
        {
          anItalianQuiz.corrections();
          System.out.println("Type 'done' if you want to stop taking quizzes, or enter any key to continue:");
          redo = keyboard.nextLine().toLowerCase();
          if (redo.equals("done"))
            break;
        }
        else //fix
        {
          System.out.println("Ottimo lavoro! You passed!");
          System.out.println("Type 'done' if you want to stop taking quizzes, or enter any key to continue:");
          redo = keyboard.nextLine().toLowerCase();
          if (redo.equals("done"))
            break;
        }
      }

      else
        System.out.println("Ok :(");
    }
  }
}
