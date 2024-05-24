public class StringBufferDemo { //StringBuffer is a predefined class in java
    public static void main(String[] args) {

        //Constructor in StringBuffer Class -: empty :- StringBuffer() , StringBuffer(CharSequence seq) , StringBuffer(String str) , StringBuffer(int capacity)

        StringBuffer sb = new StringBuffer(); //StringBuffer Default character capacity is 16
        System.out.println(sb.capacity());

        StringBuffer sb2 = new StringBuffer("Aman"); //capacity (16+4 = 20)
        System.out.println(sb2.capacity());

        StringBuffer sb3 = new StringBuffer("Aman Loves Pooja"); // (old capacity * 2)+2 or (old capacity+1)*2
        System.out.println(sb3.capacity());

        //.append() method use to concatenate the word or string into last
        System.out.println(sb3.append(" are"));

        //.delete() method is use do delete string
        System.out.println(sb3.delete(16,21));

        //.deleteCharAt() method
        System.out.println(sb3.deleteCharAt(9));

        //.equals() method
        StringBuffer sbd = new StringBuffer("Aman Love Pooja One Soul and Two Body");
        StringBuffer sb4 = sb3.append(" One Soul and Two Body");
        System.out.println(sb4.equals(sbd)); //false because of StringBuffer class does not override equals method of object class but String class override the equals method of object class
        System.out.println(sb3.equals(sb4));
        System.out.println(sb4);

        //.indexOf() method
        System.out.println(sb4.indexOf("P"));
        System.out.println(sb4.lastIndexOf("Soul"));

        //.insert() method
        System.out.println(sb4.insert(9,"with"));

        //.replace() method
        System.out.println(sb4.replace(5,13,"Loves With"));

        //.reverse() method
       // System.out.println(sb4.reverse());

        //.subSequence() method
        System.out.println(sb4.subSequence(16,22));

        //.subString() method
        System.out.println(sb4.substring(16));
        System.out.println(sb4.subSequence(16,22));

        //.setCharAt() method
        sb4.setCharAt(9,'z');
        System.out.println(sb4);

        //.setLength() method
        sb4.setLength(21);
        System.out.println(sb4);

        //.trimToSize() method and .ensureCapacity() method
        StringBuffer SB = new StringBuffer();
        SB.ensureCapacity(100); //capacity of SB is 100
        SB.append("Hello"); //and we use only 5 character
        SB.trimToSize(); // wastage memory delete kr deta hain
        System.out.println(SB.capacity());
    }
}
