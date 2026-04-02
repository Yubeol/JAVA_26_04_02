import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("**롯데월드 자이로스윙 이용 정보**");
        System.out.println("자이로스윙을 탑승하기 위해 탑승자의 정보 검사\n");
        System.out.println("탑승자의 이름을 입력해주세요.: ");
        String name = scanner.nextLine(); // 엔터를 누르기 전까지 키를 누르기 전까지의 모든 문장을 읽어옵니다.
        System.out.print("탑승자의 나이를 입력해주세요.: ");
        int age = scanner.nextInt();
        System.out.print("탑승자의 키를 입력해주세요.: ");
        int height = scanner.nextInt();
        boolean canRide = (age <= 65) && (height >= 130) && (height <= 190);
        System.out.println("--- 탑승 심사 결과 ---");
        System.out.println((name + "닙의 자이로스윙 탑승 가능 여부: " + canRide));
        scanner.close();
        
    }
}
