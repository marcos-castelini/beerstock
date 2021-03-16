package br.com.marcoscastelini.beerstock.repository;

import br.com.marcoscastelini.beerstock.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BeerRepository extends JpaRepository<Beer, Long> {

    Optional<Beer> findByName(String name);
}
