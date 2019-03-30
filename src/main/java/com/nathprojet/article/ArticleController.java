package com.nathprojet.article;

import com.nathprojet.article.dao.ArticleBean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;


/**
 * Created by FP13694 on 20/01/2019.
 */
@Controller    // This means that this class is a Controller
@RequestMapping(path="/api/article")
@CrossOrigin(origins = "http://localhost:4200")
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

}
