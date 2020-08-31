/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author Sanele
 */
public class clsSyDevAssignments extends JFrame{
    public clsSyDevAssignments() {
        this.setTitle("Systems Development Assignments");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        mCreateSyDevWindow();
        this.setVisible(true);
    }
    
    private void mCreateSyDevWindow() {
        JPanel jpPanel = new JPanel(new BorderLayout(10, 20));
        jpPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        jpPanel.setOpaque(true);
        jpPanel.setBackground(new Color(0, 204, 204));
        jpPanel.add(mCreateWindow());
        this.add(jpPanel);
    }
        private JLabel mCreateLabel(String strText, int intWidth, int intHeight,
            Color clrFg, Color clrBg) {
        JLabel lblLabel = new JLabel(strText);
        lblLabel.setHorizontalAlignment(JLabel.CENTER);
        lblLabel.setOpaque(true);
        lblLabel.setBackground(clrBg);
        lblLabel.setForeground(clrFg);
        lblLabel.setPreferredSize(new Dimension(intWidth, intHeight));
        return lblLabel;
    }
    
    private JButton mCreateButton(int intWidth, int intHeight,
            ImageIcon imgIcon, ActionListener listener) {
        JButton btnButton = new JButton(imgIcon);
        btnButton.addActionListener(listener);
        btnButton.setPreferredSize(new Dimension(intWidth, intHeight));
        return btnButton;
    }
    
    private JPanel mCreateWindow() {
        JPanel jpPanel = new JPanel(new GridBagLayout());
        jpPanel.setBorder(new EmptyBorder(20, 20, 40, 20));
        jpPanel.setOpaque(true);
        jpPanel.setBackground(new Color(255, 255, 255));
        clsMainWindow.mAddComponent(jpPanel, mCreateButton(87, 104, new ImageIcon(this.getClass().getResource("assignmentIcon.PNG")), 
                this::mOpenFirstYearAssignmentWindow), 0, 0, 2, 2, 0, 0, 
                GridBagConstraints.NONE, GridBagConstraints.LINE_START, 
                new Insets(10, 0, 10, 10));
        clsMainWindow.mAddComponent(jpPanel, mCreateLabel("First Year", 80, 20, Color.BLACK, 
                Color.WHITE), 0, 2, 2, 1, 0, 0, GridBagConstraints.NONE, 
                GridBagConstraints.LINE_START, new Insets(0, 0, 0, 0));
        clsMainWindow.mAddComponent(jpPanel, mCreateButton(87, 104, new ImageIcon(this.getClass().getResource("assignmentIcon.PNG")), 
                this::mOpenSecondYearAssignmentWindow), 4, 0, 2, 2, 0, 0, 
                GridBagConstraints.NONE, GridBagConstraints.LINE_START, 
                new Insets(10, 0, 10, 10));
        clsMainWindow.mAddComponent(jpPanel, mCreateLabel("Second Year", 80, 20, Color.BLACK, 
                Color.WHITE), 4, 2, 2, 1, 0, 0, GridBagConstraints.NONE, 
                GridBagConstraints.LINE_START, new Insets(10, 10, 10, 10));
        clsMainWindow.mAddComponent(jpPanel, mCreateButton(87, 104, new ImageIcon(this.getClass().getResource("assignmentIcon.PNG")), 
                this::mOpenThirdYearAssignmentWindow),
                8, 0, 2, 2, 0, 0, GridBagConstraints.NONE, GridBagConstraints.LINE_START, new Insets(10, 0, 10, 10));
        clsMainWindow.mAddComponent(jpPanel, mCreateLabel("Third Year", 80, 20, Color.BLACK, Color.WHITE), 8, 2, 2, 2, 0, 0, 
                GridBagConstraints.NONE, GridBagConstraints.LINE_START, new Insets(10, 10, 10, 10));
        return jpPanel;
    }
    
    private void mOpenFirstYearAssignmentWindow(ActionEvent e) {
        clsFirstYear clsFirstYr = new clsFirstYear();
    }
    
    private void mOpenSecondYearAssignmentWindow(ActionEvent e) {
        clsSecondYearAssignments cls2ndYr = new clsSecondYearAssignments();
    }
    
