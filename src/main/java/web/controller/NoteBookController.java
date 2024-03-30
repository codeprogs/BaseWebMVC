package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.service.NoteBookService;

import java.util.Map;

@Controller
public class NoteBookController {

    private final NoteBookService noteBookService = new NoteBookService();

    @GetMapping("/notebooks")
    public String addNoteBook(@RequestParam Map<String, String> allParams, ModelMap model){
        if (!allParams.isEmpty()){
            noteBookService.addNew(allParams);
        }
        model.addAttribute("notebooks", noteBookService.getAll());
        return "notebooks";
    }

}
