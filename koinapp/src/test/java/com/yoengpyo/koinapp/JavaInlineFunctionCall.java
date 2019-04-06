package com.yoengpyo.koinapp;

import org.junit.Test;

public class JavaInlineFunctionCall {
    @Test
    public void testPrint(){
        KotlinInlineFunctionTest testClass = new KotlinInlineFunctionTest();
        testClass.stringPrint("ASDF");
        testClass.stringPrintToParameter("ASDF", "text message");
    }
}
