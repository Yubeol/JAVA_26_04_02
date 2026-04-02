public class SmartHomeBitwise {
    public static void main(String[]args){
        System.out.println("--- 스마트홈 가전 제어 (비트 연산) ---");

        int TV = 0b0001;
        int AC = 0b0010;
        int LIGHT = 0b0100;
        int myRoom = 0b0000;

        myRoom = myRoom | TV | LIGHT;
        System.out.println("1. TV와 조명 켬 (|) -> 상태값: " + myRoom);
        int checkAC = myRoom & AC;
        System.out.println("2. 에어컨 켜져 있나요? (&) -> 결과값: " + checkAC + " (0이므로 꺼짐");
        int checkTV = myRoom & TV;
        System.out.println(("3. TV가 켜져 있나요? (&) -> 결과값: " + checkTV + " (0이 아니므로 켜짐"));
        myRoom = myRoom ^ TV;
        System.out.println("4. TV 스위치 다시 누름 (^) 상태값: " + myRoom);
        

    }
    
}
