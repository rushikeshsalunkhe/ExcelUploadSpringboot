
package com.springrest.springrest.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.model.Articles;

public interface ArticleRepository extends JpaRepository<Articles, Long> {
	
	
	
}


