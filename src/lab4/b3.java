/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.JList;


/**
 *
 * @author Administrator
 */
public class b3 extends javax.swing.JFrame {
        
    /**
     * Creates new form b3
     */
   





/**
 *
 * @author Administrator
 */
    
  
        private static final long serialVersionUID=1L;
        public b3(String title){
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
            JLabel lblTitle=new JLabel("Cộng Trừ Nhân Chia");
            pnNorth.add(lblTitle);
            pnBorder.add(pnNorth,BorderLayout.NORTH);
            lblTitle.setForeground(Color.BLUE);
            Font ft=new Font("arial",Font.BOLD,25);
            lblTitle.setFont(ft);
            JPanel pnWest=new JPanel();
            pnWest.setLayout(new BoxLayout(pnWest,BoxLayout.Y_AXIS));
            JButton btnGiai=new JButton("Giải");
            JButton btnXoa=new JButton("Xóa");
            JButton btnThoat=new JButton("Thoát");
            pnWest.add(btnGiai);
            pnWest.add(Box.createVerticalStrut(10));
            pnWest.add(btnXoa);
            pnWest.add(Box.createVerticalStrut(10));
            pnWest.add(btnThoat);
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
            pnBorder.add(pnSouth,BorderLayout.SOUTH);
            JPanel pnCenter=new JPanel();
            pnCenter.setLayout(new BoxLayout(pnCenter,BoxLayout.Y_AXIS));
            pnBorder.add(pnCenter,BorderLayout.CENTER);
            
            Border centerborder
                    =BorderFactory.createLineBorder(Color.RED);
            TitledBorder centerTitleBorder=new TitledBorder(centerborder,"nhập 2 số a và b:");
            pnCenter.setBorder(centerTitleBorder);
            
            JPanel pna=new JPanel();
            JLabel lbla=new JLabel("nhập a:");
            final JTextField txta=new JTextField(15);
            pna.add(lbla);
            pna.add(txta);
            pnCenter.add(pna);
            JPanel pnb=new JPanel();
            JLabel lblb=new JLabel("nhập b:");
            final JTextField txtb=new JTextField(15);
            pnb.add(lblb);
            pnb.add(txtb);
            pnCenter.add(pnb);
            JPanel pnc=new JPanel();
            JPanel pnpheptoan=new JPanel();
            pnpheptoan.setLayout(new GridLayout(2,2));
            pnpheptoan.setBorder(new TitledBorder(BorderFactory.createLineBorder(Color.BLACK),"Chọn phép toán:"));
            
            final JRadioButton radCong=new JRadioButton("Cộng");
            pnpheptoan.add(radCong);
            final JRadioButton radTru=new JRadioButton("Trừ");
            pnpheptoan.add(radTru);
            final JRadioButton radNhan=new JRadioButton("Nhân");
            pnpheptoan.add(radNhan);
            final JRadioButton radChia=new JRadioButton("Chia");
            pnpheptoan.add(radChia);
            ButtonGroup group =new ButtonGroup();
            group.add(radCong);group.add(radTru);
            group.add(radNhan);group.add(radChia);
            
            pnc.add(pnpheptoan);
            pnCenter.add(pnc);
            
            JPanel pnkq=new JPanel();
            JLabel lblkq=new JLabel("Kết quả:");
            final JTextField txtkq=new JTextField(15);
            pnkq.add(lblkq);
            pnkq.add(txtkq);
            pnCenter.add(pnkq);
            
            lbla.setPreferredSize(lblkq.getPreferredSize());
            lblb.setPreferredSize(lblkq.getPreferredSize());
            btnThoat.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent arg0){
                    int ret=JOptionPane.showConfirmDialog(null,"Muốn thoát hả?","Thoát",
                            JOptionPane.YES_NO_OPTION);
                    if(ret==JOptionPane.YES_OPTION)
                        System.exit(0);
                }
            });
            btnXoa.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent arg0){
                    txta.setText("");
                    txtb.setText("");
                    txtkq.setText("");
                    txta.requestFocus();
                }
            });
            
            btnGiai.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent arg0){
                    String sa=txta.getText();
                    int a=0,b=0;
                    try{
                        a=Integer.parseInt(sa);
                    }
                    catch(Exception ex){
                        JOptionPane.showMessageDialog(null,"Nhập sai định dạng!");
                        txta.selectAll();
                        txta.requestFocus();
                        return;
                    }
                    String sb=txtb.getText();
                    try{
                        b=Integer.parseInt(sb);
                    }
                    catch(Exception ex){
                        JOptionPane.showMessageDialog(null,"Nhập sai định dạng!");
                        txtb.selectAll();
                        txtb.requestFocus();
                        return;
                    }
                    double kq=0;
                    if(radCong.isSelected()){
                        kq=(a+b);
                    }
                    else if(radTru.isSelected()){
                        kq=(a-b);
                    }
                    else if(radNhan.isSelected()){
                        kq=(a*b);
                    }
                    else{
                        kq=a*1.0/b*1.0;
                    }
                    txtkq.setText(kq+"");
                }
            });
            Container con=getContentPane();
            con.add(pnBorder);
        }
    
        public static void main (String[] args){
           b3 ui=new b3 ("Cộng - Trừ - Nhân - Chia");
            ui.doShow();
 
   }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setToolTipText("");

        jButton1.setText("Giải");
        jButton1.setToolTipText("");

        jButton2.setText("Xóa");

        jButton3.setText("Thoát");
        jButton3.setToolTipText("");

        jLabel1.setText("CỘNG TRỪ NHÂN CHIA");

        jLabel2.setText("nhập 2 số a và b");

        jLabel3.setText("nhập a");

        jLabel4.setText("nhập b");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jLabel3))
                        .addGap(65, 65, 65))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(8, 8, 8)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
