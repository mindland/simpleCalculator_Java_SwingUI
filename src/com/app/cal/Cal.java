
package com.app.cal;

/**
 *
 * @author Pham Vo Duc Phong 
 */
public class Cal extends javax.swing.JFrame {

	String value;
	double fnum;
	double snum;
	String operator;
	double ans;

	public Cal() {
		initComponents();
	}
	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		txtdisplay = new javax.swing.JTextField();
		btn1 = new javax.swing.JButton();
		btn2 = new javax.swing.JButton();
		btn3 = new javax.swing.JButton();	
		btn4 = new javax.swing.JButton();
		btn5 = new javax.swing.JButton();
		btn6 = new javax.swing.JButton();
		btn7 = new javax.swing.JButton();
		btn8 = new javax.swing.JButton();
		btn9 = new javax.swing.JButton();
		btn10 = new javax.swing.JButton();
		btn11 = new javax.swing.JButton();
		btn12 = new javax.swing.JButton();
		btn14 = new javax.swing.JButton();
		btn15 = new javax.swing.JButton();
		btn16 = new javax.swing.JButton();
		btn17 = new javax.swing.JButton();
		btn18 = new javax.swing.JButton();
		btn19 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();

		jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

		jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("CALCULATOR");

		jPanel1.setBackground(new java.awt.Color(0, 0, 0));
		jPanel1.setLayout(new java.awt.GridBagLayout());

		txtdisplay.setEditable(false);
		txtdisplay.setBackground(new java.awt.Color(51, 51, 51));
		txtdisplay.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
		txtdisplay.setForeground(new java.awt.Color(255, 255, 255));
		txtdisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
		txtdisplay.setToolTipText("");
		txtdisplay.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 4;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.ipady = 20;
		jPanel1.add(txtdisplay, gridBagConstraints);

		btn1.setBackground(new java.awt.Color(153, 153, 153));
		btn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		btn1.setForeground(new java.awt.Color(255, 255, 255));
		btn1.setText("1");
		btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		btn1.setBorderPainted(false);
		btn1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn1ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.ipadx = 70;
		gridBagConstraints.ipady = 60;
		gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
		jPanel1.add(btn1, gridBagConstraints);

		btn2.setBackground(new java.awt.Color(153, 153, 153));
		btn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		btn2.setForeground(new java.awt.Color(255, 255, 255));
		btn2.setText("2");
		btn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		btn2.setBorderPainted(false);
		btn2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn2ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.ipadx = 70;
		gridBagConstraints.ipady = 60;
		gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
		jPanel1.add(btn2, gridBagConstraints);

		btn3.setBackground(new java.awt.Color(153, 153, 153));
		btn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		btn3.setForeground(new java.awt.Color(255, 255, 255));
		btn3.setText("3");
		btn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		btn3.setBorderPainted(false);
		btn3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn3ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.ipadx = 70;
		gridBagConstraints.ipady = 60;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
		jPanel1.add(btn3, gridBagConstraints);

		btn4.setBackground(new java.awt.Color(153, 153, 153));
		btn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		btn4.setForeground(new java.awt.Color(255, 255, 255));
		btn4.setText("4");
		btn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		btn4.setBorderPainted(false);
		btn4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn4ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.ipadx = 70;
		gridBagConstraints.ipady = 60;
		gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
		jPanel1.add(btn4, gridBagConstraints);

		btn5.setBackground(new java.awt.Color(153, 153, 153));
		btn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		btn5.setForeground(new java.awt.Color(255, 255, 255));
		btn5.setText("5");
		btn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		btn5.setBorderPainted(false);
		btn5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn5ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.ipadx = 70;
		gridBagConstraints.ipady = 60;
		gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
		jPanel1.add(btn5, gridBagConstraints);

		btn6.setBackground(new java.awt.Color(153, 153, 153));
		btn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		btn6.setForeground(new java.awt.Color(255, 255, 255));
		btn6.setText("6");
		btn6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		btn6.setBorderPainted(false);
		btn6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn6ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.ipadx = 70;
		gridBagConstraints.ipady = 60;
		gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
		jPanel1.add(btn6, gridBagConstraints);

		btn7.setBackground(new java.awt.Color(153, 153, 153));
		btn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		btn7.setForeground(new java.awt.Color(255, 255, 255));
		btn7.setText("7");
		btn7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		btn7.setBorderPainted(false);
		btn7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn7ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.ipadx = 70;
		gridBagConstraints.ipady = 60;
		gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
		jPanel1.add(btn7, gridBagConstraints);

