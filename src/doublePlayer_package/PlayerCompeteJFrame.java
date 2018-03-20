/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublePlayer_package;

import UserManage_package.User;
import UserManage_package.UserManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import main_package.AudioFilePlayer;

/**
 *
 * @author Administrator
 */
public class PlayerCompeteJFrame extends javax.swing.JFrame {

    private Board board;
    private AudioFilePlayer player;
    private String selfId;

    /**
     * Creates new form MainMenu
     */
    public PlayerCompeteJFrame(String user_info) {
        System.out.println(user_info);
        String[] info=user_info.split(" ");
        selfId=info[0].split("\n")[0];
        player = new AudioFilePlayer("src/musics/磯村由紀子 (矶村由纪子) - 风居住的街道.mp3");
        board = new Board(info[0],Integer.valueOf(info[1]));
        getContentPane().add(board);
        initComponents();
        setResizable(false);
        player.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new main_package.ButtonJPanel("src/images/button.jpg");
        startButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        playMusicButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        startMenuItem = new javax.swing.JMenuItem();
        backMenuItem = new javax.swing.JMenuItem();
        save_MenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();
        AIOption = new javax.swing.JMenu();
        DepthMenu = new javax.swing.JMenu();
        lowItem = new javax.swing.JRadioButtonMenuItem();
        primaryItem = new javax.swing.JRadioButtonMenuItem();
        midItem = new javax.swing.JRadioButtonMenuItem();
        highItem = new javax.swing.JRadioButtonMenuItem();
        AITypeItem = new javax.swing.JCheckBoxMenuItem();
        helpMenu = new javax.swing.JMenu();
        improveItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        aboutItem = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("双人对弈");
        setPreferredSize(new java.awt.Dimension(904, 660));

        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        playMusicButton.setBorderPainted(false);
        playMusicButton.setContentAreaFilled(false);
        playMusicButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playMusicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playMusicButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playMusicButton, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(playMusicButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(328, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_END);

        jMenu.setText("菜单");

        startMenuItem.setText("重新开始");
        startMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startMenuItemActionPerformed(evt);
            }
        });
        jMenu.add(startMenuItem);

        backMenuItem.setText("悔棋");
        jMenu.add(backMenuItem);

        save_MenuItem.setText("保存");
        save_MenuItem.setEnabled(false);
        save_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_MenuItemActionPerformed(evt);
            }
        });
        jMenu.add(save_MenuItem);
        jMenu.add(jSeparator1);

        exitMenuItem.setText("退出");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        jMenu.add(exitMenuItem);

        jMenuBar1.add(jMenu);

        AIOption.setText("选项");

        DepthMenu.setText("选择难度");
        DepthMenu.setEnabled(false);

        lowItem.setSelected(true);
        lowItem.setText("低级");
        DepthMenu.add(lowItem);

        primaryItem.setSelected(true);
        primaryItem.setText("初级");
        DepthMenu.add(primaryItem);

        midItem.setSelected(true);
        midItem.setText("中级");
        DepthMenu.add(midItem);

        highItem.setSelected(true);
        highItem.setText("高级");
        DepthMenu.add(highItem);

        AIOption.add(DepthMenu);

        AITypeItem.setSelected(true);
        AITypeItem.setText("AI执黑");
        AITypeItem.setEnabled(false);
        AIOption.add(AITypeItem);

        jMenuBar1.add(AIOption);

        helpMenu.setText("帮助");

        improveItem.setText("进阶");
        improveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                improveItemActionPerformed(evt);
            }
        });
        helpMenu.add(improveItem);
        helpMenu.add(jSeparator2);

        aboutItem.setText("关于");
        aboutItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutItem);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startMenuItemActionPerformed
        board.restart();
    }//GEN-LAST:event_startMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        exitButtonActionPerformed(evt);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        board.goback();
    }//GEN-LAST:event_backButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        board.exit();
        UserManager um=new UserManager();
        User user=um.findUser(selfId);
        player.start=false;
        dispose();
        new LobbyFrame(user).setVisible(true);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void save_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_MenuItemActionPerformed
//        JFileChooser fc = new JFileChooser();
////        fc.setBounds(getX(), getY(), fc.getWidth(), fc.getHeight());
//        fc.setFileFilter(new MyFilefilter());
//        fc.setSelectedFile(new File(".chess"));
//        fc.showSaveDialog(null);
//        File f = fc.getSelectedFile();
//        if (f != null) {
//            save(f.getAbsolutePath());
//        }
    }//GEN-LAST:event_save_MenuItemActionPerformed

    private void improveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_improveItemActionPerformed
        String url = "http://jingyan.baidu.com/article/4e5b3e198bc8b991901e24d0.html";
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (IOException ee) {
            ee.printStackTrace();
        }
    }//GEN-LAST:event_improveItemActionPerformed

    private void aboutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutItemActionPerformed
        JOptionPane.showMessageDialog(this, "By YJL and NY.");
    }//GEN-LAST:event_aboutItemActionPerformed

    private void playMusicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playMusicButtonActionPerformed
        if (player.start == false) {
            player.start = true;
        } else {
            player.start = false;
        }
    }//GEN-LAST:event_playMusicButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        board.restart();
    }//GEN-LAST:event_startButtonActionPerformed

//    public void reload(String url) {
//        board.reload(url);
//    }
//
//    public void save(String url) {
//        board.save(url);
//    }

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
            java.util.logging.Logger.getLogger(PlayerCompeteJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerCompeteJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerCompeteJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerCompeteJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PlayerCompeteJFrame p=new PlayerCompeteJFrame("老贾\n老王 1");
//                PlayerCompeteJFrame p=new PlayerCompeteJFrame("老王\n老贾 0");
                p.setVisible(true);
            }
        });
    }

    private class MyItemListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
//            Object obj = e.getSource();// 获得事件源
//            if (obj == startMenuItem || obj == startButton) {
//                // 重新开始
//                // JFiveFrame.this内部类引用外部类
//                System.out.println("重新开始");
//                board.restartGame();
//            } else if (obj == exitMenuItem || obj == exitButton) {
//                player.exit();
//                dispose();
//                MainJFrame startMenu = new MainJFrame(user);
//                startMenu.setVisible(true);
//            } else if (obj == backMenuItem || obj == backButton) {
//                System.out.println("悔棋...");
//                board.goback();
//            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AIOption;
    private javax.swing.JCheckBoxMenuItem AITypeItem;
    private javax.swing.JMenu DepthMenu;
    private javax.swing.JMenuItem aboutItem;
    private javax.swing.JButton backButton;
    private javax.swing.JMenuItem backMenuItem;
    private javax.swing.JButton exitButton;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JRadioButtonMenuItem highItem;
    private javax.swing.JMenuItem improveItem;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JRadioButtonMenuItem lowItem;
    private javax.swing.JRadioButtonMenuItem midItem;
    private javax.swing.JButton playMusicButton;
    private javax.swing.JRadioButtonMenuItem primaryItem;
    private javax.swing.JMenuItem save_MenuItem;
    private javax.swing.JButton startButton;
    private javax.swing.JMenuItem startMenuItem;
    // End of variables declaration//GEN-END:variables
}
