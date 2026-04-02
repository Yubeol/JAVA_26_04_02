import java.util.Scanner; // 사용자 입력을 받기 위한 Scanner 클래스 import

public class SmartEnergyGrid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // 키보드 입력 객체 생성

        // 0000 → 정상
        // 0001 → 비상
        // 0010 → 점검
        // 0011 → 비상 + 점검 동시에
        int STATUS_EMERGENCY = 0b0001; // 비상 상태를 나타내는 비트 (0001) // 0b는 2진수를 사용하겠다는 뜻
        int STATUS_MAINTENCE = 0b0010; // 점검 상태를 나타내는 비트 (0010)

        int systemStatus = 0b0000; // 현재 시스템 상태 (초기값: 아무 상태도 없음)
        int attemptCount = 0; // 시스템 가동 시도 횟수

        System.out.println("=== AI 스마트 그리드 관제 센터 ===");
        System.out.println("현제 공급 전력량(W)을 입력하세요: ");
        int powerSupply = sc.nextInt(); // 공급 전력 입력 받기

        System.out.print("시스템 정검 여부를 입력하세요 (1:정검중, 0:정상): ");
        int isFixing = sc.nextInt(); // 점검 여부 입력 받기

        // 점검 중이면 상태에 MAINTENANCE 비트 추가
        if (isFixing == 1){
            systemStatus = systemStatus | STATUS_MAINTENCE; 
            // OR 연산: 해당 비트를 1로 설정 (상태 추가)
        }

        System.out.println("\n>> 시스템 보안 검사 시작...");
        attemptCount++; // 시스템 실행 시도 횟수 증가

        // 전력 공급이 정상이고, 점검 상태가 아닐 때만 실행
        if (powerSupply > 0 && (systemStatus & STATUS_MAINTENCE) == 0){ //systemStatus & STATUS_MAINTENCE 상태 "확인"
            // AND 연산으로 점검 상태 여부 확인 (0이면 점검 아님)

            System.out.print("현재 부하량(Load)을 입력하세요: ");
            int currentLoad = sc.nextInt(); // 현재 사용 전력 입력

            // 사용 전력이 공급 전력보다 많으면
            if (currentLoad > powerSupply){
                systemStatus = systemStatus | STATUS_EMERGENCY; // systemStatus | STATUS_EMERGENCY 상태 "추가"
                // EMERGENCY 비트를 켜서 비상 상태로 변경

                System.out.println("[경고] 공급 초과! 비상 모드 (EMERGENCY)를 가동합니다.");
            } else {
                // 효율 계산 (사용량 / 공급량 * 100)
                double efficiency = (double)currentLoad / powerSupply * 100;

                System.out.println("[정상] 에너지 사용 효율: " + efficiency + "%");
            }

        } else {
            // 전력이 없거나 점검 중이면 실행 차단
            System.out.println("[차단] 시스템이 오프라인이거나 점검 중입니다.");
        }

        System.out.println("\n--- 오늘의 관제 리포트 ---");
        System.out.println("총 가동 시도 횟수: " + attemptCount);

        // EMERGENCY 상태 여부 확인
        boolean isEmergency = (systemStatus & STATUS_EMERGENCY) != 0; 
        // AND 결과가 0이 아니면 → 해당 비트가 켜져 있음 → true

        System.out.println("비상 조치 발령 여부: " + isEmergency);

        sc.close(); // Scanner 종료 (자원 해제)
    }
}