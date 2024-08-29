package shop;

public class User {
    // 이름, 지불방법(CARD, CASH)
    private String name;
    // 입력값 제한 PayType 내의 몇가지 말곤 받지 않겠다
    private PayType payType;

    public User(String name, PayType payType) {
        this.name = name;
        this.payType = payType;
    }

    public String getName() {
        return name;
    }

    public PayType getPayType() {
        return payType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPayType(PayType payType) {
        this.payType = payType;
    }

}
