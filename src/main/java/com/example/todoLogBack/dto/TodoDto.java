package com.example.todoLogBack.dto;

import com.example.todoLogBack.model.Todo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoDto {

    private Long id;

    private String title;

    private String description;

    private ZonedDateTime startDate;

    private boolean done;

    private boolean favourite;

    private CategoryDto category;

    public static Todo toEntity(TodoDto todoDto) {
        final Todo todo = new Todo();
        todo.setId(todoDto.getId());
        todo.setTitle(todoDto.getTitle());
        todo.setDescription(todoDto.getDescription());
        todo.setStartDate(todoDto.getStartDate());
        todo.setDone(todoDto.isDone());
        todo.setFavourite(todoDto.isFavourite());
        todo.setCategory(CategoryDto.toEntity(todoDto.getCategory()));

        return todo;
    }

    public static TodoDto fromEntity(Todo todo){
        return TodoDto.builder()
                .id(todo.getId())
                .title(todo.getTitle())
                .description(todo.getDescription())
                .startDate(todo.getStartDate())
                .done(todo.isDone())
                .favourite(todo.isFavourite())
                .build();
    }
}
