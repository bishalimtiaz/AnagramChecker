import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {

    @Test
    public void anagramChecker(){
        String s1="bleat";
        String s2="table";
        boolean actual = Anagram.areAnagram(s1,s2);
        boolean expected = true;
        Assert.assertEquals(actual,expected);
    }
}
