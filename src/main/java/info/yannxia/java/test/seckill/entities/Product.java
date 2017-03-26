package info.yannxia.java.test.seckill.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2017/3/25.
 */

@Entity
@Table(name = "PRODUCT")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "total")
    private Integer total;

}
