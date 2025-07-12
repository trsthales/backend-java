package com.shopping.api.repository;

import java.util.Date;
import java.util.List;

import com.shopping.api.dto.ShopReportDTO;
import com.shopping.api.model.Shop;

public interface ReportRepository {
	
	public List<Shop> getShopByFilters(Date dataInicio, Date dataFim, Float valorMinimo);

	public ShopReportDTO getReportByDate(Date dataInicio, Date dataFim);
}
