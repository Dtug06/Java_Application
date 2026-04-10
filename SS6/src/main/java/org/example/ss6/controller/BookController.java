package org.example.ss6.controller;

import org.example.ss6.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping
public class BookController {

    @GetMapping("/book")
    public String home(Model model){
        List<Book> book =new ArrayList<>(
                Arrays.asList(
                        new Book(1, "Dai Duong Den", "Dang Hoang Giang", 240),
                        new Book(2, "Thien, ac va smartphone", "Dang Hoang Giang", 240),
                        new Book(3, "Being and nothingness", "Sartre paul", 240),
                        new Book(4, "Thien tai ben trai ", "unknow", 240)
                )
        );
     model.addAttribute("books",book);
        return "home";
    }
    @GetMapping("/book/{id}")
    public String detail(@PathVariable("id") int id, Model model) {
        // Tạm thời tạo lại danh sách (sau này có thể lấy từ service/database)
        List<Book> books = Arrays.asList(
                new Book(1, "Dai Duong Den", "Dang Hoang Giang", 240),
                new Book(2, "Thien, ac va smartphone", "Dang Hoang Giang", 240),
                new Book(3, "Being and nothingness", "Sartre paul", 240),
                new Book(4, "Thien tai ben trai ", "unknow", 240)
        );

        // Tìm sách theo id
        Book bookDetail = books.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElse(null);

        model.addAttribute("bookDetail", bookDetail);
        return "bookDetail"; // trả về file bookDetail.html
    }

}
