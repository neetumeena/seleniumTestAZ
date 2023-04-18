package com.az.reports;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManager {

    private static final ThreadLocal<ExtentTest> threadLocal = new ThreadLocal<>();

    private ExtentManager() {
    }

    static ExtentTest getExtentTest() {
        return threadLocal.get();
    }

    static void setExtentTest(ExtentTest test) {
        threadLocal.set(test);

    }
}