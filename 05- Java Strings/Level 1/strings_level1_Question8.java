public class strings_level1_Question8 {
    public static void tryAndCatch(){
        try{
            String[] vowelsArray= {"a","e","i","o","u"};
            System.out.println(vowelsArray[6]);
        }
        catch(Exception e){
            System.out.println(" Array is out of index");
        }
    }
    public static void main(String[] args){
        tryAndCatch();
    }
}