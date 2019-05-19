package com.nathprojet.article;

import com.nathprojet.article.dao.ArticleBean;
import com.nathprojet.article.dao.ArticleSearchBean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Optional;


/**
 * Created by FP13694 on 20/01/2019.
 */
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/article")
public class ArticleController {

  private ArticleService articleService;

  public ArticleController(ArticleService articleService) {
    this.articleService = articleService;
  }

  @Transactional
  @PostMapping()
  public ArticleBean create(@RequestBody ArticleBean article){
    return articleService.create(article);
  }

  @GetMapping()
  @ResponseBody
  public Iterable<ArticleBean> getAll() {
    return articleService.findAll();
  }

  @GetMapping("/{id}")
  public Optional<ArticleBean> getById(@PathVariable("id") Integer id) {return articleService.getById(id);}

  @GetMapping("/search/{param}")
  @ResponseBody
  public Iterable<ArticleBean> getArticlesSearch(@PathVariable("param") String param) {
    return articleService.findArticlesSearch(param);
  }

}
