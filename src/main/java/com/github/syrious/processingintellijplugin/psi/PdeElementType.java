package com.github.syrious.processingintellijplugin.psi;

import com.github.syrious.processingintellijplugin.PdeLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class PdeElementType extends IElementType {
  public PdeElementType(@NonNls @NotNull final String debugName) {
    super(debugName, PdeLanguage.INSTANCE);
  }
}
