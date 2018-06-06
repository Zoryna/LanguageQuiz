/*
A quiz game to help teach
basic Spanish and Italian

Coded by Janeen Soria
Last modified June 5, 2018
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ItalianQuiz implements Quizaroo
{
  String element;
  int score;

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

  public ArrayList wordBox() //different from other quiz
  {
    System.out.println("Here is your word box:");
    ArrayList<String> wordOptions = new ArrayList<String>(Arrays.asList(
    "lavorare", "bere", "essere", "fare", "leggere",
    "dire", "mangiare", "andare", "volere", "avere"));

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

  public ArrayList answerSheet() //different from other quiz
  {
    ArrayList<String> answerKey = new ArrayList<String>(Arrays.asList(
    "andare", "essere", "avere", "lavorare", "mangiare",
    "bere", "fare", "leggere", "dire", "volere"));

    return answerKey;
  }

  public ArrayList grade()
  {
    ArrayList<String> userInput = this.inputAnswers();
    ArrayList<String> correctAnswers = this.answerSheet();
    //ArrayList<String> theQuestions = this.quizQuestions();
    ArrayList<Object> toCorrect = new ArrayList<Object>();
    int score = 0;
    int wrong = 0;

    for (int i = 0; i <= userInput.size()-1; i++)
    {
      if (userInput.get(i).equals(correctAnswers.get(i)))
        score++;
      else if (!(userInput.get(i).equals(correctAnswers.get(i))))
      {
        toCorrect.add(i); //stores the index of wrong answers
      }
    }

    System.out.println("You have " + score + " out of 10 correct");
    wrong = 10 - score;


    //System.out.println(toCorrect);
    return toCorrect;
  }

  /*public ArrayList retakeQuiz();
  {
    return null;
  } */










}
