package com.pratap.stackedbarchartdemo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Paint;

import javax.swing.JOptionPane;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.SubCategoryAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.data.KeyToGroupMap;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.GradientPaintTransformType;
import org.jfree.ui.StandardGradientPaintTransformer;

public class MyStackedBarChart extends ApplicationFrame
{
	private MouseEventHandler mouseEventHandler;
	public MyStackedBarChart(final String title) 
	{
		super(title);
		final CategoryDataset dataset=createDataset();
		final JFreeChart chart=createChart(dataset);
		final ChartPanel chartPanel=new ChartPanel(chart);
		chartPanel.setPreferredSize(new Dimension(590,350));
		setContentPane(chartPanel);
		mouseEventHandler=new MouseEventHandler(chart,chartPanel);
		chartPanel.addMouseListener(mouseEventHandler);
		chartPanel.addMouseMotionListener(mouseEventHandler);
	}

	private JFreeChart createChart(CategoryDataset dataset) 
	{
		final JFreeChart chart=ChartFactory.createStackedBarChart(
						"Stacked Bar Chart Demo (org.pratap)", 
						"Category", 
						"value", 
						dataset,
						PlotOrientation.HORIZONTAL,
						true,
						true,
						false);
		//-------------------------
		
		GroupedStackedBarRenderer renderer = new GroupedStackedBarRenderer();
        KeyToGroupMap map = new KeyToGroupMap("G1");
        map.mapKeyToGroup("Product 1 (US)", "G1");
        map.mapKeyToGroup("Product 1 (Europe)", "G1");
        map.mapKeyToGroup("Product 1 (Asia)", "G1");
        map.mapKeyToGroup("Product 1 (Middle East)", "G1");
        map.mapKeyToGroup("Product 2 (US)", "G2");
        map.mapKeyToGroup("Product 2 (Europe)", "G2");
        map.mapKeyToGroup("Product 2 (Asia)", "G2");
        map.mapKeyToGroup("Product 2 (Middle East)", "G2");
        map.mapKeyToGroup("Product 3 (US)", "G3");
        map.mapKeyToGroup("Product 3 (Europe)", "G3");
        map.mapKeyToGroup("Product 3 (Asia)", "G3");
        map.mapKeyToGroup("Product 3 (Middle East)", "G3");
        renderer.setSeriesToGroupMap(map); 
        
        renderer.setItemMargin(0.0);
        Paint p1=new GradientPaint(0.0f, 0.0f, new Color(0x22, 0x22, 0xff), 0.0f, 0.0f, new Color(0x88, 0x88, 0xff));

        renderer.setSeriesPaint(0, p1);
        renderer.setSeriesPaint(4, p1);
        renderer.setSeriesPaint(8, p1);
         
        Paint p2 = new GradientPaint(
            0.0f, 0.0f, new Color(0x22, 0xFF, 0x22), 0.0f, 0.0f, new Color(0x88, 0xFF, 0x88)
        );
        renderer.setSeriesPaint(1, p2); 
        renderer.setSeriesPaint(5, p2); 
        renderer.setSeriesPaint(9, p2); 
        
        Paint p3 = new GradientPaint(
            0.0f, 0.0f, new Color(0xFF, 0x22, 0x22), 0.0f, 0.0f, new Color(0xFF, 0x88, 0x88)
        );
        renderer.setSeriesPaint(2, p3);
        renderer.setSeriesPaint(6, p3);
        renderer.setSeriesPaint(10, p3);
            
        Paint p4 = new GradientPaint(
            0.0f, 0.0f, new Color(0xFF, 0xFF, 0x22), 0.0f, 0.0f, new Color(0xFF, 0xFF, 0x88)
        );
        renderer.setSeriesPaint(3, p4);
        renderer.setSeriesPaint(7, p4);
        renderer.setSeriesPaint(11, p4);
        renderer.setGradientPaintTransformer(
            new StandardGradientPaintTransformer(GradientPaintTransformType.VERTICAL)
        );
        
        SubCategoryAxis domainAxis = new SubCategoryAxis("Product / Month");
        domainAxis.setCategoryMargin(0.05);
        domainAxis.addSubCategory("Product 1");
        domainAxis.addSubCategory("Product 2");
        domainAxis.addSubCategory("Product 3");
        
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        //plot.setDomainAxis(domainAxis);
        plot.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT);
        plot.setRenderer(renderer);
        plot.setFixedLegendItems(createLegendItems());
		return chart;
	}

	private LegendItemCollection createLegendItems() 
	{

        LegendItemCollection result = new LegendItemCollection();
        return result;
	}

	private CategoryDataset createDataset() 
	{
		DefaultCategoryDataset result=new DefaultCategoryDataset();
		JOptionPane.showMessageDialog(null, "PLEASE ENTER ONLY VALUES EITHER INTEGER OR DOUBLE");
		result.addValue(Double.parseDouble(JOptionPane.showInputDialog("SAMSUNG : JAN-14 : SALES").toString().trim()), "SAMSUNG", "Jan 14");
        result.addValue(Double.parseDouble(JOptionPane.showInputDialog("SAMSUNG : FEB-14 : SALES").toString().trim()), "SAMSUNG", "Feb 14");
        result.addValue(Double.parseDouble(JOptionPane.showInputDialog("SAMSUNG : MAR-14 : SALES").toString().trim()), "SAMSUNG", "Mar 14");
        result.addValue(Double.parseDouble(JOptionPane.showInputDialog("LG : JAN-14 : SALES").toString().trim()), "LG", "Jan 14");
        result.addValue(Double.parseDouble(JOptionPane.showInputDialog("LG : FEB-14 : SALES").toString().trim()), "LG", "Feb 14");
        result.addValue(Double.parseDouble(JOptionPane.showInputDialog("LG : MAR-14 : SALES").toString().trim()), "LG", "Mar 14");
        result.addValue(Double.parseDouble(JOptionPane.showInputDialog("iPhone : JAN-14 : SALES").toString().trim()), "iPhone", "Feb 14");
        result.addValue(Double.parseDouble(JOptionPane.showInputDialog("iPhone : FEB-14 : SALES").toString().trim()), "iPhone", "Mar 14");
        result.addValue(Double.parseDouble(JOptionPane.showInputDialog("iPhone : MAR-14 : SALES").toString().trim()), "iPhone", "Mar 14");
        result.addValue(Double.parseDouble(JOptionPane.showInputDialog("NOKIA : JAN-14 : SALES").toString().trim()), "NOKIA", "Jan 14");
        result.addValue(Double.parseDouble(JOptionPane.showInputDialog("NOKIA : FEB-14 : SALES").toString().trim()), "NOKIA", "Feb 14");
        result.addValue(Double.parseDouble(JOptionPane.showInputDialog("NOKIA : MAR-14 : SALES").toString().trim()), "NOKIA", "Mar 14");
		return result;
	}	
}
