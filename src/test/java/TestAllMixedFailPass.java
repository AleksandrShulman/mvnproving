import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * Created by aleks on 7/13/16.
 */
public class TestAllMixedFailPass {
    @Test
    public void testFail1() {

        System.out.println("Parent Module: This test will fail");
    }

    @Test
    public void testFail2() {
        System.out.println("Parent Module: This test will also fail");
        fail("We failed.");
    }
}
