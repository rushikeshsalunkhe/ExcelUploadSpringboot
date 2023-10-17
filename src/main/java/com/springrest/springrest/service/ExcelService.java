
package com.springrest.springrest.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.springrest.springrest.helper.ExcelHelper;
import com.springrest.springrest.model.Articles;
import com.springrest.springrest.repository.ArticleRepository;


@Service
public class ExcelService {
  @Autowired
  ArticleRepository repository;

  public void save(MultipartFile file) {
    try {
      List<Articles> tutorials = ExcelHelper.excelToTutorials(file.getInputStream());
      repository.saveAll(tutorials);
    } catch (IOException e) {
      throw new RuntimeException("fail to store excel data: " + e.getMessage());
    }
  }

  public List<Articles> getAllTutorials() {
    return repository.findAll();
  }
}
