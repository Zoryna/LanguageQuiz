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
    String chooseQuiz, redo;
    Scanner keyboard = new Scanner (System.in);

    System.out.println("Do you want to take the Spanish or Italian quiz? Type 'Spanish' or 'Italian'");
    chooseQuiz = keyboard.nextLine();
    if (chooseQuiz.equals("Spanish"))
    {
      aSpanishQuiz.questionsAndOptions();
      aSpanishQuiz.inputAnswers();
      if (aSpanishQuiz.grade() < 6)
      {
        aSpanishQuiz.corrections();
      }


    }
    else if (chooseQuiz.equals("Italian"))
    {
      anItalianQuiz.questionsAndOptions();
      anItalianQuiz.inputAnswers();
      if (anItalianQuiz.grade() < 6)
      {
        anItalianQuiz.corrections();
      }


    }


  }


}
