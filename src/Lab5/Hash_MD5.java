package Lab5;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.security.MessageDigest;
import javax.print.DocFlavor;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author ntluong
 */
public class Hash_MD5 extends javax.swing.JFrame {

    /**
     * Creates new form Hash_md5
     */
    public Hash_MD5() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_UserName = new javax.swing.JTextField();
        txt_Pass = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_KQ1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_KQ2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_Chuoi = new javax.swing.JTextArea();
        btn_DangNhap = new javax.swing.JButton();
        btn_DangKy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Hash_MD5");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("User name :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Password :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Result 1 :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Result 2 :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Chuỗi User Name & Password :");

        txt_KQ1.setColumns(20);
        txt_KQ1.setRows(5);
        jScrollPane1.setViewportView(txt_KQ1);

        txt_KQ2.setColumns(20);
        txt_KQ2.setRows(5);
        jScrollPane2.setViewportView(txt_KQ2);

        txt_Chuoi.setColumns(20);
        txt_Chuoi.setRows(5);
        jScrollPane3.setViewportView(txt_Chuoi);

        btn_DangNhap.setText("Đăng nhập");
        btn_DangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangNhapActionPerformed(evt);
            }
        });

        btn_DangKy.setText("Đăng ký");
        btn_DangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangKyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_DangNhap)
                                    .addGap(47, 47, 47)
                                    .addComponent(btn_DangKy))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_Pass, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                .addComponent(txt_UserName)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_DangNhap)
                    .addComponent(btn_DangKy))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangKyActionPerformed
       try
       {
           String username = txt_UserName.getText();
           String pass = txt_Pass.getText();
           String bam="";
           bam = username + pass;
           MessageDigest md = MessageDigest.getInstance("MD5");
           md.update(bam.getBytes());
           byte [] data = md.digest();
           StringBuffer sb = new StringBuffer();
           for (int i = 0;i<data.length; i++)
           {
               sb.append(Integer.toString((data[i] & 0xff)+ 0x100, 16).substring(1));
           }
           System.out.println("hex:" + sb.toString());
           txt_KQ1.setText(sb.toString());
           StringBuffer hexstring = new StringBuffer();
           for(int i =0; i<data.length; i++)
           {
               String hex = Integer.toHexString(0xff & data[i]);
               if(hex.length() ==1)
               {
                   hexstring.append('0');
               }
               hexstring.append(hex);
           }
           System.out.println("hex:" + hexstring.toString());
           txt_KQ2.setText(hexstring.toString());
           txt_Chuoi.setText(bam.toString());
           BufferedWriter bw = null;
           String file ="D:\\MD5.txt";
           bw = new BufferedWriter(new FileWriter(file));
           bw.write(hexstring.toString());
           bw.close();
           JOptionPane.showMessageDialog(null,"Đăng ký thành công!");          
       }
       catch(Exception e)
       {
            System.out.println("lỗi"+e);
       }
    }//GEN-LAST:event_btn_DangKyActionPerformed

    private void btn_DangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangNhapActionPerformed

            String username =txt_UserName.getText();
            String pass =txt_Pass.getText();
            String bam = "";
            bam = username + pass;
            BufferedReader br ;
            String file ="D:\\MD5.txt";
            try
            {
                br = new BufferedReader(new FileReader(file));
                StringBuffer sb = new StringBuffer();
                char [] c = new char[5];
                while(br.ready())
                {
                   int l = br.read(c);
                   sb.append(c,0,l);
                }
                br.close();
                System.out.println("chuoi:"+ " " +sb);
                String chuoi = sb.toString();
                MessageDigest md = MessageDigest.getInstance("MD5");
                md.update(bam.getBytes());
                byte []data = md.digest();
                StringBuffer hexstring = new StringBuffer();
                for (int i = 0; i<data.length; i++)
                {
                    String hex = Integer.toHexString(0xff & data[i]);
                    if(hex.length()==1)
                    {
                        hexstring.append('0');
                    }
                    hexstring.append(hex);
                }
                
              System.out.println("chuoi:"+ " " +hexstring.toString());
              Boolean k = hexstring.toString().equals(chuoi);
              if(k==true)
              {
                  JOptionPane.showMessageDialog(null, "dang nhap thanh cong!");
                  txt_KQ1.setText(hexstring.toString());
                  txt_KQ2.setText(chuoi);
                  txt_Chuoi.setText("User: " + username + " " +"Pass : "+pass);
              }
              else
              {
                  JOptionPane.showMessageDialog(null, "dang nhap that bai");
              }
            }
            catch(Exception de)
            {
                System.out.println("loi:" + de);
            }
            
    }//GEN-LAST:event_btn_DangNhapActionPerformed

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
            java.util.logging.Logger.getLogger(Hash_MD5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hash_MD5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hash_MD5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hash_MD5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hash_MD5().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DangKy;
    private javax.swing.JButton btn_DangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txt_Chuoi;
    private javax.swing.JTextArea txt_KQ1;
    private javax.swing.JTextArea txt_KQ2;
    private javax.swing.JTextField txt_Pass;
    private javax.swing.JTextField txt_UserName;
    // End of variables declaration//GEN-END:variables
}
// Có khả năng băm mã hóa tập tin bất kỳ thành chuỗi HEX 32 ký tự, tương đương 128-bit  (