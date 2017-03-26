package info.yannxia.java.test.seckill.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2017/3/25.
 */
@Entity
@Table(name = "USER")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "balance")
    private BigDecimal balance;
}
