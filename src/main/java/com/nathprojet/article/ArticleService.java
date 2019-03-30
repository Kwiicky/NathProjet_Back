package com.nathprojet.article;

import com.nathprojet.article.dao.ArticleBean;
import com.nathprojet.article.dao.ArticleRepository;
import org.springframework.stereotype.Service;

/**
 * Created by FP13694 on 20/01/2019.
 */
@Service
public class ArticleService {

  private ArticleRepository articleRepository;

  public ArticleService(ArticleRepository articleRepository) {
    this.articleRepository = articleRepository;
  }

  public ArticleBean create(ArticleBean article){
    return this.articleRepository.save(article);
  }


  public Iterable<ArticleBean> findAll(){
    return this.articleRepository.findAll();
  }

}
