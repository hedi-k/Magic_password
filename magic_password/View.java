package magic_password;

/**
 * L'interface.
 *
 * @author eddy
 */
public class View extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(View.class.getName());
    private Controler superControler;
    private Model superModel;
    private Calcul superCalcul; // Il y a peut être pas besoin de celui la
    private int nbChar =0;

    /**
     * Creates new form View
     */
    public View(Model superModel, Calcul superCalcul, Controler superControler) {
        this.superModel = superModel;
        this.superControler = superControler;
        this.superCalcul = superCalcul;

        initComponents();
        initialise();
        this.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSpinnerNbChar = new javax.swing.JSpinner();
        jCheckBoxMaj = new javax.swing.JCheckBox();
        jCheckBoxNum = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jCheckBoxSpe = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEnabled(false);
        jTextField1.addActionListener(this::jTextField1ActionPerformed);

        jButton1.setText("GO");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jSpinnerNbChar.addChangeListener(this::jSpinnerNbCharStateChanged);

        jCheckBoxMaj.setText("Majuscule");

        jCheckBoxNum.setText("Numérique");

        jLabel1.setText("Nombre de caractère");

        jCheckBoxSpe.setText("Spéciaux");

        jLabel2.setText("MAGIC PASSWORD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBoxMaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxNum)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxSpe)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSpinnerNbChar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxMaj)
                    .addComponent(jCheckBoxNum)
                    .addComponent(jCheckBoxSpe))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerNbChar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Comportement par défaut des sélecteurs numérique.
    private void initialise() {
        //Nombre de caractères.
        ((javax.swing.SpinnerNumberModel) jSpinnerNbChar.getModel()).setMinimum(5);
        ((javax.swing.SpinnerNumberModel) jSpinnerNbChar.getModel()).setMaximum(20);
        jSpinnerNbChar.setValue(10);
        jCheckBoxMaj.setSelected(true);
        jCheckBoxNum.setSelected(true);
        jCheckBoxSpe.setSelected(true);
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * Action du btn GO !
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        superControler.generate(nbChar, jCheckBoxMaj.isSelected(),jCheckBoxNum.isSelected(), jCheckBoxSpe.isSelected());
        jTextField1.setText(superModel.getMdp());
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
     * Valorise les changements du selecteur numérique.
     * @param evt 
     */
    private void jSpinnerNbCharStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerNbCharStateChanged
        nbChar = (int)jSpinnerNbChar.getValue();
    }//GEN-LAST:event_jSpinnerNbCharStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBoxMaj;
    private javax.swing.JCheckBox jCheckBoxNum;
    private javax.swing.JCheckBox jCheckBoxSpe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSpinner jSpinnerNbChar;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
