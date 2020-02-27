package com.leetcode.algorithm;

import java.util.Stack;

/**
 * @description: 反转列表
 * @author: wenyidao
 * @create: 2019-12-31 11:16
 **/
public class ReverseList {

    public static void main(String[] args) {




        ListNode five = new ListNode(5);
        five.next = null;

        ListNode forth = new ListNode(4);
        forth.next = five;

        ListNode three = new ListNode(3);
        three.next = forth;

        ListNode two = new ListNode(2);
        two.next = three;

        ListNode head = new ListNode(1);
        head.next = two;

//        while (head != null){
//            System.out.println(head.val);
//            head = head.next;
//        }

        reverseList(head);

        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }


    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public static ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while(temp!= null){
            stack.push(temp);
            temp = temp.next;
        }
        ListNode pre = null;
        while(!stack.empty() && stack.peek() != null){
            ListNode node = stack.pop();
            pre = node;
            pre.next = node;
            head = node;
        }
        return head;
    }
}
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

