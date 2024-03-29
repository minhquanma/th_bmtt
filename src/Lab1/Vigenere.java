/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author quanmm
 */
public class Vigenere extends javax.swing.JFrame {

    /**
     * Creates new form Vigenere
     */
    public Vigenere() {
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
        lblPlain = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtArea_Plain = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txt_Key = new javax.swing.JTextField();
        btn_Encypt = new javax.swing.JButton();
        btb_Decypt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtArea_cipher = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("Thuật toán mã hóa Vigenere");

        lblPlain.setText("PlainText: ");

        TxtArea_Plain.setColumns(20);
        TxtArea_Plain.setRows(5);
        jScrollPane1.setViewportView(TxtArea_Plain);

        jLabel2.setText("Key: (chỉ nhập chữ) ");

        btn_Encypt.setText("v Encrypt v");
        btn_Encypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EncyptActionPerformed(evt);
            }
        });

        btb_Decypt.setText("^ Decypt ^");
        btb_Decypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_DecyptActionPerformed(evt);
            }
        });

        jLabel3.setText("CipherText: ");

        TxtArea_cipher.setColumns(20);
        TxtArea_cipher.setRows(5);
        jScrollPane2.setViewportView(TxtArea_cipher);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlain)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Encypt)
                        .addGap(18, 18, 18)
                        .addComponent(btb_Decypt))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(txt_Key, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlain)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Encypt)
                    .addComponent(btb_Decypt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EncyptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EncyptActionPerformed
        int rowsize = 26; 
        int colsize = 26;
        int table[][] = new int [26][26];
        for(int row = 0; row <rowsize; row++)
        {
            for(int col = 0; col<colsize; col++)
            {
                table[row][col]=(row + col)% 26;
            }
        }
        System.out.println("Nhập văn bản");
        String plaintext = TxtArea_Plain.getText();
        plaintext = plaintext.toUpperCase();
        
        System.out.println("Nhập giá trị khóa");
        String key = txt_Key.getText();    
        key = key.toUpperCase();
        
        String cipher = "";
        int keyindex =0 ;
        for(int plaintextindex = 0; plaintextindex < plaintext.length(); plaintextindex++)
        {
            char pchar = plaintext.charAt(plaintextindex);
            int ascii = (int) pchar;
            if(pchar == ' ')
            {
               cipher += pchar;
               continue;
            }
            if(ascii < 65 || ascii > 90)
            {
                cipher += pchar;
               continue;
            }
            int base_plain_text = ((int)pchar) - 65;
            char key_char = key.charAt(keyindex);
            int base_key = ((int)key_char) - 65;
            int tb = table[base_plain_text][base_key];
            
            char c = (char)(tb+65);
            cipher += c;
            keyindex ++;
            if(keyindex == key.length())
            {
                keyindex= 0;
            }
            System.out.println("văn bản sau mã hóa:" + " " + cipher);
            TxtArea_cipher.setText(cipher.toUpperCase());
        }
                 
    }//GEN-LAST:event_btn_EncyptActionPerformed

    private void btb_DecyptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btb_DecyptActionPerformed
        int rowsize = 26; 
        int colsize = 26;
        int table[][] = new int [26][26];
        String cipher_Text = TxtArea_cipher.getText();
        String plainText ="";
        for(int row = 0; row< rowsize; row++)
        {
               for(int col = 0; col<colsize; col++)
               {
                   table[row][col] = (row+col)%26;
               }
        }
        System.out.println("Nhập văn bản cần giải mã ");
        cipher_Text = cipher_Text.toUpperCase();
        String key = txt_Key.getText();
        key = key.toUpperCase();
        
        int k_index =0;
        
        for(int cipher_text_index = 0; cipher_text_index<cipher_Text.length(); cipher_text_index++)
        {
            char c_ = cipher_Text.charAt(cipher_text_index);
            int ascii = (int)c_;
            if(c_ == ' ')
            {
                plainText += c_;
                continue;
            }
            if(ascii<65 || ascii>90)
            {
                plainText +=c_;
                continue;
            }
            int basic_cipher = ((int) c_) - 65;
            char K_char = key.charAt(k_index);
            int B_key_value = ((int)K_char) - 65;
            for (int pIndex =0; pIndex<colsize; pIndex++)
            {
                if(table[B_key_value][pIndex]== basic_cipher)
                {
                    char potcchar = (char)(table[B_key_value][pIndex]+65);
                    char potpchar = (char)(pIndex + 65);
                    plainText+= potpchar;
                }
            }   
             k_index ++;
            if(k_index == key.length())
        
                 k_index = 0;
        }
        System.out.println("Văn bản sau khi giải mã:" + plainText);
        TxtArea_cipher.setText(cipher_Text.toUpperCase());
        TxtArea_Plain.setText(plainText.toUpperCase());
    }//GEN-LAST:event_btb_DecyptActionPerformed

    
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
            java.util.logging.Logger.getLogger(Vigenere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vigenere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vigenere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vigenere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vigenere().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TxtArea_Plain;
    private javax.swing.JTextArea TxtArea_cipher;
    private javax.swing.JButton btb_Decypt;
    private javax.swing.JButton btn_Encypt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPlain;
    private javax.swing.JTextField txt_Key;
    // End of variables declaration//GEN-END:variables
}
//có nhiều bản chử cái