package co.kr.ibeauty.codewars;

class TriangleTester{
    public static boolean isTriangle(int a, int b, int c){
        if(a+b > c && b+c > a && a+c > b)
            return true;
        else
            return false;
    }
}
