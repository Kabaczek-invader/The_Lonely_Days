
import java.awt.Color;
import java.util.HashSet;
import javax.swing.JTextArea;

/**
 *
 * @author Bastek
 */
public class Day0 extends javax.swing.JFrame {

    /**
     * Creates new form Day0
     */
    public Day0() {
        initComponents();
        jTextArea1.setBackground(new Color(0,0,0,0)); //        MIKI TAK SIE ROBI PRZEZROCZYSTE TLO!!!
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setPreferredSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));

        jTextArea1.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(6);
        jTextArea1.setTabSize(6);
        jTextArea1.setText("                                                                       PROLOG\n\n Jest rok 2046 Rosja pokłóciła się ze Stanami Zjednoczonymi. Powodem ich sporu były braki w                surowcach ze strony Stanów oraz niechęć współpracy ze strony Rosji. Prezydent postanowił pokazać,\n że nie warto im odmawiać i postanowił wystrzelić w stronę Rosji kilka pocisków nuklearnych. Rosja         spodziewała się takiego ruchu ze strony Stanów i włączyła barierę która \"obroniła\" ich przed prawie       wszystkimi pociskami. Nieliczne pociski przedostały się do Rosji, a cała reszta zostala rozrzucona po       całym globie.\n Pociski oprócz ogromnych zniszczeń spowodowały też rozpowszechnienie się toksyn przez które             wymarło 99% ludzkości, a pozostały procent skryło się w bunkrach, jaskiniach, górach i rozpoczęło         walkę o przetrwanie. \n Dzień ten nazywamy dniem 0...");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(null);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea1.setFocusable(false);
        jTextArea1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jTextArea1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jTextArea1.setPreferredSize(new java.awt.Dimension(1080, 720));

        jButton1.setText("Dalej");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToDay1(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(483, 483, 483)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jButton1)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1080, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goToDay1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToDay1
        this.dispose();
        new Day1().setVisible(true);
    }//GEN-LAST:event_goToDay1

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
            java.util.logging.Logger.getLogger(Day0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Day0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Day0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Day0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Day0().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
