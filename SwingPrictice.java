package javaDailyProctice;

import javax.swing.*;
import java.awt.*;

/**
 * QQ界面实现
 */
public class SwingPrictice extends JFrame {

    //北部区域
    JLabel jl1;

     //南部区域
    JButton jb1,jb2,jb3;
    JPanel jp1;

    //中部区域
    JTabbedPane jtp;//选项卡容器窗体
    JPanel jp2,jp3,jp4;

    JLabel jl2,jl3,jl4,jl5;
    //号码文本框
    JTextField jtf;
    //密码框
    JPasswordField jpf;
    //清除号码的button
    JButton jb4;
    //隐身登录和记住密码
    JCheckBox jcb1,jcb2;

    public static void main(String[] args) {
         SwingPrictice swingPrictice=new SwingPrictice();
    }

    public SwingPrictice()  {
      //创建组件
        jl2=new JLabel("QQ号码",JLabel.CENTER);
        jl3=new JLabel("QQ密码",JLabel.CENTER);
        jl4=new JLabel("忘记密码",JLabel.CENTER);
        jl4.setFont(new Font("宋体",Font.PLAIN,16));
        jl4.setForeground(Color.BLUE);
        jl5=new JLabel("<html><a href='www.qq.com'>申请密码保护</a>");
        jl5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

       //输入号码框
        jtf=new JTextField();
        //输入密码框
        jpf=new JPasswordField();

        jb4=new JButton(new ImageIcon("clear.gif"));
        //复选框
        jcb1=new JCheckBox("隐身登录");
        jcb2=new JCheckBox("记住密码");

        //北部区域
        jl1=new JLabel(new ImageIcon("tou.gif"));

        //南部
        jp1 = new JPanel();
        jb1=new JButton(new ImageIcon("denglu.gif"));
        jb2=new JButton(new ImageIcon("quxiao.gif"));
        jb3=new JButton(new ImageIcon("xiangdao.gif"));

        //中部区域
        jtp=new JTabbedPane();
        jp2=new JPanel();
        jp3=new JPanel();
        jp3.setBackground(Color.RED);//给面板设置背景色
        jp4=new JPanel();
        jp4.setBackground(new Color(0,0,255));

        //将面板添加到选项卡窗体
        jtp.add("QQ号码",jp2);// 第一个参数代表选项卡的名称，第二个参数代表
        jtp.add("手机号码",jp3);
        jtp.add("电子邮箱",jp4);

        //设置布局
        jp2.setLayout(new GridLayout(3,3));

        //添加组件
        jp1.add(jb1);
        jp1.add(jb2);
        jp1.add(jb3);


        jp2.add(jl2);
        jp2.add(jtf);
        jp2.add(jb4);
        jp2.add(jl3);
        jp2.add(jpf);
        jp2.add(jl4);
        jp2.add(jcb1);
        jp2.add(jcb2);
        jp2.add(jl5);

        this.add(jp1,BorderLayout.SOUTH); //边界布局，系统默认的是流式布局
        this.add(jl1,BorderLayout.NORTH);
        this.add(jtp,BorderLayout.CENTER);

        //展现组件
        ImageIcon icon=new ImageIcon("qq,gif");
        this.setIconImage(icon.getImage());//给窗体设置图标方法
        this.setSize(350,240);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);



    }
}
