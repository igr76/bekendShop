package com.testShop.Repository;

import com.testShop.Entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

/**
 * Репозиторий для комментариев
 */
@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Integer> {
    Optional<CommentEntity> findByIdAndAd_Id(Integer commentId, Integer adId);

    Collection<CommentEntity> findAllByAd_Id (Integer adId);



}
