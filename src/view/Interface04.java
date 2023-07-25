package view;

import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Interface04 extends javax.swing.JFrame {

    public Interface04() {
        initComponents();
    }
    
    private final int FOCUS_TIME = 25;
    private final int SHORT_BREAK_TIME= 5;
    private final int LONG_BREAK_TIME = 15;
    private final int ROUNDS = 5;
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        timer = new javax.swing.JPanel();
        timeLabel = new javax.swing.JLabel();
        settingsButton = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        buttonLabel = new javax.swing.JLabel();
        settings = new javax.swing.JPanel();
        fecharLabel = new javax.swing.JLabel();
        FocusTimeSlide = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        FocusTimeLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BreakShortLabel = new javax.swing.JLabel();
        BreakShortSlide = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        BreakLongSlide = new javax.swing.JSlider();
        BreakLongLabel = new javax.swing.JLabel();
        RoundLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        RoundSlide = new javax.swing.JSlider();
        ResetButton = new javax.swing.JButton();
        ApplyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setLayout(new java.awt.CardLayout());

        timeLabel.setFont(new java.awt.Font("Dialog", 1, 70)); // NOI18N
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel.setText("25:00");

        settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/engrenagem.png"))); // NOI18N
        settingsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsButtonMouseClicked(evt);
            }
        });

        statusLabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        statusLabel.setText("TEMPO DE FOCO");

        buttonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/play.png"))); // NOI18N
        buttonLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout timerLayout = new javax.swing.GroupLayout(timer);
        timer.setLayout(timerLayout);
        timerLayout.setHorizontalGroup(
            timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timerLayout.createSequentialGroup()
                .addGroup(timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(settingsButton))
                    .addGroup(timerLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(buttonLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerLayout.createSequentialGroup()
                .addGap(0, 73, Short.MAX_VALUE)
                .addGroup(timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerLayout.createSequentialGroup()
                        .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerLayout.createSequentialGroup()
                        .addComponent(statusLabel)
                        .addGap(136, 136, 136))))
        );
        timerLayout.setVerticalGroup(
            timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settingsButton)
                .addGap(29, 29, 29)
                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(buttonLabel)
                .addGap(18, 18, 18)
                .addComponent(statusLabel)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        main.add(timer, "timer");

        fecharLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/claro.png"))); // NOI18N
        fecharLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fecharLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecharLabelMouseClicked(evt);
            }
        });

        FocusTimeSlide.setMaximum(50);
        FocusTimeSlide.setMinimum(1);
        FocusTimeSlide.setValue(25);
        FocusTimeSlide.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                FocusTimeSlideStateChanged(evt);
            }
        });

        jLabel1.setText("TEMPO DE FOCO");

        FocusTimeLabel.setText("25:00");

        jLabel3.setText("BREAK CURTO");

        BreakShortLabel.setText("05:00");

        BreakShortSlide.setMaximum(15);
        BreakShortSlide.setMinimum(1);
        BreakShortSlide.setValue(5);
        BreakShortSlide.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BreakShortSlideStateChanged(evt);
            }
        });

        jLabel5.setText("BREAK LONGO");

        BreakLongSlide.setMaximum(30);
        BreakLongSlide.setMinimum(1);
        BreakLongSlide.setValue(15);
        BreakLongSlide.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BreakLongSlideStateChanged(evt);
            }
        });

        BreakLongLabel.setText("15:00");

        RoundLabel.setText("05");

        jLabel8.setText("ROUNDS");

        RoundSlide.setMaximum(10);
        RoundSlide.setMinimum(1);
        RoundSlide.setValue(5);
        RoundSlide.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                RoundSlideStateChanged(evt);
            }
        });

        ResetButton.setText("Reset Default");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        ApplyButton.setText("Aplicar");

        javax.swing.GroupLayout settingsLayout = new javax.swing.GroupLayout(settings);
        settings.setLayout(settingsLayout);
        settingsLayout.setHorizontalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsLayout.createSequentialGroup()
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fecharLabel))
                    .addGroup(settingsLayout.createSequentialGroup()
                        .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(settingsLayout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(RoundSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(59, 59, 59))
                                            .addComponent(BreakShortSlide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                                                .addComponent(BreakShortLabel)
                                                .addGap(86, 86, 86))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(59, 59, 59))
                                            .addComponent(BreakLongSlide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                                                .addComponent(BreakLongLabel)
                                                .addGap(86, 86, 86)))
                                        .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(59, 59, 59))
                                            .addComponent(FocusTimeSlide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                                                .addComponent(FocusTimeLabel)
                                                .addGap(86, 86, 86))))))
                            .addGroup(settingsLayout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(settingsLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(RoundLabel))
                                    .addComponent(jLabel8))))
                        .addGap(0, 75, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(settingsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ResetButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ApplyButton)
                .addGap(78, 78, 78))
        );
        settingsLayout.setVerticalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fecharLabel)
                .addGap(93, 93, 93)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FocusTimeLabel)
                .addGap(6, 6, 6)
                .addComponent(FocusTimeSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BreakShortLabel)
                .addGap(6, 6, 6)
                .addComponent(BreakShortSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BreakLongLabel)
                .addGap(6, 6, 6)
                .addComponent(BreakLongSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RoundLabel)
                .addGap(6, 6, 6)
                .addComponent(RoundSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResetButton)
                    .addComponent(ApplyButton))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        main.add(settings, "settings");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void settingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseClicked
        changePanel("settings");
    }//GEN-LAST:event_settingsButtonMouseClicked

    private void fecharLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharLabelMouseClicked
        changePanel("timer");
    }//GEN-LAST:event_fecharLabelMouseClicked

    private void FocusTimeSlideStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_FocusTimeSlideStateChanged
        //int value = this.FocusTimeSlide.getValue();
        //String valueFormat = String.format("%02d:%02d", value, 00);
        //this.FocusTimeLabel.setText(valueFormat);
        changeValueSlider(this.FocusTimeSlide, this.FocusTimeLabel);
    }//GEN-LAST:event_FocusTimeSlideStateChanged

    private void BreakShortSlideStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BreakShortSlideStateChanged
