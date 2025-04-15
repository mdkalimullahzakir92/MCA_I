public class StringBuff {
        public static void main(String[] args) {
                System.out.println("Abdullah");
                String s = "This is for demo.";
                StringBuffer sb1 = new StringBuffer(s);
                StringBuffer sb3 = new StringBuffer("JMI");

//                sb3.append("Mca");
//                sb3.append(100);
//                sb3.insert(2, 90);
//                sb3.delete(2, 4);
//                sb3.replace(6, 8, "47");
//                sb1.reverse();
//                char[] charArr = s.toCharArray();
//                sb3.getChars(0, 6, charArr, 4);
//                System.out.println(sb1.length());
//                System.out.println(sb1.capacity());
//                System.out.println(charArr);
                System.out.println(sb3.append("Mca"));
                System.out.println(sb3.append(100));
                System.out.println(sb3.insert(2, 90));

        }
}
