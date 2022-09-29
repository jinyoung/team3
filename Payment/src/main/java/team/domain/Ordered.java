package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;
    private Integer productId;
    private Integer qty;
    private String address;
    private Date orderDate;
    private Integer amount;
    private String customerName;
    private Integer cost;
    private String phoneNumber;
    private String status;
}


