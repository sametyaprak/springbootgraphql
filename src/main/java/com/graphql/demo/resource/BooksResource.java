package com.graphql.demo.resource;


import com.graphql.demo.service.GraphQLService;
import graphql.ExecutionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest/books")
@RestController
public class BooksResource {


    @Autowired
    GraphQLService graphQLService;

    @PostMapping
    public ResponseEntity<Object> getAllBooks(@RequestBody String query){
        ExecutionResult execute = graphQLService.getGraphQL().execute(query);
        return new ResponseEntity<Object>(execute, HttpStatus.OK);
    }

}
