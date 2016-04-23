import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JamesBondTest</code> contains tests for the class <code>{@link JamesBond}</code>.
 *
 * @generatedBy CodePro at 4/22/16 10:21 PM
 * @author vadesanmi
 * @version $Revision: 1.0 $
 */
public class JamesBondTest {
	private JamesBond s;
	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/22/16 10:21 PM
	 */
	@Before
	public void setUp()
		
		throws Exception {
		// add additional set up code here
		s = new JamesBond();
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/22/16 10:21 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}
	@Test
	public void trueTest(){
		assertFalse(s.bondRegex(""));
	}
	@Test
	public void trueTest1(){
		assertFalse(s.bondRegex("*3422"));
	}
	@Test
	public void trueTest2(){
		assertTrue(s.bondRegex("*(*007*)*"));
	}
	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/22/16 10:21 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JamesBondTest.class);
	}
}