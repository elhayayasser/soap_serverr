package org.example.webservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.models.Product;

import java.util.Date;
import java.util.List;
@WebService(serviceName = "ProductWS")
public class ProductWebService {
    @WebMethod(operationName = "sellingPrice")
    public Double sellingPrice(@WebParam(name = "Price") double price) {
        return price*1.5;
    }
    @WebMethod
    public Product getProduct(Integer code) {
        return new Product(code , "Table", 300.00,new Date());
    }

    @WebMethod
    public List<Product> ProductsList() {
        return List.of(
                new Product(1 , "Table", 300.00,new Date()),
                new Product(2 , "Pen", 30.00,new Date()),
                new Product(3 , "Batata", 3.00,new Date()),
                new Product(4 , "Cheese", 68.00,new Date())
        );
    }
}
