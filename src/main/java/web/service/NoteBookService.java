package web.service;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.dao.NoteBookDao;
import web.model.NoteBook;
import web.model.OperSys;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class NoteBookService {
    private final NoteBookDao noteBookDao = new NoteBookDao();

    public void addNew(Map<String, String> allParams){
        OperSys win = OperSys.builder()
                .oSName(allParams.get("oSName"))
                .family(allParams.get("family"))
                .build();
        NoteBook noteBook = NoteBook.builder()
                .firm(allParams.get("firm"))
                .model(allParams.get("model"))
                .diagonal(allParams.get("diagonal"))
                .operSys(win)
                .build();
        noteBookDao.add(noteBook);
        System.out.println("Добавлен - " + noteBook);
    }

    public List<NoteBook> getAll() {
        return noteBookDao.getAll();
    }
}
