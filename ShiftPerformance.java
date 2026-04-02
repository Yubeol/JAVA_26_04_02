public class ShiftPerformance {
    public static void main(String [] args){
        long interations = 10000000000L; // 10억번 반복
        long startTime, endTime;
        int result = 0;
        System.out.println("연산 속도 대결을 시작합니다! (반복 횟수: " + interations + "회)");
        startTime = System.nanoTime();
        for (long i = 0; i < interations; i++){
            result = 10 * 2;

        }
        endTime = System.nanoTime();
        long multiTime = endTime - startTime;
        System.out.println("일반 곱셉 걸린시간 " + multiTime);

        startTime = System.nanoTime();
        for (long i = 0; i < interations; i++){
            result = 10 << 1;
        }
        endTime = System.nanoTime();
        long shiftTime = endTime - startTime;
        System.out.println("왼쪽 시프트(<< 1) 소요 시간:" + shiftTime + "ns");

        System.out.println("\n--- 성능 분석 결과 ---");
        System.out.println("시프트 연산이 약 " + (double)multiTime / shiftTime + "배 더 빠릅니다.");
        System.out.println("(최종 연산 결과값: " + result + ")");
    }
    
}
