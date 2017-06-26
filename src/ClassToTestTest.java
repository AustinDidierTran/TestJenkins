import static org.junit.Assert.*;

/**
 * Created by valentin on 6/26/17.
 */
public class ClassToTestTest {
    @org.junit.Test
    public void add() throws Exception {
        assert ClassToTest.Add(1, 2) == 3;
    }

}