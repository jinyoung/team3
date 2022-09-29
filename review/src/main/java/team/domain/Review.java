package team.domain;

import team.ReviewApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Review_table")
@Data

public class Review  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Integer orderId;
    
    
    
    
    
    private Integer productId;
    
    
    
    
    
    private String contents;
    
    
    
    
    
    private String customerName;
    
    
    
    
    
    private Date reviewDate;
    
    
    
    
    
    private Date modifiedDate;
    
    
    
    
    
    private Integer rating;
    
    
    
    
    
    private Date deleteDate;

    @PostPersist
    public void onPostPersist(){
    }

    public static ReviewRepository repository(){
        ReviewRepository reviewRepository = ReviewApplication.applicationContext.getBean(ReviewRepository.class);
        return reviewRepository;
    }






}
