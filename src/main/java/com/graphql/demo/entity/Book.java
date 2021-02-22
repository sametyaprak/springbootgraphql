package com.graphql.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    private String isn;
    private String title;
    private String publisher;
    //private String[] authors;
    //bunu yapamadım, arastırmak lazım
    private String[] authors;
    private String publishedDate;

}
