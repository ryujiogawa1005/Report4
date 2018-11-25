public class Main {
    public static void main(String[] args){
        String str = "百二十三";
        int value = Integer.parseInt(str);



        try {
            System.out.print(str.length());

        } catch(NullPointerException e){
            System.out.println("NullPointerExceptionが起こりました");
            System.out.println(e.getMessage());


        }

    }
}
