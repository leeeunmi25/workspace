package a0629;

import java.util.Scanner;

public class Ex4_14 {
    public static void main(String[] args) {
        int num =0, sum =0;
        System.out.print("숫자를 입력하세요(예:12345)");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp); // 입력받은 문자열 tmp를 숫자변환
        while(num!=0){
            sum += num%10; //sum = sum + num%10
            System.out.printf("sum= %3d num=%d%n",sum, num);

            num /= 10; //num = num / 10;
            //num을 100으로 나눈 값을 다시 num에 저장 
        }
        System.out.println("각 자리수의 합" +sum);
    }
    
}
