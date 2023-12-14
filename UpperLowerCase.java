package day22_array_List;

public class UpperLowerCase {
    public static void main(String[] args) {



    String str = "JAVA java";

     int lowerCase=0;
     int upperCase=0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (Character.isLowerCase(each)){
                lowerCase++;

            } else if (Character.isUpperCase(each)) {
                upperCase++;

            }

        }
        System.out.println(lowerCase==upperCase);
}
}
/*
Write program that returns true if the total number of upper case characters
 are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true
 */