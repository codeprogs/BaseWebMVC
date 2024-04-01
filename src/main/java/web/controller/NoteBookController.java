package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.service.NoteBookService;

import java.util.Map;

@Controller
@RequiredArgsConstructor
public class NoteBookController {

    private final NoteBookService noteBookService;

    @GetMapping("/notebooks")
    public String noteBook(ModelMap model){
        model.addAttribute("notebooks", noteBookService.getAll());
        return "notebooks";
    }

    @PostMapping("/add-notebook")
    public String addNoteBook(@RequestParam Map<String, String> allParams, ModelMap model){
        if (!allParams.isEmpty()){
            noteBookService.addNew(allParams);
        }
        model.addAttribute("notebooks", noteBookService.getAll());
        return "notebooks";
    }

}
