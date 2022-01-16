import org.junit.Test;

import static org.junit.Assert.*;

public class QuizTest {

    @Test
    public void displayAnswer() {
        Quiz quiz = new Quiz();
        quiz.displayAnswer();
    }

    @Test
    public void nextQuestion() {
        Quiz quiz = new Quiz();
        quiz.nextQuestion();
    }

}