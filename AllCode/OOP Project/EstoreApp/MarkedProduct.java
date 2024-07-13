package EstoreApp;

public class MarkedProduct {
    private int productId;
    private String productName;
    private int price;
    private String productDescription;
    private String productCategory;

    public MarkedProduct(int productId, int price, String productName, String productDescription, String productCategory){
        this.productDescription = productDescription;
        this.price = price;
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
    }

}
