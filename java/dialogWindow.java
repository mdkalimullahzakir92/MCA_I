import javax.swing.JOptionPane;
class dialogWindow{
        public static void main(String[] args) {
                System.out.println("Abdullah");
                /*
                 * Using JOptionPane.showInputDialog directly 
                 * for multi-line input isn't feasible as it typically only supports single-line input. 
                 * To facilitate multi-line input, 
                 * we can use JTextArea inside a 
                 * JOptionPane for a more flexible and user-friendly approach.
                 */
                String s = JOptionPane.showInputDialog(null,"Enter a string");
                JOptionPane.showMessageDialog(null, "Length = "+ s.length() + ", UpperCase = "+s.toUpperCase());
                System.out.println("Words that start with 'J':"); 
                String[] words = s.split(" ");
                System.out.println(words.length);
                for (String word : words) 
                { 
                        if (word.startsWith("J") || word.startsWith("j")) 
                        { 
                                System.out.println(word); 
                        }
                }
        }
}