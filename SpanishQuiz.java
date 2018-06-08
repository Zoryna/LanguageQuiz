/*
A quiz game to help teach
basic Spanish and Italian

Coded by Janeen Soria
Last modified June 7, 2018
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SpanishQuiz implements Quizaroo
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

  ArrayList<String> answerKey = new ArrayList<String>(Arrays.asList( //answer sheet, different from other quiz
  "ir", "ser", "tener", "trabajar", "comer",
  "beber", "hacer", "leer", "decir", "querer"));

  ArrayList<String> wordOptions = new ArrayList<String>(Arrays.asList( //word box, different from other quiz
  "hacer", "comer", "tener", "beber", "trabajar",
  "ser", "querer", "decir", "leer", "ir"));

  ArrayList<String> answers = new ArrayList<String>(); //testing


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
      answers.add(choice);
      if (answers.size() == 10)
      break;
    }
  }

  public ArrayList grade()
  {
    ArrayList<Object> toCorrect = new ArrayList<Object>();
    int score = 0;

    for (int i = 0; i <= answers.size()-1; i++)
    {
      if (answers.get(i).equals(answerKey.get(i)))
        score++;
      else if (!(answers.get(i).equals(answerKey.get(i))))
      {
        toCorrect.add(i); //stores the index of wrong answers
      }
    }

    System.out.println("You have " + score + " out of 10 correct");


    System.out.println(toCorrect);

    return toCorrect;
  }

  /*public int corrections() //gives new score
  {
    ArrayList<String> replacementAnswers = new ArrayList<String>();
    System.out.println("testing: " + answers); //testing



    return 0;
  }


  /*public ArrayList retakeQuiz();
  {
    return null;
  } */









}