		btn8.setBackground(new java.awt.Color(153, 153, 153));
		btn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		btn8.setForeground(new java.awt.Color(255, 255, 255));
		btn8.setText("8");
		btn8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		btn8.setBorderPainted(false);
		btn8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn8ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.ipadx = 70;
		gridBagConstraints.ipady = 60;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
		jPanel1.add(btn8, gridBagConstraints);

		btn9.setBackground(new java.awt.Color(153, 153, 153));
		btn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		btn9.setForeground(new java.awt.Color(255, 255, 255));
		btn9.setText("9");
		btn9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		btn9.setBorderPainted(false);
		btn9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn9ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.ipadx = 70;
		gridBagConstraints.ipady = 60;
		gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
		jPanel1.add(btn9, gridBagConstraints);

		btn10.setBackground(new java.awt.Color(102, 102, 102));
		btn10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		btn10.setForeground(new java.awt.Color(255, 255, 255));
		btn10.setText("+/-");
		btn10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		btn10.setBorderPainted(false);
		btn10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn10ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.ipadx = 70;
		gridBagConstraints.ipady = 60;
		gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
		jPanel1.add(btn10, gridBagConstraints);

		btn11.setBackground(new java.awt.Color(153, 153, 153));
		btn11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		btn11.setForeground(new java.awt.Color(255, 255, 255));
		btn11.setText("0");
		btn11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		btn11.setBorderPainted(false);
		btn11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn11ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.ipadx = 70;
		gridBagConstraints.ipady = 60;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
		jPanel1.add(btn11, gridBagConstraints);

		btn12.setBackground(new java.awt.Color(153, 153, 153));
		btn12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		btn12.setForeground(new java.awt.Color(255, 255, 255));
		btn12.setText(".");
		btn12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		btn12.setBorderPainted(false);
		btn12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn12ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.ipadx = 70;
		gridBagConstraints.ipady = 60;
		gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
		jPanel1.add(btn12, gridBagConstraints);

		btn14.setBackground(new java.awt.Color(102, 102, 102));
		btn14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		btn14.setForeground(new java.awt.Color(255, 255, 255));
		btn14.setText("AC");
		btn14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		btn14.setBorderPainted(false);
		btn14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn14ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.ipadx = 70;
		gridBagConstraints.ipady = 60;
		gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
		jPanel1.add(btn14, gridBagConstraints);

		btn15.setBackground(new java.awt.Color(255, 153, 51));
		btn15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		btn15.setForeground(new java.awt.Color(255, 255, 255));
		btn15.setText("=");
		btn15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		btn15.setBorderPainted(false);
		btn15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn15ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.ipadx = 70;
		gridBagConstraints.ipady = 60;
		gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
		jPanel1.add(btn15, gridBagConstraints);

		btn16.setBackground(new java.awt.Color(255, 153, 51));
		btn16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		btn16.setForeground(new java.awt.Color(255, 255, 255));
		btn16.setText("+");
		btn16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		btn16.setBorderPainted(false);
		btn16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn16ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.ipadx = 70;
		gridBagConstraints.ipady = 60;
		gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
		jPanel1.add(btn16, gridBagConstraints);

		btn17.setBackground(new java.awt.Color(255, 153, 51));
		btn17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		btn17.setForeground(new java.awt.Color(255, 255, 255));
		btn17.setText("-");
		btn17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		btn17.setBorderPainted(false);
		btn17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn17ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.ipadx = 70;
		gridBagConstraints.ipady = 60;
		gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
		jPanel1.add(btn17, gridBagConstraints);

		btn18.setBackground(new java.awt.Color(255, 153, 51));
		btn18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		btn18.setForeground(new java.awt.Color(255, 255, 255));
		btn18.setText("*");
		btn18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		btn18.setBorderPainted(false);
		btn18.setMargin(new java.awt.Insets(0, 0, 0, 0));
		btn18.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn18ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.ipadx = 70;
		gridBagConstraints.ipady = 60;
		gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
		jPanel1.add(btn18, gridBagConstraints);

