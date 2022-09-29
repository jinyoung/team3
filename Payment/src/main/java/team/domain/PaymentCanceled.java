package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PaymentCanceled extends AbstractEvent {

    private Long id;
    private Integer paymentid;
    private Integer orderid;
    private String status;
    private String cost;
    private Date approveDate;
    private Date cancelDate;

    public PaymentCanceled(Payment aggregate){
        super(aggregate);
    }
    public PaymentCanceled(){
        super();
    }
}
