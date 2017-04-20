/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.prova.dao;


import br.com.prova.objeto.Treinador;
import br.com.prova.objeto.Wartortle;
import java.util.List;

/**
 *
 * @author Markson
 */
public interface IWartortleDao {
    void incluir(Wartortle novo);
    List<Wartortle> consultarId(int id);
    List<Wartortle> consultarNome(String nome);
    List<Wartortle> consultarTreinador(Treinador treinador);
    List<Wartortle> consultarStatus(char status);
    void atualizar(Wartortle wartortle);
}
