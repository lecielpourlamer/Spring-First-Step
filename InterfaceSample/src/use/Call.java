package use;

import used.Calculator;
import used.SubCalc;

/**
 * PackageName  : use
 * Author       : shlim
 * Date         : 2025-03-13
 * Description  :
 */

public class Call {

    public static void main(String[] args) {
        // 덧셈 클래스 인스턴스화
        //Calculator calculator = new AddCalc();

        // 뺄셈 클래스 인스턴스화
        Calculator calculator = new SubCalc();

        // 메서드 실행
        Integer result = calculator.calc(10, 5);

        // 결과 표시
        System.out.println("계산 결과는 " + result + "입니다.");
    }
}
