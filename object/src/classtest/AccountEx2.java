package classtest;

import java.util.Scanner;

public class AccountEx2 {

    // 멤버 변수
    // main에서도 쓰고 메인 아래 스태틱으로 쓸거라 메인 위에 선언(여러군데서 쓰려고)
    // 멤버 변수 앞에 인스턴스(static)가 와야함
    // account 인스턴스를 생성해서 배열로 다룰것이다. 현재는 null 100개
    static Account[] accounts = new Account[100];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("===================================================");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("===================================================");
            System.out.print("메뉴 선택 >> ");

            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    // 계좌생성 메소드 호출
                    // 생성된 계좌를 위 static Account[] account = new Account[100]; 배열에 담을 예정
                    createAccount();
                    break;
                case 2:
                    // 계좌 목록 메소드 호출
                    accountList();
                    break;
                case 3:
                    deposit();

                    break;
                case 4:
                    withdraw();

                    break;
                case 5:
                    run = false;
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("메뉴 번호를 확인해 주세요");
                    break;
            }
        }

    }

    static void createAccount() {
        // 계좌생성 담당 메소드
        // 1번 누를때 createAccount 메소드 호출
        // 계좌와 관련된 정보 입력받기(계좌번호,이름,금액)
        // accounts[특정인덱스] = new Account(111-12-222, 성춘향, 10000)

        System.out.printf("계좌번호 >> ");
        String accountNo = sc.nextLine();
        System.out.printf("이름 >> ");
        String owner = sc.nextLine();
        System.out.printf("금액 >> ");
        int balance = Integer.parseInt(sc.nextLine());

        // 배열 요소에서 빈공간을 찾아서 채우기
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = new Account(accountNo, owner, balance);
                System.out.println("계좌생성이 완료되었습니다.\n");
                break;

            }
        }
    }

    static void accountList() {
        // 현재 생성된 계좌목록 출력
        // accounts 배열 출력
        System.out.println("==============================");
        System.out.println("계좌         이름        잔액");
        System.out.println("==============================");
        for (Account account : accounts) {
            if (account != null) {
                System.out.printf("%s\t%s\t%d\n", account.getAccountNo(), account.getOwner(), account.getBalnce());
            }
        }

        // for (int i = 0; i < accounts.length; i++) {
        // if (accounts[i] != null) {
        // for (Account account : accounts) {
        // System.out.println("계좌번호 : %d" , accountNo(i));
        // }
        // }
        // }

    }

    static void deposit() {
        // 예금하기
        // 계좌번호와 예금액 입력받기
        System.out.print("계좌번호 >> ");
        String accountNo = sc.nextLine();
        System.out.print("예금액 >> ");
        int amount = Integer.parseInt(sc.nextLine());

        Account account = findAccount(accountNo);
        if (account != null) {
            account.deposit(amount);
        }
    }

    static void withdraw() {
        System.out.print("계좌번호 >> ");
        String accountNo = sc.nextLine();
        System.out.print("출금액 >> ");
        int amount = Integer.parseInt(sc.nextLine());
        Account account = findAccount(accountNo);
        if (account != null) {
            account.withdraw(amount);
        }
    }

    static Account findAccount(String accountNo) {
        // 일치하는 account 리턴
        for (Account account : accounts) {
            if (account != null) {
                if (accountNo.equals(account.getAccountNo())) {

                    return account;
                }
            }
        }
        return null;
    }
}
