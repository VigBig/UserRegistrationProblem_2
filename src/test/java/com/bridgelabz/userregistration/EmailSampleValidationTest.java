package com.bridgelabz.userregistration;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class EmailSampleValidationTest {
    private String emailSample;
    private boolean expectedResult;

    public EmailSampleValidationTest(String emailSample, boolean expectedResult) {
        this.emailSample = emailSample;
        this.expectedResult = expectedResult;
    }


    @Parameterized.Parameters
    public static Collection emailSampleList() {
        return Arrays.asList(new Object[][]{{"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"ab@gmail.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc..2002@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false}
        });

    }

    @Test
    public void testValidAndInvalidEmailSamples() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.email(this.emailSample);
        assertEquals("Email", this.expectedResult, result);
    }

}