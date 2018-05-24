/*
A quiz game to help teach
basic Spanish and Italian

Coded by Janeen Soria
Last modified May 23, 2018
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ItalianQuiz implements Quizaroo
{
  String element;

  public ArrayList quizQuestions()
  {
    ArrayList<String> questions = new ArrayList<String>(Arrays.asList(
    "1. What is the verb that means 'to go?'", //index 0, question 1
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

    return questions;
  }

  public ArrayList wordBox ()
  {
    System.out.println("Here is your word box:");
    ArrayList<String> wordOptions = new ArrayList<String>(Arrays.asList(
    "lavorare",
    "bere",
    "essere",
    "fare",
    "leggere",
    "dire",
    "mangiare",
    "andare",
    "volere",
    "avere"));

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
    "andare", "essere", "avere", "lavorare", "mangiare",
    "bere", "fare", "leggere", "dire", "volere"));

    return answerKey;
  }

  public int score()
  {
    ArrayList<String> userInput = this.inputAnswers();
    ArrayList<String> correctAnswers = this.answerSheet();

    userInput.removeAll(correctAnswers); //keeps only the wrong answers (matched then correct, then removed)
    //print statement for question number with answer

    System.out.println("You have " + userInput.size() + " incorrect");
    System.out.println(userInput);

    return userInput.size();
  }

  /*public ArrayList corrections();
  {
    return null;
  }

  public ArrayList retakeQuiz();
  {
    return null;
  } */










}