//        int value = this.BreakShortSlide.getValue();
//        String valueFormat = String.format("%02d:%02d", value, 00);
//        this.BreakShortLabel.setText(valueFormat);
        changeValueSlider(this.BreakShortSlide, this.BreakShortLabel);
    }//GEN-LAST:event_BreakShortSlideStateChanged

    private void BreakLongSlideStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BreakLongSlideStateChanged
//        int value = this.BreakLongSlide.getValue();
//        String valueFormat = String.format("%02d:%02d", value, 00);
//        this.BreakLongLabel.setText(valueFormat);
        changeValueSlider(this.BreakLongSlide, this.BreakLongLabel);
    }//GEN-LAST:event_BreakLongSlideStateChanged

    private void RoundSlideStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_RoundSlideStateChanged
        int value = this.RoundSlide.getValue();
        String valueFormat = String.format("%02d", value, 00);
        this.RoundLabel.setText(valueFormat);
        //changeValueSlider(this.RoundSlide, this.RoundLabel);
        
    }//GEN-LAST:event_RoundSlideStateChanged

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        this.FocusTimeSlide.setValue(this.FOCUS_TIME);
        this.BreakShortSlide.setValue(this.SHORT_BREAK_TIME);
        this.BreakLongSlide.setValue(this.LONG_BREAK_TIME);
        this.RoundSlide.setValue(this.ROUNDS);
    }//GEN-LAST:event_ResetButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface04().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApplyButton;
    private javax.swing.JLabel BreakLongLabel;
    private javax.swing.JSlider BreakLongSlide;
    private javax.swing.JLabel BreakShortLabel;
    private javax.swing.JSlider BreakShortSlide;
    private javax.swing.JLabel FocusTimeLabel;
    private javax.swing.JSlider FocusTimeSlide;
    private javax.swing.JButton ResetButton;
    private javax.swing.JLabel RoundLabel;
    private javax.swing.JSlider RoundSlide;
    private javax.swing.JLabel buttonLabel;
    private javax.swing.JLabel fecharLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel main;
    private javax.swing.JPanel settings;
    private javax.swing.JLabel settingsButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JPanel timer;
    // End of variables declaration//GEN-END:variables
   
    private void changePanel(String cardName){
        CardLayout cardLayout = (CardLayout) this.main.getLayout();
        cardLayout.show(this.main,cardName);
    }
    private void changeValueSlider(JSlider slider, JLabel label){
        int value = slider.getValue();
        String valueFormat = String.format("%02d:%02d", value, 00);
        label.setText(valueFormat);
    }
}
