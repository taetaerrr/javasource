package classtest;

public class AccountEx {
    public static void main(String[] args) {
        // 주소값 타입 Account
        Account account = new Account("101-11-12345", "홍길동", 1000000);

        // 예금하다
        account.deposit(100000);
        // 잔액조회
        System.out.println("입금 후 현재 잔액 : " + account.getBalnce());

        // 출금하다
        int balance = account.withdraw(50000);
        if (balance == -1) {
            System.out.println("잔액 부족");
        } else {
            System.out.println("출금 후 현재 잔액 : " + balance);
        }

        printAccount(account);
    }

    // 새로 Account 변수 선언 - 앞이 대문자라서 주소가 넘어가기에 account가 복사됨 : 두 account가 같은 곳을 가리킴
    static void printAccount(Account account) {
        System.out.println("입금 후 현재 잔액 : " + account.getBalnce());

    }

}
