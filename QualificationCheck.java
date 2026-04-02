public class QualificationCheck {
    public static void main(String[]args){
        System.out.println("--- 2026학년도 졸업 및 장학금 심사 ---");

        int totalCredits = 142;
        double gpa = 3.8;
        int toeicScore =850;
        boolean hasCodingCert = true;
        boolean isProbation = false;
        
        System.out.println(("[1단계: 기본 요건 확인]"));
        boolean checkCredits = totalCredits >= 140;
        System.out.println("졸업 학점을 모두 채웠는가? " + checkCredits);
        boolean checkGpa = gpa == 4.5;
        System.out.println("평점이 4.5 만점인가? " + checkGpa);
        System.out.println("\n{2단계: 종합 논리 심사");
        boolean canGraduate = (totalCredits >= 140) && (gpa >= 3.0) && !isProbation;
        System.out.println("최종 졸업 자격을 만족하는가? " + canGraduate);

        boolean passCert = (toeicScore >= 800) || hasCodingCert;
        System.out.println("외국어 또는 IT 자격 인증을 통과했는가? " + passCert);
        System.out.println("이 학생은 성적 우수 장학금 대상인가? " + !isProbation);
        boolean hasDoubleMajor = true;
        boolean hasMinor = true;
        boolean validTrack = hasDoubleMajor ^ hasMinor;
        System.out.println("\n[특이 조건: 복수전공/부전공 중 택 1");
        System.out.println("특화 프로그램에 지원 가능한가? " + validTrack);

    }
    
}
