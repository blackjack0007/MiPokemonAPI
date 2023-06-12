package api.repository;


import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import api.model.PokemonEntity;

import java.util.ArrayList;

/**
 * Repositorio para la persistencia de datos con Spring Data JPA
 *
 */
@Repository
public interface PokemonEntityRepo  extends PagingAndSortingRepository<PokemonEntity, Long>,JpaSpecificationExecutor<PokemonEntity>{
    PokemonEntity findByApodo(String apodo);
    ArrayList<PokemonEntity> findByEspecie(String especie);

    PokemonEntity save(PokemonEntity pokemon);
}
