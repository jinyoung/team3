package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ShippingCancled extends AbstractEvent {

    private Long id;
    private Integer productId;
    private Integer qty;
    private String address;
    private String status;
    private String shipcompletedate;
    private Date startDate;
    private Date endDate;
    private Date expectDate;

    public ShippingCancled(Delivery aggregate){
        super(aggregate);
    }
    public ShippingCancled(){
        super();
    }
}
