
package calculator;


public class Sample_Frame extends javax.swing.JFrame {

 
 double num,result; char operators; 
    public Sample_Frame() {
        initComponents();
        ON.setEnabled(false);
        setVisible(true);
        
    }
    public void disable(){
        num_1.setEnabled(false);
        num_2 .setEnabled(false);
        num_3 .setEnabled(false);
        num_0 .setEnabled(false);
        num_4 .setEnabled(false);
        num_5 .setEnabled(false);
        num_6 .setEnabled(false);
        num_7 .setEnabled(false);
        num_8 .setEnabled(false);
        num_9 .setEnabled(false);
        delete .setEnabled(false);
        AllClear .setEnabled(false);
        multiPly .setEnabled(false);
        devide .setEnabled(false);
        Addition .setEnabled(false);
        Minus .setEnabled(false);
        equal .setEnabled(false);
        dot .setEnabled(false);
       
        ON.setEnabled(true);
        off.setEnabled(false);

    }
    public void Enable(){
        num_1.setEnabled(true);
        num_2 .setEnabled(true);
        num_3 .setEnabled(true);
        num_0 .setEnabled(true);
        num_4 .setEnabled(true);
        num_5 .setEnabled(true);
        num_6 .setEnabled(true);
        num_7 .setEnabled(true);
        num_8 .setEnabled(true);
        num_9 .setEnabled(true);
        delete .setEnabled(true);
        AllClear .setEnabled(true);
        multiPly .setEnabled(true);
        devide .setEnabled(true);
        Addition .setEnabled(true);
        Minus .setEnabled(true);
        equal .setEnabled(true);
        dot .setEnabled(true);
       
        ON.setEnabled(false);
        off.setEnabled(true);
    }
    public void Arithmatic_operation(){
        
        switch(operators){
            case '+':
            {
                result = num +Double.parseDouble(CalcText.getText());
                CalcText.setText(Double.toString(result));
                break;
            }
            case '-':
            {
                result = num -Double.parseDouble(CalcText.getText());
                CalcText.setText(Double.toString(result));
                break;
            }
            case 'x':
            {
                result = num *Double.parseDouble(CalcText.getText());
                CalcText.setText(Double.toString(result));
                break;
            }
            case '/':
            {
                result = num /Double.parseDouble(CalcText.getText());
                CalcText.setText(Double.toString(result));
                break;
            }
             case '%':{
                result = num *((Double.parseDouble(CalcText.getText()))/100);
                CalcText.setText(Double.toString(result )+"%"); 
                break;
             }
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        CalcText = new javax.swing.JTextField();
        num_1 = new javax.swing.JButton();
        num_2 = new javax.swing.JButton();
        num_3 = new javax.swing.JButton();
        num_0 = new javax.swing.JButton();
        num_4 = new javax.swing.JButton();
        num_5 = new javax.swing.JButton();
        num_6 = new javax.swing.JButton();
        num_7 = new javax.swing.JButton();
        num_8 = new javax.swing.JButton();
        num_9 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        AllClear = new javax.swing.JButton();
        multiPly = new javax.swing.JButton();
        devide = new javax.swing.JButton();
        Addition = new javax.swing.JButton();
        Minus = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        ON = new javax.swing.JRadioButton();
        off = new javax.swing.JRadioButton();
        prev_calculation = new javax.swing.JLabel();
        percentage = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBounds(new java.awt.Rectangle(250, 250, 400, 400));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLocation(new java.awt.Point(250, 250));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        CalcText.setEditable(false);
        CalcText.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        CalcText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcTextActionPerformed(evt);
            }
        });

        num_1.setText("1");
        num_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_1ActionPerformed(evt);
            }
        });

        num_2.setText("2");
        num_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_2ActionPerformed(evt);
            }
        });

        num_3.setText("3");
        num_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_3ActionPerformed(evt);
            }
        });

        num_0.setText("0");
        num_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_0ActionPerformed(evt);
            }
        });

        num_4.setText("4");
        num_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_4ActionPerformed(evt);
            }
        });

        num_5.setText("5");
        num_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_5ActionPerformed(evt);
            }
        });

        num_6.setText("6");
        num_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_6ActionPerformed(evt);
            }
        });

        num_7.setText("7");
        num_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_7ActionPerformed(evt);
            }
        });

        num_8.setText("8");
        num_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_8ActionPerformed(evt);
            }
        });

        num_9.setText("9");
        num_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_9ActionPerformed(evt);
            }
        });

        delete.setText("DEL");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        AllClear.setText("AC");
        AllClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllClearActionPerformed(evt);
            }
        });

        multiPly.setText("X");
        multiPly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiPlyActionPerformed(evt);
            }
        });

        devide.setText("/");
        devide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devideActionPerformed(evt);
            }
        });

        Addition.setText("+");
        Addition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdditionActionPerformed(evt);
            }
        });

        Minus.setText("-");
        Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusActionPerformed(evt);
            }
        });

        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        dot.setText(".");
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });

        buttonGroup1.add(ON);
        ON.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        ON.setText("ON");
        ON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ONActionPerformed(evt);
            }
        });

        buttonGroup1.add(off);
        off.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        off.setText("OFF");
        off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offActionPerformed(evt);
            }
        });

        prev_calculation.setForeground(new java.awt.Color(102, 102, 255));
        prev_calculation.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        percentage.setText("%");
        percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentageActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CalcText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(num_7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                    .addComponent(num_4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(num_0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(num_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(num_2, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                    .addComponent(num_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(num_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(num_6, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(num_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(num_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(multiPly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Addition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(percentage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(AllClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(devide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(prev_calculation, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(off)
                            .addComponent(ON, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prev_calculation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CalcText, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(off))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AllClear)
                    .addComponent(delete)
                    .addComponent(num_9)
                    .addComponent(num_8)
                    .addComponent(num_7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(devide)
                    .addComponent(multiPly)
                    .addComponent(num_6)
                    .addComponent(num_5)
                    .addComponent(num_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Minus)
                            .addComponent(Addition))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(equal)
                            .addComponent(percentage)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num_1)
                            .addComponent(num_2)
                            .addComponent(num_3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num_0)
                            .addComponent(dot))))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalcTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcTextActionPerformed
      //  String str = CalcText.getText();
    }//GEN-LAST:event_CalcTextActionPerformed

    private void devideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devideActionPerformed
      num = Double.parseDouble(CalcText.getText());
      operators = '/';  
      CalcText.setText("");
      prev_calculation.setText(num+"/");
        
    }//GEN-LAST:event_devideActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
         Arithmatic_operation();
         prev_calculation.setText("");
    }//GEN-LAST:event_equalActionPerformed

    private void num_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_1ActionPerformed
       
           CalcText.setText(CalcText.getText()+"1");
         
           
      
    }//GEN-LAST:event_num_1ActionPerformed

    private void num_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_2ActionPerformed
             
         CalcText.setText(CalcText.getText() +  "2");           
    }//GEN-LAST:event_num_2ActionPerformed
  
    private void AdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdditionActionPerformed
      
      num = Double.parseDouble(CalcText.getText());
      operators = '+';  
      CalcText.setText("");
      prev_calculation.setText(num+"+");
      
      
    }//GEN-LAST:event_AdditionActionPerformed

    private void num_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_4ActionPerformed
         CalcText.setText(CalcText.getText() +  "4");
    }//GEN-LAST:event_num_4ActionPerformed

    private void offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offActionPerformed
        disable();
        CalcText.setText(" ");
        num = 0;
        result = 0;
    }//GEN-LAST:event_offActionPerformed

    private void num_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_3ActionPerformed
      CalcText.setText(CalcText.getText() +  "3");
    }//GEN-LAST:event_num_3ActionPerformed

    private void num_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_5ActionPerformed
         CalcText.setText(CalcText.getText() +  "5");
    }//GEN-LAST:event_num_5ActionPerformed

    private void num_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_6ActionPerformed
         CalcText.setText(CalcText.getText() +  "6");
    }//GEN-LAST:event_num_6ActionPerformed

    private void num_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_7ActionPerformed
         CalcText.setText(CalcText.getText() +  "7");
    }//GEN-LAST:event_num_7ActionPerformed

    private void num_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_8ActionPerformed
         CalcText.setText(CalcText.getText() +  "8");
    }//GEN-LAST:event_num_8ActionPerformed

    private void num_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_9ActionPerformed
         CalcText.setText(CalcText.getText() +  "9");
    }//GEN-LAST:event_num_9ActionPerformed

    private void num_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_0ActionPerformed
         CalcText.setText(CalcText.getText() +  "0");
    }//GEN-LAST:event_num_0ActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        CalcText.setText(CalcText.getText() +  ".");
    }//GEN-LAST:event_dotActionPerformed

    private void multiPlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiPlyActionPerformed
         num = Double.parseDouble(CalcText.getText());
      operators = 'x';  
      CalcText.setText("");
      prev_calculation.setText(num+"x");
    }//GEN-LAST:event_multiPlyActionPerformed

    private void MinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusActionPerformed
        num = Double.parseDouble(CalcText.getText());
      operators = '-';  
      CalcText.setText("");
      prev_calculation.setText(num+"-");
    }//GEN-LAST:event_MinusActionPerformed

    private void AllClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllClearActionPerformed
        CalcText.setText("");
        num = 0;
        result = 0;
    }//GEN-LAST:event_AllClearActionPerformed

    private void ONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ONActionPerformed
       Enable();
    }//GEN-LAST:event_ONActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int length = CalcText.getText().length();
        int num = CalcText.getText().length()-1;
        String store;
        if(length > 0){
            StringBuilder back =  new StringBuilder(CalcText.getText());
            back.deleteCharAt(num);
            store = back.toString();
            CalcText.setText(store);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void percentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentageActionPerformed
      num = Double.parseDouble(CalcText.getText());
      operators = '%';  
      CalcText.setText("");
      prev_calculation.setText(num+"%");
    }//GEN-LAST:event_percentageActionPerformed
  
    
    public static void main(String args[]) {
       
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sample_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sample_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sample_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sample_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sample_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addition;
    private javax.swing.JButton AllClear;
    private javax.swing.JTextField CalcText;
    private javax.swing.JButton Minus;
    private javax.swing.JRadioButton ON;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton delete;
    private javax.swing.JButton devide;
    private javax.swing.JButton dot;
    private javax.swing.JButton equal;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JButton multiPly;
    private javax.swing.JButton num_0;
    private javax.swing.JButton num_1;
    private javax.swing.JButton num_2;
    private javax.swing.JButton num_3;
    private javax.swing.JButton num_4;
    private javax.swing.JButton num_5;
    private javax.swing.JButton num_6;
    private javax.swing.JButton num_7;
    private javax.swing.JButton num_8;
    private javax.swing.JButton num_9;
    private javax.swing.JRadioButton off;
    private javax.swing.JButton percentage;
    private javax.swing.JLabel prev_calculation;
    // End of variables declaration//GEN-END:variables
}
