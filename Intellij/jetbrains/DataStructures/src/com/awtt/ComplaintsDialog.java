package com.awtt;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ComplaintsDialog extends JDialog {

    public ComplaintsDialog(JFrame frame) {
        super(frame, true);
        setTitle("Simple Complaints Dialog");
        setSize(500, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBorder(new EmptyBorder(new Insets(5, 5, 5, 5)));

        getContentPane().add(BorderLayout.CENTER, panel);

        GridBagConstraints c = new GridBagConstraints();

        Dimension shortField = new Dimension(40, 20);
        Dimension mediumField = new Dimension(120, 20);
        Dimension longField = new Dimension(240, 20);
        Dimension hugeField = new Dimension(240, 80);

        EmptyBorder border = new EmptyBorder(new Insets(0, 0, 0, 10));
        EmptyBorder border1 = new EmptyBorder(new Insets(0, 50, 0, 10));

        c.insets = new Insets(2, 2, 2, 2);
        c.anchor = GridBagConstraints.WEST;

        JLabel shortDescription = new JLabel("Short Description");
        shortDescription.setBorder(border);
        panel.add(shortDescription, c);

        JTextField shortTextField = new JTextField();
        shortTextField.setPreferredSize(longField);
        c.gridx = 1;
        c.weightx = 1.0;
        c.gridwidth = 3;
        c.fill = GridBagConstraints.HORIZONTAL;
        panel.add(shortTextField, c);

        JLabel description = new JLabel("Description");
        description.setBorder(border);
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 0.0;
        panel.add(description, c);

        JTextArea descriptionArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(descriptionArea);
        scrollPane.setPreferredSize(hugeField);
        c.gridx = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.gridwidth = 3;
        c.gridheight = 2;
        c.fill = GridBagConstraints.BOTH;
        panel.add(scrollPane, c);

        JLabel severity = new JLabel("Severity");
        severity.setBorder(border);
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weighty = 0.0;
        c.weightx = 0.0;
        c.fill = GridBagConstraints.NONE;
        panel.add(severity, c);

        JComboBox<String> comboBox1 = new JComboBox<>();
        comboBox1.addItem("A");
        comboBox1.addItem("B");
        comboBox1.addItem("C");
        comboBox1.addItem("D");
        comboBox1.addItem("E");
        comboBox1.setPreferredSize(shortField);
        c.gridx = 1;
        panel.add(comboBox1, c);

        JLabel priority = new JLabel("Priority");
        priority.setBorder(border1);
        c.gridx = 2;
        panel.add(priority, c);

        JComboBox<String> comboBox = new JComboBox<String>();
        comboBox.addItem("1");
        comboBox.addItem("2");
        comboBox.addItem("3");
        comboBox.addItem("4");
        comboBox.addItem("5");
        comboBox.setPreferredSize(shortField);
        c.gridx = 3;
        panel.add(comboBox, c);

        JLabel name = new JLabel("Name");
        name.setBorder(border);
        c.gridx = 0;
        c.gridy = 4;
        panel.add(name, c);

        JTextField nameField = new JTextField();
        nameField.setPreferredSize(longField);
        c.gridx = 1;
        c.gridwidth = 3;
        panel.add(nameField, c);

        JLabel telephone = new JLabel("Telephone");
        telephone.setBorder(border);
        c.gridx = 0;
        c.gridy = 5;

        panel.add(telephone, c);

        JTextField phoneField = new JTextField();
        phoneField.setPreferredSize(longField);
        c.gridx = 1;
        c.gridwidth = 3;
        panel.add(phoneField, c);

        JLabel sex = new JLabel("Sex");
        sex.setBorder(border);
        c.gridx = 0;
        c.gridy = 6;
        panel.add(sex, c);

        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
        ButtonGroup group = new ButtonGroup();
        JRadioButton radioButtonMale = new JRadioButton("Male");
        radioButtonMale.setSelected(true);
        group.add(radioButtonMale);
        JRadioButton radioButtonFemale = new JRadioButton("Female");
        group.add(radioButtonFemale);

        radioPanel.add(radioButtonMale);
        radioPanel.add(radioButtonFemale);
        c.gridx = 1;
        c.gridwidth = 3;
        panel.add(radioPanel, c);

        JLabel id = new JLabel("ID Number");
        id.setBorder(border);
        c.gridx = 0;
        c.gridy = 7;
        c.gridwidth = 1;
        panel.add(id, c);

        JTextField idField = new JTextField();
        idField.setPreferredSize(longField);
        c.gridx = 1;
        c.gridwidth = 3;
        panel.add(idField, c);

        JButton submitButton = new JButton("Submit");
        c.gridx = 4;
        c.gridy = 0;
        c.gridwidth = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        panel.add(submitButton, c);

        JButton cancelButton = new JButton("Cancel");
        c.gridy = 1;
        panel.add(cancelButton, c);

        JButton helpButton = new JButton("Help");
        c.gridy = 2;
        c.anchor = GridBagConstraints.NORTH;
        panel.add(helpButton, c);

        setVisible(true);

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        new ComplaintsDialog(frame);

    }


}


























