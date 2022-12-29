package tech.manleysoftware.dgscorecard.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tech.manleysoftware.dgscorecard.entity.Scorecard;

public interface ScorecardRepository extends PagingAndSortingRepository<Scorecard, String>,
        CrudRepository<Scorecard, String> {
}
