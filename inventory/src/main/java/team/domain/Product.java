package team.domain;

import team.InventoryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Product_table")
@Data

public class Product  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String productId;
    
    
    
    
    
    private String productName;
    
    
    
    
    
    private String productSpec;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private Long productPrice;

    @PostPersist
    public void onPostPersist(){
    }

    public static ProductRepository repository(){
        ProductRepository productRepository = InventoryApplication.applicationContext.getBean(ProductRepository.class);
        return productRepository;
    }




    public static void qtyDecrease(PaymentApproved paymentApproved){

        /** Example 1:  new item 
        Product product = new Product();
        repository().save(product);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentApproved.get???()).ifPresent(product->{
            
            product // do something
            repository().save(product);


         });
        */

        
    }
    public static void qtyIncrease(PaymentCanceled paymentCanceled){

        /** Example 1:  new item 
        Product product = new Product();
        repository().save(product);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentCanceled.get???()).ifPresent(product->{
            
            product // do something
            repository().save(product);


         });
        */

        
    }


}
