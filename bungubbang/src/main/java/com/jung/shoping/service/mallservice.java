package com.jung.shoping.service;

import java.util.List;

import com.jung.shoping.userVO.ProdutInfo;

public interface mallservice {
	List<ProdutInfo> ProdentSelect(); // 전체 판매 목록 리스트
	ProdutInfo selectProduct(ProdutInfo product);
	int insertProduct(ProdutInfo product);
	int updateProduct(ProdutInfo product);
	int deleteProduct(ProdutInfo product);
	
}
