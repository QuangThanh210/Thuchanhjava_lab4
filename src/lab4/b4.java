/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import javax.swing.JList;


/**
 *
 * @author Administrator
 */
public class b4 extends javax.swing.JFrame {
        
    
        private static final long serialVersionUID=1L;
        public b4(String title){
            setTitle(title);
        }
        public void doShow(){
            setSize(400,300);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            addControl();
            setResizable(false);
            setVisible(true);
        }
         public void addControl(){
            JPanel pnBorder=new JPanel();
            pnBorder.setLayout(new BorderLayout());
            JPanel pnNorth=new JPanel();
            JLabel lblTitle=new JLabel("Thao tác trên JList-CheckBox");
            pnNorth.add(lblTitle);
            pnBorder.add(pnNorth,BorderLayout.NORTH);
            lblTitle.setForeground(Color.BLUE);
            Font ft=new Font("arial",Font.BOLD,25);
            lblTitle.setFont(ft);
            JPanel pnWest=new JPanel();
            pnWest.setLayout(new BoxLayout(pnWest,BoxLayout.Y_AXIS));
            JButton btnTodensochan=new JButton("Tô đen sỗ chẵn");
            JButton btnTodensole=new JButton("Tô đen số lẻ");
            JButton btnTodensnt=new JButton("Tô đen số nguyen tố");
            JButton btnBotoden=new JButton("Bỏ tô đen");
            JButton btnXoacacgttoden=new JButton("Xóa các giá trị đang tô den");
            JButton btnTonggttrongjlist=new JButton("Tổng giá trị trong JList");
            pnWest.add(btnTodensochan);
            pnWest.add(Box.createVerticalStrut(10));
            pnWest.add(btnTodensole);
            pnWest.add(Box.createVerticalStrut(10));
             pnWest.add(btnTodensnt);
            pnWest.add(Box.createVerticalStrut(10));

            pnWest.add(btnBotoden);
            pnWest.add(Box.createVerticalStrut(10));
            pnWest.add(btnXoacacgttoden);
            pnWest.add(Box.createVerticalStrut(10));
            pnWest.add(btnTonggttrongjlist);
            pnWest.add(Box.createVerticalStrut(10));
            pnBorder.add(pnWest,BorderLayout.WEST);
            pnWest.setBackground(Color.LIGHT_GRAY);
            Border southborder
                    =BorderFactory.createLineBorder(Color.RED);
            TitledBorder southTitleBorder=new TitledBorder(southborder,"Chọn tác vụ");
            pnWest.setBorder(southTitleBorder);
            JPanel pnSouth=new JPanel();
            pnSouth.setPreferredSize(new Dimension(0,30));
            pnSouth.setBackground(Color.PINK);
            JPanel pns1=new JPanel();
            pnSouth.setBackground(Color.BLUE);
            pnSouth.add(pns1);
            JPanel pns2=new JPanel();
            pns2.setBackground(Color.RED);
            pnSouth.add(pns2);
            JPanel pns3=new JPanel();
            pns3.setBackground(Color.YELLOW);
            pnSouth.add(pns3);
            JPanel pns4=new JPanel();
            pnSouth.setBackground(Color.ORANGE);
            pnSouth.add(pns4);
            JPanel pns5=new JPanel();
            pnSouth.setBackground(Color.GREEN);
            pnSouth.add(pns5);
            pnBorder.add(pnSouth,BorderLayout.SOUTH);
            JPanel pnCenter=new JPanel();
            pnCenter.setLayout(new BoxLayout(pnCenter,BoxLayout.Y_AXIS));
            pnBorder.add(pnCenter,BorderLayout.CENTER);
    
             Border centerborder
                    =BorderFactory.createLineBorder(Color.RED);
            TitledBorder centerTitleBorder=new TitledBorder(centerborder,"nhập thông tin :");
            pnCenter.setBorder(centerTitleBorder);
            JPanel pn1=new JPanel();
            JLabel lbl1=new JLabel("nhập:");
            final JTextField txt1=new JTextField(15);
             pn1.add(lbl1);
            pn1.add(txt1);
            pnCenter.add(pn1);
            JCheckBox pn2=new JCheckBox("Cho nhập số âm");
            pnCenter.add(pn2);
           

  
          
           
  JButton btndongchuongtrinh=new JButton("Đóng chương trình");
            pnCenter.add(btndongchuongtrinh);
         }
         
        
               
            
            
            
            
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("THAO TÁC TRÊN JLIST-CHECKBOX");

        jButton1.setText("Tô đen số chẵn");
        jButton1.setToolTipText("");

        jButton2.setText("Tô đen số lẻ");
        jButton2.setToolTipText("");

        jButton3.setText("Tô đen số nguyên tố");

        jButton4.setText("Xóa các giá trị tô đen");

        jButton5.setText("Tổng giá trị trong list");

        jButton6.setText("Nhập");

        jCheckBox2.setText("Cho nhập số âm");

        jScrollPane2.setViewportView(jList2);

        jButton7.setText("Đóng chương trình");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel2.setText("Chọn tác vụ");

        jLabel3.setText("Nhập thông tin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(jButton4)
                            .addComponent(jButton3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jButton6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jCheckBox2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jButton7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

   
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
            java.util.logging.Logger.getLogger(b4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(b4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(b4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(b4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       b4 ui=new b4 ("Thao tác trên JList_CheckBox");
            ui.doShow();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
