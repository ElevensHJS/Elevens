package Activity02;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DeckTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */

public class DeckTest

{
    /**
     * Default constructor for test class DeckTest
     */
    public DeckTest()
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
    public void testIsEmpty()
    {
        Activity02.Deck deck1 = new Activity02.Deck(new String[]{"king"}, new String[]{"clubs"}, new int[]{13});
        assertEquals(false, deck1.isEmpty());
    }

    @Test
    public void testSize()
    {
        Activity02.Deck deck2 = new Activity02.Deck(new String[]{"ace"}, new String[]{"spades"}, new int[]{1});
        assertEquals(1, deck2.size());

    }
   
    @Test
    public void testCardDeal()
    {
        Activity02.Deck deck3 = new Activity02.Deck(new String[]{"7"}, new String[]{"diamonds"}, new int[]{7});
        assertSame(deck3, deck3.deal());
    }
    
}
