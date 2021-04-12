package javaDailyProctice;

import javax.swing.*;
import java.awt.*;

public class GuiTest extends JFrame{
    JButton jb1,jb2,jb3,jb4,jb5;  //定义按钮的组件
    public static void main(String[] args) {
          GuiTest guiTest=new GuiTest();
    }

    public GuiTest() {
        //创建按钮组件
        jb1=new JButton("中部");
        jb2=new JButton("北部");
        jb3=new JButton("西部");
        jb4=new JButton("东部");
        jb5=new JButton("南部");

        //添加按钮组件,其中BorderLayout是边界布局管理器
        this.add(jb1, BorderLayout.CENTER);//中部布局
        this.add(jb2,BorderLayout.NORTH); //北部布局
        this.add(jb3,BorderLayout.WEST);//西部布局
        this.add(jb4,BorderLayout.EAST);//东部布局
        this.add(jb5,BorderLayout.SOUTH);//南部布局

        //设置窗体的标题
        this.setTitle("窗体的标题！！！");
        //设置窗体大小
        this.setSize(800,900);
        //设置窗体初始位置
        this.setLocation(600,600);
        //设置默认的关闭方式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //显示窗体
        this.setVisible(true);







////        //创建顶层容器类对象，
////        JFrame ji=new JFrame();
////        JButton jButton=new JButton("按钮");
//        ji.add(jButton);
//        //给窗体设置标题
//        ji.setTitle("你好！！");
//        //给窗体设置大小
//        ji.setSize(200,200);
//        //给窗体设置初始位置
//        ji.setLocation(300,200);
//        //给窗体设置默认的退出方式
//        ji.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        //显示窗体
//        ji.setVisible(true);
    }
}
