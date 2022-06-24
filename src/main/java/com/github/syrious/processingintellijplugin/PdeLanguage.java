package com.github.syrious.processingintellijplugin;

import com.intellij.lang.Language;

public class PdeLanguage extends Language {
  public static final PdeLanguage INSTANCE = new PdeLanguage();

  protected PdeLanguage() {
    super("PDE");
  }
}
