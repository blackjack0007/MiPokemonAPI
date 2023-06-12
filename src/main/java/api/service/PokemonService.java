package api.service;

import java.util.ArrayList;

import api.model.PokemonDTO;
import api.model.PokemonEntity;

/**
 * Métodos abstractos para aplicar la lógica de negocio a el Pokémon API
 *
 */
public interface PokemonService {
    ArrayList<PokemonDTO> getPokemonesGenaracion(int generacion);
    ArrayList<PokemonDTO> getRangoPokemones(int a, int b);
    PokemonDTO getPokemon(String identificador);
    PokemonEntity guardarPokemon(PokemonEntity pokemon);
    PokemonEntity consultarPokemon(String apodo);
    ArrayList<PokemonEntity> consultarPokemonesPorEspecie(String especie);
}

