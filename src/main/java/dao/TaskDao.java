package dao;

import models.Task;
import java.util.List;

public interface TaskDao {
    // list
    List<Task> getAll();

    // create
    void add(Task task);

    //read
    Task findById(int id);

    //update
    void update(int id, String content, int categoryId);

    //delete
     void deleteById(int id);
     void clearAllTasks();
}
