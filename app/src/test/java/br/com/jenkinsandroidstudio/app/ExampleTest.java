package br.com.jenkinsandroidstudio.app;

import android.app.Activity;
import android.widget.TextView;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

public class ExampleTest {

    @Test
    public void assertNumbers() throws Exception {
        final int expected = 1;
        final int reality = 5;
        assertEquals(expected, reality);
    }

    @Test
    public void wasThatABanana() {
        Activity activity = new Activity();
        TextView textView = new TextView(activity);
        assertEquals("A Banana", textView);
    }

    @Test
    public void wasThatBehaveABanana() {
        Activity activity = new Activity();
        TextView textView = new TextView(activity);
        TextView mockedTextView = spy(textView);
        doReturn("A Banana").when(mockedTextView).getText();
        assertEquals("A Banana", mockedTextView.getText());
    }
}
