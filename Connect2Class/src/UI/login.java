package UI;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import ClassHandling.conjdbc;

/**
 *
 * @author amndw cms.CMS
 */
public class login extends javax.swing.JFrame {

    public login() {
        this.setUndecorated(false);
        initComponents();
        this.setLocationRelativeTo(null);   //jframe to center
        this.setBackground(new Color(0, 0, 0, 0));       //jframe to transparent background
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        leftpane.setBackground(new Color(0, 0, 0, 0));
        signin_pane.setBackground(new Color(0, 0, 0, 0));
        signup_pane.setBackground(new Color(0, 0, 0, 0));
        forget_pane.setBackground(new Color(0, 0, 0, 0));

        switch_panel_signin.setBackground(new Color(0, 0, 0, 0));
        switch_panel_signup.setBackground(new Color(0, 0, 0, 0));

        img_signin.setBackground(new Color(0, 0, 0, 0));
        img_signup.setBackground(new Color(0, 0, 0, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        min1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        signin_pane = new keeptoo.KGradientPanel();
        min = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        switch_panel_signin = new javax.swing.JPanel();
        lbl_signup = new javax.swing.JLabel();
        lbl_signin = new javax.swing.JLabel();
        img_signin = new javax.swing.JLabel();
        img_signup = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtpass_in = new javax.swing.JPasswordField();
        txtuser_in = new javax.swing.JTextField();
        btn_signin = new keeptoo.KButton();
        btn_forgetpass = new javax.swing.JLabel();
        signup_pane = new keeptoo.KGradientPanel();
        close1 = new javax.swing.JLabel();
        min2 = new javax.swing.JLabel();
        switch_panel_signup = new javax.swing.JPanel();
        lbl_signup1 = new javax.swing.JLabel();
        lbl_signin1 = new javax.swing.JLabel();
        img_signup1 = new javax.swing.JLabel();
        img_signin1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnregister_up = new keeptoo.KButton();
        cboxtype_up = new javax.swing.JComboBox<>();
        txtenpass_up = new javax.swing.JPasswordField();
        txtrepass_up = new javax.swing.JPasswordField();
        txtname_up = new javax.swing.JTextField();
        txtemail_up = new javax.swing.JTextField();
        txtuser_up = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtsecurans_up = new javax.swing.JTextField();
        forget_pane = new keeptoo.KGradientPanel();
        min3 = new javax.swing.JLabel();
        close2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtuser_change = new javax.swing.JTextField();
        btnchange_pass = new keeptoo.KButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtemail_change = new javax.swing.JTextField();
        txtrepass_change = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtsecans_change = new javax.swing.JTextField();
        txtenpass_change = new javax.swing.JTextField();
        leftpane = new keeptoo.KGradientPanel();
        lbl_icon = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        min1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/min.png"))); // NOI18N
        min1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                min1MousePressed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        signin_pane.setkBorderRadius(75);
        signin_pane.setkEndColor(new java.awt.Color(255, 255, 255));
        signin_pane.setkStartColor(new java.awt.Color(153, 255, 255));
        signin_pane.setOpaque(false);

        min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/min.png"))); // NOI18N
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minMousePressed(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeMousePressed(evt);
            }
        });

        switch_panel_signin.setBackground(new java.awt.Color(255, 255, 255));
        switch_panel_signin.setForeground(new java.awt.Color(255, 255, 255));
        switch_panel_signin.setOpaque(false);
        switch_panel_signin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_signup.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbl_signup.setText("SignUp");
        switch_panel_signin.add(lbl_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        lbl_signin.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbl_signin.setForeground(new java.awt.Color(255, 255, 255));
        lbl_signin.setText("SignIn");
        switch_panel_signin.add(lbl_signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        img_signin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue_sign.png"))); // NOI18N
        switch_panel_signin.add(img_signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        img_signup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lblue_sign.png"))); // NOI18N
        img_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                img_signupMousePressed(evt);
            }
        });
        switch_panel_signin.add(img_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, -1));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setText("Password");

