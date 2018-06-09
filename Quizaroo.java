/*
Interface for language quiz classes
A quiz game to help teach
basic Spanish and Italian

Coded by Janeen Soria
Last modified June 8, 2018
*/

import java.util.ArrayList;

public interface Quizaroo //turn into class and make quizzes extend?
{
  public void questionsAndOptions();

  public void inputAnswers();

  public int grade();

  public int corrections();
}
