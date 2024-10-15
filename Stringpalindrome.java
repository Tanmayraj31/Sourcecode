public class Stringpalindrome {
    int i=0;
    public static void main(String[] args) {
        String s = "Tanmay";
        isPalindrome(s);

    }
    static boolean isPalindrome(String s) {
        int i =0;
        if(i>=s.length()/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            i++;
            return false;
        }

        return false;
    }
}
