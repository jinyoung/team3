package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class PaymentApproved extends AbstractEvent {

    private Long id;
    private Integer paymentid;
    private Integer orderid;
    private String status;
    private String cost;
    private Date approveDate;
}


