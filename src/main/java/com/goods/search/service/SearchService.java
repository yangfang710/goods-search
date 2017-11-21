package com.goods.search.service;

import com.goods.search.pojo.SearchResult;

public interface SearchService {
	SearchResult search(String queryString, int page, int rows) throws Exception;
}
