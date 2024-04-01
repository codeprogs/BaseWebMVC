package web.dao;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.NoteBook;

import java.util.ArrayList;
import java.util.List;
@Repository
@AllArgsConstructor
public class NoteBookDao {

    private List<NoteBook> noteBooks;

    public List<NoteBook> getAll(){
        return noteBooks;
    }

    public void add(NoteBook noteBook){
        noteBooks.add(noteBook);
    }
}
