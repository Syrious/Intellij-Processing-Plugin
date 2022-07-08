package com.github.syrious.processingintellijplugin.structview;

import com.github.syrious.processingintellijplugin.PdeIcons;
import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class SampleItemPresentation implements ItemPresentation {
	protected final PsiElement element;

	protected SampleItemPresentation(PsiElement element) {
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
		ASTNode node = element.getNode();
		return node.getText();
	}

	@Nullable
	@Override
	public String getLocationString() {
		return null;
	}
}
