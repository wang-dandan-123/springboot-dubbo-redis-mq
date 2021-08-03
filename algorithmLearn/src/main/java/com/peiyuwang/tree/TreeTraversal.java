package com.peiyuwang.tree;

import java.util.Stack;

/**
 * @author wang
 * @create 2021-08-03 下午 4:22
 */
public class TreeTraversal {
    public static void preOrderUnRecur(TreeNode head) {
        System.out.println("pre-order:");
        if (head != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.add(head);//头节点入栈
            while (!stack.isEmpty()) {
                TreeNode node = stack.pop();//弹出一个
                System.out.println(head.val + " ");
                if (head.right != null) {
                    stack.add(head.right);//右节点先入栈
                }
                if (head.left != null) {
                    stack.add(head.left);//左节点后入栈
                }
            }
        }
    }

    public static void posOrderUnRecur(TreeNode head) {
        System.out.println("pos-order:");
        if (head != null) {
            Stack<TreeNode> s1 = new Stack<>();
            Stack<TreeNode> s2 = new Stack<>();
            s1.add(head);//头节点入栈
            while (!s1.isEmpty()) {
                TreeNode node = s1.pop();//s1弹出一个
                s2.push(node);//把弹出这个放到s2

                if (head.right != null) {
                    s1.add(head.left);//左节点先入栈
                }
                if (head.left != null) {
                    s1.add(head.right);//右节点后入栈
                }
            }
            while (!s2.isEmpty()){
                System.out.println(s2.pop().val+" ");
            }
            //s1入栈的顺序是头左右，弹出后入栈s2
            //所以s2入栈的顺序是头右左，然后s2弹出左右头
        }
    }

    public static void inOrderUnRecur(TreeNode head){
        System.out.println("in-order:");
        if(head!=null){
            Stack<TreeNode>stack=new Stack<>();
            while (!stack.isEmpty()||head!=null){
                if(head!=null){
                    stack.push(head);
                    head=head.left;
                }else {
                    head=stack.pop();
                    System.out.println(head.val+" ");
                    head=head.right;
                }
            }
        }
    }
}
