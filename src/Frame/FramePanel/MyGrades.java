/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame.FramePanel;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import trainingcentersystem.Student;

/**
 *
 * @author DELL
 */
public class MyGrades extends javax.swing.JPanel {

    /**
     * Creates new form MyGrades
     */
    private void setColor(JPanel p)
    {
        p.setBackground(new java.awt.Color(0,64,128));
    }
    private void getColor(JPanel p)
    {
        p.setBackground(new java.awt.Color(105,105,105));
    }
    public MyGrades() {
        initComponents();
        jPanelWrongEmail.setVisible(false);
        jPanelwrongPass.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldEmailLogin = new javax.swing.JTextField();
        jPasswordFieldPassLogin = new javax.swing.JPasswordField();
        jLabelSuccessORFail = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldMidTerm = new javax.swing.JTextField();
        jTextFieldCourseWork = new javax.swing.JTextField();
        jTextFieldFinal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxResgisteredCourse = new javax.swing.JComboBox<>();
        jTextFieldId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelWrongEmail = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanelwrongPass = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(105, 105, 105));

        jLabel16.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Email");

        jLabel17.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Password");

        jTextFieldEmailLogin.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jTextFieldEmailLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPasswordFieldPassLogin.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jPasswordFieldPassLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabelSuccessORFail.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabelSuccessORFail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSuccessORFail.setText("Your Grades");

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Course Work");

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mid Term Exam");

        jLabel12.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Final Exam");

