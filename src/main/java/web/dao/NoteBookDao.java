package web.dao;

import web.model.NoteBook;

import java.util.ArrayList;
import java.util.List;

public class NoteBookDao {
    private static final List<NoteBook> noteBooks = new ArrayList<>();

    public List<NoteBook> getAll(){
        return noteBooks;
    }

    public void add(NoteBook noteBook){
        noteBooks.add(noteBook);
    }
}
