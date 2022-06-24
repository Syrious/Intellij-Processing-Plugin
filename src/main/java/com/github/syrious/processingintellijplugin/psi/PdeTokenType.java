package com.github.syrious.processingintellijplugin.psi;

import com.github.syrious.processingintellijplugin.PdeLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class PdeTokenType extends IElementType {

  public PdeTokenType(@NonNls @NotNull final String debugName) {
    super(debugName, PdeLanguage.INSTANCE);
  }

  @Override
  public String toString() {
    return "PdeTokenType." + super.toString();
  }
}
