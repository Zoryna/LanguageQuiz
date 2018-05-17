/*
A quiz game to help teach
basic Spanish and Italian

Coded by Janeen Soria
Last modified May 17, 2018
*/

import java.List;
import java.util.Scanner;

public class ItalianQuiz implements Quizaroo
{
  ArrayList inputAnswers()
  {
    ArrayList<Character> answers = new ArrayList();
    char choice;
    Scanner keyboard = new Scanner (System.in);

    System.out.println("Please enter your answers for the 10 questions. Type 'done' when you are finished answering the questions.");
    while(true)
    {
      choice = keyboard.nextLine();
      answers.add(choice);
      




    }




  }








}
