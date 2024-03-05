package com.example.demo.strategy;

import com.example.demo.state.GreenState;
import com.example.demo.state.Item;
import com.example.demo.state.RedState;
import com.example.demo.state.State;
import com.example.demo.state.YellowState;

public class EmailSender {

  private LanguageStrategy languageStrategy;

  public void setLanguageStrategy(LanguageStrategy languageStrategy) {
    this.languageStrategy = languageStrategy;
  }

  public String sendMail(Item item, State newState) {
    String template = null;
    switch (newState.getName()) {
      case (GreenState.name):
        template = item.getState().onGreen();
        break;
      case (YellowState.name):
        template = item.getState().onYellow();
        break;
      case (RedState.name):
        template = item.getState().onRed();
        break;
    }
    if (template != null) {
      return String.format(template, item.getItemId());
    }
    return "nothing happened";
  }


}