		btn19.setBackground(new java.awt.Color(255, 153, 51));
		btn19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		btn19.setForeground(new java.awt.Color(255, 255, 255));
		btn19.setText("/");
		btn19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		btn19.setBorderPainted(false);
		btn19.setMargin(new java.awt.Insets(0, 0, 0, 0));
		btn19.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn19ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.ipadx = 70;
		gridBagConstraints.ipady = 60;
		gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
		jPanel1.add(btn19, gridBagConstraints);

		jButton1.setBackground(new java.awt.Color(102, 102, 102));
		jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("%");
		jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jButton1.setBorderPainted(false);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.ipadx = 70;
		gridBagConstraints.ipady = 60;
		gridBagConstraints.insets = new java.awt.Insets(1, 1, 1, 1);
		jPanel1.add(jButton1, gridBagConstraints);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>

	private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {

		value = txtdisplay.getText() + "1";
		txtdisplay.setText(value);

	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		value = txtdisplay.getText() + "%";
		txtdisplay.setText(value);

	}

	private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {
		value = txtdisplay.getText() + "2";
		txtdisplay.setText(value);
	}

	private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {
		value = txtdisplay.getText() + "3";
		txtdisplay.setText(value);
	}

	private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {
		value = txtdisplay.getText() + " + ";
		txtdisplay.setText(value);
	}

	private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {
		value = txtdisplay.getText() + "4";
		txtdisplay.setText(value);
	}

	private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {
		value = txtdisplay.getText() + "5";
		txtdisplay.setText(value);
	}

	private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {
		value = txtdisplay.getText() + "6";
		txtdisplay.setText(value);
	}

	private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {
		value = txtdisplay.getText() + "7";
		txtdisplay.setText(value);
	}

	private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {
		value = txtdisplay.getText() + "8";
		txtdisplay.setText(value);
	}

	private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {
		value = txtdisplay.getText() + "9";
		txtdisplay.setText(value);
	}

	private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {
		if (txtdisplay.getText().length() > 0) {

			double text = Double.parseDouble(txtdisplay.getText());
			double y = -1 * text;
			txtdisplay.setText(String.valueOf(y));
		}
	}

	private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {
		value = txtdisplay.getText() + "0";
		txtdisplay.setText(value);
	}

	private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {
		value = txtdisplay.getText() + ".";
		txtdisplay.setText(value);
	}

	private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {
		value = txtdisplay.getText() + " / ";
		txtdisplay.setText(value);
	}

	private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {
		value = txtdisplay.getText() + " * ";
		txtdisplay.setText(value);
	}

	private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {
		value = txtdisplay.getText() + " - ";
		txtdisplay.setText(value);
	}

	private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {
		txtdisplay.setText("");
	}

	private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {
		answer();
	}

	private void answer() {
		int x = txtdisplay.getText().length();
		fnum = Double.parseDouble(value.substring(0, value.indexOf(" "))); // so thu nhat 
		
		String s = value.substring(value.indexOf(" ") + 2, x);  // so thu 2 string
		if(s.contains("%")) {
			s = s.substring(0, s.indexOf("%"));
			snum = Double.parseDouble(s) / 100;
		}
		else {
			snum = Double.parseDouble(s);
		}
		
		operator = value.substring(value.indexOf(" ") + 1, value.indexOf(" ") + 2);
		
		if (operator.equals("+")) {
			ans = fnum + snum;
		} else if (operator.equals("-")) {
			ans = fnum - snum;
		} else if (operator.equals("*")) {
			ans = fnum * snum;
		} else if (operator.equals("/")) {
			ans = fnum / snum;	
		} else {
			txtdisplay.setText("");
		}

		txtdisplay.setText(String.valueOf(ans));

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Cal().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton btn1;
	private javax.swing.JButton btn10;
	private javax.swing.JButton btn11;
	private javax.swing.JButton btn12;
	private javax.swing.JButton btn14;
	private javax.swing.JButton btn15;
	private javax.swing.JButton btn16;
	private javax.swing.JButton btn17;
	private javax.swing.JButton btn18;
	private javax.swing.JButton btn19;
	private javax.swing.JButton btn2;
	private javax.swing.JButton btn3;
	private javax.swing.JButton btn4;
	private javax.swing.JButton btn5;
	private javax.swing.JButton btn6;
	private javax.swing.JButton btn7;
	private javax.swing.JButton btn8;
	private javax.swing.JButton btn9;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField txtdisplay;
	// End of variables declaration
}
