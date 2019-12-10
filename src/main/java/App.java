public class App {
    public static void main(String[] args) {
        String s ="Always-Look-on-the-Bright-Side-of-Life";
        int k = 5;
        String result = "";
        int digit =0;

        int something =0;
        for(int i = 0; i<s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))){
                digit = (s.charAt(i)+k-97)%26+97;
                result+=(char)digit;
            }
            else if(Character.isUpperCase(s.charAt(i))){
                digit = (s.charAt(i)+k-65)%26+65;
                result+=(char)digit;
            }


            else{
                result +=s.charAt(i);
            }


        }

        System.out.println(result);
    }

}

