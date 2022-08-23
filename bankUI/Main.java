package bankUI;

public class Main {

    public static void main(String[] args) {

        System.out.println("--Testing Bank of America version of UI--");
        Director director = new Director();


        // Making Bank of America Builder
        Builder bankOfAmericaUserInterfaceBuilder = new BankOfAmericaBuilder("");
        director.construct(bankOfAmericaUserInterfaceBuilder);
        Product p1 = bankOfAmericaUserInterfaceBuilder.getUI();
        p1.showProduct();

        //Making Chase Builder
        Builder chaseUserInterfaceBuilder = new ChaseBuilder("");

        director.construct(chaseUserInterfaceBuilder);
        Product p2 = chaseUserInterfaceBuilder.getUI();
        p2.showProduct();
    }
}