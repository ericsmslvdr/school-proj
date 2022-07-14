
import java.awt.Toolkit;

public class EnrollForm extends javax.swing.JFrame {

    public EnrollForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelStudentNumber = new javax.swing.JLabel();
        labelFullName = new javax.swing.JLabel();
        labelCourse = new javax.swing.JLabel();
        labelYear = new javax.swing.JLabel();
        labelTotalUnitsEnrolled = new javax.swing.JLabel();
        labelPricePerUnit = new javax.swing.JLabel();
        labelTotalMiscellaneous = new javax.swing.JLabel();
        tfStudentNumber = new javax.swing.JTextField();
        tfFullName = new javax.swing.JTextField();
        tfTotalUnitsEnrolled = new javax.swing.JTextField();
        tfPricePerUnit = new javax.swing.JTextField();
        tfMiscellaneous = new javax.swing.JTextField();
        cbCourse = new javax.swing.JComboBox<>();
        cbYear = new javax.swing.JComboBox<>();
        labelScholarshipType = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rbFullScholarship = new javax.swing.JRadioButton();
        rbNonScholar = new javax.swing.JRadioButton();
        rbPartialScholarship = new javax.swing.JRadioButton();
        cbDiscount = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        rbCash = new javax.swing.JRadioButton();
        rbBank = new javax.swing.JRadioButton();
        cbBank = new javax.swing.JComboBox<>();
        labelPaymentOption = new javax.swing.JLabel();
        btnProcessEnrollment = new javax.swing.JButton();
        labelEnrollmentInformation = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        labelStudentNumberOutput = new javax.swing.JLabel();
        labelFullNameOutput = new javax.swing.JLabel();
        labelCourseOutput = new javax.swing.JLabel();
        labelYearOutput = new javax.swing.JLabel();
        labelTotalUnitsEnrolledOutput = new javax.swing.JLabel();
        labelPricePerUnitOutput = new javax.swing.JLabel();
        lableTotalMiscellaneousOutput = new javax.swing.JLabel();
        tfStudentNumberOutput = new javax.swing.JTextField();
        tfFullNameOutput = new javax.swing.JTextField();
        tfTotalUnitsEnrolledOutput = new javax.swing.JTextField();
        tfPricePerUnitOutput = new javax.swing.JTextField();
        tfMiscellaneousOutput = new javax.swing.JTextField();
        labelScholarshipTypeOutput = new javax.swing.JLabel();
        tfCourseOutput = new javax.swing.JTextField();
        cbYear1 = new javax.swing.JTextField();
        labelPaymentOptionOutput = new javax.swing.JLabel();
        labelDiscountAmountOutput = new javax.swing.JLabel();
        labelTotalAmountOutput = new javax.swing.JLabel();
        tfScholarTypeOutput = new javax.swing.JTextField();
        tfPaymentOptionOutput = new javax.swing.JTextField();
        tfDiscountAmountOutput = new javax.swing.JTextField();
        tfTotalAmountOutput = new javax.swing.JTextField();
        labelTuitionFeeOutput = new javax.swing.JLabel();
        tfTuitionFeeOutput = new javax.swing.JTextField();
        labelStudentInformation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini Enrollment System");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("assets/student_male_32px.png")));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labelStudentNumber.setText("Student Number:");

        labelFullName.setText("Full Name:");

        labelCourse.setText("Course:");

        labelYear.setText("Year:");

        labelTotalUnitsEnrolled.setText("Total Units Enrolled:");

        labelPricePerUnit.setText("Price per Unit:");

        labelTotalMiscellaneous.setText("Total Miscellaneous:");

        cbCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BS Information Technology", "BS Computer Engineering", "BS Psychology", "BS Accountancy", "BS Business Administration", "BS Hospitality Management" }));

        cbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st Year", "2nd Year", "3rd Year", "4th Year" }));

        labelScholarshipType.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelScholarshipType.setText("Scholarship Types:");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup1.add(rbFullScholarship);
        rbFullScholarship.setText("Full Scholarship");

        buttonGroup1.add(rbNonScholar);
        rbNonScholar.setText("Non-Scholar");

        buttonGroup1.add(rbPartialScholarship);
        rbPartialScholarship.setText("Partial Scholarship");

