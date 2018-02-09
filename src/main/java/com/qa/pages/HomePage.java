package com.qa.pages;
import com.qa.testcases.HomePageTestCase;

public class HomePage {

    HomePageTestCase h = new HomePageTestCase();

    public void main(String[] args) {
        System.out.println("Home Page");

        h.testCase1();
        h.testCase2();
    }
}
