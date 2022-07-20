package com.ajou.prcoding.myweb.repository;

import com.ajou.prcoding.myweb.Entity.FavoriteMusic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavoriteRepository extends JpaRepository<FavoriteMusic, String> {
    List<FavoriteMusic> findAll();
}