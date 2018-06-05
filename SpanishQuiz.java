/*
A quiz game to help teach
basic Spanish and Italian

Coded by Janeen Soria
Last modified June 4, 2018
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SpanishQuiz implements Quizaroo
{
  String element;

  public ArrayList quizQuestions()
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
    "10. What is the verb that means 'to want?'")); //index 9, question 10

    for (String element : questions)
      System.out.println(element);

    return questions; //10 objects
  }

  public ArrayList wordBox ()
  {
    System.out.println("Here is your word box:");
    ArrayList<String> wordOptions = new ArrayList<String>(Arrays.asList(
    "hacer", "comer", "tener", "beber", "trabajar",
    "ser", "querer", "decir", "leer", "ir"));

    for (String element : wordOptions)
      System.out.println(element);

    return wordOptions;
  }

  public ArrayList inputAnswers()
  {
    ArrayList<String> answers = new ArrayList<String>();
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

    return answers;
  }

  public ArrayList answerSheet()
  {
    ArrayList<String> answerKey = new ArrayList<String>(Arrays.asList(
    "ir", "ser", "tener", "trabajar", "comer",
    "beber", "hacer", "leer", "decir", "querer"));

    return answerKey;
  }

  public double score()
  {
    ArrayList<String> userInput = this.inputAnswers();
    ArrayList<String> correctAnswers = this.answerSheet();
    double percentage = 0;

    for (int i = 0; i <= userInput.size()-1; i++)
    {
      if (userInput.get(i).equals(correctAnswers.get(i)))
        percentage++;
    }
    percentage = (percentage/10) * 100;
    System.out.println("Your score is " + percentage);

    return percentage;
  }


  /*public ArrayList corrections(); //print question(s) that user got wrong to redo
  {
    return null;
  }

  public ArrayList retakeQuiz();
  {
    return null;
  } */









}
