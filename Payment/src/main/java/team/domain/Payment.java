package team.domain;

import team.domain.PaymentApproved;
import team.domain.PaymentCanceled;
import team.PaymentApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Payment_table")
@Data

public class Payment  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Integer paymentid;
    
    
    
    
    
    private Integer orderid;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String cost;
    
    
    
    
    
    private Date approveDate;
    
    
    
    
    
    private Date cancelDate;

    @PostPersist
    public void onPostPersist(){


        PaymentApproved paymentApproved = new PaymentApproved(this);
        paymentApproved.publishAfterCommit();



        PaymentCanceled paymentCanceled = new PaymentCanceled(this);
        paymentCanceled.publishAfterCommit();

    }

    public static PaymentRepository repository(){
        PaymentRepository paymentRepository = PaymentApplication.applicationContext.getBean(PaymentRepository.class);
        return paymentRepository;
    }




    public static void paymentCancel(OrderCanceled orderCanceled){

        /** Example 1:  new item 
        Payment payment = new Payment();
        repository().save(payment);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(payment->{
            
            payment // do something
            repository().save(payment);


         });
        */

        
    }
    public static void payment(Ordered ordered){

        /** Example 1:  new item 
        Payment payment = new Payment();
        repository().save(payment);

        */

        /** Example 2:  finding and process
        
        repository().findById(ordered.get???()).ifPresent(payment->{
            
            payment // do something
            repository().save(payment);


         });
        */

        
    }


}
