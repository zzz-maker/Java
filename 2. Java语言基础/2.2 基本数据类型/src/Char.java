public class Char {
    public static void main(String[] args){
        char word = 'd', word2 = '@';
        int p = 12345, p2 = 4231;
        char c1 = '\\', c2 = '\u2605';    //转义字符
        boolean b = true,b2 = false;
        System.out.println("d的位置为"+(int)word+";@的位置 "+(int)word2);
        System.out.println((char) p);
        System.out.println((char) p2);
        System.out.println(c1);
        System.out.println((int)c2);     //u 16进制； d 8进制
        System.out.println(b);
        System.out.println(b2);
    }
}
