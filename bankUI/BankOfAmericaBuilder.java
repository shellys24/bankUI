package bankUI;

//BankOfAmericaBuilder class
class BankOfAmericaBuilder implements Builder {
    private String bankName;
    private final Product product;

    public BankOfAmericaBuilder(String bank) {
        product = new Product();
        this.setBankName(bank);
    }

    public void createHeader() {
        product.add("Step 1: Creating Bank of America Header...");
    }

    @Override
    public void createSideBar() {
        product.add("Step 2: Creating Bank of America SideBar...");

    }

    public void createMainPanel() {
        product.add("Step 3: Creating Bank of America MainPanel");
    }

    public void createFooter() {
        product.add("Step 4: Creating Bank of America Footer");
    }

    public Product getUI() {
        return product;
    }

    @Override
    public String getbankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
