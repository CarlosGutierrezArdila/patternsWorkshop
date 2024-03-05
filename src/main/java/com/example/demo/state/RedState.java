package com.example.demo.state;

public class RedState extends State{

  public static final String name = "red";

  public RedState(Item item) {
    super(item);
  }

  @Override
  public String onGreen() {
    return "";
  }

  @Override
  public String onYellow() {
    return null;
  }

  @Override
  public String onRed() {
    return null;
  }

  @Override
  public String getName() {
    return name;
  }
}
