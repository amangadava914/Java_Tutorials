public class Strings2 {
    public static void main(String[] args) {
        // String Builder
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //charAt index
        System.out.println(sb.charAt(0));

        //set charAt index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //Insert in String using .insert()
        sb.setCharAt(0,'T');
        sb.insert(4,"Stark");
        sb.insert(4," ");
        sb.insert(2,'n');
        System.out.println(sb);

        //Delete a character/word/sentences in a string using .delete()
        sb.delete(2,3);
        System.out.println(sb);
        sb.delete(2,3);
        System.out.println(sb);

        // Append Keyword
        StringBuilder SB = new StringBuilder("H");
        SB.append("e");
        SB.append("l");
        SB.append("l");
        SB.append("o");
        System.out.println(SB);
    }
}
