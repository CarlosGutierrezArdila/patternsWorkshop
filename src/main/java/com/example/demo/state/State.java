package com.example.demo.state;

public abstract class State {

  Item item;



  public State(Item item) {
    this.item = item;
  }

  public abstract String onGreen();
  public abstract String onYellow();

  public abstract String onRed();

  public abstract String getName();



}
