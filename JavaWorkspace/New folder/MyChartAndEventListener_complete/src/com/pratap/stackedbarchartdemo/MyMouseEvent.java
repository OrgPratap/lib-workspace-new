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

	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x_axis=e.getX();
		y_axis=e.getY();
		System.out.println(x_axis+","+y_axis);
		Graphics g=chartPanel.getGraphics();
		g.drawLine(x_axis, 0, x_axis, chartPanel.getHeight());
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
}
