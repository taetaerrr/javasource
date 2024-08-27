package classtest;

public class Account2 {
    // 계좌번호(accountNO) : 101-11-12345
    // 계좌주(owner) : 홍길동
    // 잔액(balnce) : 1000000
    private String accountNo;
    private String owner;
    private int balnce;

    public Account2(String accountNo, String owner, int balnce) {
        this.accountNo = accountNo;
        this.owner = owner;
        this.balnce = balnce;
    }

    // 기능
    // 예금하다(deposit)
    // 잔액 = 잔액 + 예금액
    // 리턴 없음
    void deposit(int amount) {
        balnce += amount;
    }

    // 출금하다(withdraw)
    // 잔액 = 잔액 - 출금액
    // 잔액 return
    int withdraw(int amount) {
        if (amount > balnce) {
            return -1;
        }
        balnce -= amount;
        return balnce;
    }

    public int getBalnce() {
        return balnce;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getOwner() {
        return owner;
    }

    // toString : 메소드 이름 //리턴타입이 String
    @Override
    public String toString() {
        return "Account2 [accountNo=" + accountNo + ", owner=" + owner + ", balnce=" + balnce + "]";
    }

}
