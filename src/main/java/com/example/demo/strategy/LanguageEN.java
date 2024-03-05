package com.example.demo.strategy;

public class LanguageEN implements LanguageStrategy {
  @Override
  public String greenToYellow() {
    return "Your item %s had lost exposition in the marketplace, it will no longer visible anymore.";
  }

  @Override
  public String greenToRed() {
    return "Your item %s is losing exposition in the marketplace, you should better your cancel / claim  rates and improve the buyer experience in order to be available in the marketplace, otherwise your item will not be visible anymore.";
  }

  @Override
  public String yellowToRed() {
    return "Your previously warned item %s had been lost exposition in the marketplace definitively, it will no longer visible anymore.";
  }
}
