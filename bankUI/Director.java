package bankUI;

// Director class
class Director {
    Builder builder;

    // Director knows how to use the builder and the sequence of steps.
    public void construct(Builder builder) {
        this.builder = builder;
        builder.createHeader();
        builder.createSideBar();
        builder.createMainPanel();
        builder.createFooter();

    }
}
