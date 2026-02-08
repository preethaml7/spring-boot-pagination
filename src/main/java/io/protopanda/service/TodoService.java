package io.protopanda.service;

import io.protopanda.model.Todo;
import io.protopanda.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedModel;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public PagedModel<Todo> getAllTodosOrderedByCreatedAtDesc(int page, int size) {

        Pageable pageable = PageRequest.of(page, size);
        Page<Todo> todos = todoRepository.findAllByOrderByCreatedAtDesc(pageable);

        return new PagedModel<>(todos);
    }
}
