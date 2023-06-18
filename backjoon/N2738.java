public class N2738 {
    public static void main(String[] args) {
        String my_string = "stas";
        String answer = "";
        for(int i = my_string.length() -1 ;i>=0;i--){
            answer += my_string.charAt(i);
        }

        System.out.println(answer);
    }
}
