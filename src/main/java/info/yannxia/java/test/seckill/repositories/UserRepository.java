package info.yannxia.java.test.seckill.repositories;

import info.yannxia.java.test.seckill.entities.User;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import javax.persistence.LockModeType;
import java.util.Optional;

/**
 * Created by yann on 2017/3/26.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Optional<User> findById(Long id);
}
