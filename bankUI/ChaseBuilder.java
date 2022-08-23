package bankUI;

// ChaseBuilder class
class ChaseBuilder implements Builder {
    private String bankName;
    private final Product product;

    public ChaseBuilder(String bank) {
        product = new Product();
        this.setBankName(bank);
    }

    public void createHeader() {
        product.add("Step 1: Creating Chase Header...");
    }

    public void createSideBar() {
        product.add("Step 2: Creating Chase SideBar...");
    }

    public void createMainPanel() {
        product.add("Step 3: Creating Chase MainPanel...");
    }

    public void createFooter() {

        product.add("Step 4: Creating Chase Footer...");
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
