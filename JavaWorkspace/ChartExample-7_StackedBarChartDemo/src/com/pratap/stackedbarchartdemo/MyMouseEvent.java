package com.pratap.stackedbarchartdemo;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

class MouseEventHandler implements MouseListener,MouseMotionListener
{
	private JFreeChart chart;
	private ChartPanel chartPanel;
	private int x_axis;
	private int y_axis;

	public MouseEventHandler(JFreeChart chart, ChartPanel chartPanel) 
	{
		this.chart=chart;
		this.chartPanel=chartPanel;
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) 
	{
		/**
		x_axis=e.getX();
		y_axis=e.getY();
		System.out.println(x_axis+","+y_axis);
		Graphics g=chartPanel.getGraphics();
		g.drawLine(x_axis, 0, x_axis, chartPanel.getHeight());
		**/
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e)
	{
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) 
	{
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) 
	{
		x_axis=e.getX();
		y_axis=e.getY();
		System.out.println(x_axis+","+y_axis);
		Graphics g=chartPanel.getGraphics();
		g.drawLine(x_axis, 0, x_axis, chartPanel.getHeight());
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) 
	{
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void mouseMoved(MouseEvent e) 
	{
			
	}
	
}
