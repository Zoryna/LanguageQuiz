/*
A quiz game to help teach
basic Spanish and Italian

Coded by Janeen Soria
Last modified June 7, 2018
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ItalianQuiz implements Quizaroo
{
  ArrayList<String> questions = new ArrayList<String>(Arrays.asList(
  "1. What is the verb that means 'to go?'", //index 0
  "2. What is the verb that means 'to be?'",
  "3. What is the verb that means 'to have'",
  "4. What is the verb that means 'to work?'",
  "5. What is the verb that means 'to eat?'" ,
  "6. What is the verb that means 'to drink?'",
  "7. What is the verb that means 'to do?'",
  "8. What is the verb that means 'to read?'",
  "9. What is the verb that means 'to say?'",
  "10. What is the verb that means 'to want?'"));

  ArrayList<String> answerKey = new ArrayList<String>(Arrays.asList( //word box, different from other quiz
  "andare", "essere", "avere", "lavorare", "mangiare",
  "bere", "fare", "leggere", "dire", "volere"));

  ArrayList<String> wordOptions = new ArrayList<String>(Arrays.asList( //answer sheet, different from other quiz
  "lavorare", "bere", "essere", "fare", "leggere",
  "dire", "mangiare", "andare", "volere", "avere"));

  Scanner keyboard = new Scanner (System.in);

  ArrayList<String> userAnswers = new ArrayList<String>();

  int score; //make into double to make into percentage?

  ArrayList<Object> toCorrect = new ArrayList<Object>(); //index of wrong answers, testing


  public void quizQuestions()
  {
    for (String element : questions)
      System.out.println(element);
  }

  public void wordBox()
  {
    System.out.println("Here is your word box:");
    for (String element : wordOptions)
      System.out.println(element);
  }

  public void inputAnswers()
  {
    String choice;
    Scanner keyboard = new Scanner (System.in);

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
    //ArrayList<Object> toCorrect = new ArrayList<Object>();
    //int score = 0;

    for (int i = 0; i <= userAnswers.size()-1; i++)
    {
      if (userAnswers.get(i).equals(answerKey.get(i)))
        score++;
      else if (!(userAnswers.get(i).equals(answerKey.get(i))))
      {
        toCorrect.add(i); //stores the index of wrong answers
      }
    }

    System.out.println("You have " + score + " out of 10 correct");

    System.out.println("indexes of answers to correct: " + toCorrect);

    return score;
  }

  public int corrections() //gives new score
  {
    String replacement;

    System.out.println("before for loop" + userAnswers);
    for (int i = 0; i <= userAnswers.size()-1; i++)
    {
      if (!(userAnswers.get(i).equals(answerKey.get(i))))
      {
        System.out.println("Replace your incorrect answer with a different answer:");
        replacement = keyboard.nextLine().toLowerCase();
        userAnswers.set(i, replacement);
      }
    }


    System.out.println("after for loop: " + userAnswers); //testing


    return score;
  }

  /*public ArrayList retakeQuiz();
  {
    return null;
  } */










}
