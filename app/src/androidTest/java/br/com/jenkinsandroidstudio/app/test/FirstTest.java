package br.com.jenkinsandroidstudio.app.test;

import android.test.InstrumentationTestCase;
import android.test.suitebuilder.annotation.SmallTest;

public class FirstTest extends InstrumentationTestCase {

    @SmallTest
    public void testFirst() {
        assertTrue("Hello World".equals("Hello World"));
    }
}
