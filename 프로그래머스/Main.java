public class Main {
    public static void main(String[] args) {
        String kim = "Kim";
        String[] arr = {"Jane","Kim"};
        int answer = 0;
        for (int i=0;i< arr.length;i++){
            if(arr[i].equals(kim)){
                answer =i;
                break;
            }
        }
        System.out.println(answer);
    }
}
