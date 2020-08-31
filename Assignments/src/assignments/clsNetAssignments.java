/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;

import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 *
 * @author Sanele
 */
public class clsNetAssignments extends JDialog {
    public clsNetAssignments() {
        super(null, "Networking Assignments", Dialog.ModalityType.APPLICATION_MODAL);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        mCreateNetWindow();
        this.setVisible(true);    
    }   
    
    private void mCreateNetWindow() {
        JPanel jpPanel = new JPanel(new BorderLayout(10, 20));
        jpPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        jpPanel.setOpaque(true);
        jpPanel.setBackground(new Color(0, 204, 204));
        jpPanel.add(mCreateWindow());
        this.add(jpPanel);
    }
    
    private JPanel mCreateWindow() {
        JPanel jpPanel = new JPanel(new GridBagLayout());
        jpPanel.setBorder(new EmptyBorder(20, 20, 40, 20));
        jpPanel.setOpaque(true);
        jpPanel.setBackground(new Color(255, 255, 255));
        clsMainWindow.mAddComponent(jpPanel, new clsMainWindow().mCreateButton(87, 104, new ImageIcon(this.getClass().getResource("assignmentIcon.PNG")), 
                this::mOpenAssgnmt),
                0, 0, 2, 2, 0, 0, GridBagConstraints.NONE, GridBagConstraints.LINE_START, 
                new Insets(0, 0, 0, 0));
        clsMainWindow.mAddComponent(jpPanel, new clsMainWindow().mCreateLabel("HPRXN3B161.pdf", 100, 20, Color.BLACK, 
                Color.WHITE), 0, 2, 2, 1, 0, 0, GridBagConstraints.NONE, 
                GridBagConstraints.LINE_START, new Insets(0, 0, 0, 0));
        clsMainWindow.mAddComponent(jpPanel, new clsMainWindow().mCreateButton(87, 104, new ImageIcon(this.getClass().getResource("assignmentIcon.PNG")), 
                    this::mOpenHPRXN3B161Temp), 4, 0, 2, 1, 0, 0, GridBagConstraints.NONE, GridBagConstraints.LINE_START, 
                new Insets(10, 10, 10, 40));
            clsMainWindow.mAddComponent(jpPanel, new clsMainWindow().mCreateLabel("HPRXN-Temp", 100, 20, Color.BLACK, 
                Color.WHITE), 4, 2, 2, 1, 0, 0, GridBagConstraints.NONE, 
                GridBagConstraints.LINE_START, new Insets(10, 10, 10, 10));
        return jpPanel;
    }
    
    private void mOpenAssgnmt(ActionEvent e) {
        File flPath = new File("C:\\Users\\Sanele\\Documents\\Information Technology\\Java OOP\\Java 2_Programs With GUI\\Assignments\\assignments\\Third Year Assignment\\HPRXN3B161_SA-July-Dec2020-SA-TSS-V.2-17072020.pdf");
        this.hide();
        new clsPdfViewer(flPath.getAbsoluteFile()).toFront();
    }
    
    private void mOpenHPRXN3B161Temp(ActionEvent e) {
        try {
            File fl = new File("C:\\Users\\Sanele\\Documents\\Information Technology\\Java OOP\\Java 2_Programs With GUI\\Assignments\\assignments\\Third Year Assignment\\WrittenReport_Template-HPRXN3B161_SA-July-Dec2020-SA-TSS-V.2-17072020.docx");
            Runtime.getRuntime().exec("cmd.exe /c start soffice.exe \""+fl.getAbsoluteFile());
        } catch(IOException eX) {
            JOptionPane.showMessageDialog(null, eX);
        }
    }
}
