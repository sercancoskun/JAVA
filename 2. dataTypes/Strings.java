public class Strings {
    public static void main(String[] args){
        String str = "abc";

        //is equivalent to:
        char data[] = {'a', 'b', 'c'};
        String str2 = new String(data);

        //Here are some more examples of how strings can be used:

        System.out.println(str);
        System.out.println(str2);
        String def = "def";
        System.out.println("abc" + def);
        String c = "abc".substring(2,3);
        String d = def.substring(1, 2);
    }
}
