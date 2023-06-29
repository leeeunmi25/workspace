package a0628;

import java.util.Scanner;

public class Ex4_4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.println("점수를 입력하세요.>");
        //스캐너를 import
        Scanner scammer = new Scanner(System.in);
        int input = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 input에 저장
        if(score >=90){
            grade = 'A';
        }else if (score >= 80){
            grade = 'B';
        } else if (score >= 70) {
            grade = 'c';
        } else {
            grade = 'D';
        }
    }
}
