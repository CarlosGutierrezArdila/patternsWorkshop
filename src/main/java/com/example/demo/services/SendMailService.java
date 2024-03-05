package com.example.demo.services;

import com.example.demo.constants.Site;
import com.example.demo.dtos.ChangeStatusRequestDto;
import com.example.demo.state.GreenState;
import com.example.demo.state.Item;
import com.example.demo.state.RedState;
import com.example.demo.state.State;
import com.example.demo.state.YellowState;
import com.example.demo.strategy.EmailSender;

public enum SendMailService {
  INSTANCE;

  public String send(ChangeStatusRequestDto requestDto) {
    Site site = Site.siteFromString(requestDto.getSiteId());
    Item item = new Item(requestDto.getItemId(), site);
    State currentState = stateFromText(requestDto.getCurrentStatus(), item);
    State newState = stateFromText(requestDto.getNewStatus(), item);
    item.setState(currentState);
    EmailSender s = new EmailSender();
    s.setLanguageStrategy(site.getLanguageStrategy());
    return s.sendMail(item, newState);
  }

  private State stateFromText(String state, Item item) {
    switch (state){
      case (GreenState.name):
        return new GreenState(item);
      case (YellowState.name):
        return new YellowState(item);
      case (RedState.name):
        return new RedState(item);
      default:
        throw new RuntimeException("invalid state");
    }
  }

}
