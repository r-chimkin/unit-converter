package Calcu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author user
 */
//Import for handling action events like button clicks
import java.awt.event.ActionEvent;

//Import AWT classes
import java.awt.*;

//Import for Swing classes 
import javax.swing.*;

//Import for arraylist
import java.util.List;
import java.util.ArrayList;

public class Calcu extends javax.swing.JFrame {

    /**
     * Creates new form Calcu
     */
    // Model to hold the list of answer history items 
    DefaultListModel<String> answerHistoryModel = new DefaultListModel<>();

    // JList component that displays the answer history 
    JList<String> answerHistoryList = new JList<>(answerHistoryModel);

    //Array List to store the original answers that
    List<String> originalAnswers = new ArrayList<>();

    public Calcu() {

        initComponents();
        //Set the model for the result list to display answer history
        resultList.setModel(answerHistoryModel);

        // show one item at a time
        answerHistoryList.setVisibleRowCount(1);

        // Add a default placeholder text to the answer history model
        answerHistoryModel.addElement("The answer will be shown here");

        //Change the btnSwap appereance 
        btnSwap.setContentAreaFilled(false);
        btnSwap.setBorderPainted(false);
        btnSwap.setFocusPainted(false);
        btnSwap.setOpaque(false);

        //Change the btnCalculate apperance
        btnCalculate.setContentAreaFilled(false);
        btnCalculate.setOpaque(true);

        //Change the btnClear appearance
        btnClear.setContentAreaFilled(false);
        btnClear.setOpaque(true);

        //Change the toggleDecimalFormat appearance
        toggleDecimalFormat.setContentAreaFilled(false);
        toggleDecimalFormat.setBorderPainted(false);
        toggleDecimalFormat.setFocusPainted(false);
        toggleDecimalFormat.setOpaque(true);

        //Pack the frame components tightly
        this.pack();

        //Center the frame on the screen
        this.setLocationRelativeTo(null);

        // Make the frame visible
        this.setVisible(true);

        //Set the main title text
        titleLabel.setText("Distance Converter");

        // Set the sub text for input and output
        subLabel.setText("Value to Convert");
        subLabel2.setText("Answer: ");

        //Set labels for unit selection
        subLabel4.setText("from:");
        subLabel5.setText("to:");

        //Clear the user Input Field
        userInputField.setText(null);

        // Initialize Unit System Comboboxes with Imperial and Metric Option 
        unitSystemComboBox1.removeAllItems();
        unitSystemComboBox1.addItem("Imperial");
        unitSystemComboBox1.addItem("Metric");
        unitSystemComboBox2.removeAllItems();
        unitSystemComboBox2.addItem("Metric");
        unitSystemComboBox2.addItem("Imperial");

        // Set text for Calculate and Clear button
        btnCalculate.setText("Convert");
        btnClear.setText("Clear");

        //Set custom render for comboboxes
        unitSystemComboBox1.setRenderer(new CustomComboBoxRenderer());
        unitSystemComboBox2.setRenderer(new CustomComboBoxRenderer());
        unitComboBox1.setRenderer(new CustomComboBoxRenderer());
        unitComboBox2.setRenderer(new CustomComboBoxRenderer());

    }

    public class CustomComboBoxRenderer extends DefaultListCellRenderer {

