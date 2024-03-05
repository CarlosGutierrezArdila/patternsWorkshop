package com.example.demo.state;

public class YellowState extends State{

  public static final String name = "yellow";
  public YellowState(Item item) {
    super(item);
  }

  @Override
  public String onGreen() {
    return null;
  }

  @Override
  public String onYellow() {
    return null;
  }

  @Override
  public String onRed() {
    return item.getSite().getLanguageStrategy().yellowToRed();
  }

  @Override
  public String getName() {
    return name;
  }
}