        jTextFieldMidTerm.setEditable(false);
        jTextFieldMidTerm.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextFieldMidTerm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldMidTerm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextFieldCourseWork.setEditable(false);
        jTextFieldCourseWork.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextFieldCourseWork.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCourseWork.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextFieldCourseWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCourseWorkActionPerformed(evt);
            }
        });

        jTextFieldFinal.setEditable(false);
        jTextFieldFinal.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextFieldFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldFinal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("your resgistered Courses");

        jComboBoxResgisteredCourse.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jComboBoxResgisteredCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBoxResgisteredCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxResgisteredCourseActionPerformed(evt);
            }
        });

        jTextFieldId.setEditable(false);
        jTextFieldId.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextFieldId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID ");

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total Grades ");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(105, 105, 105));

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Signin_48px.png"))); // NOI18N
        jLabel3.setText("SignIn");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(0, 0, 0))
        );

        jPanelWrongEmail.setBackground(new java.awt.Color(105, 105, 105));

        jLabel20.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Cancel_20px.png"))); // NOI18N
        jLabel20.setText("Wrong Email");

        javax.swing.GroupLayout jPanelWrongEmailLayout = new javax.swing.GroupLayout(jPanelWrongEmail);
        jPanelWrongEmail.setLayout(jPanelWrongEmailLayout);
        jPanelWrongEmailLayout.setHorizontalGroup(
            jPanelWrongEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWrongEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelWrongEmailLayout.setVerticalGroup(
            jPanelWrongEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWrongEmailLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel20))
        );

        jPanelwrongPass.setBackground(new java.awt.Color(105, 105, 105));

        jLabel18.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Cancel_20px.png"))); // NOI18N
        jLabel18.setText("Wrong Pass");

        javax.swing.GroupLayout jPanelwrongPassLayout = new javax.swing.GroupLayout(jPanelwrongPass);
        jPanelwrongPass.setLayout(jPanelwrongPassLayout);
        jPanelwrongPassLayout.setHorizontalGroup(
            jPanelwrongPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelwrongPassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelwrongPassLayout.setVerticalGroup(
            jPanelwrongPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelwrongPassLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldEmailLogin)
                            .addComponent(jPasswordFieldPassLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelWrongEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelwrongPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelSuccessORFail, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(275, 275, 275))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxResgisteredCourse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldFinal)
                            .addComponent(jTextFieldMidTerm)
                            .addComponent(jTextFieldCourseWork, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(165, 165, 165))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelSuccessORFail)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTextFieldEmailLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jPasswordFieldPassLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelWrongEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelwrongPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCourseWork, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldMidTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxResgisteredCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCourseWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCourseWorkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCourseWorkActionPerformed

    private void jComboBoxResgisteredCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxResgisteredCourseActionPerformed
        // TODO add your handling code here:
        Student x = new Student();
        x=x.getStudent(Integer.parseInt(jTextFieldId.getText()));
            double grades[]=x.getGrades();
            if(jComboBoxResgisteredCourse.getSelectedIndex()==0){
                jTextFieldCourseWork.setText(""+grades[0]);
                jTextFieldMidTerm.setText(""+grades[1]);
                jTextFieldFinal.setText(""+grades[2]);
            }
            else if(jComboBoxResgisteredCourse.getSelectedIndex()==1){
                jTextFieldCourseWork.setText(""+grades[3]);
                jTextFieldMidTerm.setText(""+grades[4]);
                jTextFieldFinal.setText(""+grades[5]);
            }
            else if(jComboBoxResgisteredCourse.getSelectedIndex()==2){
                jTextFieldCourseWork.setText(""+grades[6]);
                jTextFieldMidTerm.setText(""+grades[7]);
                jTextFieldFinal.setText(""+grades[8]);
            }
            else if(jComboBoxResgisteredCourse.getSelectedIndex()==3){
                jTextFieldCourseWork.setText(""+grades[9]);
                jTextFieldMidTerm.setText(""+grades[10]);
                jTextFieldFinal.setText(""+grades[11]);
            }
            else if(jComboBoxResgisteredCourse.getSelectedIndex()==4){
                jTextFieldCourseWork.setText(""+grades[12]);
                jTextFieldMidTerm.setText(""+grades[13]);
                jTextFieldFinal.setText(""+grades[14]);
            }
            else if(jComboBoxResgisteredCourse.getSelectedIndex()==5){
                jTextFieldCourseWork.setText(""+grades[15]);
                jTextFieldMidTerm.setText(""+grades[16]);
                jTextFieldFinal.setText(""+grades[17]);
            }
            else if(jComboBoxResgisteredCourse.getSelectedIndex()==6){
                jTextFieldCourseWork.setText(""+grades[18]);
                jTextFieldMidTerm.setText(""+grades[19]);
                jTextFieldFinal.setText(""+grades[20]);
            }
    }//GEN-LAST:event_jComboBoxResgisteredCourseActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        jComboBoxResgisteredCourse.setEditable(false);
        jPanelWrongEmail.setVisible(false);
        jPanelwrongPass.setVisible(false);
        
        if(!jTextFieldEmailLogin.getText().equals("")&&!jPasswordFieldPassLogin.getText().equals("")){
            Student x = new Student();
            if((x=x.openMyProfile(jTextFieldEmailLogin.getText(), jPasswordFieldPassLogin.getText()))!=null){
                jTextFieldId.setText(""+x.getID());
                jTextField1.setText(""+x.totalGrade(x));
                jTextFieldEmailLogin.setText("");
                jPasswordFieldPassLogin.setText("");
                String []subject = x.getCourses();
                jComboBoxResgisteredCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { 
                subject[0],subject[1],subject[2],subject[3],subject[4],subject[5],subject[6] }));
                jComboBoxResgisteredCourse.setEditable(true);
            }
            else{
                jLabelSuccessORFail.setText("Invalid ... !  Please try again");
                JOptionPane.showMessageDialog(null, "Email OR Password is Wrong OR both are Wrong ,Try Again :(");
                jPanelWrongEmail.setVisible(false);
                jPanelwrongPass.setVisible(false);
            }
        }
        else
        jLabelSuccessORFail.setText("Missing Required Email & Pass ... !  Please, complete them before Check ...! :(");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        setColor(jPanel1);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        getColor(jPanel1);
    }//GEN-LAST:event_jLabel3MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxResgisteredCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelSuccessORFail;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelWrongEmail;
    private javax.swing.JPanel jPanelwrongPass;
    private javax.swing.JPasswordField jPasswordFieldPassLogin;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldCourseWork;
    private javax.swing.JTextField jTextFieldEmailLogin;
    private javax.swing.JTextField jTextFieldFinal;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldMidTerm;
    // End of variables declaration//GEN-END:variables
}
