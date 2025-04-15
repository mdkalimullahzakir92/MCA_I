package Assignments;/*
 The Java Swing package (javax.swing) provides a comprehensive set of 
 GUI (Graphical User Interface) components for building desktop applications.
 */

import javax.swing.JOptionPane;

class StrOperation {
        String s;
        StrOperation(String s) {
                this.s = s;
        }

        // convert each line in sentence case
        public String sentenceCase() {
                StringBuilder str = new StringBuilder();
                String[] lines = s.split("\n");
                for (String sentence : lines) {
                        // converting in sentence case line by line and concatenating to the final string
                        str.append(sentence.substring(0, 1).toUpperCase()).append(sentence.substring(1).toLowerCase());
                }
                return str.toString();
        }

        // reverse a given word
        protected String reverseWord(String str) {
                // converting str to strArray
                char[] strArray = str.toCharArray();
                // reversing string in the same array
                int end = strArray.length - 1, start = 0;
                while (start < end) {
                        char t = strArray[start];
                        strArray[start] = strArray[end];
                        strArray[end] = t;
                        start++;
                        end--;
                }
                // converting strArray to str
                str = String.valueOf(strArray);
                return str;
        }

        // reversing each word in each sentence
        public String reverseWords() {
                String[] lines = s.split("\n.");
                StringBuilder str = new StringBuilder();
                for (String sentence : lines) {
                        String[] Words = sentence.split(" ");
                        for (String word : Words) {
                                // reversing each word & appending in str
                                str.append(reverseWord(word)).append(" ");
                        }
                        str.append("\n");
                }
                return str.toString();
        }

        // reversing each sentence
        String revSentence() {
                StringBuilder str = new StringBuilder();
                String[] lines = s.split("\n.");
                for (String sentence : lines) {
                        String[] words = sentence.trim().split(" ");
                        for (int i = words.length - 1; i >= 0; i--) {
                                str.append(reverseWord(words[i])).append(" ");
                        }
                        str.append("\n");

                }
                return str.toString();
        }
}

class StringTest {
        public static void main(String[] args) {
                String s = JOptionPane.showInputDialog(null, "Enter a string");
                StrOperation x = new StrOperation(s);

                JOptionPane.showMessageDialog(null, s + "\n" + x.reverseWords() + "\n" + x.sentenceCase() + "\n" + x.revSentence());

String[] words = s.trim().split(" ");
                String[] lines = s.split("\n");
                char[] characters = s.toCharArray();

                String choice = JOptionPane.showInputDialog(null, """
                        Enter your choice: \
                        
                        1 No of words
                        2 No of Characters
                        3 No of lines
                        0 exit""");
                while (!choice.equals("0")) {
                        switch (choice) {
                                case "1":
                                        JOptionPane.showMessageDialog(null,"No of words : " + words.length);
                                        break;
                                case "2":
                                        JOptionPane.showMessageDialog(null,"No of characters : " + characters.length);
                                        break;
                                case "3":
                                        JOptionPane.showMessageDialog(null,"No of lines : " + lines.length);
                                        break;
                                default:
                                        JOptionPane.showMessageDialog(null,"Invalid input! Try again.");
                                        System.out.println();
                                        break;
                        }
                        choice = JOptionPane.showInputDialog(null, """
                                Enter choice: \
                                
                                1 No of words
                                2 No of Characters
                                3 No of lines
                                0 exit""");
                }
        }
}