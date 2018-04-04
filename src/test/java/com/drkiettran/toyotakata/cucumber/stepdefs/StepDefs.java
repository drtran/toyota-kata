package com.drkiettran.toyotakata.cucumber.stepdefs;

import com.drkiettran.toyotakata.ToyotaKataApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ToyotaKataApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
