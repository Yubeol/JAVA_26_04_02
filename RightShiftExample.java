public class RightShiftExample {
    public static void main(String[] args){
        System.out.println("--- 오른쪽 시프트(>>) 연산 ---");

        int num = 0b1100;

        System.out.print("초기 상태값 " + num + "(이진수 1100)\n");

        int shift1 = num >> 1;
        System.out.println("1. num >> 1 -> 결과값: " + shift1 + "(이진수 0110)");
        int shift2 = num >> 2;
        System.out.println("2. num >> 2 -> 결과값: " + shift2 + "(이진수 0011)");
        int shift3 = num >> 3;
        System.out.println("3. num >> 3 -> 결과값: " + shift3 + "(이진수 0001)");
    }
    
}
