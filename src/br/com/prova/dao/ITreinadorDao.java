/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.prova.dao;

import br.com.prova.objeto.Pokemon;
import br.com.prova.objeto.Treinador;
import java.util.List;

/**
 *
 * @author Markson
 */
public interface ITreinadorDao {
   void incluir(Treinador novo);
    List<Treinador> consultarId(int id);
    List<Treinador> consultarNome(String nome);
    List<Treinador> consultarCnh(String rg);
    List<Treinador> consultarCpf(String cpf);
    void atualizar(Treinador proprietario);
    List<Pokemon> consultarPokemons();
}
