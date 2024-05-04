public class intro{
    public static void main(String[] args) {
        String s="abcdef";
        String k="";
        int i=0;
        // s.charAt(0)='a';
        System.out.println(s);
        while(i<s.length()){
            k=k+s.charAt(i);
            i++;
        }
        System.out.println(k);
    }
    
}