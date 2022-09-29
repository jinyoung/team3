package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PaymentApproved extends AbstractEvent {

    private Long id;
    private Integer paymentid;
    private Integer orderid;
    private String status;
    private String cost;
    private Date approveDate;

    public PaymentApproved(Payment aggregate){
        super(aggregate);
    }
    public PaymentApproved(){
        super();
    }
}
