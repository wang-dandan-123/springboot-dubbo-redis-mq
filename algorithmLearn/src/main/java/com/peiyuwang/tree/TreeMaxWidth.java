package com.peiyuwang.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wang
 * @create 2021-08-03 下午 3:12
 */
public class TreeMaxWidth {
    public static int max(TreeNode head){
        if(head==null){
            return 0;
        }
        Queue <TreeNode> quene = new LinkedList<>();//声明一个队列去放结点
        quene.add(head);
        HashMap<TreeNode,Integer> levelMap = new HashMap<>();//记录结点的所在的层数
        levelMap.put(head,1);
        int curLevel=1;
        int curLevelNodes=0;
        int max=Integer.MIN_VALUE;
        while(!quene.isEmpty()){
            TreeNode cur = quene.poll();//弹出节点
            int curNodeLevel = levelMap.get(cur);//记录当前的节点层数
            if (curLevel==curNodeLevel){
                curLevelNodes++;//如果当前的节点的层数与当前的层数一致，那么说明弹出的节点所在层还有，就计数
            }else{//否则就说明当前节点在下一层了，要在这个逻辑里把上一层的结算
                Math.max(max,curLevelNodes);
                curLevelNodes=1;//把下一层的节点置为1
            }
            if(cur.left!=null){
                levelMap.put(cur.left,curNodeLevel+1);//记录当前节点的层数（子节点的层数）
                quene.add(cur.left);
            }
            if(cur.right!=null){
                levelMap.put(cur.right,curNodeLevel+1);//记录当前节点的层数（子节点的层数）
                quene.add(cur.right);
            }
        }
        return max;
    }
}
