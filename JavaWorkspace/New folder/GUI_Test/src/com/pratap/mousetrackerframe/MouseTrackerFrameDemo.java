package com.pratap.mousetrackerframe;

import javax.swing.JFrame;

public class MouseTrackerFrameDemo 
{
 public static void main(String[] args) 
 {
  MouseTrackerFrame mtf=new MouseTrackerFrame();
  mtf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  mtf.setSize(400, 300);
  mtf.setVisible(true);
 }
}