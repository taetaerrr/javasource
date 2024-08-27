package extendstest;

// 은행 계좌 + 직불카드
public class CheckingAccount extends Account {

    private String cardNo;

    public CheckingAccount(String accountNo, String owner, int balnce, String cardNo) {
        super(accountNo, owner, balnce);
        this.cardNo = cardNo;

    }

}
