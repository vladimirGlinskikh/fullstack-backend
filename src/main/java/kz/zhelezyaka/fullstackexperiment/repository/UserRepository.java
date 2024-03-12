package kz.zhelezyaka.fullstackexperiment.repository;

import kz.zhelezyaka.fullstackexperiment.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
