public interface Products {
    // This method will return an object of type 'Product', searched by 'id'
    Product findById(long id);

    // This method will insert a 'Product' into our table, the return of this will be said product's ID.
    long createProduct(Product product);

    // could add extra method requirements to update/delete/etc
    // i.e deleteProduct(long id) {}
    // i.e updateProduct(Product product) {}
}
