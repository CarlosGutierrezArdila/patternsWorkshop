package com.example.demo.strategy;

public class LanguageES implements LanguageStrategy{
  @Override
  public String greenToYellow() {
    return "Tu item %s ha perdido exposición en el sitio, ya no será visible para ningun comprador.";
  }

  @Override
  public String greenToRed() {
    return "Tu item %s está perdiendo exposición en el sitio, si no se reduce el número de cancelaciones, devoluciones o reclamos de este ítem ya no será visible para ningún comprador en el futuro.";
  }

  @Override
  public String yellowToRed() {
    return "Tu item que traía problemas %s ha perdido exposición en el sitio definitivamente y ya no será visible para ningún comprador.";
  }
}
