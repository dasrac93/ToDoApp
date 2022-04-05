package com.springboot.todo.service;

import com.springboot.todo.model.Todo;
import com.springboot.todo.repository.TodoRepository;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static junit.framework.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TodoServiceTest {


    @MockBean
    private TodoRepository todoRepository;
    private Todo todo;
    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        todo = new Todo();
        todo.setUserName("admin");
        todo.setDescription("I am admin");
        todo.setId(123);
        todo.setTargetDate(new Date());
    }

    @After
    public void tearDown() {
    }

    @Test
    public void getTodosByUserTest() {
        String user = "admin";
        List<Todo> result = todoRepository.findByUserName(user);
        assertEquals(0, result.size());
    }
    @Test
    public void getTodoByIdTest() {
        Long id = Long.valueOf(1234);
        Optional<Todo> result = todoRepository.findById(id);
        assertEquals(false, result.isPresent());
    }
    @Test
    public void updateTodoTest() {
        Todo todo = new Todo();
        todo.setUserName("admin");
        todo.setDescription("I am admin");
        todo.setId(123);
        todo.setTargetDate(new Date());

        todoRepository.save(todo);
       System.out.println( todoRepository.findByUserName("admin").size());
        Mockito.verify(todoRepository, times(1)).save(todo);

    }
    @Test
    public void addTodoTest(){
        if(todo !=null)
        todoRepository.save(todo);
        Mockito.verify(todoRepository, times(1)).save(todo);
    }
    @Test
    public void deleteTodoTest(){
        todoRepository.save(todo);
       System.out.println(todoRepository.findByUserName("admin").size());
        Long id = Long.valueOf(123);
        Optional<Todo> todo = todoRepository.findById(id);
        if (todo.isPresent()) {
            todoRepository.delete(todo.get());
            Mockito.verify(todoRepository, times(1)).delete(todo.get());
        }
    }


}
