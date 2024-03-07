package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testPushPopOperation() {
        myStack<Integer> stackList = new myStack<>();
        stackList.push(7);
        assertEquals(7, stackList.pop().intValue());
    }

    public void testDelegate() {
        myStack<Integer> delegateList = new myStack<>();
        delegateList.push(10);
        assertEquals(10, delegateList.pop().intValue());
    }

    public void testDelegateWithoutArrayListExtension() {
        myStack<Integer> delegationList = new myStack<>();
        delegationList.push(18);
        assertEquals(18, delegationList.pop().intValue());
    }
}
