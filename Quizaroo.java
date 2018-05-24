/*
Interface for language quiz classes
A quiz game to help teach
basic Spanish and Italian

Coded by Janeen Soria
Last modified May 23, 2018
*/

import java.util.ArrayList;

public interface Quizaroo
{
  public ArrayList quizQuestions();

  public ArrayList wordBox();

  public ArrayList inputAnswers();

  public ArrayList answerSheet();

  public int score();

  //public ArrayList corrections();

  //public ArrayList retakeQuiz(); //make it void?
}
