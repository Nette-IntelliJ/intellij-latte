package com.jantvrdik.intellij.latte.psi.elements;

public interface LattePhpClassUsageElement extends BaseLattePhpElement {

	public abstract String getClassName();

	public boolean isTemplateType();

	//public void reset();

}