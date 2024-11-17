public class Practice_3045 {
    static String s1="Welcome to Java";
    static String s2=s1;
    static String s3=new String("Welcome to Java");
    static String s4=s1.intern();
    public boolean equal(String s1,String s2){
        return s1==s2;
    }

    public static void main(String[] args){
        Practice_3045 obj =new Practice_3045();
        System.out.println("Sivaranjani -2022503045");
        System.out.println("The string s1 is = "+s1);
        System.out.println("s1==s2   "+obj.equal(s1,s2));
        System.out.println("s2==s3   "+obj.equal(s2,s3));
        System.out.println("s1.equalsIgnoreCase(s2)   "+s1.equalsIgnoreCase(s2));
        System.out.println("s2.equals(s3)   "+s2.equals(s3));
        System.out.println("s2 == s4 "+s2 == s4);
        System.out.println("s1 + s2   "+s1 + s2);
        System.out.println("s1.charAt(0)   "+s1.charAt(0));
        System.out.println("s1.indexOf('j')   "+s1.indexOf('j'));
        System.out.println("s1.indexOf(\"to\")   "+s1.indexOf("to"));
        System.out.println("s1.lastIndexOf('a')   "+s1.lastIndexOf('a'));
        System.out.println("s1.lastIndexOf(\"o\", 15)   "+s1.lastIndexOf("o", 15));
        System.out.println("s1.codePointCount(0, s1.length()) "+s1.codePointCount(0, s1.length()));
        System.out.println("s1.length() "+s1.length());
        System.out.println("s1.substring( 3) "+s1.substring( 3));
        System.out.println("s1.substring(1, 3)  "+s1.substring(1, 3));
        System.out.println("s1.startsWith(\"Wel\") "+s1.startsWith("Wel"));
        System.out.println("s1.endsWith(\"Java\") "+s1.endsWith("Java"));
        System.out.println("s1.toLowerCase()  "+s1.toLowerCase());
        System.out.println("s1.toUpperCase() "+s1.toUpperCase());
        System.out.println("“ Hi”.trim()  "+" Hi".trim());
        System.out.println("s1.replace('o', 'O') "+s1.replace('o', 'O'));
        System.out.println("s1.replaceAll(\"o\", \"O\") "+s1.replaceAll("o", "O"));
        System.out.println("s1.replaceFirst(\"o\", \"O\") "+s1.replaceFirst("o", "O"));
        s1=s1.replaceAll("o","O");
        String[] res=s1.split("O");
        System.out.println("s1.split(\"O\") --- >");
        for(String str:res)
            System.out.print(str+" ");
        System.out.println();
        res=s1.split("O", 4);
        System.out.println("s1.split(\"O\",4) --- >");
        for(String str:res)
            System.out.print(str+" ");
        System.out.println();
        char[] string= s1.toCharArray();
        System.out.println("s1.toCharArray()--->");
        for(char c:string)
            System.out.print(c+" ");
        System.out.println();
        System.out.println("s1.codePointAt(0) "+s1.codePointAt(0));
        System.out.println("s1.contains(\"or\") "+s1.contains("or"));
        System.out.println("String.join(\"-\", s1, s2, s3) "+String.join("-", s1, s2, s3));


    }
}

/*
s1 = = s2
 s2 = = s3
 s1.equalsIgnoreCase(s2)
 s2.equals(s3)
 s1.compareTo(s2)
 s2.compareTo(s3)
 s1.equals(s2)
 s2 == s4
 s1 + s2
 s1.charAt(0)
 s1.indexOf('j')
 s1.indexOf("to")
 s1.lastIndexOf('a')
 s1.lastIndexOf("o", 15)
 s1.codePointCount(0, s1.length())
 s1.length()

 s1.substring( 3)
 s1.substring(1, 3)
 s1.startsWith("Wel")
 s1.endsWith("Java")
 s1.toLowerCase()
 s1.toUpperCase()
 “ Hi”.trim()
 s1.replace('o', 'O')
 s1.replaceAll("o", "O")
 s1.replaceFirst("o", "O")
 s1.split("O")
 s1.split("O", 4)
 s1.toCharArray()
 s1.codePointAt(0)
 s1.contains("or")
 String.join("-", s1, s2, s3)
 */
