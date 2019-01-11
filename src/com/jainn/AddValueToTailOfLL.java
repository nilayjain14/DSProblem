package com.jainn;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

    public class AddValueToTailOfLL {

        static class SinglyLinkedListNode {
            public int data;
            public SinglyLinkedListNode next;

            public SinglyLinkedListNode(int nodeData) {
                this.data = nodeData;
                this.next = null;
            }
        }

        static class SinglyLinkedList {
            public SinglyLinkedListNode head;

            public SinglyLinkedList() {
                this.head = null;
            }


        }

        public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
            while (node != null) {
                bufferedWriter.write(String.valueOf(node.data));

                node = node.next;

                if (node != null) {
                    bufferedWriter.write(sep);
                }
            }
        }

        // Complete the insertNodeAtTail function below.

        /*
         * For your reference:
         *
         * SinglyLinkedListNode {
         *     int data;
         *     SinglyLinkedListNode next;
         * }
         *
         */
        static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

            if (head == null){
                head = new SinglyLinkedListNode(data);
               // head.data = data;
            }
            else {
                SinglyLinkedListNode node =  head;
                while (node.next != null){
                    node = node.next;
                }
               // node.next = new SinglyLinkedListNode(data);
                node.next.data = data;
                node.next = null;
            }
            return head;
        }

        //private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            SinglyLinkedList llist = new SinglyLinkedList();

            //int llistCount = scanner.nextInt();
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            int[] llistItem = {1,2,3,4,5};
            for (int i = 0; i < llistItem.length; i++) {
                //int llistItem = scanner.nextInt();
                //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem[i]);

                llist.head = llist_head;
            }



            while(llist.head != null){
                System.out.println(llist.head.data);
            }
           // printSinglyLinkedList(llist.head, "\n", bufferedWriter);
            //bufferedWriter.newLine();

            //bufferedWriter.close();

            //scanner.close();
        }
    }
