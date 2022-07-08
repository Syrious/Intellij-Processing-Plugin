package com.github.syrious.processingintellijplugin.psi;

import com.github.syrious.processingintellijplugin.PdeFileType;
import com.github.syrious.processingintellijplugin.PdeIcons;
import com.github.syrious.processingintellijplugin.PdeLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import org.antlr.intellij.adaptor.SymtabUtils;
import org.antlr.intellij.adaptor.psi.ScopeNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class PdePSIFileRoot extends PsiFileBase implements ScopeNode {
    public PdePSIFileRoot(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, PdeLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return PdeFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Sample Language file";
    }

    @Override
    public Icon getIcon(int flags) {
        return PdeIcons.FILE;
    }

	/** Return null since a file scope has no enclosing scope. It is
	 *  not itself in a scope.
	 */
	@Override
	public ScopeNode getContext() {
		return null;
	}

	@Nullable
	@Override
	public PsiElement resolve(PsiNamedElement element) {
//		System.out.println(getClass().getSimpleName()+
//		                   ".resolve("+element.getName()+
//		                   " at "+Integer.toHexString(element.hashCode())+")");
		if ( element.getParent() instanceof CallSubtree ) {
			return SymtabUtils.resolve(this, PdeLanguage.INSTANCE,
			                           element, "/script/function/ID");
		}
		return SymtabUtils.resolve(this, PdeLanguage.INSTANCE,
		                           element, "/script/vardef/ID");
	}
}
