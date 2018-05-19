/*
Interface for LanguageQuiz class
A quiz game to help teach
basic Spanish and Italian

Coded by Janeen Soria
Last modified May 18, 2018

*/

import java.util.ArrayList;
import java.util.Arrays;

public interface Quizaroo
{
  public ArrayList quizQuestions();

  public ArrayList inputAnswers();

  public ArrayList answerSheet();

  public int score();

  //public ArrayList corrections();

  //public ArrayList retakeQuiz();
}
