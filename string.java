import java.util.*;
public class string {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static float shortestPath(String direction){
        int x = 0; // W -1 | E + 1
        int y = 0; // S -1 | N + 1
        for(int i=0; i<direction.length(); i++){
            if(direction.charAt(i) == 'W'){
                x--;
            }else if(direction.charAt(i) == 'E'){
                x++;
            }else if(direction.charAt(i) == 'S'){
                y--;
            }else{
                y++;
            }
        }
        float displacement = (float)Math.sqrt((x*x) + (y*y));
        return displacement;
    }

    public static String subString(String str, int si, int ei){
        String newString = "";
        for(int i=si; i<ei; i++){
            newString += str.charAt(i);
        }
        return newString;
    }

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String  compression(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }
        }

        return sb.toString();
    }

    public static void countVowels(){
        String str = new Scanner(System.in).next();
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("count of vowels is  : " + count);
    }

    public static void isAnagrams(String str, String str2){
        if(str.length() == str2.length()){
            //converting string in lower case.
        str = str.toLowerCase();
        str2 = str2.toLowerCase();
        
        // converting string in array form.
        char [] strArray = str.toCharArray();
        char [] str2Array = str2.toCharArray();

        //sorting array
        Arrays.sort(strArray);
        Arrays.sort(str2Array);

        //bringing back array to string
        String sortedStr = new String(strArray);
        String sortedStr2 = new String(str2Array);

            if(sortedStr.equals(sortedStr2)){
                System.out.println(str + " and " + str2 + " is anagram.");
            }else{
                System.out.println(str + " and " + str2  + " is not anagram.");
            }
        }else{
            System.out.println(str + " and " + str2  + " is not anagram.");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // char arr[] = {'a', 'b', 'c', 'd', 'e'};
        // String str = "abcd";
        // String str2 = new String("abcd@143");
        // // string are Immutable

        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String fullname = "Tony STark";
        // System.out.println(fullname.length());
        
        //concatenation
        // String firstName = "prahans";
        // String lastName = "panuhar";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName + " is my full name.");
        // printLetters(fullName);
        // String str = "prahans";

        // System.out.println(isPalindrome(str));
        // String direction = "WNEENESENNN";
        // System.out.println(shortestPath(direction));

        // String str = "helloworld";
        // System.out.println(subString(str,0,5));
        // System.out.println(str.substring(0,5)); // inbuild function 

        // StringBuilder sb = new StringBuilder(""); // O(26)
        // for(char ch='A'; ch <= 'Z'; ch++){
        //     sb.append(ch);
        // }

        // System.out.println(sb);
        // System.out.println(sb.length());

        // change first letter of word to uppercase.
        // String str = "i am prahans panuhar.";
        // System.out.println(toUpperCase(str)); // I Am Prahans Panuhar.

        // compression
        // String str = "aaabbccc"; // a3b2c3
        // System.out.println(compression(str));

        //qs 1
        // countVowels();

        //qs 4
        String str = "RACE";
        String str2 = "care";
        isAnagrams(str, str2);
    }
}