        txtpass_in.setBackground(new Color(0,0,0,0));
        txtpass_in.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        txtpass_in.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtpass_in.setOpaque(false);

        txtuser_in.setBackground(new Color(0,0,0,0));
        txtuser_in.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        txtuser_in.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtuser_in.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtuser_in.setOpaque(false);

        btn_signin.setBorder(null);
        btn_signin.setText("Sign In");
        btn_signin.setFocusable(false);
        btn_signin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_signin.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        btn_signin.setkBorderRadius(35);
        btn_signin.setkEndColor(new java.awt.Color(51, 204, 255));
        btn_signin.setkHoverEndColor(new java.awt.Color(0, 153, 255));
        btn_signin.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_signin.setkHoverStartColor(new java.awt.Color(0, 153, 255));
        btn_signin.setkPressedColor(new java.awt.Color(0, 255, 0));
        btn_signin.setkSelectedColor(new java.awt.Color(255, 255, 255));
        btn_signin.setkStartColor(new java.awt.Color(51, 204, 255));
        btn_signin.setPreferredSize(new java.awt.Dimension(150, 40));
        btn_signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_signinMouseClicked(evt);
            }
        });

        btn_forgetpass.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btn_forgetpass.setForeground(new java.awt.Color(255, 0, 0));
        btn_forgetpass.setText("Forget Password?");
        btn_forgetpass.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_forgetpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_forgetpassMousePressed(evt);
            }
        });

        javax.swing.GroupLayout signin_paneLayout = new javax.swing.GroupLayout(signin_pane);
        signin_pane.setLayout(signin_paneLayout);
        signin_paneLayout.setHorizontalGroup(
            signin_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signin_paneLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(switch_panel_signin, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(min)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close)
                .addGap(19, 19, 19))
            .addGroup(signin_paneLayout.createSequentialGroup()
                .addGroup(signin_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signin_paneLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(signin_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(signin_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(txtuser_in, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(signin_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(txtpass_in, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, signin_paneLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btn_forgetpass))))
                    .addGroup(signin_paneLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(btn_signin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        signin_paneLayout.setVerticalGroup(
            signin_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signin_paneLayout.createSequentialGroup()
                .addGroup(signin_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signin_paneLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(signin_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(min)
                            .addComponent(close)))
                    .addGroup(signin_paneLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(switch_panel_signin, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtuser_in, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpass_in, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_signin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btn_forgetpass)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.add(signin_pane, "card3");

        signup_pane.setkBorderRadius(75);
        signup_pane.setkEndColor(new java.awt.Color(255, 255, 255));
        signup_pane.setkStartColor(new java.awt.Color(153, 255, 255));

        close1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                close1MousePressed(evt);
            }
        });

        min2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/min.png"))); // NOI18N
        min2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                min2MousePressed(evt);
            }
        });

        switch_panel_signup.setBackground(new java.awt.Color(255, 255, 255));
        switch_panel_signup.setForeground(new java.awt.Color(255, 255, 255));
        switch_panel_signup.setOpaque(false);
        switch_panel_signup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_signup1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbl_signup1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_signup1.setText("SignUp");
        switch_panel_signup.add(lbl_signup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        lbl_signin1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbl_signin1.setText("SignIn");
        switch_panel_signup.add(lbl_signin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        img_signup1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue_sign.png"))); // NOI18N
        switch_panel_signup.add(img_signup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, -1));

        img_signin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lblue_sign.png"))); // NOI18N
        img_signin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                img_signin1MousePressed(evt);
            }
        });
        switch_panel_signup.add(img_signin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setText("Enter Name:");

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setText("Enter Email:");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setText("Enter Username:");

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel6.setText("Enter Password:");

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setText("Re-Enter Password:");

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel8.setText("Type:");

        btnregister_up.setBorder(null);
        btnregister_up.setText("Register");
        btnregister_up.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnregister_up.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        btnregister_up.setkBorderRadius(50);
        btnregister_up.setkEndColor(new java.awt.Color(51, 204, 255));
        btnregister_up.setkHoverEndColor(new java.awt.Color(0, 102, 204));
        btnregister_up.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnregister_up.setkHoverStartColor(new java.awt.Color(0, 102, 204));
        btnregister_up.setkPressedColor(new java.awt.Color(255, 102, 0));
        btnregister_up.setkSelectedColor(new java.awt.Color(255, 255, 255));
        btnregister_up.setkStartColor(new java.awt.Color(51, 204, 255));
        btnregister_up.setMaximumSize(new java.awt.Dimension(107, 28));
        btnregister_up.setMinimumSize(new java.awt.Dimension(107, 28));
        btnregister_up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnregister_upMouseClicked(evt);
            }
        });

        cboxtype_up.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cboxtype_up.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "staff", "admin" }));
        cboxtype_up.setToolTipText("");
        cboxtype_up.setBorder(null);
        cboxtype_up.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtenpass_up.setBackground(new Color(0,0,0,0));
        txtenpass_up.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        txtenpass_up.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtenpass_up.setOpaque(false);

        txtrepass_up.setBackground(new Color(0,0,0,0));
        txtrepass_up.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        txtrepass_up.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtrepass_up.setOpaque(false);

        txtname_up.setBackground(new Color(0,0,0,0));
        txtname_up.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        txtname_up.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtname_up.setOpaque(false);

        txtemail_up.setBackground(new Color(0,0,0,0));
        txtemail_up.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        txtemail_up.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtemail_up.setOpaque(false);

        txtuser_up.setBackground(new Color(0,0,0,0));
        txtuser_up.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        txtuser_up.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtuser_up.setOpaque(false);

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel16.setText("Security Answer:");

        txtsecurans_up.setBackground(new Color(0,0,0,0));
        txtsecurans_up.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        txtsecurans_up.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtsecurans_up.setOpaque(false);

        javax.swing.GroupLayout signup_paneLayout = new javax.swing.GroupLayout(signup_pane);
        signup_pane.setLayout(signup_paneLayout);
        signup_paneLayout.setHorizontalGroup(
            signup_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signup_paneLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(switch_panel_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(signup_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signup_paneLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(min2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close1)
                        .addGap(19, 19, 19))
                    .addGroup(signup_paneLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboxtype_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signup_paneLayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(signup_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signup_paneLayout.createSequentialGroup()
                        .addComponent(btnregister_up, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signup_paneLayout.createSequentialGroup()
                        .addGroup(signup_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addGroup(signup_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtrepass_up, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtenpass_up, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtuser_up, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtname_up, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtemail_up, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(95, 95, 95))
                    .addGroup(signup_paneLayout.createSequentialGroup()
                        .addGroup(signup_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(txtsecurans_up, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96))))
        );
        signup_paneLayout.setVerticalGroup(
            signup_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signup_paneLayout.createSequentialGroup()
                .addGroup(signup_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signup_paneLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(switch_panel_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(signup_paneLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(signup_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(min2)
                            .addComponent(close1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signup_paneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(signup_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cboxtype_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtname_up, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtemail_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(txtuser_up, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtenpass_up, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtrepass_up, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtsecurans_up, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnregister_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jLayeredPane1.add(signup_pane, "card2");

        forget_pane.setkBorderRadius(75);
        forget_pane.setkEndColor(new java.awt.Color(153, 255, 255));
        forget_pane.setkStartColor(new java.awt.Color(255, 255, 255));

        min3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/min.png"))); // NOI18N
        min3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                min3MousePressed(evt);
            }
        });

        close2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        close2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                close2MousePressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel13.setText("Enter your Security Answer");

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel14.setText("Enter New Password");

        txtuser_change.setBackground(new Color(0,0,0,0));
        txtuser_change.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtuser_change.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtuser_change.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtuser_change.setOpaque(false);

        btnchange_pass.setBorder(null);
        btnchange_pass.setText("Change Password");
        btnchange_pass.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnchange_pass.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        btnchange_pass.setkBorderRadius(35);
        btnchange_pass.setkEndColor(new java.awt.Color(51, 204, 255));
        btnchange_pass.setkHoverEndColor(new java.awt.Color(102, 255, 102));
        btnchange_pass.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnchange_pass.setkHoverStartColor(new java.awt.Color(102, 255, 102));
        btnchange_pass.setkPressedColor(new java.awt.Color(255, 0, 51));
        btnchange_pass.setkSelectedColor(new java.awt.Color(255, 255, 255));
        btnchange_pass.setkStartColor(new java.awt.Color(51, 204, 255));
        btnchange_pass.setPreferredSize(new java.awt.Dimension(150, 40));
        btnchange_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnchange_passMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel15.setText("Re-enter New Password");

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel17.setText("Enter email");

        txtemail_change.setBackground(new Color(0,0,0,0));
        txtemail_change.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtemail_change.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtemail_change.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtemail_change.setOpaque(false);

        txtrepass_change.setBackground(new Color(0,0,0,0));
        txtrepass_change.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        txtrepass_change.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtrepass_change.setOpaque(false);

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        jLabel18.setText("Enter Username");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jLabel9.setText("Back to Sign In");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        txtsecans_change.setBackground(new Color(0,0,0,0));
        txtsecans_change.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtsecans_change.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtsecans_change.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtsecans_change.setOpaque(false);

        txtenpass_change.setBackground(new Color(0,0,0,0));
        txtenpass_change.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        txtenpass_change.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtenpass_change.setOpaque(false);

        javax.swing.GroupLayout forget_paneLayout = new javax.swing.GroupLayout(forget_pane);
        forget_pane.setLayout(forget_paneLayout);
        forget_paneLayout.setHorizontalGroup(
            forget_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forget_paneLayout.createSequentialGroup()
                .addGroup(forget_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(forget_paneLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(forget_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel17)
                            .addComponent(txtemail_change, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(txtuser_change, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(txtrepass_change, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsecans_change, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtenpass_change, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(forget_paneLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel9))
                    .addGroup(forget_paneLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnchange_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forget_paneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(min3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close2)
                .addGap(19, 19, 19))
        );
        forget_paneLayout.setVerticalGroup(
            forget_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forget_paneLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(forget_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(min3)
                    .addComponent(close2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(30, 30, 30)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtuser_change, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtemail_change, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtsecans_change, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtenpass_change, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtrepass_change, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnchange_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jLayeredPane1.add(forget_pane, "card3");

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 470, 550));

        leftpane.setkBorderRadius(50);
        leftpane.setkEndColor(new java.awt.Color(51, 204, 255));
        leftpane.setkGradientFocus(250);
        leftpane.setkStartColor(new java.awt.Color(51, 204, 255));
        leftpane.setkTransparentControls(false);
        leftpane.setOpaque(false);

        lbl_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/c2c.jpg"))); // NOI18N

        javax.swing.GroupLayout leftpaneLayout = new javax.swing.GroupLayout(leftpane);
        leftpane.setLayout(leftpaneLayout);
        leftpaneLayout.setHorizontalGroup(
            leftpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftpaneLayout.createSequentialGroup()
                .addComponent(lbl_icon)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        leftpaneLayout.setVerticalGroup(
            leftpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftpaneLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbl_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(leftpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, 370));

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Co-powered by ATAD Co-Operation");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMousePressed
        // TODO add your handling code here:
        System.exit(0); //for exut jframe
    }//GEN-LAST:event_closeMousePressed

    private void minMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMousePressed
        // TODO add your handling code here:
        this.setState(ICONIFIED);       //for minimize jframe
    }//GEN-LAST:event_minMousePressed

    private void min1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min1MousePressed
        // TODO add your handling code her //for minimize jframe
    }//GEN-LAST:event_min1MousePressed

    private void close1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MousePressed
        // TODO add your handling code here:
        System.exit(0); //for exut jframe
    }//GEN-LAST:event_close1MousePressed

    private void img_signupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_signupMousePressed
        // TODO add your handling code here:
        signin_pane.setVisible(false);
        signup_pane.setVisible(true);
    }//GEN-LAST:event_img_signupMousePressed

    private void img_signin1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_signin1MousePressed
        // TODO add your handling code here:
        signup_pane.setVisible(false);
        signin_pane.setVisible(true);
    }//GEN-LAST:event_img_signin1MousePressed

    private void min2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min2MousePressed
        // TODO add your handling code here:
        this.setState(ICONIFIED);       //for minimize jframe
    }//GEN-LAST:event_min2MousePressed

    private void min3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min3MousePressed
        // TODO add your handling code here:
        this.setState(ICONIFIED);
    }//GEN-LAST:event_min3MousePressed

    private void close2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close2MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_close2MousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        // TODO add your handling code here:
        forget_pane.setVisible(false);
        signin_pane.setVisible(true);
    }//GEN-LAST:event_jLabel9MousePressed

    private void btn_forgetpassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_forgetpassMousePressed
        // TODO add your handling code here:
        signin_pane.setVisible(false);
        forget_pane.setVisible(true);
    }//GEN-LAST:event_btn_forgetpassMousePressed

    private void btn_signinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_signinMouseClicked
        // TODO add your handling code here:    LOGIN CODE
        String username = txtuser_in.getText();
        String password = String.valueOf(txtpass_in.getPassword());
        if (username.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Some Fields Are Empty", "Error", 1);
        } else {

            try {
                Connection con = conjdbc.getConnection();
                //Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","root");
                PreparedStatement smt = con.prepareStatement("select * from user where username =? and password =?");
                smt.setString(1, username);
                smt.setString(2, password);
                ResultSet st = smt.executeQuery();
                if (st.next()) {
                    JOptionPane.showMessageDialog(null, "You are Successfully logged in");
                    signup_pane.setVisible(false);
                    JFrame frame = new home();
                    frame.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Login Credentials");
                }
                con.close();
                st.close();
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_signinMouseClicked

    public static boolean isEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null) {
            return false;
        }
        return pat.matcher(email).matches();
    }

    private void btnregister_upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregister_upMouseClicked
        // TODO add your handling code here:
        String name = txtname_up.getText();
        String email = txtemail_up.getText();
        String username = txtuser_up.getText();
        String pass1 = String.valueOf(txtenpass_up.getPassword());
        String pass2 = String.valueOf(txtrepass_up.getPassword());
        String usertype = cboxtype_up.getSelectedItem().toString();
        String secans = txtsecurans_up.getText();
            if (isEmail(email) && pass1.equals(pass2) && !pass1.isEmpty() && !pass2.isEmpty() && !username.isEmpty() && !name.isEmpty() && !secans.isEmpty()) {
                try {
                    Connection con = conjdbc.getConnection();
                    PreparedStatement smt = (PreparedStatement) con.prepareStatement("insert into user(name,email,username,password,user_type,sec_ans)values(?,?,?,?,?,?)");
                    smt.setString(1, name);
                    smt.setString(2, email);
                    smt.setString(3, username);
                    smt.setString(4, pass1);
                    smt.setString(5, usertype);
                    smt.setString(6, secans);
                    int res = smt.executeUpdate();
                    if (res != 0) {
                        JOptionPane.showMessageDialog(null, "You are registered successfully");
                        signin_pane.setVisible(true);
                        signup_pane.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Something went wrong");
                    }
                    con.close();
                    smt.close();
                } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Please fill all the details correctly");
            }
    }//GEN-LAST:event_btnregister_upMouseClicked


    private void btnchange_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnchange_passMouseClicked
        // TODO add your handling code here:
        String cusername = txtuser_change.getText();
        String cemail = txtemail_change.getText();
        String cpass1 = txtenpass_change.getText();
        String cpass2 = txtrepass_change.getText();
        String csec_ans = txtsecans_change.getText();

        try {
            Connection con = conjdbc.getConnection();
            PreparedStatement select = (PreparedStatement) con.prepareStatement("select username, email, sec_ans from user where username=?;");
            select.setString(1, cusername);
            //conn.setAutoCommit(false);

            ResultSet rs = select.executeQuery();

            if (rs.next()) {
                String username = rs.getString("username");
                String email = rs.getString("email");
                String sec = rs.getString("sec_ans");

                if (cusername.equals(username) == true) {
                    if (cemail.equals(email) == true) {
                        if (csec_ans.equals(sec)) {
                            if (cpass1.equals(cpass2)) {
                                int a = cpass1.length();
                                if (a >= 8 && a <= 16) {
                                    PreparedStatement ps = (PreparedStatement) con.prepareStatement("update user set password=? where username=?");
                                    ps.setString(1, cpass1);
                                    ps.setString(2, cusername);
                                    int n = ps.executeUpdate();
                                    if (n == 1) {
                                        JOptionPane.showMessageDialog(null, "Password Updated Successfully");
                                        txtuser_change.setText("");
                                        txtemail_change.setText("");
                                        txtsecans_change.setText("");
                                        txtenpass_change.setText("");
                                        txtrepass_change.setText("");
                                        forget_pane.setVisible(false);
                                        signin_pane.setVisible(false);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Password must be 8 to 16 characters long.");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Passwords don't match!");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid answer to security question");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid email");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error!");
            }
            con.commit();
            con.close();
            select.close();
            rs.close();
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnchange_passMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_forgetpass;
    private keeptoo.KButton btn_signin;
    private keeptoo.KButton btnchange_pass;
    private keeptoo.KButton btnregister_up;
    private javax.swing.JComboBox<String> cboxtype_up;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JLabel close2;
    private keeptoo.KGradientPanel forget_pane;
    private javax.swing.JLabel img_signin;
    private javax.swing.JLabel img_signin1;
    private javax.swing.JLabel img_signup;
    private javax.swing.JLabel img_signup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lbl_icon;
    private javax.swing.JLabel lbl_signin;
    private javax.swing.JLabel lbl_signin1;
    private javax.swing.JLabel lbl_signup;
    private javax.swing.JLabel lbl_signup1;
    private keeptoo.KGradientPanel leftpane;
    private javax.swing.JLabel min;
    private javax.swing.JLabel min1;
    private javax.swing.JLabel min2;
    private javax.swing.JLabel min3;
    private keeptoo.KGradientPanel signin_pane;
    private keeptoo.KGradientPanel signup_pane;
    private javax.swing.JPanel switch_panel_signin;
    private javax.swing.JPanel switch_panel_signup;
    private javax.swing.JTextField txtemail_change;
    private javax.swing.JTextField txtemail_up;
    private javax.swing.JTextField txtenpass_change;
    private javax.swing.JPasswordField txtenpass_up;
    private javax.swing.JTextField txtname_up;
    private javax.swing.JPasswordField txtpass_in;
    private javax.swing.JTextField txtrepass_change;
    private javax.swing.JPasswordField txtrepass_up;
    private javax.swing.JTextField txtsecans_change;
    private javax.swing.JTextField txtsecurans_up;
    private javax.swing.JTextField txtuser_change;
    private javax.swing.JTextField txtuser_in;
    private javax.swing.JTextField txtuser_up;
    // End of variables declaration//GEN-END:variables
}
