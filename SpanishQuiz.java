/*
A quiz game to help teach
basic Spanish and Italian

Coded by Janeen Soria
Last modified June 8, 2018
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SpanishQuiz implements Quizaroo
{
  ArrayList<String> questions = new ArrayList<String>(Arrays.asList(
  "1. What is the verb that means 'to go?'",
  "2. What is the verb that means 'to be?'",
  "3. What is the verb that means 'to have'",
  "4. What is the verb that means 'to work?'",
  "5. What is the verb that means 'to eat?'" ,
  "6. What is the verb that means 'to drink?'",
  "7. What is the verb that means 'to do?'",
  "8. What is the verb that means 'to read?'",
  "9. What is the verb that means 'to say?'",
  "10. What is the verb that means 'to want?'"));

  ArrayList<String> answerKey = new ArrayList<String>(Arrays.asList( //answer sheet, different from other quiz
  "ir", "ser", "tener", "trabajar", "comer",
  "beber", "hacer", "leer", "decir", "querer"));

  ArrayList<String> wordOptions = new ArrayList<String>(Arrays.asList( //word box, different from other quiz
  "hacer", "comer", "tener", "beber", "trabajar",
  "ser", "querer", "decir", "leer", "ir"));

  Scanner keyboard = new Scanner (System.in);

  ArrayList<String> userAnswers = new ArrayList<String>();

  int score; //make into double to make into percentage?


  public void questionsAndOptions()
  {
    for (String element : questions)
    {
      System.out.println(element);
    }

    System.out.println("Here is your word box:");
    System.out.println(wordOptions);
  }

  public void inputAnswers()
  {
    String choice;

    System.out.println("Please enter your answers by typing in each word. Press 'enter' after each answer:");
    while(true)
    {
      choice = keyboard.nextLine().toLowerCase();
      userAnswers.add(choice);
      if (userAnswers.size() == 10)
      break;
    }
  }

  public int grade()
  {
    for (int i = 0; i <= userAnswers.size()-1; i++)
    {
      if (userAnswers.get(i).equals(answerKey.get(i)))
        score++;
    }

    System.out.println("You have " + score + " out of 10 correct");

    return score;
  }

  public int corrections() //gives new score
  {
    String replacement;

    System.out.println("You had fewer than 6 right. Correct your wrong answers and we will give you your new score. Here is your word box again:");
    System.out.println(wordOptions);

    for (int i = 0; i <= userAnswers.size()-1; i++)
    {
      if (!(userAnswers.get(i).equals(answerKey.get(i))))
      {
        System.out.println("You got this question incorrect: " + questions.get(i));
        System.out.println("Replace your incorrect answer with a different answer:");
        replacement = keyboard.nextLine().toLowerCase();
        userAnswers.set(i, replacement);
      }
    }
    System.out.println("You have " + score + " out of 10 correct");

    return score;
  }
}
