// import java.util.Scanner;

import javax.swing.JOptionPane;
class StringClass
         {
        public static void 
        main(String[] args) {
                System.out.println("Abdullah");
                String s = JOptionPane.showInputDialog(null, "Enter a paragraph.");
                String[] lines=  s.split("\n");
                String[] words= s.trim().split("[\\s,\\.?]+");
                JOptionPane.showMessageDialog(null, "Number of characters : "+ s.length()+ " Number of lines: "+ lines.length + "Number of words: "+ words.length);

                for (int i = s.length()-1 ; i>=0 ; i--)
                        System.out.print(s.charAt(i));
                System.out.println();
                for(String word : words){
                        System.out.println(word);
                        word = word.toLowerCase();
                        

                }
                        



                
                

                
                
        }
}
