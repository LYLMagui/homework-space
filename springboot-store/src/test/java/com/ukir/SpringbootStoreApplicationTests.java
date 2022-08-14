package com.ukir;

import com.ukir.entity.Author;
import com.ukir.entity.Book;
import com.ukir.service.AuthorService;
import com.ukir.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootStoreApplicationTests {
	@Autowired
	private BookService bookService;

	@Autowired
	private AuthorService authorService;

	@Test
	public void getAllBook() {
		List<Book> allBook = bookService.getAllBook();
		System.out.println(allBook);
	}

	@Test
	void getById() {
		Author author = authorService.getAuthor(1000);
		System.out.println(author);
	}


}
