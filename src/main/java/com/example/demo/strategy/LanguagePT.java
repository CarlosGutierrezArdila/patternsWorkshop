package com.example.demo.strategy;

public class LanguagePT implements LanguageStrategy{
  @Override
  public String greenToYellow() {
    return "Seu item %s perdeu exposição no site, não estará mais visível para nenhum comprador.";
  }

  @Override
  public String greenToRed() {
    return "Seu item %s está perdendo exposição no site, caso o número de cancelamentos, devoluções ou reclamações não seja reduzido, este item não estará mais visível para nenhum comprador no futuro.";
  }

  @Override
  public String yellowToRed() {
    return "Seu item que estava causando problemas no %s perdeu permanentemente a exposição no site e não estará mais visível para nenhum comprador.";
  }
}
