import com.example.MoodAnalyser;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysis() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        String mood = moodAnalyser.analyseMood("This is a sad message.");

        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }

    @Test
    public void testHappyMoods() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        String mood = moodAnalyser.analyseMood("this is a happy message");
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }
}