    private void mOpenThirdYearAssignmentWindow(ActionEvent e) {
        clsThirdYearAssignments cls3rdYr = new clsThirdYearAssignments();
    }
    
    class clsFirstYear extends JDialog {
        public clsFirstYear() {
            super(null, "First Year Assignments", Dialog.ModalityType.APPLICATION_MODAL);
            this.setSize(400, 400);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            mCreateFrstYrWindow();
            this.setVisible(true);
        }
        
        private void mCreateFrstYrWindow() {
            JPanel jpPanel = new JPanel(new BorderLayout(10, 20));
            jpPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
            jpPanel.setOpaque(true);
            jpPanel.setBackground(new Color(0, 204, 204));
            jpPanel.add(mCreateFirstYearAssignmentWindow());
            this.add(jpPanel);
        }        
        
        private JPanel mCreateFirstYearAssignmentWindow() {
            JPanel jpPanel = new JPanel(new GridBagLayout());
            jpPanel.setBorder(new EmptyBorder(20, 20, 40, 20));
            jpPanel.setOpaque(true);
            jpPanel.setBackground(new Color(255, 255, 255));
            clsMainWindow.mAddComponent(jpPanel, new clsMainWindow().mCreateButton(87, 104, new ImageIcon(this.getClass().getResource("assignmentIcon.PNG")), 
                    this::mOpenAssgnmt),
                0, 0, 2, 2, 0, 0, GridBagConstraints.NONE, GridBagConstraints.LINE_START, 
                new Insets(10, 0, 10, 10));
            clsMainWindow.mAddComponent(jpPanel, new clsMainWindow().mCreateLabel("Java 2.pdf", 100, 20, Color.BLACK, 
                Color.WHITE), 0, 2, 2, 1, 0, 0, GridBagConstraints.NONE, 
                GridBagConstraints.LINE_START, new Insets(0, 0, 0, 0));
            clsMainWindow.mAddComponent(jpPanel, new clsMainWindow().mTable(new File("C:\\Users\\Sanele\\Documents\\Information Technology\\Java OOP\\Java 2_Programs With GUI\\Assignments\\assignments\\First Year Assignment\\Dates.txt").getAbsoluteFile()),
                4, 0, 4, 4, 0, 0, GridBagConstraints.NONE, GridBagConstraints.LINE_START, new Insets(10, 10, 10, 10));
            return jpPanel;
        }
        
        private void mOpenAssgnmt(ActionEvent e) {
            File flPath = new File("C:\\Users\\Sanele\\Documents\\Information Technology\\Java OOP\\Java 2_Programs With GUI\\Assignments\\assignments\\First Year Assignments\\Java Project 2 Assignment.pdf");
            this.hide();
            new clsPdfViewer(flPath.getAbsoluteFile()).toFront();
        }
    }
    
    class clsSecondYearAssignments extends JDialog{
        public clsSecondYearAssignments() {
            super(null, "Second Year Assignments", Dialog.ModalityType.APPLICATION_MODAL);
            this.setSize(400, 400);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            mCreate2ndYrWindow();
            this.setVisible(true);
        }
        
        private void mCreate2ndYrWindow() {
            JPanel jpPanel = new JPanel(new BorderLayout(10, 20));
            jpPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
            jpPanel.setOpaque(true);
            jpPanel.setBackground(new Color(0, 204, 204));
            jpPanel.add(mCreateSecondYearAssignmentWindow());
            this.add(jpPanel);
        }
        
