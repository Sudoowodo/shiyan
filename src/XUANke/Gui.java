package XUANke;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Gui extends JFrame {
    Majorattribute majorattribute;

    Container c;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4, label5;
    JLabel label6;
    JLabel label7;
    JLabel label8;
    JLabel label9;
    JLabel label10, label11;
    JLabel label12;
    JLabel label13;

    JButton button1, button2;
    JButton button3, button4;
    TextArea ta1, ta2;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8;
    CheckboxGroup cbg;
    JComboBox b1;
    JComboBox b2;
    JComboBox b3;
    JComboBox b4;
    JComboBox b5;
    JCheckBox c1, c2, c3;
    String year[] = {"1999年", "2000年"};
    String month[] = {"1月", "2月", "3月", "4月", "5月", "6月", "1月",
            "7月", "8月", "9月", "10月", "11月", "12月"};
    String day[] = {"1日", "2日", "3日", "4日", "5日", "6日", "7日", "8日", "9日",
            "10日", "11日", "12日", "13日",
            "14日", "15日", "16日", "17日",
            "18日", "19日", "20日", "21日",
            "22日", "23日", "24日", "25日",
            "26日", "27日", "28日", "29日",
            "30日", "31日"};
    String time[] = {"0.5", "1.0", "1.5", "2.0", "2.5", "3.0"};
    String score[] = {"2.0", "2.5", "3.0"
    };

    public Gui() {
        super("选课系统");
        label1 = new JLabel("欢迎进入北石化选课系统 请输入你的呢开设的课程和信息");
        label7 = new JLabel("欢迎进入北石化选课系统 请输入你的呢开设的课程和信息 ");
        b1 = new JComboBox(year);
        b2 = new JComboBox(month);
        b3 = new JComboBox(day);
        b4 = new JComboBox(time);
        b5 = new JComboBox(score);
        label2 = new JLabel("学生姓名：");
        label8 = new JLabel("教师姓名：");
        label3 = new JLabel("性别:");
        cbg = new CheckboxGroup();
        label9 = new JLabel("课程名称：");
        label6 = new JLabel("学号：");
        label4 = new JLabel("生日：");
        label10 = new JLabel("课程编号：");
        label5 = new JLabel("课程：");
        label11 = new JLabel("上课地点：");
        label12 = new JLabel("课时：");
        label13 = new JLabel("学分：");

        c1 = new JCheckBox("pyhton");
        c2 = new JCheckBox("c++");
        c3 = new JCheckBox("Java");
        ta1 = new TextArea(17, 35);
        ta2 = new TextArea(17, 35);
        button1 = new JButton("确定");
        button2 = new JButton("取消");
        button3 = new JButton("确定");
        button4 = new JButton("取消");
        t1 = new JTextField("", 5);
        t2 = new JTextField("", 10);
        t3 = new JTextField("", 5);
        t4 = new JTextField("", 5);
        t5 = new JTextField("", 5);
        t6 = new JTextField("", 5);
        t7 = new JTextField("", 5);
        t8 = new JTextField("", 5);
        setBounds(600, 300, 625, 620);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        c = getContentPane();
        c.setBackground(Color.white);
        c.setLayout(new FlowLayout(FlowLayout.LEFT));
        c.add(label1);
        c.add(label7);
        c.add(label2);
        c.add(t1);
        c.add(label3);
        c.add(new Checkbox("男", cbg, true));
        c.add(new Checkbox("女", cbg, false));
        c.add(new JLabel("           "));
        c.add(label8);
        c.add(t3);
        c.add(new JLabel("                          "));
        c.add(label6);
        c.add(t2);

        c.add(new JLabel("                        "));
        c.add(label9);
        c.add(t4);
        c.add(new JLabel("                          "));
        c.add(label4);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(new JLabel("           "));

        c.add(label11);
        c.add(t6);
        c.add(new JLabel("                         "));
        c.add(label5);
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(new JLabel("               "));
        c.add(label10);
        c.add(t5);
        c.add(new JLabel("                                                   "));
        c.add(label12);
        c.add(b4);
        c.add(new JLabel("                                                   "));
        c.add(label13);
        c.add(b5);

        c.add(new JLabel("                      "));
        c.add(ta1);
        c.add(new JLabel("     "));
        c.add(ta2);
        c.add(new JLabel("                               "));
        c.add(button1);

        c.add(new JLabel("                                        "));
        c.add(button3);
        c.add(new JLabel("                                        "));
        c.add(new JLabel("                                          "));
        c.add(button4);
        setVisible(true);
        button1.addActionListener(new Button1Listener());
        button2.addActionListener(new Button2Listener());
        button3.addActionListener(new Button3Listener());
        button4.addActionListener(new Button4Listener());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) throws NewException {
        Gui d = new Gui();
    }

    class Button1Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ta1.append("姓名：" + t1.getText() + "\n" +
                    "学号：" + t2.getText() + "\n" + "性别："
                    + cbg.getSelectedCheckbox().getLabel() +
                    "\n" + "生日：" + b1.getSelectedItem() + b2.getSelectedItem()
                    + b3.getSelectedItem() + "\n");
            String course = null;
            if (c1.isSelected()) {
                ta1.append("课程：" + c1.getLabel() + "\n");
                course = c1.getLabel();
            } else if (c2.isSelected()) {
                ta1.append("课程：" + c2.getLabel() + "\n");
                course = c2.getLabel();
            } else if (c3.isSelected()) {
                ta1.append("课程：" + c3.getLabel() + "\n");
                course = c3.getLabel();
            }

            try (PrintWriter pw = new PrintWriter(new FileOutputStream(new File("/c:/a.txt"), true))) {
                pw.println(t1.getText() + "," + t2.getText() + "," + cbg.getSelectedCheckbox().getLabel() + "," + b1
                        .getSelectedItem() + b2.getSelectedItem() + b3.getSelectedItem() + "," + course);
                pw.flush();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }

    class Button2Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // do nothing
        }
    }

    class Button3Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ta2.append("教师姓名：" + t3.getText() + "\n" +
                    "课程名称：" + t4.getText() + "\n" + "上课地点：" + t6.getText()
                    + "\n" + "课程编号：" + t5.getText() + "\n" + "课时：" + b4.getSelectedItem()
                    + "\n" + "学分：" + b5.getSelectedItem() + "\n");
            try (PrintWriter pw = new PrintWriter(new FileOutputStream(new File("/c:/b.txt"), true))) {
                pw.println(t3.getText() + "," + t4.getText() + "," + t6.getText() + "," + t5.getText() + "," + b4
                        .getSelectedItem() + "," + b5.getSelectedItem());
                pw.flush();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }

    class Button4Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

}
