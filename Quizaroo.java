/*
Interface for language quiz classes
A quiz game to help teach
basic Spanish and Italian

Coded by Janeen Soria
Last modified June 7, 2018
*/

import java.util.ArrayList;

public interface Quizaroo //turn into class and make quizzes extend?
{
  public void quizQuestions();

  public void wordBox();

  public void inputAnswers();

  public ArrayList grade();

  //public int corrections();

  //public ArrayList retakeQuiz(); //retake quiz or take other, make it void?
}
