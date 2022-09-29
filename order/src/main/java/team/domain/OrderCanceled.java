package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private Integer productId;
    private Integer qty;
    private String address;
    private Date orderDate;
    private Date cancelDate;
    private Integer amount;
    private Integer cost;
    private String customerName;
    private String phoneNumber;
    private String status;

    public OrderCanceled(Order aggregate){
        super(aggregate);
    }
    public OrderCanceled(){
        super();
    }
}
