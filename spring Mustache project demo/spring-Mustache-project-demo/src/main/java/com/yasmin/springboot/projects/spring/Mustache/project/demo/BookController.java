package com.yasmin.springboot.projects.spring.Mustache.project.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class BookController {
 
    @GetMapping("/books")
    public String getProducts(final Model model){
 
        List<Book> bookList = IntStream.range(0,200)
                        .mapToObj(i->getBook(i))
                        .collect(Collectors.toList());
         
        model.addAttribute("bookList",bookList);
        return "book";
    }
 
    private Book getBook(int i){
        return new Book(Long.valueOf(i),
                "ISBN Number -" + i,
                "Book Name " + i,
                "Author " + i,
                Double.valueOf(100 * i));
    }
}