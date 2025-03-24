
public class extras_strings_Question8 {
    public static void main(String[] args){
        String string1="apple";
        String string2="banana";
        char a= string1.charAt(0);
        char b=string2.charAt(0);
        if(a< b){
            System.out.println("\""+string1+"\" comes before \""+string2+"\" in lexicographical order");
        }
        else{
            System.out.println("\""+string2+"\" comes before \""+string1+"\" in lexicographical order");
        }
    }
}
