public class Solution {
    public static void main(String[] args) {

        System.out.println(solution("()()"));
    }

    public static boolean solution(String s) {
        while (true){
            if(s.contains("\\\\(.\\\\)")){
                s = s.replaceAll("\\\\(.\\\\)","");
            }else break;
        }
        return s.length()==0;
    }
}
