/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pluse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;

import fonction.Ajout;
import fonction.combo_boxtable;
import fonction.conndb1;
import fonction.read_db;



/**
 *
 * @author AK12
 */
@SuppressWarnings("serial")
public class d extends javax.swing.JFrame {

    /**
     * Creates new form article
     */
    public d() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu3.setIcon(new ImageIcon("C:\\Users\\AK12\\Downloads\\localhost _ 127.0.0.1 _ d _ phpMyAdmin 4.5.1_files\\page_add.png"));
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem2.setIcon(new ImageIcon("C:\\Users\\AK12\\Desktop\\swipl.ico"));
        jMenuItem2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		
        new d().setVisible(true);
        	}
        });
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem4.setIcon(new ImageIcon("C:\\Users\\AK12\\Downloads\\localhost _ 127.0.0.1 _ d _ phpMyAdmin 4.5.1_files\\save.png"));
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        jMenu3.setText("new");

        jMenuItem2.setText("article");
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Clsse");
        jMenu3.add(jMenuItem3);

        jMenu1.add(jMenu3);

        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem4.setText("Save");
        jMenu1.add(jMenuItem4);
        jMenu1.add(jSeparator2);

        jMenuItem5.setText("Exit");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
       // jTextField2.
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);
        
        mntmNewMenuItem = new JMenuItem("Retour",'Z');
        mntmNewMenuItem.setIcon(new ImageIcon("C:\\Users\\AK12\\Downloads\\localhost _ 127.0.0.1 _ d _ phpMyAdmin 4.5.1_files\\downarrow1 - Copie (2).png"));
        jMenu2.add(mntmNewMenuItem);
        
        JMenuItem mntmNewMenuItem_5 = new JMenuItem("Retour_Inverce",'Y');
        mntmNewMenuItem_5.setIcon(new ImageIcon("C:\\Users\\AK12\\Downloads\\localhost _ 127.0.0.1 _ d _ phpMyAdmin 4.5.1_files\\downarrow1 - Copie.png"));
        jMenu2.add(mntmNewMenuItem_5);
        
        JSeparator separator_1 = new JSeparator();
        jMenu2.add(separator_1);
        
        mntmNewMenuItem_1 = new JMenuItem("Couper",'X');
        jMenu2.add(mntmNewMenuItem_1);
        
        mntmNewMenuItem_2 = new JMenuItem("Copier",'C');
        jMenu2.add(mntmNewMenuItem_2);
        
        mntmNewMenuItem_3 = new JMenuItem("Coller",'V');
        jMenu2.add(mntmNewMenuItem_3);
        
        JSeparator separator = new JSeparator();
        jMenu2.add(separator);
        
        mntmNewMenuItem_4 = new JMenuItem("New menu item");
        jMenu2.add(mntmNewMenuItem_4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 733, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 426, Short.MAX_VALUE)
        );
        getContentPane().setLayout(layout);

       // pack();
        setSize(745, 481);
    }// </editor-fold>  
    
    
    
    
    
    
    
    

    

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:

        JFileChooser file =new JFileChooser();

        file.showOpenDialog(jMenuItem2);
    }                                          

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:

        System.exit(d.EXIT_ON_CLOSE);
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new d().setVisible(true);
            }
        });
    }
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private JMenuItem mntmNewMenuItem;
    private JMenuItem mntmNewMenuItem_1;
    private JMenuItem mntmNewMenuItem_2;
    private JMenuItem mntmNewMenuItem_3;
    private JMenuItem mntmNewMenuItem_4;
}
