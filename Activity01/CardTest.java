package Activity01;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CardTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CardTest
{
    /**
     * Default constructor for test class CardTest
     */
    public CardTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testSuit()
    {
        Activity01.Card card1 = new Activity01.Card("four", "hearts", 4);
        assertEquals("hearts", card1.suit());
    }

    @Test
    public void testRank()
    {
        Activity01.Card card1 = new Activity01.Card("7", "spades", 7);
        assertEquals("7", card1.rank());
    }

    @Test
    public void testPointValue()
    {
        Activity01.Card card1 = new Activity01.Card("king", "diamonds", 13);
        assertEquals(13, card1.pointValue());
    }

    @Test
    public void testMatches()
    {
        Activity01.Card card3 = new Activity01.Card("4", "clubs", 4);
        Activity01.Card card4 = new Activity01.Card("jack", "diamonds", 11);
        assertEquals(false, card3.matches(card4));
        
        Activity01.Card card5 = new Activity01.Card("6", "hearts", 6);
        Activity01.Card card6 = new Activity01.Card("6", "hearts", 6);
        assertEquals(true, card3.matches(card4));
    }
}




