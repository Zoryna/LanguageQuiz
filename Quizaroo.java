/*
Interface for LanguageQuiz class
A quiz game to help teach
basic Spanish and Italian

Coded by Janeen Soria
Last modified May 16, 2018

*/

import java.List;
import java.util.Arrays;

public Interface Quizaroo
{
  ArrayList inputAnswers();

  int score();

  ArrayList answerSheet();

  ArrayList corrections();

  ArrayList retakeQuiz();
}
