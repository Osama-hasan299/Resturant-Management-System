//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class aboutUs extends JFrame {
    private JPanel contentPane;

    public static void main(String[] args) {
        (new aboutUs()).setVisible(true);
    }

    public aboutUs() {
        super("About Us - Code for Interview");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Monu\\Desktop\\monu.png"));
        this.setBackground(new Color(173, 216, 230));
        this.setBounds(500, 250, 700, 500);
        this.contentPane = new JPanel();
        this.setContentPane(this.contentPane);
        this.contentPane.setLayout((LayoutManager)null);
        new JLabel("New label");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, 1);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(500, 40, 100, 100);
        this.contentPane.add(l1);
        JLabel l3 = new JLabel("Library");
        l3.setForeground(new Color(0, 250, 154));
        l3.setFont(new Font("Trebuchet MS", 3, 34));
        l3.setBounds(160, 40, 150, 55);
        this.contentPane.add(l3);
        JLabel l4 = new JLabel("Mangement System");
        l4.setForeground(new Color(127, 255, 0));
        l4.setFont(new Font("Trebuchet MS", 3, 34));
        l4.setBounds(70, 90, 405, 40);
        this.contentPane.add(l4);
        JLabel l5 = new JLabel("v5.1");
        l5.setForeground(new Color(30, 144, 255));
        l5.setFont(new Font("Trebuchet MS", 1, 25));
        l5.setBounds(185, 140, 100, 21);
        this.contentPane.add(l5);
        JLabel l6 = new JLabel("Developed By : Code for Interview");
        l6.setFont(new Font("Trebuchet MS", 1, 30));
        l6.setBounds(70, 198, 600, 35);
        this.contentPane.add(l6);
        JLabel l7 = new JLabel("Contact Us : codeforinterview01@gmail.com");
        l7.setFont(new Font("Trebuchet MS", 1, 20));
        l7.setBounds(70, 260, 600, 34);
        this.contentPane.add(l7);
        JLabel l8 = new JLabel("Subscribe us on Youtube : Code for Interview");
        l8.setFont(new Font("Trebuchet MS", 1, 20));
        l8.setBounds(70, 290, 600, 34);
        this.contentPane.add(l8);
        JLabel l9 = new JLabel("Follow us on Instagram : codeforinterview");
        l9.setFont(new Font("Trebuchet MS", 1, 20));
        l9.setBounds(70, 320, 600, 34);
        this.contentPane.add(l9);
        JLabel l10 = new JLabel("**If you want us to make Java Project for you, drop a mail**");
        l10.setForeground(new Color(47, 79, 79));
        l10.setFont(new Font("Trebuchet MS", 3, 18));
        l10.setBounds(70, 400, 600, 34);
        this.contentPane.add(l10);
        this.contentPane.setBackground(Color.WHITE);
    }
}
