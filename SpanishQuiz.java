/*
A quiz game to help teach
basic Spanish and Italian

Coded by Janeen Soria
Last modified May 18, 2018
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SpanishQuiz implements Quizaroo
{
  public ArrayList quizQuestions()
  {
    ArrayList<String> questions = new ArrayList<String>(Arrays.asList(
    "1. How do you say 'hello?'", //index 0, question 1
    "A) hello B) hola C) ciao D) 'sup'",
    "2. What is the verb that means 'to be?'", //index 2
    "A) tener B) ser C) avere D) essere",
    "3. What is the verb that means 'to have'", //index 4...questions are even numbers
    "A) tener B) ser C) avere D) essere",
    "4. what are the endings of the verbs?",
    "A) -ar B) -er C) -ir D) all of the above",
    "5. What are the common endings of the nouns?" ,
    "A) o B) a C) s D) none of the above",
    "6. How do you say 'and' and 'but?'",
    "A) y, pero B) y, perro C) e D) A and B",
    "7. What are some prepositions?",
    "A) a, in, per, con, di, da B) a, in, en, con, di, de C) a, en, para, por, con, de D) A and B",
    "8. What are the definite articles?",
    "A) il/i  B) la/le  C)lo/gli, l'  D) all of the above",
    "9. Which word is in Spanish and Italian?",
    "A) pero  B) si  C) ma  D) no",
    "10. Which of these does not belong?", //index 9, question 10
    "A) essere  B) avere  C) e  D) hola"));

    for (String element : questions)
      System.out.println(element);

    return questions; //last index is 19, 20 objects
  }

  public ArrayList inputAnswers()
  {
    ArrayList<String> answers = new ArrayList<String>();
    String choice;
    Scanner keyboard = new Scanner (System.in);

    System.out.println("Please enter your answers for the 10 questions:");
    while(true)
    {
      choice = keyboard.nextLine();
      answers.add(choice);
      if (answers.size() == 10) //there are only 10 questions
      break;
    }
    /*for (String element : answers)
      System.out.println(element);
      for (int i = 0; i <= 10; i++)
        System.out.println(answers.get(i)); */

    return answers;
  }




  /*public int score();
  {
    return null;
  }

  public ArrayList answerSheet();
  {
    return null;
  }

  public ArrayList corrections();
  {
    return null;
  }

  public ArrayList retakeQuiz();
  {
    return null;
  } */









}