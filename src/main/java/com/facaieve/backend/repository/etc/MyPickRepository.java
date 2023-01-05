package com.facaieve.backend.repository.etc;

import com.facaieve.backend.entity.etc.MyPickEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyPickRepository extends JpaRepository<MyPickEntity,Long> {
    MyPickEntity findByUserId(Long userId);

    List<MyPickEntity> findMyPickEntitiesByUserId(Long userId);

    boolean existsByUserId(Long userId);
    void deleteByUserId(Long userId);

}
