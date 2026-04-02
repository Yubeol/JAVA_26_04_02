public class minorRuightShift {
    public static void main(String[] args){
        byte num = -16;
        System.out.println("--- 오른쪾 시프트(>>) 연산 (음수 확인) ---");
        System.out.printf("초기 상태값: %d (이진수: %8s)\n", num, Integer.toBinaryString(num & 0xFF));
        int shift1 = num >> 1;
        System.out.printf("1. num >> 1 -> 결과: %d (이진수: %s)\n", shift1, Integer.toBinaryString(shift1 & 0xFF));
        int shift2 = num >> 2;
        System.out.printf("2. num >> 2 -> 결과: %d (이진수: %s)\n", shift2, Integer.toBinaryString(shift2 & 0xFF));
    }
    
}
