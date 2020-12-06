public class Errors {
    public static void main(String[] args){
        int[] arr = { 1, 2, 3 ,18};
        int[] arr2 = new int[8];
        int[][] arr3 = {{1,2}, {3,4}, {5,6}, {7,8}, {9,10}};
        String s = "Hello World";


        // (a) arr[0];
        // (b) arr[arr2.length - 5];
        // (c) s.charAt(arr.length);
        // (d) s.charAt(arr[3]);
        // (e) s.charAt(arr[5]);
        // (f) s.charAt(arr[1]);
        // (g) arr3[arr.length];
        // (h) arr3[arr.length][1];
        // (i) arr3.length;
        // (j) arr3[0].length;
        // (k) arr3[1].length();
        // (l) s.length;
        // (m) s.charAt(s.indexOf('H')); -- H
        // (n) s.charAt(s.indexOf('Q'));
        // (o) s.indexOf('Q');
        // (p) arr2[0];
        // (q) arr2 = arr; -- what is happening here?
        // (r) arr[0] = arr3[2][0] + arr3[3][0];
        // (s) arr[0] = (int) s.charAt(6);
        // (t) arr[0] = s.charAt(6); -- a little confusing like how double absorbs int
        // (u) int j = 6.0;
        // (v) double d = 7;
        // (w) s += 'q';
        // (x) (s + "Goodbye!").length();
        // (y) s == ("Hello " + "World"); -- KNOW THE DIFFERENCE BETWEEN Y & Z
        // (z) s.equals("Hello " + "World");
    }
}
