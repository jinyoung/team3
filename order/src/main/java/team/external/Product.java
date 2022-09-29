package team.external;

import lombok.Data;
import java.util.Date;
@Data
public class Product {

    private Long id;
    private String productId;
    private String productName;
    private String productSpec;
    private Integer qty;
    private Long productPrice;
}


