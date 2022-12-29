package tech.manleysoftware.dgscorecard.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Scorecard {

    @Id
    private String id;

    private String courseName;

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

    private Map<String, Integer> playerScores = new HashMap<>();

    private List<Integer> pars = new ArrayList<>();
    
}
