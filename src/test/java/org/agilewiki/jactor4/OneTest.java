package org.agilewiki.jactor4;

import junit.framework.TestCase;

public class OneTest extends TestCase {
    public void test1() {
        One one = new One();
		System.out.println(one.getGreeting());
	}
}