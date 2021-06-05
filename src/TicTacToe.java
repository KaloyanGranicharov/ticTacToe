import javax.swing.*;
import java.awt.*;

public class TicTacToe extends javax.swing.JFrame {
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;

    public TicTacToe() {
        initComponents();
        setSize(1200, 1000);
        setLocationRelativeTo(null);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("screen.png")));
        image.setPreferredSize(new java.awt.Dimension(1200, 1000));
        image.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                imageFocusGained(evt);
            }
        });
        jPanel2.add(image);
        image.setBounds(0, 0, 1200, 1000);
    }

    private void gameScore() {
        lblPlayerX.setText(String.valueOf(xCount));
        lblPlayerO.setText(String.valueOf(oCount));
    }

    private void Take_Turns() {
        if (startGame.equalsIgnoreCase("X")) startGame = "O";
        else startGame = "X";
    }

    private void endGame() {
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();

        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();

        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();

        if (b1 == ("X") && b2 == ("X") && b3 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.GREEN);
            jButton2.setBackground(Color.GREEN);
            jButton3.setBackground(Color.GREEN);
        }
        if (b4 == ("X") && b5 == ("X") && b6 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton4.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
        }
        if (b7 == ("X") && b8 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton7.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
        }
        if (b1 == ("X") && b4 == ("X") && b7 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.GREEN);
            jButton4.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
        }
        if (b2 == ("X") && b5 == ("X") && b8 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton2.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
        }
        if (b3 == ("X") && b6 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton3.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
        }
        if (b1 == ("X") && b5 == ("X") && b9 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
        }
        if (b3 == ("X") && b5 == ("X") && b7 == ("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton3.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
        }


        if (b1 == ("O") && b2 == ("O") && b3 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton1.setBackground(Color.GREEN);
            jButton2.setBackground(Color.GREEN);
            jButton3.setBackground(Color.GREEN);
        }
        if (b4 == ("O") && b5 == ("O") && b6 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton4.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
        }
        if (b7 == ("O") && b8 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton7.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
        }
        if (b1 == ("O") && b4 == ("O") && b7 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton1.setBackground(Color.GREEN);
            jButton4.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
        }
        if (b2 == ("O") && b5 == ("O") && b8 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton2.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
        }
        if (b3 == ("O") && b6 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton3.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
        }
        if (b1 == ("O") && b5 == ("O") && b9 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton1.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
        }
        if (b3 == ("O") && b5 == ("O") && b7 == ("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton3.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
        }
        if (b1 != "" && b2 != "" && b3 != "" && b4 != "" && b5 != "" && b6 != "" && b7 != "" && b8 != "" && b9 != "") {
            JOptionPane.showMessageDialog(this, "It's a tie", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void initComponents() {
        image = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblPlayerX = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblPlayerO = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");


        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 75)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 30));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setForeground(Color.BLUE);
        jLabel2.setText("Player X");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 250)));

        lblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 26));
        lblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerX.setForeground(Color.BLUE);
        lblPlayerX.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblPlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPlayerX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 0, 0)));

        lblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 26));
        lblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerO.setForeground(Color.RED);
        lblPlayerO.setText("0");


        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblPlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPlayerO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 30));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setForeground(Color.RED);
        jLabel3.setText("Player O");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new java.awt.GridLayout(3, 3, 2, 2));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 250), 2));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 95));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel8);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 0, 0), 2));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 95));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel9);

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 250), 2));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 95));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel10);

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 0, 0), 2));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 95));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel11);

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 250), 2));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 95));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
                jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel12);

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 0, 0), 2));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 95));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel13);

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 250), 2));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 95));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
                jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
                jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel14);

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 0, 0), 2));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 95));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel15);

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 250), 2));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 95));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
                jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
                jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel16);

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 250, 2)));
        jbtnReset.setFont(new java.awt.Font("Tahoma", 0, 35));
        jbtnReset.setForeground(Color.BLUE);
        jbtnReset.setText("Reset");

        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
                jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
                jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 0, 0)));

        jbtnExit.setFont(new java.awt.Font("Tahoma", 0, 36));
        jbtnExit.setForeground(Color.RED);
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(317, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(312, 312, 312))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {

        System.exit(0);
    }

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");

        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);

    }

    private void imageFocusGained(java.awt.event.FocusEvent evt) {
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        jButton1.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) jButton1.setForeground(Color.BLUE);
        else jButton1.setForeground(Color.red);
        Take_Turns();
        endGame();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        if (jButton2.getText() != "") return;

        jButton2.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) jButton2.setForeground(Color.BLUE);
        else jButton2.setForeground(Color.red);
        Take_Turns();
        endGame();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

        if (jButton3.getText() != "") return;

        jButton3.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) jButton3.setForeground(Color.BLUE);
        else jButton3.setForeground(Color.red);
        Take_Turns();
        endGame();
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {

        if (jButton4.getText() != "") return;

        jButton4.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) jButton4.setForeground(Color.BLUE);
        else jButton4.setForeground(Color.red);
        Take_Turns();
        endGame();
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {

        if (jButton5.getText() != "") return;

        jButton5.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) jButton5.setForeground(Color.BLUE);
        else jButton5.setForeground(Color.red);
        Take_Turns();
        endGame();
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {

        if (jButton6.getText() != "") return;

        jButton6.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) jButton6.setForeground(Color.BLUE);
        else jButton6.setForeground(Color.red);
        Take_Turns();
        endGame();
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {

        if (jButton7.getText() != "") return;

        jButton7.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) jButton7.setForeground(Color.BLUE);
        else jButton7.setForeground(Color.red);
        Take_Turns();
        endGame();
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {

        if (jButton8.getText() != "") return;

        jButton8.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) jButton8.setForeground(Color.BLUE);
        else jButton8.setForeground(Color.red);
        Take_Turns();
        endGame();
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {

        if (jButton9.getText() != "") return;

        jButton9.setText(startGame);

        if (startGame.equalsIgnoreCase("X")) jButton9.setForeground(Color.BLUE);
        else jButton9.setForeground(Color.red);
        Take_Turns();
        endGame();
    }


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblPlayerO;
    private javax.swing.JLabel lblPlayerX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;

}

