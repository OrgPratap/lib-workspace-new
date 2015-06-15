package com.pratap.stackedbarchartdemo;

import org.jfree.ui.RefineryUtilities;

public class StackedBarChartDemo 
{
	public static void main(String[] args) 
	{
		MyStackedBarChart msbc= new MyStackedBarChart("org.pratap-StackedBarChartDemo");
		msbc.pack();
		RefineryUtilities.centerFrameOnScreen(msbc);
		msbc.setVisible(true);
	}
}
