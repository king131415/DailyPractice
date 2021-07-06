package javaDailyProctice.Test0705_Hashmap.Test0706_HashMap;

import java.util.Scanner;

public class TestRBTree {
    public static void main(String[] args) {
        RBTree<String, Object> rbtree = new RBTree();
        //测试输入：ijkgefhdabc
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入key:");
            String key = sc.next();

            rbtree.insert(key, null);
            TreeOperation.show(rbtree.getRoot());
        }
    }
}