        private JPanel mCreateSecondYearAssignmentWindow() {
            JPanel jpPanel = new JPanel(new GridBagLayout());
            jpPanel.setBorder(new EmptyBorder(20, 20, 40, 20));
            jpPanel.setOpaque(true);
            jpPanel.setBackground(new Color(255, 255, 255));
            clsMainWindow.mAddComponent(jpPanel, new clsMainWindow().mCreateButton(87, 104, new ImageIcon(this.getClass().getResource("assignmentIcon.PNG")), 
                    this::mOpenAssgnmt),
                0, 0, 2, 2, 0, 0, GridBagConstraints.NONE, GridBagConstraints.LINE_START, 
                new Insets(10, 0, 10, 10));
            clsMainWindow.mAddComponent(jpPanel, new clsMainWindow().mCreateLabel("HPXS200-FA1.pdf", 100, 20, Color.BLACK, 
                Color.WHITE), 0, 2, 2, 1, 0, 0, GridBagConstraints.NONE, 
                GridBagConstraints.LINE_START, new Insets(0, 0, 0, 0));
            clsMainWindow.mAddComponent(jpPanel, new clsMainWindow().mTable(new File("C:\\Users\\Sanele\\Documents\\Information Technology\\Java OOP\\Java 2_Programs With GUI\\Assignments\\assignments\\Second Year Assignment\\Dates.txt").getAbsoluteFile()),
                4, 0, 4, 4, 0, 0, GridBagConstraints.NONE, GridBagConstraints.LINE_START, new Insets(10, 10, 10, 10));
            return jpPanel;
        }
        
        private void mOpenAssgnmt(ActionEvent e) {
            File flPath = new File("C:\\Users\\Sanele\\Documents\\Information Technology\\Java OOP\\Java 2_Programs With GUI\\Assignments\\assignments\\Second Year Assignments\\HPXS200-1-July-Dec2020-FA1-CMu-V2-08052020 (1).pdf");
            this.hide();
            new clsPdfViewer(flPath.getAbsoluteFile()).toFront();
        }
    }
    
    class clsThirdYearAssignments extends JDialog {
        public clsThirdYearAssignments() {
            super(null, "Third Year Assignments", Dialog.ModalityType.APPLICATION_MODAL);
            this.setSize(500, 400);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            mCreate3rdYrWindow();
            this.setVisible(true);
        }
        
        private void mCreate3rdYrWindow() {
            JPanel jpPanel = new JPanel(new BorderLayout(10, 20));
            jpPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
            jpPanel.setOpaque(true);
            jpPanel.setBackground(new Color(0, 204, 204));
            jpPanel.add(mCreateThirdYearAssignmentWindow());
            this.add(jpPanel);
        }
        
        private JPanel mCreateThirdYearAssignmentWindow() {
            JPanel jpPanel = new JPanel(new GridBagLayout());
            jpPanel.setBorder(new EmptyBorder(10, 10, 20, 10));
            jpPanel.setOpaque(true);
            jpPanel.setBackground(new Color(255, 255, 255));
            clsMainWindow.mAddComponent(jpPanel, new clsMainWindow().mCreateButton(87, 104, new ImageIcon(this.getClass().getResource("assignmentIcon.PNG")), 
                    this::mOpenAssgnmt1), 0, 0, 2, 2, 0, 0, GridBagConstraints.NONE, GridBagConstraints.LINE_START, 
                new Insets(0, 0, 10, 0));
            clsMainWindow.mAddComponent(jpPanel, new clsMainWindow().mCreateLabel("HPRXS3B161.pdf", 100, 20, Color.BLACK, 
                Color.WHITE), 0, 2, 2, 1, 0, 0, GridBagConstraints.NONE, 
                GridBagConstraints.LINE_START, new Insets(0, 0, 40, 0));
            return jpPanel;
        }
        
        private void mOpenAssgnmt(ActionEvent e) {
            File flPath = new File("C:\\Users\\Sanele\\Documents\\Information Technology\\Java OOP\\Java 2_Programs With GUI\\Assignments\\assignments\\Third Year Assignment\\HPRXN3B161_SA-July-Dec2020-SA-TSS-V.2-17072020.pdf");
            this.hide();
            new clsPdfViewer(flPath.getAbsoluteFile()).toFront();
        }
        
        private void mOpenAssgnmt1(ActionEvent e) {
            File flPath = new File("C:\\Users\\Sanele\\Documents\\Information Technology\\Java OOP\\Java 2_Programs With GUI\\Assignments\\assignments\\Third Year Assignment\\HPRXS3B161-Jul-Dec2020-FA1-RM-V2-29052020-1.pdf");
            this.hide();
            new clsPdfViewer(flPath.getAbsoluteFile()).toFront();
        }
    }
}
