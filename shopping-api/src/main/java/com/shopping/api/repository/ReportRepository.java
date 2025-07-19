package com.shopping.api.repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.shopping.api.model.Shop;

import dto.ShopReportDTO;

public interface ReportRepository {
	
	public List<Shop> getShopByFilters(LocalDate dataInicio, LocalDate dataFim, Float valorMinimo);

	public ShopReportDTO getReportByDate(Date dataInicio, Date dataFim);
}
