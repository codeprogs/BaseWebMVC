package web.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NoteBook {

    private String firm;

    private String model;

    private String diagonal;

    private OperSys operSys;

}
