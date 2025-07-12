package com.shopping.api.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.api.model.Shop;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long>, ReportRepository {
	public List<Shop> findAllByUserIdentifier(String userIdentifier);

	public List<Shop> findAllByTotalGreaterThan(Float total);

	List<Shop> findAllByDateGreaterThan(LocalDateTime date);
}
