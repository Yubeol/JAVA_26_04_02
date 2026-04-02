import java.util.Scanner;

public class even_odd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("판별힐 정수를 입력하세요: ");
        int number = scanner.nextInt();
        String type = (number %2 == 0) ? "짝수" : "홀수";
        System.out.println("입력하신 숫자 " + number + "은(는) [" + type + "] 입니다.");
        scanner.close();
    }
}
