package br.com.marcoscastelini.beerstock.mapper;

import br.com.marcoscastelini.beerstock.dto.BeerDTO;
import br.com.marcoscastelini.beerstock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
