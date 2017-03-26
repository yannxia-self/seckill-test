package info.yannxia.java.test.seckill.repositories;

import info.yannxia.java.test.seckill.entities.Product;
import info.yannxia.java.test.seckill.entities.User;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.LockModeType;
import java.util.Optional;

/**
 * Created by yann on 2017/3/26.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Optional<Product> findById(Long id);
}
