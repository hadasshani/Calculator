package com.example.hadass.calculator;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.hadass.calculator", appContext.getPackageName());
    }

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void ensureAddWork() {
//        Spoon.screenshot(mainActivityActivityTestRule.getActivity(), "Start", ExampleInstrumentedTest.class.getName(), "ensureTextChangesWork");
//        File f = new File(mainActivityActivityTestRule.getActivity().getCacheDir(), "file.1");
//        try {
//            f.createNewFile();
//            Spoon.save(mainActivityActivityTestule.getActivity(), f);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        // Type 123
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button3)).perform(click());

        // type add
        onView(withId(R.id.buttonadd)).perform(click());

        // 123
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button3)).perform(click());

        // check if equal to 269
        onView(withId(R.id.buttoneql)).perform(click());

        onView(withId(R.id.edt1)).check(matches(withText("246.0")));



//
//        Spoon.screenshot(mainActivityActivityTestRule.getActivity(), "After-input", ExampleInstrumentedTest.class.getName(), "ensureTextChangesWork");


//        Spoon.screenshot(mainActivityActivityTestRule.getActivity(), "After-click", ExampleInstrumentedTest.class.getName(), "ensureTextChangesWork");

        // Check that the text was changed.


//        f = new File(mainActivityActivityTestRule.getActivity().getCacheDir(), "file.2");
//        try {
//            f.createNewFile();
//            Spoon.save(mainActivityActivityTestRule.getActivity(), f);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        Spoon.screenshot(mainActivityActivityTestRule.getActivity(), "End", ExampleInstrumentedTest.class.getName(), "ensureTextChangesWork");
    }


    @Test
    public void ensureDivWork() {
//        Spoon.screenshot(mainActivityActivityTestRule.getActivity(), "Start", ExampleInstrumentedTest.class.getName(), "ensureTextChangesWork");
//        File f = new File(mainActivityActivityTestRule.getActivity().getCacheDir(), "file.1");
//        try {
//            f.createNewFile();
//            Spoon.save(mainActivityActivityTestule.getActivity(), f);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        // Type 12
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button2)).perform(click());

        // type dev
        onView(withId(R.id.buttondiv)).perform(click());

        // 123

        onView(withId(R.id.button3)).perform(click());

        // check if equal to 269
        onView(withId(R.id.buttoneql)).perform(click());

        onView(withId(R.id.edt1)).check(matches(withText("4.0")));



//
//        Spoon.screenshot(mainActivityActivityTestRule.getActivity(), "After-input", ExampleInstrumentedTest.class.getName(), "ensureTextChangesWork");


//        Spoon.screenshot(mainActivityActivityTestRule.getActivity(), "After-click", ExampleInstrumentedTest.class.getName(), "ensureTextChangesWork");

        // Check that the text was changed.


//        f = new File(mainActivityActivityTestRule.getActivity().getCacheDir(), "file.2");
//        try {
//            f.createNewFile();
//            Spoon.save(mainActivityActivityTestRule.getActivity(), f);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        Spoon.screenshot(mainActivityActivityTestRule.getActivity(), "End", ExampleInstrumentedTest.class.getName(), "ensureTextChangesWork");
    }

}
