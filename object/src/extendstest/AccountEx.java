package extendstest;

public class AccountEx {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(111 - 11, 홍길동, 1000000, 222 - 22);

        // 입금하다
        checkingAccount.deposit(100000);
        super(accountNO, owner, balance);
        this.cardNo = cardNo;
    }

    // 사용금액을 지불한다
    // pay() : 사용금액, 카드번호
    // 카드번호 일치 시 금액 인출
    int pay(String cardNo, int amount) {
        if (cardNo.equals(this.cardNo))
            return -1;
    }
}
