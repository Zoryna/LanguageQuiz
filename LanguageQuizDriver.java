/*
The driver class for LanguageQuiz class
A quiz game to help teach
basic Spanish and Italian

Coded by Janeen Soria
Last modified June 8, 2018
*/

import java.util.Scanner;

public class LanguageQuizDriver //make a while loop to retake quizzes?
{

  public static void main (String [] args)
  {
    SpanishQuiz aSpanishQuiz = new SpanishQuiz();
    ItalianQuiz anItalianQuiz = new ItalianQuiz();
    String chooseQuiz, again, redo;
    Scanner keyboard = new Scanner (System.in);

    System.out.println("Do you want to take the Spanish or Italian quiz? Type 'Spanish' or 'Italian':");
    chooseQuiz = keyboard.nextLine().toLowerCase();
    if (chooseQuiz.equals("spanish"))
    {
      aSpanishQuiz.questionsAndOptions();
      aSpanishQuiz.inputAnswers();
      if (aSpanishQuiz.grade() < 7)
      {
        aSpanishQuiz.corrections();
      }
      else
      System.out.println("¡Muy bien! You passed!");

    }
    else if (chooseQuiz.equals("italian"))
    {
      anItalianQuiz.questionsAndOptions();
      anItalianQuiz.inputAnswers();
      if (anItalianQuiz.grade() < 7)
      {
        anItalianQuiz.corrections();
      }
      else
      System.out.println("Ottimo lavoro! You passed!");
    }






    /* //idea 1
    do
    {
      System.out.println("Do you want to take the Spanish or Italian quiz? Type 'Spanish' or 'Italian':");
      chooseQuiz = keyboard.nextLine().toLowerCase();
      if (chooseQuiz.equals("spanish"))
      {
        aSpanishQuiz.questionsAndOptions();
        aSpanishQuiz.inputAnswers();
        if (aSpanishQuiz.grade() < 7)
        {
          aSpanishQuiz.corrections();
          System.out.println("Type 'done' if you want to stop taking quizzes, or press any key to continue:");
          redo = keyboard.nextLine().toLowerCase();
        }
        else
        {
          System.out.println("¡Muy bien! You passed!");
          System.out.println("Type 'done' if you want to stop taking quizzes, or press any key to continue:");
          redo = keyboard.nextLine().toLowerCase();
        }


      }
      else if (chooseQuiz.equals("italian"))
      {
        anItalianQuiz.questionsAndOptions();
        anItalianQuiz.inputAnswers();
        if (anItalianQuiz.grade() < 7)
        {
          anItalianQuiz.corrections();
          System.out.println("Type 'done' if you want to stop taking quizzes, or press any key to continue:");
          redo = keyboard.nextLine().toLowerCase();
        }
        else
        {
          System.out.println("Ottimo lavoro! You passed!");
          System.out.println("Type 'done' if you want to stop taking quizzes, or press any key to continue:");
          redo = keyboard.nextLine().toLowerCase();
        }
      }
    } while (!(redo.equals("done"))); //fix expression */




    /* //idea 2
    System.out.println("Do you want to take another quiz? Type 'yes' or 'no':");
    again = keyboard.nextLine().toLowerCase();
    do
    {
      System.out.println("Which quiz do you want to take? Type 'Spanish' or 'Italian':");
      redo = keyboard.nextLine().toLowerCase();
      if (redo.equals("spanish"))
      {
        aSpanishQuiz.questionsAndOptions();
        aSpanishQuiz.inputAnswers();
        if (aSpanishQuiz.grade() < 7)
        {
          aSpanishQuiz.corrections();
          System.out.println("Type 'done' if you want to stop taking quizzes:");
          go = keyboard.nextLine().toLowerCase();
          if (go.equals("done"));
          break;

        }
        else
        {
          System.out.println("¡Muy bien! You passed!");
          System.out.println("Type 'done' if you want to stop taking quizzes:");
          go = keyboard.nextLine().toLowerCase();
          if (go.equals("done"));
          break;
        }

      }
      else if (again.equals("italian"))
      {
        anItalianQuiz.questionsAndOptions();
        anItalianQuiz.inputAnswers();
        if (anItalianQuiz.grade() < 7)
        {
          anItalianQuiz.corrections();
          System.out.println("Type 'done' if you want to stop taking quizzes:");
          go = keyboard.nextLine().toLowerCase();
          if (continue.equals("done"))
          break;
        }
        else
        {
          System.out.println("Ottimo lavoro! You passed!");
          System.out.println("Type 'done' if you want to stop taking quizzes:");
          go = keyboard.nextLine().toLowerCase();
          if (go.equals("done"));
          break;
        }
      }

    } while (again.equals("yes")); */

  }


}
