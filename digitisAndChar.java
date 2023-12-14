package day22_array_List;


public class digitisAndChar {
    public static void main(String[] args) {

        String  str = "Wooden Spoon!";

        String letters = "";
        String Digits = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (Character.isLetter(each)){
                letters+=each;
            } else if (Character.isDigit(each)) {
                Digits+=each;

            }else {
                specialChars+=each;
            }

        }

        System.out.println("Letters= " + letters);
        System.out.println("Digits= " + Digits);
        System.out.println("Special Chars= " + specialChars);



    }
}
/*
 Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= WoodenSpoon
            Digits =
            specialChars =  !

 */