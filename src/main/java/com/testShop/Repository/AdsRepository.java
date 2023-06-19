package com.testShop.Repository;

import com.testShop.Entity.AdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * репозиторий для объявления
 */

@Repository
public interface AdsRepository extends JpaRepository<AdEntity, Integer> {

    @Query(nativeQuery = true, value = "SELECT MAX(ID) FROM ads")
    int findMaxID();

}