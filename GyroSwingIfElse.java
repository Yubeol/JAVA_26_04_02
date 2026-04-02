import java.util.Scanner;

public class GyroSwingIfElse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("**롯데월드 자이로스윙 이용 심사**");
        System.out.println("----------------------------");
        System.out.println("탑승자의 이름을 입력해주세요.: ");
        String name = scanner.nextLine(); // 엔터를 누르기 전까지 키를 누르기 전까지의 모든 문장을 읽어옴.
        System.out.print("탑승자의 나이를 입력해주세요.: ");
        int age = scanner.nextInt();
        System.out.print("탑승자의 키를 입력해주세요.: ");
        int height = scanner.nextInt();

        System.out.println("--- 탑승 심사 결과 ---");
        boolean canRide = (age <= 65) && (height >= 130) && (height <= 190);
        if (canRide){
            System.out.println("환영합니다! " + name + "님은 자이로스윙 탑승 요겅을 충족하셨습니다.");
            System.out.println("안전바를 꽉 잡고 즐거운 시간 되세요!");
        }else{
            System.out.println("죄송합니다. " + name + "님은 아전상의 이유로 자이로스윙에 탑승하 실 수 없습니다.");
            System.out.println("다른 놀이기구를 이용해 주시기 바랍니다.");
        }
        
        scanner.close();
        
    }
}

