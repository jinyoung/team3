package team.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name="ProductInfo_table")
@Data
public class ProductInfo {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}