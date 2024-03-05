package com.example.demo.state;

public class GreenState extends State{

  public static final String name = "green";

  public GreenState(Item item) {
    super(item);
  }

  @Override
  public String onGreen() {
    return null;
  }

  @Override
  public String onYellow() {
    return item.getSite().getLanguageStrategy().greenToYellow();
  }

  @Override
  public String onRed() {
    return item.getSite().getLanguageStrategy().greenToRed();
  }

  @Override
  public String getName() {
    return name;
  }
}
