package com.graphql.demo.service.datafetcher;

import com.graphql.demo.entity.Book;
import com.graphql.demo.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AllBookDataFetcher implements DataFetcher<List<Book>> {


    @Autowired
    BookRepository bookRepository;


    @Override
    public List<Book> get(DataFetchingEnvironment dataFetchingEnvironment) throws Exception {
        return bookRepository.findAll();
    }
}