        @Override
        public java.awt.Component getListCellRendererComponent(javax.swing.JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            javax.swing.JLabel label = (javax.swing.JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

            //Set the foreground color of the label to a  green 
            label.setForeground(new Color(29, 191, 115));

            // Set the background and foreground colors of the calculate button green 
            btnCalculate.setBackground(new Color(29, 191, 115));
            btnCalculate.setForeground(new Color(0, 0, 0));

            //Set the background and foreground colors of the clear button to green 
            btnClear.setBackground(new Color(29, 191, 115));
            btnClear.setForeground(new Color(0, 0, 0));

            //Set the background and foreground colors of the toggle button to green 
            toggleDecimalFormat.setBackground(new Color(29, 191, 115));
            toggleDecimalFormat.setForeground(new Color(0, 0, 0));

            //Set the background color of the combo boxes to white
            unitSystemComboBox1.setBackground(Color.WHITE);
            unitSystemComboBox2.setBackground(Color.WHITE);
            unitComboBox1.setBackground(Color.WHITE);
            unitComboBox2.setBackground(Color.WHITE);

            return label;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        subLabel = new javax.swing.JLabel();
        subLabel2 = new javax.swing.JLabel();
        btnSwap = new javax.swing.JButton();
        userInputField = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        subLabel4 = new javax.swing.JLabel();
        unitSystemComboBox1 = new javax.swing.JComboBox<>();
        unitComboBox1 = new javax.swing.JComboBox<>();
        unitSystemComboBox2 = new javax.swing.JComboBox<>();
        subLabel5 = new javax.swing.JLabel();
        unitComboBox2 = new javax.swing.JComboBox<>();
        JScrollPanel = new javax.swing.JScrollPane();
        resultList = new javax.swing.JList<>();
        toggleDecimalFormat = new javax.swing.JToggleButton();

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(44, 44, 44));
        jPanel2.setMaximumSize(new java.awt.Dimension(600, 400));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(29, 191, 115));
        titleLabel.setText("Distance Converter");
        jPanel2.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 340, 40));

        btnCalculate.setBackground(new java.awt.Color(0, 223, 145));
        btnCalculate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnCalculate.setForeground(new java.awt.Color(0, 0, 0));
        btnCalculate.setText("Convert");
        btnCalculate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 68, 68)));
        btnCalculate.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                btnCalculateComponentShown(evt);
            }
        });
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        jPanel2.add(btnCalculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 100, 30));

        subLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        subLabel.setForeground(new java.awt.Color(240, 240, 240));
        subLabel.setText("Value to convert");
        jPanel2.add(subLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 110, -1));

        subLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        subLabel2.setForeground(new java.awt.Color(240, 240, 240));
        subLabel2.setText("Answer:");
        jPanel2.add(subLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 60, -1));

        btnSwap.setBackground(new java.awt.Color(44, 44, 44));
        btnSwap.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnSwap.setForeground(new java.awt.Color(255, 255, 255));
        btnSwap.setText("<html>\n<b style = \"font-size: 30px; color: #1dbf73;\">⇔</b>\n</html>");
        btnSwap.setBorder(null);
        btnSwap.setOpaque(false);
        btnSwap.setPreferredSize(new java.awt.Dimension(30, 30));
        btnSwap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwapActionPerformed(evt);
            }
        });
        jPanel2.add(btnSwap, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 70, 50));

        userInputField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        userInputField.setForeground(new java.awt.Color(43, 43, 43));
        userInputField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInputFieldActionPerformed(evt);
            }
        });
        userInputField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userInputFieldKeyTyped(evt);
            }
        });
        jPanel2.add(userInputField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 190, 30));

        btnClear.setBackground(new java.awt.Color(0, 223, 145));
        btnClear.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 0, 0));
        btnClear.setText("Clear");
        btnClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 68, 68)));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 70, 30));

        subLabel4.setBackground(new java.awt.Color(240, 240, 240));
        subLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        subLabel4.setForeground(new java.awt.Color(212, 212, 212));
        subLabel4.setText("from:");
        jPanel2.add(subLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        unitSystemComboBox1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        unitSystemComboBox1.setForeground(new java.awt.Color(29, 191, 155));
        unitSystemComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        unitSystemComboBox1.setBorder(null);
        unitSystemComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        unitSystemComboBox1.setMaximumSize(new java.awt.Dimension(80, 30));
        unitSystemComboBox1.setName(""); // NOI18N
        unitSystemComboBox1.setPreferredSize(new java.awt.Dimension(90, 35));
        unitSystemComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitSystemComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(unitSystemComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 110, -1));

        unitComboBox1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        unitComboBox1.setForeground(new java.awt.Color(29, 191, 155));
        unitComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        unitComboBox1.setBorder(null);
        unitComboBox1.setPreferredSize(new java.awt.Dimension(90, 35));
        unitComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(unitComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 110, -1));

        unitSystemComboBox2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        unitSystemComboBox2.setForeground(new java.awt.Color(29, 191, 155));
        unitSystemComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        unitSystemComboBox2.setBorder(null);
        unitSystemComboBox2.setMaximumSize(new java.awt.Dimension(80, 30));
        unitSystemComboBox2.setPreferredSize(new java.awt.Dimension(90, 35));
        unitSystemComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitSystemComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(unitSystemComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 110, -1));

        subLabel5.setBackground(new java.awt.Color(255, 255, 255));
        subLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        subLabel5.setForeground(new java.awt.Color(240, 240, 240));
        subLabel5.setText("to:");
        jPanel2.add(subLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 20, 20));

        unitComboBox2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        unitComboBox2.setForeground(new java.awt.Color(29, 191, 155));
        unitComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        unitComboBox2.setBorder(null);
        unitComboBox2.setPreferredSize(new java.awt.Dimension(90, 35));
        unitComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(unitComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 110, -1));

        resultList.setBackground(new java.awt.Color(46, 46, 46));
        resultList.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        resultList.setForeground(new java.awt.Color(255, 255, 255));
        resultList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultListMouseClicked(evt);
            }
        });
        JScrollPanel.setViewportView(resultList);

        jPanel2.add(JScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 440, 30));

        toggleDecimalFormat.setBackground(new java.awt.Color(0, 223, 145));
        toggleDecimalFormat.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        toggleDecimalFormat.setForeground(new java.awt.Color(0, 0, 0));
        toggleDecimalFormat.setText("≈ 0.00");
        toggleDecimalFormat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleDecimalFormatActionPerformed(evt);
            }
        });
        jPanel2.add(toggleDecimalFormat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unitSystemComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitSystemComboBox1ActionPerformed
        // ActionListener for unitSystemComboBox1 to update items in unitComboBox1 based on the selected item in unitSystemComboBox2
        unitSystemComboBox1.addActionListener((ActionEvent e) -> {
            String selectedUnitSystem = (String) unitSystemComboBox1.getSelectedItem(); // Get the selected unit system selected by the user from unitSystemComboBox1

            //Removes all the items in the unitComboBox
            unitComboBox1.removeAllItems();

            if ("Imperial".equals(selectedUnitSystem)) {                        //Check if the selected unit system is "Imperial"
                unitComboBox1.addItem("Inch");                                //Add Inches unit to ComboBox if Imperial is selected
                unitComboBox1.addItem("Foot");                                  //Add Feet unit to ComboBox if Imperial is selected
                unitComboBox1.addItem("Yard");                                 //Add Yards unit to ComboBox if Imperial is selected
                unitComboBox1.addItem("Mile");                                 //Add Miles unit to ComboBox if Imperial is selected
            } else if ("Metric".equals(selectedUnitSystem)) {                   //Check if the selected unit system is "Metric"
                unitComboBox1.addItem("Millimeter");                            //Add Millimeter unit to ComboBox if Imperial is selected
                unitComboBox1.addItem("Centimeter");                            //Add Centimeter unit to ComboBox if Imperial is selected
                unitComboBox1.addItem("Decimeter");                             //Add Decimeter unit to ComboBox if Imperial is selected
                unitComboBox1.addItem("Meter");                                 //Add Meter unit to ComboBox if Imperial is selected
                unitComboBox1.addItem("Decameter");                             //Add Decaneter unit to ComboBox if Imperial is selected
                unitComboBox1.addItem("Hectometer");                            //Add Hectometer unit to ComboBox if Imperial is selected
                unitComboBox1.addItem("Kilometer");                             //Add  unit to ComboBox if Imperial is selected
            }
        } // Get the selected unit system selected by the user from unitSystemComboBox1
        );


    }//GEN-LAST:event_unitSystemComboBox1ActionPerformed

    private void unitSystemComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitSystemComboBox2ActionPerformed
        // ActionListener for unitSystemComboBox2 to update items in unitComboBox2 based on the selected item in unitSystemComboBox2
        unitSystemComboBox2.addActionListener((ActionEvent e) -> {
            String selected = (String) unitSystemComboBox2.getSelectedItem(); // Get the selected unit system selected by the user from unitSystemComboBox

            //Removes all the items in the unitComboBox
            unitComboBox2.removeAllItems();

            if ("Imperial".equals(selected)) {                                  //Check if the selected unit system is "Imperial"
                unitComboBox2.addItem("Inch");                                //Add Inches unit to ComboBox if Imperial is selected
                unitComboBox2.addItem("Foot");                                  //Add Feet unit to ComboBox if Imperial is selected
                unitComboBox2.addItem("Yard");                                 //Add Yards unit to ComboBox if Imperial is selected
                unitComboBox2.addItem("Mile");                                 //Add Miles unit to ComboBox if Imperial is selected
            } else if ("Metric".equals(selected)) {                             //Check if the selected unit system is "Metric"
                unitComboBox2.addItem("Millimeter");                            //Add Milimeter unit to ComboBox if Imperial is selected
                unitComboBox2.addItem("Centimeter");                            //Add Centimeter unit to ComboBox if Imperial is selected
                unitComboBox2.addItem("Decimeter");                             //Add Decimeter unit to ComboBox if Imperial is selected
                unitComboBox2.addItem("Meter");                                 //Add Meter unit to ComboBox if Imperial is selected
                unitComboBox2.addItem("Decameter");                             //Add Decameter unit to ComboBox if Imperial is selected
                unitComboBox2.addItem("Hectometer");                            //Add Hectometer unit to ComboBox if Imperial is selected
                unitComboBox2.addItem("Kilometer");                             //Add Kilometer unit to ComboBox if Imperial is selected
            }
        });
    }//GEN-LAST:event_unitSystemComboBox2ActionPerformed

    private void userInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userInputFieldActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // Convert the user input from the input field to a double
        double inputValue = Double.parseDouble(userInputField.getText());

        //Get the selected unit from the combo box
        String sourceUnit = (String) unitComboBox1.getSelectedItem();           // The unit to convert
        String targetUnit = (String) unitComboBox2.getSelectedItem();           // The unit to convert it to
        String convertionDescription = sourceUnit + " to " + targetUnit;        // The varaible you put in switch case 
        double formula;                                                         // variable that will store the formula for each convertion 
        String convert = "0";                                                   // variable that will hold the value after conversion
        String answerWithUnit;                                                  // combine the answer with unit  
        String fullEntry;                                                       // the full answer to be put in historyList and array list

        jLabel5.setText(null);

        switch (convertionDescription) {
            case "Inch to Millimeter" -> {
                formula = inputValue * 25.4;                                    //Does the conversion 
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " mm");                             //Combine the converted answer with the unit 
                fullEntry = (answerWithUnit + "  " + "(1 in = 25.4 mm)");       // the full Entry
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to the ArrayList 
            }
            case "Inch to Centimeter" -> {
                formula = inputValue * 2.54;                                    //Does the conversion 
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " cm");                             //Combine the converted answer with the unit 
                fullEntry = (answerWithUnit + "   " + "(1 in = 25.4 cm)");      // The full  Entry
                answerHistoryModel.addElement(answerWithUnit + " cm");          //Add the answer to the historylist
                originalAnswers.add(fullEntry);                                 //Add the answer to the ArrayList 
            }
            case "Inch to Decimeter" -> {
                formula = inputValue * 0.254;                                   //Does the conversion 
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " dm");                             //Combine the converted answer with the unit 
                fullEntry = (answerWithUnit + "   " + "(1 in = 0.254 dm)");     // The full  Entry
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to the ArrayList 
            }
            case "Inch to Meter" -> {
                formula = inputValue * 0.0254;                                  //Does the conversion 
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " m");                              //combine the converted answer with the unit
                fullEntry = (answerWithUnit + "   " + "(1 in = 0.0254 m)");     //Combination of answer with unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to array list
            }
            case "Inch to Decameter" -> {
                formula = inputValue * 0.00254;                                 //Does the conversion 
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " dam");                            //Combine the converted answer with the unit
                fullEntry = (answerWithUnit + "   " + "(1 in = 0.00254 dam)");  //Combination of answer with unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Inch to Hectometer" -> {
                formula = inputValue * 0.000254;                                //Does the conversion 
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " hm");                             //Combine the converted answer with the unit
                fullEntry = (answerWithUnit + "   " + "(1 in = 0.000254 hm)");  //Combination of answer with unit and conversion factor 
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Inch to Kilometer" -> {
                formula = inputValue * 0.0000254;                               //Does the conversion 
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " km");                             //Combine the converted answer with the unit
                fullEntry = (answerWithUnit + "   " + "(1 in = 0.0000254 km)"); //combination of answer with unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }

            case "Foot to Millimeter" -> {
                formula = inputValue * 304.8;                                   //Does the conversion 
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " mm");                             //combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 ft = 304.8 mm)");     //Combine the answer with units and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Foot to Centimeter" -> {
                formula = inputValue * 30.48;                                   //Does the conversion 
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " cm");                             //Combine the answer with Unit
                fullEntry = (answerWithUnit + "   " + "(1 ft = 30.48 cm)");     //Combines the answer with unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Foot to Decimeter" -> {
                formula = inputValue * 3.048;                                   //Does the conversion 
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " dm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 ft = 3.048 dm)");     //Combines the answer with unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Foot to Meter" -> {
                formula = inputValue * 0.3048;                                  //Does the conversion 
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " m");                              //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 ft = 0.3048 dm)");    //combines the answer with unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Foot to Decameter" -> {
                formula = inputValue * 0.03048;                                 //Does the conversion 
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " dam");                            //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 ft = 0.03048 dam)");  //Combines the answer with unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Foot to Hectometer" -> {
                formula = inputValue * 0.003048;                                //Does the conversion 
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " hm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 ft = 0.003048 hm)");  //Combines the answer with unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Foot to Kilometer" -> {
                formula = inputValue * 0.0003048;                               //Does the conversion 
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " km");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 ft = 0.0003048)");    //Combines the answer with unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }

            case "Yard to Millimeter" -> {
                formula = inputValue * 914.4;                                   //Does the conversion 
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " mm");                             //Combines the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 yd = 914.4 mm)");     //Combines the answer with unit and conversion factior 
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Yard to Centimeter" -> {
                formula = inputValue * 91.44;                                   //Does the conversion 
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " cm");                             //Combines the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 yd = 91.44 cm)");     //Combines the answer with unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Yard to Decimeter" -> {
                formula = inputValue * 9.144;                                   //Does the conversion 
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " dm");                             //Combines the annswer with unit
                fullEntry = (answerWithUnit + "   " + "(1 yd = 9.144 dm)");     //combines the answer with unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Yard to Meter" -> {
                formula = inputValue * 0.9144;                                  //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " m");                              //Combines the answer with unit 
                fullEntry = (answerWithUnit + "   " + "(1 yd = 0.9144m)");      //Combines the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Yard to Decameter" -> {
                formula = inputValue * 0.09144;                                 //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " dam");                            //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 yd = 0.09144 dam)");  //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Yard to Hectometer" -> {
                formula = inputValue * 0.009144;                                //Does the convertion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " hm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 yd = 0.009144 hm)");  //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Yard to Kilometer" -> {
                formula = inputValue * 0.0009144;                               //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " km");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 yd = 0.0009144 km)"); //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }

            case "Mile to Millimeter" -> {
                formula = inputValue * 1609e+6;                                 //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a Stringg
                answerWithUnit = (convert + " mm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 mi = 1609e+6 mm)");   //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Mile to Centimeter" -> {
                formula = inputValue * 160900;                                  //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " cm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 mi = 160900 cm)");    //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Mile to Decimeter" -> {
                formula = inputValue * 16090;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " dm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 mi = 16090 dm)");     //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Mile to Meter" -> {
                formula = inputValue * 1609;                                    //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " m");                              //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 mi = 1609 m)");       //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Mile to Decameter" -> {
                formula = inputValue * 160.9;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " dam");                            //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 mi = 160.9 dam)");    //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Mile to Hectometer" -> {
                formula = inputValue * 16.093;                                  //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " hm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 mi = 16.09 hm)");     //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Mile to Kilometer" -> {
                formula = inputValue * 1.609;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " km");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 mi = 1.609 km)");     //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Millimeter to Inch" -> {
                formula = inputValue / 25.4;                                    //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " in");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 mm = 0.0394 in)");    //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Millimeter to Foot" -> {
                formula = inputValue / 304.8;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " ft");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 mm = 0.00328084 ft)");//Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Millimeter to Yard" -> {
                formula = inputValue / 914.4;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " yd");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 mm = 0.00109361 yd)");//Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Millimeter to Mile" -> {
                formula = inputValue / 1609344;                                 //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " mi");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 mm = 6.2137e-7 mi)"); //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }

            case "Centimeter to Inch" -> {
                formula = inputValue / 2.54;                                    //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " in");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 cm = 0.0393701 in)"); //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Centimeter to Foot" -> {
                formula = inputValue / 30.48;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " ft");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 cm = 0.0328084 ft)"); //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Centimeter to Yard" -> {
                formula = inputValue / 91.44;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " yd");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 cm = 0.0109361 yd)"); //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Centimeter to Mile" -> {
                formula = inputValue / 160900;                                  //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " mi");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 cm = 6.2137e-6 mi)"); //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }

            case "Decimeter to Inch" -> {
                formula = inputValue * 3.937;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " in");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 dm = 3.93701 in)");   //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Decimeter to Foot" -> {
                formula = inputValue / 3.048;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " ft");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 dm = 0.328084 ft)");  //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Decimeter to Yard" -> {
                formula = inputValue / 9.144;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " yd");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 dm = 0.109361 yd)");  //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Decimeter to Mile" -> {
                formula = inputValue / 16090;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " mi");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 dm = 6.2137e-5 mi)"); //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }

            case "Meter to Inch" -> {
                formula = inputValue * 63360;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " in");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 m = 39.3701 in)");    //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Meter to Foot" -> {
                formula = inputValue * 3.281;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " ft");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 m = 3.28084 ft)");    //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Meter to Yard" -> {
                formula = inputValue * 1.094;                                   //Does the convertion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " yd");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 m = 1.09361 yd)");    //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Meter to Mile" -> {
                formula = inputValue / 1609;                                    //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " mi");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1m = 0.000621371 mi)"); //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }

            case "Decameter to Inch" -> {
                formula = inputValue * 393.7;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " in");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 dm = 393.701 in)");   //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Decameter to Foot" -> {
                formula = inputValue * 32.808;                                  //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " ft");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 dm = 32.8084 ft)");   //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Decameter to Yard" -> {
                formula = inputValue * 10.936;                                  //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " yd");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 dm = 10.9361 yd)");   //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Decameter to Mile" -> {
                formula = inputValue / 160.9;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " mi");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 dm = 0.00621371 mi)");//Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }

            case "Hectometer to Inch" -> {
                formula = inputValue * 3937;                                    //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " in");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 hm = 3937.01 in)");   //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Hectometer to Foot" -> {
                formula = inputValue * 328.1;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " ft");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 hm = 328.084 ft)");   //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Hectometer to Yard" -> {
                formula = inputValue * 109.4;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " yd");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 hm = 109.361 yd)");   //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Hectometer to Mile" -> {
                formula = inputValue / 16.093;                                  //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " mi");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 hm = 0.0621371 mi)"); //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }

            case "Kilometer to Inch" -> {
                formula = inputValue * 39370;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " in");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 km = 39370.1 in)");   //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Kilometer to Foot" -> {
                formula = inputValue * 3281;                                    //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " ft");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 km = 3280.84 ft)");   //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Kilometer to Yard" -> {
                formula = inputValue * 1094;                                    //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " yd");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 km = 1093.61 yd)");   //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                        //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Kilometer to Mile" -> {
                formula = inputValue / 1.609;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " mi");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 km = 0.621371 mi)");  //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Inch to Foot" -> {
                formula = inputValue / 12;                                      //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " ft");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 in = 0.0833333 ft)"); //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Inch to Yard" -> {
                formula = inputValue / 36;                                      //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " yd");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 in = 0.0277778 yd)"); //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Inch to Mile" -> {
                formula = inputValue / 63360;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " mi");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 in = 1.5783e-5 mi)"); //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }

            case "Foot to Inch" -> {
                formula = inputValue * 12;                                      //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " in");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 ft = 12 in)");        //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Foot to Yard" -> {
                formula = inputValue / 3;                                       //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " yd");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 ft = 0.333333 yd)");  //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Foot to Mile" -> {
                formula = inputValue / 5280;                                    //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " mi");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 ft = 0.000189394 mi)");//Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }

            case "Yard to Inch" -> {
                formula = inputValue * 36;                                      //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " in");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 yd = 36 in)");        //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Yard to Foot" -> {
                formula = inputValue * 3;                                       //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " ft");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 yd = 3 ft)");         //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Yard to Mile" -> {
                formula = inputValue / 1760;                                    //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " mi");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 yd = 0.000568182 mi)");//Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }

            case "Mile to Inch" -> {
                formula = inputValue * 63360;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " in");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 mi = 63360 in)");     //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Mile to Foot" -> {
                formula = inputValue * 5280;                                    //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " ft");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 mi = 5280 ft)");      //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Mile to Yard" -> {
                formula = inputValue * 1760;                                    //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " yd");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 mi = 1760 yd)");      //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Millimeter to Centimeter" -> {
                formula = inputValue / 10;                                      //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " cm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 mm = 0.1 cm)");       //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Millimeter to Decimeter" -> {
                formula = inputValue / 100;                                     //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " dm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 mm = 0.01 dm)");      //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Millimeter to Meter" -> {
                formula = inputValue / 1000;                                    //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " m");                              //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 mm = 0.001 m)");      //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Millimeter to Decameter" -> {
                formula = inputValue / 10000;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " dam");                            //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 mm = 0.0001 dam)");   //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Millimeter to Hectometer" -> {
                formula = inputValue / 100000;                                  //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " hm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 mm = 1e-5 hm)");      //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Millimeter to Kilometer" -> {
                formula = inputValue / 1e6;                                     //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " km");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 mm = 1e-6 km)");      //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }

            case "Centimeter to Millimeter" -> {
                formula = inputValue * 10;                                      //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " mm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 cm = 10 mm)");        //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Centimeter to Decimeter" -> {
                formula = inputValue / 10;                                      //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " dm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 cm = 0.1 dm)");       //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Centimeter to Meter" -> {
                formula = inputValue / 100;                                     //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " m");                              //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 cm = 0.01 m)");       //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Centimeter to Decameter" -> {
                formula = inputValue / 1000;                                    //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " dam");                            //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 cm = 0.001 dam)");    //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Centimeter to Hectometer" -> {
                formula = inputValue / 10000;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " hm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 cm = 0.0001 hm)");    //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Centimeter to Kilometer" -> {
                formula = inputValue / 100000;                                  //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " km");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 cm = 1e-5 km)");      //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }

            case "Decimeter to Millimeter" -> {
                formula = inputValue * 100;                                     //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " mm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 dm = 100 mm)");       //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Decimeter to Centimeter" -> {
                formula = inputValue * 10;                                      //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " cm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 dm = 10 cm)");        //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Decimeter to Meter" -> {
                formula = inputValue / 10;                                      //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " m");                              //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 dm = 0.1 m)");        //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Decimeter to Decameter" -> {
                formula = inputValue / 100;                                     //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " dam");                            //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 dm = 0.01 dam)");     //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Decimeter to Hectometer" -> {
                formula = inputValue / 1000;                                    //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " hm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 dm = 0.001 hm)");     //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Decimeter to Kilometer" -> {
                formula = inputValue / 10000;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " km");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 dm = 1e-4 km)");      //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }

            case "Meter to Millimeter" -> {
                formula = inputValue * 100;                                     //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " mm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 m = 1000 mm)");       //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Meter to Centimeter" -> {
                formula = inputValue * 100;                                     //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " cm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 m = 100 cm)");        //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Meter to Decimeter" -> {
                formula = inputValue * 10;                                      //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " dm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 m = 10 dm)");         //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Meter to Decameter" -> {
                formula = inputValue / 10;                                      //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " dam");                            //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 m = 0.1 dam)");       //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Meter to Hectometer" -> {
                formula = inputValue / 100;                                     //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " hm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 m = 0.01 hm)");       //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Meter to Kilometer" -> {
                formula = inputValue / 1000;                                    //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " km");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 m = 0.001 km)");      //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }

            case "Decameter to Millimeter" -> {
                formula = inputValue * 1000;                                    //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " mm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 dam = 10000 mm)");    //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Decameter to Centimeter" -> {
                formula = inputValue * 1000;                                    //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " cm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 dam = 1000 cm)");     //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Decameter to Decimeter" -> {
                formula = inputValue * 100;                                     //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " dm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 dam = 100 dm)");      //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Decameter to Meter" -> {
                formula = inputValue * 10;                                      //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " m");                              //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 dam = 10 m)");        //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Decameter to Hectometer" -> {
                formula = inputValue / 10;                                      //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " hm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 dam = 0.1 hm)");      //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Decameter to Kilometer" -> {
                formula = inputValue / 100;                                     //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " km");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 dam = 0.01 km)");     //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }

            case "Hectometer Millimeter" -> {
                formula = inputValue * 100000;                                  //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " mm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 hm = 100000 mm)");    //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Hectometer to Centimeter" -> {
                formula = inputValue / 10000;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " cm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 hm = 10000 cm)");     //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Hectometer to Decimeter" -> {
                formula = inputValue * 1000;                                    //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " dm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 hm = 1000 dm)");      //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Hectometer to Meter" -> {
                formula = inputValue / 1e6;                                     //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " m");                              //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 hm = 100 m)");        //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Hectometer to Decameter" -> {
                formula = inputValue * 100;                                     //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " dam");                            //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 hm = 10 dam)");       //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Hectometer to Kilometer" -> {
                formula = inputValue / 10;                                      //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " km");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 hm = 0.1 km)");       //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }

            case "Kilometer to Millimeter" -> {
                formula = inputValue * 1e6;                                     //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " mm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 km = 1e+6 mm)");      //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Kilometer to Centimeter" -> {
                formula = inputValue * 100000;                                  //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " cm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 km = 100000 cm)");    //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Kilometer to Decimeter" -> {
                formula = inputValue * 10000;                                   //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " dm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 km = 10000 dm)");     //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Kilometer to Meter" -> {
                formula = inputValue * 1000;                                    //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " m");                              //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 km = 1000 m)");       //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Kilometer to Decameter" -> {
                formula = inputValue * 100;                                     //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " dam");                            //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 km = 100 dam)");      //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }
            case "Kilometer to Hectometer" -> {
                formula = inputValue * 10;                                      //Does the conversion
                convert = Double.toString(formula);                             //Convert the answer to a String
                answerWithUnit = (convert + " hm");                             //Combine the answer with unit
                fullEntry = (answerWithUnit + "   " + "(1 km = 10 hm)");        //Combine the answer wtih unit and conversion factor
                answerHistoryModel.addElement(fullEntry);                       //Add the answer to the historyList
                originalAnswers.add(fullEntry);                                 //Add the answer to Array List
            }

            case "Inch to Inch" -> {
                convert = Double.toString(inputValue);                          //Convert the answer to a String
                answerWithUnit = (convert + " in");                             //Combine the answer with unit
                answerHistoryModel.addElement(answerWithUnit);                  //Add the answer to the historyList 
                originalAnswers.add(answerWithUnit);                            //Add the answer to Array List
            }
            case "Foot to Foot" -> {
                convert = Double.toString(inputValue);                          //Convert the answer to a String
                answerWithUnit = (convert + " ft");                             //Combine the answer with unit
                answerHistoryModel.addElement(answerWithUnit);                  //Add the answer to the historyList 
                originalAnswers.add(answerWithUnit);                            //Add the answer to Array List
            }
            case "Yard to Yard" -> {
                convert = Double.toString(inputValue);                          //Convert the answer to a String
                answerWithUnit = (convert + " yd");                             //Combine the answer with unit
                answerHistoryModel.addElement(answerWithUnit);                  //Add the answer to the historyList 
                originalAnswers.add(answerWithUnit);                            //Add the answer to Array List
            }
            case "Mile to Mile" -> {
                convert = Double.toString(inputValue);                          //Convert the answer to a String
                answerWithUnit = (convert + " mi");                             //Combine the answer with unit
                answerHistoryModel.addElement(answerWithUnit);                  //Add the answer to the historyList 
                originalAnswers.add(answerWithUnit);                            //Add the answer to Array List
            }
            case "Millimeter to Millimeter" -> {
                convert = Double.toString(inputValue);                          //Convert the answer to a String
                answerWithUnit = (convert + " mm");                             //Combine the answer with unit
                answerHistoryModel.addElement(answerWithUnit);                  //Add the answer to the historyList 
                originalAnswers.add(answerWithUnit);                            //Add the answer to Array List
            }
            case "Centimeter to Centimeter" -> {
                convert = Double.toString(inputValue);                          //Convert the answer to a String
                answerWithUnit = (convert + " cm");                             //Combine the answer with unit
                answerHistoryModel.addElement(answerWithUnit);                  //Add the answer to the historyList 
                originalAnswers.add(answerWithUnit);                            //Add the answer to Array List
            }
            case "Decimeter to Decimeter" -> {
                convert = Double.toString(inputValue);                          //Convert the answer to a String
                answerWithUnit = (convert + " dm");                             //Combine the answer with unit
                answerHistoryModel.addElement(answerWithUnit);                  //Add the answer to the historyList 
                originalAnswers.add(answerWithUnit);                            //Add the answer to Array List
            }
            case "Meter to Meter" -> {
                convert = Double.toString(inputValue);                          //Convert the answer to a String
                answerWithUnit = (convert + " m");                              //Combine the answer with unit
                answerHistoryModel.addElement(answerWithUnit);                  //Add the answer to the historyList 
                originalAnswers.add(answerWithUnit);                            //Add the answer to Array List
            }
            case "Decameter to Decameter" -> {
                convert = Double.toString(inputValue);                          //Convert the answer to a String
                answerWithUnit = (convert + " dam");                            //Combine the answer with unit
                answerHistoryModel.addElement(answerWithUnit);                  //Add the answer to the historyList 
                originalAnswers.add(answerWithUnit);                            //Add the answer to Array List
            }
            case "Hectometer to Hectometer" -> {
                convert = Double.toString(inputValue);                          //Convert the answer to a String
                answerWithUnit = (convert + " hm");                             //Combine the answer with unit
                answerHistoryModel.addElement(answerWithUnit);                  //Add the answer to the historyList 
                originalAnswers.add(answerWithUnit);                            //Add the answer to Array List
            }
            case "Kilometer to Kilometer" -> {
                convert = Double.toString(inputValue);                          //Convert the answer to a String
                answerWithUnit = (convert + " km");                             //Combine the answer with unit
                answerHistoryModel.addElement(answerWithUnit);                  //Add the answer to the historyList 
                originalAnswers.add(answerWithUnit);                            //Add the answer to Array List
            }
            default -> {
            }
        }
//----------------Imperial to Metric
//----------Metric to Imperial
//------------Imperial to Imperial
//-------------Metric to Metric

        resultList.ensureIndexIsVisible(answerHistoryModel.size() - 1);         //Code to automatically scroll to the recently added item on the list

    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnSwapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwapActionPerformed
        // Swap the selected items between four JComboBox 
        Object selectedUnitSystem1 = unitSystemComboBox1.getSelectedItem();
        Object selectedUnitSystem2 = unitSystemComboBox2.getSelectedItem();
        Object selectedUnit1 = unitComboBox1.getSelectedItem();
        Object selectedUnit2 = unitComboBox2.getSelectedItem();

        unitSystemComboBox1.setSelectedItem(selectedUnitSystem2);               //Set combobox1 to combobox2 value
        unitSystemComboBox2.setSelectedItem(selectedUnitSystem1);               //Set COmboBox2 to Combobox1 value
        unitComboBox1.setSelectedItem(selectedUnit2);                           //Set ComboBox3 to ComboBox 4 value
        unitComboBox2.setSelectedItem(selectedUnit1);                           //Set ComboBox4 to ComboBox 3 value
    }//GEN-LAST:event_btnSwapActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        userInputField.setText(" "); //Clears the userInputField
    }//GEN-LAST:event_btnClearActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentResized

    private void unitComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitComboBox1ActionPerformed

    private void btnCalculateComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btnCalculateComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalculateComponentShown

    private void userInputFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userInputFieldKeyTyped
        // Get the character typed by the user 
        char typedChar = evt.getKeyChar();
        String numberInput = userInputField.getText();      // gets the current text written in the InputField

        // Check if the character user typed is a digit
        if (Character.isDigit(typedChar)) {
            return;
        }

        // Check if the character user typed is a decimal point ('.')
        if (typedChar == '.' && !numberInput.contains(".")) {
            return;
        }

        // if any characters except those two are typed the program will ignore it
        evt.consume();                                     // method to stop the program from processing other characters

    }//GEN-LAST:event_userInputFieldKeyTyped

    private void resultListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultListMouseClicked

    }//GEN-LAST:event_resultListMouseClicked

    private void toggleDecimalFormatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleDecimalFormatActionPerformed
        // DecimalFormat twoDecimal = new DecimalFormat("#.00");
        // String roundToTwo = twoDecimal.format(answerHistoryList);
        // Di pa tapos...

        answerHistoryModel.clear(); // Clears the item in the history list

        // If the toggle button is selected it formats all the numbers to 2 decimal places 
        if (toggleDecimalFormat.isSelected()) {
            for (String fullEntry : originalAnswers) {
                try {
                    // Seperate the answer with unit and the conversion factor
                    int newFullEntry = fullEntry.indexOf("(");
                    if (newFullEntry > 0) {
                        String mainPart = fullEntry.substring(0, newFullEntry).trim();
                        String conversionPart = fullEntry.substring(newFullEntry).trim();

                        // Split mainPart into number and unit
                        String[] parts = mainPart.split(" ");
                        if (parts.length >= 2) {
                            double num = Double.parseDouble(parts[0]);
                            String unit = parts[1];
                            String formatted = String.format("%.2f %s   %s", num, unit, conversionPart);
                            answerHistoryModel.addElement(formatted);
                        } else {
                            answerHistoryModel.addElement(fullEntry);        // add original numbers 
                        }
                    } else {
                        answerHistoryModel.addElement(fullEntry);           // add original numbers 
                    }
                } catch (NumberFormatException e) {
                    answerHistoryModel.addElement(fullEntry);               // On error, show original answers
                }
            }
        } else {
            // If the toggle button is selected again it returns the answer to their original format
            for (String fullEntry : originalAnswers) {
                answerHistoryModel.addElement(fullEntry);
            }
        }
    }//GEN-LAST:event_toggleDecimalFormatActionPerformed

    private void unitComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitComboBox2ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calcu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPanel;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSwap;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JList<String> resultList;
    private javax.swing.JLabel subLabel;
    private javax.swing.JLabel subLabel2;
    private javax.swing.JLabel subLabel4;
    private javax.swing.JLabel subLabel5;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JToggleButton toggleDecimalFormat;
    private javax.swing.JComboBox<String> unitComboBox1;
    private javax.swing.JComboBox<String> unitComboBox2;
    private javax.swing.JComboBox<String> unitSystemComboBox1;
    private javax.swing.JComboBox<String> unitSystemComboBox2;
    private javax.swing.JTextField userInputField;
    // End of variables declaration//GEN-END:variables
}
