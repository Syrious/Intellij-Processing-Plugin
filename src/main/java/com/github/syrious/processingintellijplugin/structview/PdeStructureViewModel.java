package com.github.syrious.processingintellijplugin.structview;

import com.github.syrious.processingintellijplugin.psi.PdePSIFileRoot;
import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import org.jetbrains.annotations.NotNull;

public class PdeStructureViewModel
	extends StructureViewModelBase
	implements StructureViewModel.ElementInfoProvider
{
	public PdeStructureViewModel(PdePSIFileRoot root) {
		super(root, new SampleStructureViewRootElement(root));
	}

	@NotNull
	public Sorter[] getSorters() {
		return new Sorter[] {Sorter.ALPHA_SORTER};
	}

	@Override
	public boolean isAlwaysLeaf(StructureViewTreeElement element) {
  		return !isAlwaysShowsPlus(element);
	}

	@Override
	public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
		Object value = element.getValue();
  		return value instanceof PdePSIFileRoot;
	}
}
