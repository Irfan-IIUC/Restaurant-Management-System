
package Restaurant;

import java.awt.TextField;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class restaurant extends javax.swing.JFrame {

   
    public restaurant() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtf21 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jb_total = new javax.swing.JButton();
        jb_reset = new javax.swing.JButton();
        jb_reciept = new javax.swing.JButton();
        jb_exit = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtf3 = new javax.swing.JTextField();
        jtf4 = new javax.swing.JTextField();
        jtf2 = new javax.swing.JTextField();
        jtf6 = new javax.swing.JTextField();
        jtf7 = new javax.swing.JTextField();
        jtf5 = new javax.swing.JTextField();
        jtf1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jtf11 = new javax.swing.JTextField();
        jtf12 = new javax.swing.JTextField();
        jtf13 = new javax.swing.JTextField();
        jtf14 = new javax.swing.JTextField();
        jtf15 = new javax.swing.JTextField();
        jtf16 = new javax.swing.JTextField();
        jtf17 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtf8 = new javax.swing.JTextField();
        jtf9 = new javax.swing.JTextField();
        jtf10 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtf18 = new javax.swing.JTextField();
        jtf19 = new javax.swing.JTextField();
        jtf20 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Restaurant Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jtf21.setEditable(false);
        jtf21.setColumns(20);
        jtf21.setRows(5);
        jScrollPane1.setViewportView(jtf21);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jb_total.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jb_total.setText("Total");
        jb_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_totalActionPerformed(evt);
            }
        });

        jb_reset.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jb_reset.setText("Reset");
        jb_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_resetActionPerformed(evt);
            }
        });

        jb_reciept.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jb_reciept.setText("Reciept");
        jb_reciept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_recieptActionPerformed(evt);
            }
        });

        jb_exit.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jb_exit.setText("Exit");
        jb_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_total, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_reciept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                .addComponent(jb_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_total)
                    .addComponent(jb_reciept)
                    .addComponent(jb_exit)
                    .addComponent(jb_reset))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Meals");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel10.setText("Kachchi Biryani");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel11.setText("Fried Rice");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel12.setText("Bhuna Khichuri");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel13.setText("French Fries");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel14.setText("Grilled Chicken");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel15.setText("Pizza");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel16.setText("Cheese Burger");

        jtf3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtf3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf3.setText("0");
        jtf3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf3KeyPressed(evt);
            }
        });

        jtf4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtf4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf4.setText("0");
        jtf4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf4KeyPressed(evt);
            }
        });

        jtf2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtf2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf2.setText("0");
        jtf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf2KeyPressed(evt);
            }
        });

        jtf6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtf6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf6.setText("0");
        jtf6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf6KeyPressed(evt);
            }
        });

        jtf7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtf7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf7.setText("0");
        jtf7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf7KeyPressed(evt);
            }
        });

        jtf5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtf5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf5.setText("0");
        jtf5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf5KeyPressed(evt);
            }
        });

        jtf1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtf1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf1.setText("0");
        jtf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf1ActionPerformed(evt);
            }
        });
        jtf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtf7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtf5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtf1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtf2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtf3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jtf4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jtf5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jtf6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jtf7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Drinks");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel17.setText("Milk Shake");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel18.setText("Hot Chocolate");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel19.setText("Falooda");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel20.setText("Sweet Lassi");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel21.setText("Soup");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel22.setText("Vanilla Cone");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel23.setText("Lemon Juice");

        jtf11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtf11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf11.setText("0");
        jtf11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf11KeyPressed(evt);
            }
        });

        jtf12.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtf12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf12.setText("0");
        jtf12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf12KeyPressed(evt);
            }
        });

        jtf13.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtf13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf13.setText("0");
        jtf13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf13KeyPressed(evt);
            }
        });

        jtf14.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtf14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf14.setText("0");
        jtf14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf14KeyPressed(evt);
            }
        });

        jtf15.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtf15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf15.setText("0");
        jtf15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf15KeyPressed(evt);
            }
        });

        jtf16.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtf16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf16.setText("0");
        jtf16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf16KeyPressed(evt);
            }
        });

        jtf17.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtf17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf17.setText("0");
        jtf17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf17KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtf16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtf11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtf17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtf15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtf14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtf13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtf12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jtf11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jtf12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jtf13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jtf14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jtf15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jtf16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jtf17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Total Cost of Items");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Cost of Drinks");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Cost of Meal");

        jtf8.setEditable(false);
        jtf8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtf8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jtf9.setEditable(false);
        jtf9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtf9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jtf10.setEditable(false);
        jtf10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtf10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtf8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtf9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtf10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Total");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Sub Total");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Tax");

        jtf18.setEditable(false);
        jtf18.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtf18.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jtf19.setEditable(false);
        jtf19.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtf19.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jtf20.setEditable(false);
        jtf20.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jtf20.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtf18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtf20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_exitActionPerformed
        // TODO add your handling code here:
        Sub_Class ob = new Sub_Class();
        
        ob.Exit();
    }//GEN-LAST:event_jb_exitActionPerformed

    private void jb_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_resetActionPerformed
        // TODO add your handling code here:
        jtf1.setText("0");
        jtf2.setText("0");
        jtf3.setText("0");
        jtf4.setText("0");
        jtf5.setText("0");
        jtf6.setText("0");
        jtf7.setText("0");
        
        jtf8.setText(null);
        jtf9.setText(null);
        jtf10.setText(null);
        
        jtf11.setText("0");
        jtf12.setText("0");
        jtf13.setText("0");
        jtf14.setText("0");
        jtf15.setText("0");
        jtf16.setText("0");
        jtf17.setText("0");
        
        jtf18.setText(null);
        jtf19.setText(null);
        jtf20.setText(null);
        
        jtf21.setText(null);      
    }//GEN-LAST:event_jb_resetActionPerformed

    private void jb_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_totalActionPerformed
        // TODO add your handling code here:
        
        double tax, subTotal, total;
        
        Sub_Class ob1 = new Sub_Class();
        
        ob1.kachchi = ob1.pkachchi * Double.parseDouble(jtf1.getText());
        ob1.fried = ob1.pfried * Double.parseDouble(jtf2.getText());
        ob1.bhuna = ob1.pbhuna * Double.parseDouble(jtf3.getText());
        ob1.french = ob1.pfrench * Double.parseDouble(jtf4.getText());
        ob1.grilled = ob1.pgrilled * Double.parseDouble(jtf5.getText());
        ob1.pizza = ob1.ppizza * Double.parseDouble(jtf6.getText());
        ob1.cheese = ob1.pcheese * Double.parseDouble(jtf7.getText());
        
        ob1.milk = ob1.pmilk * Double.parseDouble(jtf11.getText());
        ob1.hot = ob1.phot * Double.parseDouble(jtf12.getText());
        ob1.falooda = ob1.pfalooda * Double.parseDouble(jtf13.getText());
        ob1.sweet = ob1.psweet * Double.parseDouble(jtf14.getText());
        ob1.soup = ob1.psoup * Double.parseDouble(jtf15.getText());
        ob1.vanilla = ob1.pvanilla * Double.parseDouble(jtf16.getText());
        ob1.lemon = ob1.plemon * Double.parseDouble(jtf17.getText());
        
        subTotal = ob1.getAmount();
        
        tax = ob1.findTax(subTotal);
        
        total = subTotal + tax;
        
        String SubTotal = String.format("%.2f", subTotal);
        jtf19.setText(SubTotal);
        
        String Tax = String.format("%.2f", tax);
        jtf18.setText(Tax);
        
        String Total = String.format("%.2f", total);
        jtf20.setText(Total);
        
        String meal = String.format("%.2f", ob1.meal);
        jtf8.setText(meal);
        
        String drink = String.format("%.2f", ob1.drink);
        jtf9.setText(drink);
        
        String tcItem = String.format("%.2f", ob1.total_md);
        jtf10.setText(tcItem);
    }//GEN-LAST:event_jb_totalActionPerformed

    private void jb_recieptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_recieptActionPerformed
        // TODO add your handling code here:
        int refs = 1325 + (int) (Math.random() * 4238);
        
        Calendar timer = Calendar.getInstance();
        
        SimpleDateFormat Time = new SimpleDateFormat("HH:mm:ss");
        Time.format(timer.getTime());
        
        SimpleDateFormat date = new SimpleDateFormat("dd-MMM-yyyy");
        date.format(timer.getTime());
        
        jtf21.append("                  Restaurant Management System\n" +
                
                     "         House #27, Road #02, Uttara, Dhaka-1230\n" +
                
                     "                            Mobile: 01715268423\n" +
                
                      "\n\nBill No: " + refs + 
                
                      "\n\n=========================================\n" +
                              
                      "\nMeals:\t\t" + jtf8.getText() + "\n\n" +
                              
                      "Drinks:\t\t" + jtf9.getText() + "\n\n" +
                              
                      "Cost of items:\t\t" + jtf10.getText() + "\n\n" +
                              
                      "=========================================" + "\n\n" +
                              
                      "Tax:\t\t" + jtf18.getText() + "\n\n" +
                              
                      "SubTotal:\t\t" + jtf19.getText() + "\n\n" +
                              
                      "Total:\t\t" + jtf20.getText() + "\n\n" +
                              
                      "=========================================" + "\n\n" +
                              
                      "Date: " +date.format(timer.getTime()) +
                
                      "\n\nTime: " +Time.format(timer.getTime()) +
                
                      "\n\n\n\t" + "         Thank You");
    }//GEN-LAST:event_jb_recieptActionPerformed

    private void jtf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf1ActionPerformed

    private void jtf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf1KeyPressed
        // TODO add your handling code here:
        String val = jtf1.getText();
        int len = val.length();
        
        if((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' && len < 2) || evt.getKeyChar() == '\b'){
            
            jtf1.setEditable(true);
        }
        else{
            
            jtf1.setEditable(false);
        }
    }//GEN-LAST:event_jtf1KeyPressed

    private void jtf2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf2KeyPressed
        // TODO add your handling code here:
        String val = jtf2.getText();
        int len = val.length();
        
        if((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' && len < 2) || evt.getKeyChar() == '\b'){
            
            jtf2.setEditable(true);
        }
        else{
            
            jtf2.setEditable(false);
        }
    }//GEN-LAST:event_jtf2KeyPressed

    private void jtf3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf3KeyPressed
        // TODO add your handling code here:
        String val = jtf3.getText();
        int len = val.length();
        
        if((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' && len < 2) || evt.getKeyChar() == '\b'){
            
            jtf3.setEditable(true);
        }
        else{
            
            jtf3.setEditable(false);
        }
    }//GEN-LAST:event_jtf3KeyPressed

    private void jtf4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf4KeyPressed
        // TODO add your handling code here:
        String val = jtf4.getText();
        int len = val.length();
        
        if((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' && len < 2) || evt.getKeyChar() == '\b'){
            
            jtf4.setEditable(true);
        }
        else{
            
            jtf4.setEditable(false);
        }
    }//GEN-LAST:event_jtf4KeyPressed

    private void jtf5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf5KeyPressed
        // TODO add your handling code here:
        String val = jtf5.getText();
        int len = val.length();
        
        if((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' && len < 2) || evt.getKeyChar() == '\b'){
            
            jtf5.setEditable(true);
        }
        else{
            
            jtf5.setEditable(false);
        }
    }//GEN-LAST:event_jtf5KeyPressed

    private void jtf6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf6KeyPressed
        // TODO add your handling code here:
        String val = jtf6.getText();
        int len = val.length();
        
        if((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' && len < 2) || evt.getKeyChar() == '\b'){
            
            jtf6.setEditable(true);
        }
        else{
            
            jtf6.setEditable(false);
        }
    }//GEN-LAST:event_jtf6KeyPressed

    private void jtf7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf7KeyPressed
        // TODO add your handling code here:
        String val = jtf7.getText();
        int len = val.length();
        
        if((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' && len < 2) || evt.getKeyChar() == '\b'){
            
            jtf7.setEditable(true);
        }
        else{
            
            jtf7.setEditable(false);
        }
    }//GEN-LAST:event_jtf7KeyPressed

    private void jtf11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf11KeyPressed
        // TODO add your handling code here:
        String val = jtf11.getText();
        int len = val.length();
        
        if((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' && len < 2) || evt.getKeyChar() == '\b'){
            
            jtf11.setEditable(true);
        }
        else{
            
            jtf11.setEditable(false);
        }
    }//GEN-LAST:event_jtf11KeyPressed

    private void jtf12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf12KeyPressed
        // TODO add your handling code here:
        String val = jtf12.getText();
        int len = val.length();
        
        if((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' && len < 2) || evt.getKeyChar() == '\b'){
            
            jtf12.setEditable(true);
        }
        else{
            
            jtf12.setEditable(false);
        }
    }//GEN-LAST:event_jtf12KeyPressed

    private void jtf13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf13KeyPressed
        // TODO add your handling code here:
        String val = jtf13.getText();
        int len = val.length();
        
        if((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' && len < 2) || evt.getKeyChar() == '\b'){
            
            jtf13.setEditable(true);
        }
        else{
            
            jtf13.setEditable(false);
        }
    }//GEN-LAST:event_jtf13KeyPressed

    private void jtf14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf14KeyPressed
        // TODO add your handling code here:
        String val = jtf14.getText();
        int len = val.length();
        
        if((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' && len < 2) || evt.getKeyChar() == '\b'){
            
            jtf14.setEditable(true);
        }
        else{
            
            jtf14.setEditable(false);
        }
    }//GEN-LAST:event_jtf14KeyPressed

    private void jtf15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf15KeyPressed
        // TODO add your handling code here:
        String val = jtf15.getText();
        int len = val.length();
        
        if((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' && len < 2) || evt.getKeyChar() == '\b'){
            
            jtf15.setEditable(true);
        }
        else{
            
            jtf15.setEditable(false);
        }
    }//GEN-LAST:event_jtf15KeyPressed

    private void jtf16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf16KeyPressed
        // TODO add your handling code here:
        String val = jtf16.getText();
        int len = val.length();
        
        if((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' && len < 2) || evt.getKeyChar() == '\b'){
            
            jtf16.setEditable(true);
        }
        else{
            
            jtf16.setEditable(false);
        }
    }//GEN-LAST:event_jtf16KeyPressed

    private void jtf17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf17KeyPressed
        // TODO add your handling code here:
        String val = jtf17.getText();
        int len = val.length();
        
        if((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' && len < 2) || evt.getKeyChar() == '\b'){
            
            jtf17.setEditable(true);
        }
        else{
            
            jtf17.setEditable(false);
        }
    }//GEN-LAST:event_jtf17KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>
        UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new restaurant().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_exit;
    private javax.swing.JButton jb_reciept;
    private javax.swing.JButton jb_reset;
    private javax.swing.JButton jb_total;
    private javax.swing.JTextField jtf1;
    private javax.swing.JTextField jtf10;
    private javax.swing.JTextField jtf11;
    private javax.swing.JTextField jtf12;
    private javax.swing.JTextField jtf13;
    private javax.swing.JTextField jtf14;
    private javax.swing.JTextField jtf15;
    private javax.swing.JTextField jtf16;
    private javax.swing.JTextField jtf17;
    private javax.swing.JTextField jtf18;
    private javax.swing.JTextField jtf19;
    private javax.swing.JTextField jtf2;
    private javax.swing.JTextField jtf20;
    private javax.swing.JTextArea jtf21;
    private javax.swing.JTextField jtf3;
    private javax.swing.JTextField jtf4;
    private javax.swing.JTextField jtf5;
    private javax.swing.JTextField jtf6;
    private javax.swing.JTextField jtf7;
    private javax.swing.JTextField jtf8;
    private javax.swing.JTextField jtf9;
    // End of variables declaration//GEN-END:variables
}
