package shop;

import java.util.Scanner;

import poly.ProductEx;

public class MyShop implements IShop {

    private String title;

    // User 배열 생성
    User users[] = new User[2];

    // 상품 배열 생성
    Product products[] = new Product[5];

    Product cart[] = new Product[10];

    Scanner sc = new Scanner(System.in);

    // 선택된 user 의 index 보관
    private int selUser;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUser() {
        // user 2명을 생성 후 users 배열 담기
        users[0] = new User("홍길동", PayType.CARD);
        users[1] = new User("성춘향", PayType.CASH);

    }

    @Override
    public void genProduct() {
        // CellPhone, SmartTv 5개 생성 후 products 배열에 담기
        products[0] = new CellPhone("아이폰 13", 1500000, "KT");
        products[1] = new CellPhone("갤럭시 노트13", 1200000, "SKT");
        products[2] = new CellPhone("갤럭시 Z 플립", 1300000, "LG");
        products[3] = new CellPhone("삼성 울트라 HD", 1800000, "4k");
        products[4] = new CellPhone("LG 스마트", 1400000, "1080p");
    }

    @Override
    public void start() {
        // 출력
        // MyShop : 메인화면 - 계정선택
        // ================================
        // [1] 홍길동(CARD) :
        // [2] 성춘향(CASH) :
        // [X] 종료
        // 선택

        System.out.println(title + " : 메인화면 - 계정선택");
        System.out.println("================================");
        for (int i = 0; i < users.length; i++) {
            System.out.printf("[%d] %s(%s)\n", (i + 1), users[i].getName(), users[i].getPayType());
        }
        System.out.println("[X] 종료");
        System.out.println("선택 >> ");
        // 사용자 입력 : 1,2,X
        // 사용자 입력이 1,2 인 경우 productList() 호출
        // X 인 경우 : System.exit()
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        switch (input) {
            case "1":
            case "2":
                // 배열 인덱스
                selUser = Integer.parseInt(input) - 1;
                productList();
                break;
            case "x":
            case "X":
                System.exit(0);
            default:
                System.out.println("입력을 확인해 주세요");
                start();
                break;
        }

        // if (sc.nextLine() == X) {
        // System.exit(0);
        // } else{
        // productList();
        // }
    }

    public void productList() {
        // 출력
        // MyShop : 상품목록 - 상품선택
        // ================================
        // [1] 상품
        // [2] 상품
        // [3~5] 상품
        // [h]
        // [X] 종료
        // 선택

        System.out.println(title + " : 상품목록 - 상품선택");
        System.out.println("================================");

        int i = 0;
        for (Product product : products) {
            System.out.printf("[%d]", i++);
            product.printDetail();
        }
        System.out.println("[h] 메인화면");
        System.out.println("[c] 체크아웃");
        System.out.println("선택 >> ");

        // 메뉴 받기
        // 0~4 or h or c
        // h : 메인화면 - 계정선택 호출
        // c : checkOut() 호출
        // 0~4 : cart에 담기

        String input = sc.nextLine();
        switch (input) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
                for (int j = 0; j < cart.length; j++) {
                    if (cart[j] == null) {
                        cart[j] = products[Integer.parseInt(input)];
                        break;
                    }
                }
                break;
            case "h":
            case "H":
                start();
                break;
            case "c":
            case "C":
                checkOut();
            default:
                System.out.println("입력을 확인해 주세요");
                start();
                break;
        }

    }

    public void checkOut() {
        // cart 화면 출력
        System.out.println();
        System.out.println(title + user.selUser[] + ": 체크아웃");
        System.out.println("========================================================");

        int i = 0;
        for (Product product : cart) {
            if (product != null) {
                System.out.printf("[%d] %s (%d)\n", i++, product.getpName(), product.getPrice());
            }
        }

        // 결제방법 : CARD OR CASH
        // 합계 : 카트에 담긴 물건
        // [p] 이전
        // [q] 결제완료

        // 입력값에 따라
        // p : 상품목록 화면 보여주기
        // q : 종료
        String input = sc.nextLine();
        switch (input) {
            case "p":
                productList();
                break;
            case "q":
                System.exit(0);
                break;           
            default:
            System.out.println("입력값을 확인해 주세요");
            checkOut();
                break;
        }

    }

    // for (int i = 0; i < products.length; i++) {
    // System.out.printf("[%d] %s(%s)\n", (i+1), products[i].getName(),
    // products[i].getPayType());
    // }
    // System.out.println("[X] 종료");
    // System.out.println("선택 >> ");
    // Scanner sc = new Scanner(System.in);
    // String n = sc.nextLine();

    // if (n == X) {
    // System.exit(0);
    // } else{
    // productList();
    // }

}
