/*
The driver class for LanguageQuiz class
A quiz game to help teach
basic Spanish and Italian

Coded by Janeen Soria
Last modified May 17, 2018

*/

import java.util.ArrayList;
import java.util.Scanner;

public class LanguageQuizDriver //implements Quizaroo
{
  public static void main (String [] args)
  {
    ArrayList<String> questions = new ArrayList<String>(); //make into method in interface?
    questions.add("1. How do you say 'hello?'"); //index 0, question 1
    questions.add("2. What is the verb that means 'to be?'");
    questions.add("3. What is the verb that means 'to have'");
    questions.add("4. what are the endings of the verbs?");
    questions.add("5. What are the endings of the nouns?");
    questions.add("6. How do you say 'and' and 'but?'");
    questions.add("7. What are the prepositions?");
    questions.add("8. What are the definite articles?");
    questions.add("9. Which word is in Spanish and Italian?");
    questions.add("10. Which of these does not belong?"); //index 0, question 10

    SpanishQuiz aSpanishQuiz = new SpanishQuiz();
    ItalianQuiz anItalianQuiz = new ItalianQuiz();
    String chooseQuiz;
    Scanner keyboard = new Scanner (System.in);

    System.out.println("Do you want to take the Spanish or Italian quiz? Type 'Spanish' or 'Italian'");
    chooseQuiz = keyboard.nextLine();
    if (chooseQuiz.equals("Spanish"))
    {
      for (String element : questions) //each question would be on its own line
      System.out.println(element);
      aSpanishQuiz.inputAnswers();
    }
    else if (chooseQuiz.equals("Italian"))
    {
      for (String element : questions)
      System.out.println(element);
      anItalianQuiz.inputAnswers();
    }


  }

}
