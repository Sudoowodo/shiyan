# shiyan
第四次实验
实验目的
分析学生选课系统
使用GUI窗体及其组件设计窗体界面
完成学生选课过程业务逻辑编程
基于文件保存并读取数据
处理异常
实验要求
一、系统角色分析及类设计
例如：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择课程。
定义每种角色人员的属性，及其操作方法。
属性示例：	人员（编号、姓名、性别……）
教师（编号、姓名、性别、所授课程、……）
			学生（编号、姓名、性别、所选课程、……）
			课程（编号、课程名称、上课地点、时间、授课教师、……）
以上属性仅为示例，同学们可以自行扩展。

二、要求:
1、设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。
2、基于事件模型对业务逻辑编程，实现在界面上支持上述操作。
3、针对操作过程中可能会出现的各种异常，做异常处理
4、基于输入/输出编程，支持学生、课程、教师等数据的读写操作。
5、基于Github.com提交实验，包括实验SRC源文件夹程序、README.MD实验报告文档。
6、本次实验是综合性实验，在40%的实验成绩中占比最大，望同学们认真对待。
7、提交截止时间：12月8日。
三丶实验流程图
https://github.com/Sudoowodo/shiyan/blob/master/1575818021(1).jpg
四丶流程
先加课程，然后把课程的内容写到文件里面，学生选课的时候，去把文件里面的课程内容读出来
在相应的位置用txt存放起来，等学生查询的时候在输出出来
五丶核心代码
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

            try (PrintWriter pw = new PrintWriter(new FileOutputStream(new File("/E:/java实验/a.txt"), true))) {
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
            try (PrintWriter pw = new PrintWriter(new FileOutputStream(new File("/E:/java实验/b.txt"), true))) {
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
六丶心得体会
这次编程较为综合，是前几次实验的总结，我借鉴了前几次实验写出了这次的程序，但还没满足学生注册，输出的时候txt里没有前提，我也正在一点一点研究 
通过这次实验，我脑海中整理出了这一学期的内容，这学期的java课程结束了，我未来还会接触c语言，Python语言等等.这一学期的学习为我以后的学习奠定了基础.
