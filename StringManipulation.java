public class StringManipulation {
    
    public static String reverse(String s){ //recursive  reverse(ursive)+ c + e + r
        //recursive or iterative?
        if(s.length() == 1){
            return s;
        }

        return reverse(s.substring(1)) + s.charAt(0);
    }

    //reverse even length words, given a sentence
    public static String bizzare(String s){
        //helloq world

        String[] arr = s.split("\\s+"); //split sentence on spaces //{"helloq", "world"}
        String str = "";

        for(int i = 0; i<arr.length; i++){
            if(arr[i].length() % 2 == 0){ //reverse even length words
                arr[i] = reverse(arr[i]);
            }
            str = str + arr[i] + " "; //append to the string
        }

        return str.trim(); //remove extra whitespace at the end
    }

    public static String dollarsToWords(int n){ //0 <= n <= 999 147 - One Hundred Fourty Seven
        if(n > 999){
            return "no match";
        }
        if(n == 0){
            return "0 Dollars";
        }
        if(n == 1){
            return "1 Dollar";
        }

        String s = "";
        if( n > 100 ){
            int temp = n/100;
            s = matchOnes(temp) + " Hundred";
            n %= 100;
        }

        //possible values I could have are 0 and 99
        if( n > 19){
            int temp = n/10;
            s = s + " " + matchTens(temp);
            n %= 10;
        }

        //possible value I could have are 0 and 19
        if(n > 0){
            s = s + " " + matchOnes(n);
        }
        
        return s;

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
                    return matchOnes(n-10) + "teen";
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
        //System.out.println(dollarsToWords(427));

        System.out.println(reverse("recursive"));
        System.out.println(bizzare("helloq world"));
    }
}