package com.github.syrious.processingintellijplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class PdeFileType extends LanguageFileType {
  public static final String FILE_EXTENSION = "pde";
  public static final PdeFileType INSTANCE = new PdeFileType();

  protected PdeFileType() {
    super(PdeLanguage.INSTANCE);
  }

  @Override
  @NotNull
  public @NonNls String getName() {
    return "Pde File";
  }

  @Override
  @NotNull
  public String getDescription() {
    return "Processing file";
  }

  @Override
  @NotNull
  public String getDefaultExtension() {
    return FILE_EXTENSION;
  }

  @Override
  @Nullable
  public Icon getIcon() {
    return PdeIcons.FILE;
  }
}