        cbDiscount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "25%", "50%", "75%" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbFullScholarship)
                    .addComponent(rbNonScholar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbPartialScholarship)
                        .addGap(18, 18, 18)
                        .addComponent(cbDiscount, 0, 139, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rbFullScholarship)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbNonScholar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPartialScholarship)
                    .addComponent(cbDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buttonGroup2.add(rbCash);
        rbCash.setText("Cash");

        buttonGroup2.add(rbBank);
        rbBank.setText("Bank");

        cbBank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BDO", "BPI", "CHINABANK", "METROBANK", "RCBC" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbCash)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rbBank)
                        .addGap(94, 94, 94)
                        .addComponent(cbBank, 0, 145, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(rbCash)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbBank)
                    .addComponent(cbBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        labelPaymentOption.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelPaymentOption.setText("Payment Option");

        btnProcessEnrollment.setForeground(new java.awt.Color(0, 0, 255));
        btnProcessEnrollment.setText("Process Enrollment");
        btnProcessEnrollment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProcessEnrollment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessEnrollmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnProcessEnrollment)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPaymentOption)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelStudentNumber)
                                    .addComponent(labelFullName)
                                    .addComponent(labelCourse)
                                    .addComponent(labelYear)
                                    .addComponent(labelTotalUnitsEnrolled)
                                    .addComponent(labelPricePerUnit)
                                    .addComponent(labelTotalMiscellaneous)
                                    .addComponent(labelScholarshipType))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfMiscellaneous)
                                    .addComponent(tfPricePerUnit)
                                    .addComponent(tfStudentNumber)
                                    .addComponent(tfFullName)
                                    .addComponent(tfTotalUnitsEnrolled)
                                    .addComponent(cbCourse, 0, 157, Short.MAX_VALUE)
                                    .addComponent(cbYear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStudentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelStudentNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFullName)
                    .addComponent(tfFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCourse))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelYear)
                    .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTotalUnitsEnrolled)
                    .addComponent(tfTotalUnitsEnrolled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPricePerUnit)
                    .addComponent(tfPricePerUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTotalMiscellaneous)
                    .addComponent(tfMiscellaneous, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelScholarshipType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPaymentOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnProcessEnrollment)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 500));

        labelEnrollmentInformation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelEnrollmentInformation.setText("ENROLLMENT INFORMATION");
        getContentPane().add(labelEnrollmentInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        labelStudentNumberOutput.setText("Student Number:");

        labelFullNameOutput.setText("Full Name:");

        labelCourseOutput.setText("Course:");

        labelYearOutput.setText("Year:");

        labelTotalUnitsEnrolledOutput.setText("Total Units Enrolled:");

        labelPricePerUnitOutput.setText("Price per Unit:");

        lableTotalMiscellaneousOutput.setText("Total Miscellaneous:");

        tfStudentNumberOutput.setEditable(false);
        tfStudentNumberOutput.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tfFullNameOutput.setEditable(false);

        tfTotalUnitsEnrolledOutput.setEditable(false);

        tfPricePerUnitOutput.setEditable(false);

        tfMiscellaneousOutput.setEditable(false);

        labelScholarshipTypeOutput.setText("Scholarship Types:");

        tfCourseOutput.setEditable(false);

        cbYear1.setEditable(false);

        labelPaymentOptionOutput.setText("Payment Option");

        labelDiscountAmountOutput.setText("Discounted Amount");

        labelTotalAmountOutput.setText("Total Amount to be Paid");

        tfScholarTypeOutput.setEditable(false);

        tfPaymentOptionOutput.setEditable(false);

        tfDiscountAmountOutput.setEditable(false);

        tfTotalAmountOutput.setEditable(false);

        labelTuitionFeeOutput.setText("Tuition Fee");

        tfTuitionFeeOutput.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTuitionFeeOutput)
                            .addComponent(labelStudentNumberOutput)
                            .addComponent(labelFullNameOutput)
                            .addComponent(labelCourseOutput)
                            .addComponent(labelYearOutput)
                            .addComponent(labelTotalUnitsEnrolledOutput)
                            .addComponent(labelPricePerUnitOutput))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfCourseOutput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(tfPricePerUnitOutput)
                            .addComponent(tfStudentNumberOutput)
                            .addComponent(tfFullNameOutput)
                            .addComponent(tfTotalUnitsEnrolledOutput)
                            .addComponent(cbYear1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDiscountAmountOutput)
                            .addComponent(labelScholarshipTypeOutput)
                            .addComponent(lableTotalMiscellaneousOutput)
                            .addComponent(labelPaymentOptionOutput))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTuitionFeeOutput)
                            .addComponent(tfPaymentOptionOutput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfScholarTypeOutput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfMiscellaneousOutput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(tfDiscountAmountOutput)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labelTotalAmountOutput)
                        .addGap(18, 18, 18)
                        .addComponent(tfTotalAmountOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStudentNumberOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelStudentNumberOutput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFullNameOutput)
                    .addComponent(tfFullNameOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCourseOutput)
                    .addComponent(tfCourseOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelYearOutput)
                    .addComponent(cbYear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTotalUnitsEnrolledOutput)
                    .addComponent(tfTotalUnitsEnrolledOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPricePerUnitOutput)
                    .addComponent(tfPricePerUnitOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTuitionFeeOutput)
                    .addComponent(tfTuitionFeeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lableTotalMiscellaneousOutput)
                    .addComponent(tfMiscellaneousOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelScholarshipTypeOutput)
                    .addComponent(tfScholarTypeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPaymentOptionOutput)
                    .addComponent(tfPaymentOptionOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDiscountAmountOutput)
                    .addComponent(tfDiscountAmountOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTotalAmountOutput)
                    .addComponent(tfTotalAmountOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        labelStudentInformation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelStudentInformation.setText("STUDENT INFORMATION");
        getContentPane().add(labelStudentInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        setSize(new java.awt.Dimension(708, 579));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessEnrollmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessEnrollmentActionPerformed

        String studentNum = tfStudentNumber.getText();
        String fullName = tfFullName.getText();
        String course = String.valueOf(cbCourse.getSelectedItem());
        String year = String.valueOf(cbYear.getSelectedItem());
        int pricePerUnit = Integer.parseInt(tfPricePerUnit.getText());
        int totalUnitsEnrolled = Integer.parseInt(tfTotalUnitsEnrolled.getText());
        int miscellaneous = Integer.parseInt(tfMiscellaneous.getText());

        setStudentNumber(studentNum);

        setFullName(fullName);

        setCourse(course);

        setYear(year);

        setPricePerUnit(pricePerUnit);

        setTotalUnitsEnrolled(totalUnitsEnrolled);

        setMiscellaneous(miscellaneous);

        setTuitionFee(totalUnitsEnrolled, pricePerUnit);
        int tuitionFee = getTuitionFee();

        setScholarshipType();

        setPaymentOption();
        setTuitionFee(totalUnitsEnrolled, pricePerUnit);
        setAmountDiscounted(tuitionFee, miscellaneous);
        double amountDiscount = getAmountDiscounted();

        setTotalAmount(tuitionFee, miscellaneous, amountDiscount);

        printInfo(tuitionFee, amountDiscount);

    }//GEN-LAST:event_btnProcessEnrollmentActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EnrollForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnrollForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnrollForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnrollForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnrollForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcessEnrollment;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbBank;
    private javax.swing.JComboBox<String> cbCourse;
    private javax.swing.JComboBox<String> cbDiscount;
    private javax.swing.JComboBox<String> cbYear;
    private javax.swing.JTextField cbYear1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelCourse;
    private javax.swing.JLabel labelCourseOutput;
    private javax.swing.JLabel labelDiscountAmountOutput;
    private javax.swing.JLabel labelEnrollmentInformation;
    private javax.swing.JLabel labelFullName;
    private javax.swing.JLabel labelFullNameOutput;
    private javax.swing.JLabel labelPaymentOption;
    private javax.swing.JLabel labelPaymentOptionOutput;
    private javax.swing.JLabel labelPricePerUnit;
    private javax.swing.JLabel labelPricePerUnitOutput;
    private javax.swing.JLabel labelScholarshipType;
    private javax.swing.JLabel labelScholarshipTypeOutput;
    private javax.swing.JLabel labelStudentInformation;
    private javax.swing.JLabel labelStudentNumber;
    private javax.swing.JLabel labelStudentNumberOutput;
    private javax.swing.JLabel labelTotalAmountOutput;
    private javax.swing.JLabel labelTotalMiscellaneous;
    private javax.swing.JLabel labelTotalUnitsEnrolled;
    private javax.swing.JLabel labelTotalUnitsEnrolledOutput;
    private javax.swing.JLabel labelTuitionFeeOutput;
    private javax.swing.JLabel labelYear;
    private javax.swing.JLabel labelYearOutput;
    private javax.swing.JLabel lableTotalMiscellaneousOutput;
    private javax.swing.JRadioButton rbBank;
    private javax.swing.JRadioButton rbCash;
    private javax.swing.JRadioButton rbFullScholarship;
    private javax.swing.JRadioButton rbNonScholar;
    private javax.swing.JRadioButton rbPartialScholarship;
    private javax.swing.JTextField tfCourseOutput;
    private javax.swing.JTextField tfDiscountAmountOutput;
    private javax.swing.JTextField tfFullName;
    private javax.swing.JTextField tfFullNameOutput;
    private javax.swing.JTextField tfMiscellaneous;
    private javax.swing.JTextField tfMiscellaneousOutput;
    private javax.swing.JTextField tfPaymentOptionOutput;
    private javax.swing.JTextField tfPricePerUnit;
    private javax.swing.JTextField tfPricePerUnitOutput;
    private javax.swing.JTextField tfScholarTypeOutput;
    private javax.swing.JTextField tfStudentNumber;
    private javax.swing.JTextField tfStudentNumberOutput;
    private javax.swing.JTextField tfTotalAmountOutput;
    private javax.swing.JTextField tfTotalUnitsEnrolled;
    private javax.swing.JTextField tfTotalUnitsEnrolledOutput;
    private javax.swing.JTextField tfTuitionFeeOutput;
    // End of variables declaration//GEN-END:variables

    private String studentNumber;
    private String fullName;
    private String course;
    private String year;
    private int totalUnitsEnrolled;
    private int pricePerUnit;
    private int tuitionFee;
    private int miscellaneous;
    private String scholarshipType;
    private String paymentOption;
    private double amountDiscounted;
    private double totalAmount;

    public void setStudentNumber(String studentNum) {
        this.studentNumber = studentNum;
    }

    public String getStudentNumber() {
        return this.studentNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullname() {
        return this.fullName;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return this.course;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return this.year;
    }

    public void setTotalUnitsEnrolled(int totalUnitsEnrolled) {
        this.totalUnitsEnrolled = totalUnitsEnrolled;
    }

    public int getTotalUnitsEnrolled() {
        return this.totalUnitsEnrolled;
    }

    public void setPricePerUnit(int pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public int getPricePerUnit() {
        return this.pricePerUnit;
    }

    public void setTuitionFee(int totalUnitsEnrolled, int pricePerUnit) {
        int tuitionFee = 0;
        tuitionFee = getTotalUnitsEnrolled() * getPricePerUnit();
        this.tuitionFee = tuitionFee;
    }

    public int getTuitionFee() {
        return this.tuitionFee;
    }

    public void setMiscellaneous(int miscellaneous) {
        this.miscellaneous = miscellaneous;
    }

    public double getMiscellaneous() {
        return this.miscellaneous;
    }

    public void setScholarshipType() {
        String scholarType = "";
        if (rbFullScholarship.isSelected()) {
            scholarType = "Full Scholarship";
        } else if (rbNonScholar.isSelected()) {
            scholarType = "Non-Scholar";
        } else if (rbPartialScholarship.isSelected()) {
            scholarType = "Partial Scholarship - " + String.valueOf(cbDiscount.getSelectedItem());
        }
        this.scholarshipType = scholarType;
    }

    public String getScholarshipType() {
        return this.scholarshipType;
    }

    public void setPaymentOption() {
        String paymentOption = "";
        if (rbCash.isSelected() == true) {
            paymentOption = "Cash";
        } else {
            paymentOption = "Bank - " + String.valueOf(cbBank.getSelectedItem());
        }
        this.paymentOption = paymentOption;
    }

    public String getPaymentOption() {
        return paymentOption;
    }

    public void setAmountDiscounted(int tuitionFee, int miscellaneous) {
        double amountDiscounted = 0.0;
        double subTuitionFee = tuitionFee + miscellaneous;
        double percent;
        String discount = String.valueOf(cbDiscount.getSelectedItem());

        if (rbFullScholarship.isSelected()) {
            amountDiscounted = subTuitionFee;
        }
        if (rbPartialScholarship.isSelected()) {
            switch (discount) {
                case "25%":
                    percent = 0.25;
                    break;
                case "50%":
                    percent = 0.50;
                    break;
                case "75%":
                    percent = 0.75;
                    break;
                default:
                    throw new AssertionError();
            }
            amountDiscounted = percent * subTuitionFee;
        }
        this.amountDiscounted = amountDiscounted;
    }

    public double getAmountDiscounted() {
        return this.amountDiscounted;
    }

    public void setTotalAmount(int tuitionFee, int miscellaneous, double amountDiscount) {
        double totalAmount = 0;
        totalAmount = (tuitionFee + miscellaneous) - amountDiscounted;

        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() {
        return this.totalAmount;
    }

    public void printInfo(int tuitionFee, double amountDiscount) {
        tfStudentNumberOutput.setText(getStudentNumber());
        tfFullNameOutput.setText(getFullname());
        tfTotalUnitsEnrolledOutput.setText(String.valueOf(getTotalUnitsEnrolled()));
        tfPricePerUnitOutput.setText(String.valueOf(getPricePerUnit()));
        tfMiscellaneousOutput.setText(String.valueOf(getMiscellaneous()));
        tfCourseOutput.setText(getCourse());
        cbYear1.setText(getYear());
        tfTuitionFeeOutput.setText(String.valueOf(tuitionFee));
        tfScholarTypeOutput.setText(getScholarshipType());
        tfPaymentOptionOutput.setText(getPaymentOption());
        tfDiscountAmountOutput.setText(String.valueOf(amountDiscount));
        tfTotalAmountOutput.setText(String.valueOf(getTotalAmount()));
    }
}
