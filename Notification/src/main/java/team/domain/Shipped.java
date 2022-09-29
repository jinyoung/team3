package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Shipped extends AbstractEvent {

    private Long id;
    private Integer productId;
    private Integer qty;
    private String address;
    private String status;
    private Date startDate;
    private Date expectDate;
}


