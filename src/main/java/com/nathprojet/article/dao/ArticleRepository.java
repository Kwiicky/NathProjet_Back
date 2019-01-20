package com.nathprojet.article.dao;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by FP13694 on 20/01/2019.
 */
public interface ArticleRepository extends CrudRepository<ArticleBean, Integer> {
}
