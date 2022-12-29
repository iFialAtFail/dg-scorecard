package tech.manleysoftware.dgscorecard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tech.manleysoftware.dgscorecard.entity.Scorecard;
import tech.manleysoftware.dgscorecard.repository.ScorecardRepository;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.Map;

@SpringBootApplication
public class DgScorecardApplication implements CommandLineRunner {

	@Autowired
	private ScorecardRepository scorecardRepository;

	public static void main(String[] args) {
		SpringApplication.run(DgScorecardApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scorecard scorecard = new Scorecard();
		scorecard.setPars(Arrays.asList(1,2,3,4,5));
		scorecard.setCourseName("BRDC");
		scorecard.setStartDateTime(LocalDateTime.now());
		scorecard.setEndDateTime(LocalDateTime.of(2023, Month.JANUARY, 23,12,12));
		scorecard.setPlayerScores(Map.of("Mike",1,"Brian",2));
		scorecardRepository.save(scorecard);
	}
}
