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
    String year[] = {"1999��", "2000��"};
    String month[] = {"1��", "2��", "3��", "4��", "5��", "6��", "1��",
            "7��", "8��", "9��", "10��", "11��", "12��"};
    String day[] = {"1��", "2��", "3��", "4��", "5��", "6��", "7��", "8��", "9��",
            "10��", "11��", "12��", "13��",
            "14��", "15��", "16��", "17��",
            "18��", "19��", "20��", "21��",
            "22��", "23��", "24��", "25��",
            "26��", "27��", "28��", "29��",
            "30��", "31��"};
    String time[] = {"0.5", "1.0", "1.5", "2.0", "2.5", "3.0"};
    String score[] = {"2.0", "2.5", "3.0"
    };

    public Gui() {
        super("ѡ��ϵͳ");
        label1 = new JLabel("��ӭ���뱱ʯ��ѡ��ϵͳ ����������ؿ���Ŀγ̺���Ϣ");
        label7 = new JLabel("��ӭ���뱱ʯ��ѡ��ϵͳ ����������ؿ���Ŀγ̺���Ϣ ");
        b1 = new JComboBox(year);
        b2 = new JComboBox(month);
        b3 = new JComboBox(day);
        b4 = new JComboBox(time);
        b5 = new JComboBox(score);
        label2 = new JLabel("ѧ��������");
        label8 = new JLabel("��ʦ������");
        label3 = new JLabel("�Ա�:");
        cbg = new CheckboxGroup();
        label9 = new JLabel("�γ����ƣ�");
        label6 = new JLabel("ѧ�ţ�");
        label4 = new JLabel("���գ�");
        label10 = new JLabel("�γ̱�ţ�");
        label5 = new JLabel("�γ̣�");
        label11 = new JLabel("�Ͽεص㣺");
        label12 = new JLabel("��ʱ��");
        label13 = new JLabel("ѧ�֣�");

        c1 = new JCheckBox("pyhton");
        c2 = new JCheckBox("c++");
        c3 = new JCheckBox("Java");
        ta1 = new TextArea(17, 35);
        ta2 = new TextArea(17, 35);
        button1 = new JButton("ȷ��");
        button2 = new JButton("ȡ��");
        button3 = new JButton("ȷ��");
        button4 = new JButton("ȡ��");
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
        c.add(new Checkbox("��", cbg, true));
        c.add(new Checkbox("Ů", cbg, false));
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
            ta1.append("������" + t1.getText() + "\n" +
                    "ѧ�ţ�" + t2.getText() + "\n" + "�Ա�"
                    + cbg.getSelectedCheckbox().getLabel() +
                    "\n" + "���գ�" + b1.getSelectedItem() + b2.getSelectedItem()
                    + b3.getSelectedItem() + "\n");
            String course = null;
            if (c1.isSelected()) {
                ta1.append("�γ̣�" + c1.getLabel() + "\n");
                course = c1.getLabel();
            } else if (c2.isSelected()) {
                ta1.append("�γ̣�" + c2.getLabel() + "\n");
                course = c2.getLabel();
            } else if (c3.isSelected()) {
                ta1.append("�γ̣�" + c3.getLabel() + "\n");
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
            ta2.append("��ʦ������" + t3.getText() + "\n" +
                    "�γ����ƣ�" + t4.getText() + "\n" + "�Ͽεص㣺" + t6.getText()
                    + "\n" + "�γ̱�ţ�" + t5.getText() + "\n" + "��ʱ��" + b4.getSelectedItem()
                    + "\n" + "ѧ�֣�" + b5.getSelectedItem() + "\n");
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
