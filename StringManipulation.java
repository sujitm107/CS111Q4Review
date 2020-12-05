public class StringManipulation {
    
    public String reverse(String s){
        //recursive or iterative?
        return s;
    }

    public static String bizzare(String s){
        return s;
    }

    public static String dollarsToWords(int n){ //0 <= n <= 999
        if(n > 999){
            return "no match";
        }

        //Given 197 - One hundred ninety seven
        String s = "";
        if(n > 100){
            int hundreds = n/100;
            s =  matchOnes(hundreds) + " Hundred";
            n %= 100; // now only include the tens and ones
        }

        //possible values we could have are between 0 and 99
        if(n > 19 && n < 100){
            int tens = n/10;
            s = s +" "+ matchTens(tens);
            n %= 10;
        }

        //possible values we could have are between 0 and 19 now
        if(n > 0){
            s = s + " " + matchOnes(n);
        }

        return s + " Dollars";
    }

    public static String matchOnes(int n){
        switch (n) {
            case 1: 
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4: 
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10: 
                return "Ten";
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
            case 13:
                return "Thirteen";
            default:
                if(n>13 && n <20){
                    return dollarsToWords(n-10) + "teen";
                }
        }

        return "";
    }

    public static String matchTens(int n){
        switch (n) {
            case 2:
                return "Twenty";
            case 3:
                return "Thirty";
            case 5:
                return "Fifty";
            default:
                return matchOnes(n) + "ty";
        }

    }

    public static void main(String[] args){
        System.out.println(dollarsToWords(427));
    }
}