package com.example.demo.state;

import com.example.demo.constants.Site;

public class Item {

  private State state;
  private String itemId;

  private Site site;

  public Item(String itemId, Site site) {
    this.itemId = itemId;
    this.site = site;
  }

  public Site getSite() {
    return site;
  }

  public State getState() {
    return state;
  }

  public String getItemId() {
    return itemId;
  }

  public void setState(State state) {
    this.state = state;
  }
}
