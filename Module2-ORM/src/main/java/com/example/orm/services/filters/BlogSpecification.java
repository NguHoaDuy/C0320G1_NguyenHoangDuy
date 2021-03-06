package com.example.orm.services.filters;

import com.example.orm.models.Blog;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


public class BlogSpecification implements Specification<Blog>  {

    private final SearchCriteria criteria;

    public BlogSpecification(SearchCriteria criteria) {
        this.criteria = criteria;
    }
    @Override
    public Predicate toPredicate(Root<Blog> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        if(criteria.getOperation().equalsIgnoreCase("=")) {
            return criteriaBuilder.like(root.get(criteria.getKey()), "%" + criteria.getValue() + "%");
        }
        return null;
    }
}
