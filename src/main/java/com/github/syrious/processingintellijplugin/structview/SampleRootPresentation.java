package com.github.syrious.processingintellijplugin.structview;

import com.github.syrious.processingintellijplugin.PdeIcons;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class SampleRootPresentation implements ItemPresentation {
	protected final PsiFile element;

	protected SampleRootPresentation(PsiFile element) {
		this.element = element;
	}

	@Nullable
	@Override
	public Icon getIcon(boolean unused) {
		return PdeIcons.FILE;
	}

	@Nullable
	@Override
	public String getPresentableText() {
		return element.getVirtualFile().getNameWithoutExtension();
	}

	@Nullable
	@Override
	public String getLocationString() {
		return null;
	}
}
