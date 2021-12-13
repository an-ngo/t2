package com.example.webnetflix.formatter;
import com.example.webnetflix.model.Category;
import com.example.webnetflix.service.category.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class CategoryFormatter implements Formatter<Category> {
    @Autowired
    private ICategoryService categoryService;
    public CategoryFormatter(ICategoryService categoryService){
        this.categoryService = categoryService;
    }
    @Override
    public Category parse(String text, Locale locale) throws ParseException {
        return categoryService.findById(Long.parseLong(text)).orElse(null);
    }
    @Override
    public String print(Category object, Locale locale) {
        return "[" + object.getId() + ", " +object.getName() + "]";
    }
}
