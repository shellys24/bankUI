package bankUI;

interface Builder {
    void createHeader();

    void createSideBar();

    void createMainPanel();

    void createFooter();

    /* The following method is used to retrieve the object that is constructed. */
    Product getUI();
    String getbankName();
}
