public class Main {
    public static void main(String[] args){
        String str = null;

        try {
            System.out.print(str.length());

        } catch(NullPointerException e){
            System.out.println("NullPointerExceptionが起こりました");
            System.out.println(e.getMessage());


        }

    }
}
