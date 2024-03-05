package com.example.demo.constants;

import com.example.demo.strategy.LanguageStrategy;
import com.example.demo.strategy.LanguageEN;
import com.example.demo.strategy.LanguageES;
import com.example.demo.strategy.LanguagePT;

public enum Site {

  MLB("PT", new LanguagePT()),
  MLA("ES", new LanguageES()),
  MCO("ES", new LanguageES()),
  CBT("EN", new LanguageEN()),
  ;

  private final String language;
  private final LanguageStrategy languageStrategy;

  Site(String language, LanguageStrategy languageStrategy) {
    this.language = language;
    this.languageStrategy = languageStrategy;
  }

  public LanguageStrategy getLanguageStrategy() {
    return languageStrategy;
  }

  public static Site siteFromString(String siteId) {
    for(Site s:values()){
      if (s.name().equalsIgnoreCase(siteId)){
        return s;
      }
    }
    throw new RuntimeException("invalid state");
  }
}
