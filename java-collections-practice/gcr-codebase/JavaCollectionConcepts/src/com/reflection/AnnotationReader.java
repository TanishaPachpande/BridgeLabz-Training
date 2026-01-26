package com.reflection;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name = "Tanisha Bajpande")
class Book {
}

public class AnnotationReader {

    public static void main(String[] args) {

        Class<Book> clazz = Book.class;

        if (clazz.isAnnotationPresent(Author.class)) {
            Author author = clazz.getAnnotation(Author.class);
            System.out.println("Author Name: " + author.name());
        }
    }
}

