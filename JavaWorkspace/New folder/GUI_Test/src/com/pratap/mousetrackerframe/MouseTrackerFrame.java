package com.pratap.mousetrackerframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseTrackerFrame extends JFrame
{
 private JPanel mousePanel;
 private JLabel statusBar;
 
 public MouseTrackerFrame() 
 {
  super("Testing mouse events");
  //setLayout(new FlowLayout());
  
  mousePanel=new JPanel();
  mousePanel.setBackground(Color.GRAY);
  add(mousePanel,BorderLayout.CENTER);
  
  statusBar=new JLabel("Mouse Pointer Outside");
  add(statusBar,BorderLayout.SOUTH);
  
  MouseHandler handler=new MouseHandler();
  mousePanel.addMouseListener(handler);
  mousePanel.addMouseMotionListener(handler);
 }
 
 private class MouseHandler implements MouseListener,MouseMotionListener
 {

   @Override
  public void mouseClicked(MouseEvent mouseEvent) 
  {
   statusBar.setText(String.format("clicked at [ %d , %d ] ", mouseEvent.getX(),mouseEvent.getY())); 
  }

   @Override
  public void mouseEntered(MouseEvent mouseEvent) 
  {
   statusBar.setText(String.format("mouse entered at [ %d , %d ]",mouseEvent.getX(),mouseEvent.getY()));
   mousePanel.setBackground(Color.RED);
  }

   @Override
  public void mouseExited(MouseEvent mouseEvent) 
  {
   statusBar.setText("Mouse is Outside");
   mousePanel.setBackground(Color.BLUE);
  }

   @Override
  public void mousePressed(MouseEvent mouseEvent) 
  {
   statusBar.setText(String.format("Mouse Pressed at [ %d , %d ]",mouseEvent.getX(),mouseEvent.getY()));
  }

   @Override
  public void mouseReleased(MouseEvent mouseEvent) 
  {
   statusBar.setText(String.format("Mouse Released at [ %d , %d ]",mouseEvent.getX(),mouseEvent.getY()));
  }

   @Override
  public void mouseDragged(MouseEvent mouseEvent) 
  {
   statusBar.setText(String.format("Mouse Dragged at [ %d , %d ]",mouseEvent.getX(),mouseEvent.getY()));
  }

   @Override
  public void mouseMoved(MouseEvent mouseEvent) 
  {
   statusBar.setText(String.format("Mouse Moved at [ %d , %d ]",mouseEvent.getX(),mouseEvent.getY()));
  }
 }
}
