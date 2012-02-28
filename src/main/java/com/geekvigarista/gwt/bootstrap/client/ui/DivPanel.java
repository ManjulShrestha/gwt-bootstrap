package com.geekvigarista.gwt.bootstrap.client.ui;

import com.geekvigarista.gwt.bootstrap.client.v2.base.ComplexWidget;
import com.google.gwt.user.client.ui.HasWidgets;

/**
 * Container base for Fixed and fluid layouts and maybe for other components too.
 * 
 * @see FixedLayout
 * @see FluidLayout
 * @see SidebarPanel
 * @see ContentPanel
 * 
 * @author Carlos Alexandro Becker
 * @since 23/01/2012
 */
public class DivPanel extends ComplexWidget implements HasWidgets {

	public DivPanel() {
		super("div");
	}


}
