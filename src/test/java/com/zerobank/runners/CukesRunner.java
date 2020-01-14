package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/features",//path to features
            glue = "com/zerobank/stepdefinitions",//path to step definitions
            dryRun = true,//it given by default it checks your test step s have code implementation or not
            //if you write true you can not run your code
            tags = " @InValid_Pay_Operation",
            plugin = {"html:target/default-cucumber-reports","json:target/cucumber.json"}
    )
    public class CukesRunner {

}
