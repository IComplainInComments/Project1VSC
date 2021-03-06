
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author edward
 */
public class OptionMenu extends javax.swing.JDialog {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5757427710569257259L;
	/**
     * Creates new form OptionMenu
     */
    public OptionMenu(javax.swing.JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Characters = new javax.swing.JLabel();
        Length = new javax.swing.JLabel();
        Width = new javax.swing.JLabel();
        RunNum = new javax.swing.JLabel();
        sCharacters = new javax.swing.JSlider();
        sLength = new javax.swing.JSlider();
        sWidth = new javax.swing.JSlider();
        sRunNum = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Simulation Settings");
        setAlwaysOnTop(true);
        setResizable(false);

        Characters.setText("How Many Characters");

        Length.setText("How Tall");

        Width.setText("How Wide");

        RunNum.setText("How Many Times to Run");

        sCharacters.setMajorTickSpacing(2);
        sCharacters.setMaximum(4);
        sCharacters.setMinimum(2);
        sCharacters.setMinorTickSpacing(1);
        sCharacters.setPaintLabels(true);
        sCharacters.setPaintTicks(true);
        sCharacters.setSnapToTicks(true);
        sCharacters.setToolTipText("How many characters should be in the simulation");
        sCharacters.setValue(2);
        sCharacters.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sCharactersStateChanged(evt);
            }
        });

        sLength.setMajorTickSpacing(5);
        sLength.setMaximum(Woods.MAX_HEIGHT);
        sLength.setMinimum(2);
        sLength.setMinorTickSpacing(1);
        sLength.setPaintLabels(true);
        sLength.setPaintTicks(true);
        sLength.setSnapToTicks(true);
        sLength.setToolTipText("Set the length of the Woods");
        sLength.setValue(2);
        sLength.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sLengthStateChanged(evt);
            }
        });

        sWidth.setMajorTickSpacing(5);
        sWidth.setMaximum(Woods.MAX_WIDTH);
        sWidth.setMinimum(2);
        sWidth.setMinorTickSpacing(1);
        sWidth.setPaintLabels(true);
        sWidth.setPaintTicks(true);
        sWidth.setSnapToTicks(true);
        sWidth.setToolTipText("Set the width of the Woods");
        sWidth.setValue(2);
        sWidth.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sLengthStateChanged(evt);
            }
        });

        sRunNum.setMajorTickSpacing(24);
        sRunNum.setMaximum(100);
        sRunNum.setMinimum(1);
        sRunNum.setMinorTickSpacing(1);
        sRunNum.setPaintLabels(true);
        sRunNum.setPaintTicks(true);
        sRunNum.setSnapToTicks(true);
        sRunNum.setToolTipText("Set how many times should the simulation run");
        sRunNum.setValue(1);
        sRunNum.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sRunNumStateChanged(evt);
            }
        });
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Length)
                    .addComponent(Width)
                    .addComponent(RunNum)
                    .addComponent(sCharacters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sRunNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Characters))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Characters, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sCharacters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Length)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Width)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RunNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sRunNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sCharactersStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sCharactersStateChanged
        javax.swing.JSlider source = (javax.swing.JSlider) evt.getSource();

        if (!source.getValueIsAdjusting()) {
            this.Players = (int) source.getValue();
        }
        System.out.println(valueOutput());
    }//GEN-LAST:event_sCharactersStateChanged

    private void sLengthStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sLengthStateChanged
        javax.swing.JSlider source = (javax.swing.JSlider) evt.getSource();

        if (!source.getValueIsAdjusting()) {
            this.Leng = (int) source.getValue();
        }//GEN-LAST:event_sLengthStateChanged

        System.out.println(valueOutput());
    }


    private void sWidthStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sWidthStateChanged
        javax.swing.JSlider source = (javax.swing.JSlider) evt.getSource();

        if (!source.getValueIsAdjusting()) {
            this.Wid = (int) source.getValue();
        }
        System.out.println(valueOutput());
    }//GEN-LAST:event_sWidthStateChanged

    
    private void sRunNumStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sRunNumStateChanged
        javax.swing.JSlider source = (javax.swing.JSlider) evt.getSource();

        if (!source.getValueIsAdjusting()) {
            this.Times = (int) source.getValue();
        }
        System.out.println(valueOutput());
    }//GEN-LAST:event_sRunNumStateChanged
    

    public int getPlayers() {
        return this.Players;
    }

    public int getLeng() {
        return this.Leng;
    }

    public int getWid() {
        return this.Wid;
    }

    public int getTimes() {
        return this.Times;
    }

    public String valueOutput() {
        return "Players: " + this.Players + " Length: " + this.Leng + " Width: " + this.Wid + " Times to run: " + this.Times;
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
            java.util.logging.Logger.getLogger(OptionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OptionMenu dialog = new OptionMenu(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    private int Players = 2;
    private int Leng = Woods.MAX_HEIGHT;
    private int Wid = Woods.MAX_WIDTH;
    private int Times = 1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Characters;
    private javax.swing.JLabel Length;
    private javax.swing.JLabel RunNum;
    private javax.swing.JLabel Width;
    private javax.swing.JSlider sCharacters;
    private javax.swing.JSlider sLength;
    private javax.swing.JSlider sRunNum;
    private javax.swing.JSlider sWidth;
    // End of variables declaration//GEN-END:variables
}
