/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.prova.objeto;

/**
 *
 * @author Markson
 */
public enum EnumTipo {
    PLANTA(1), FOGO(2),AGUA(3), INSETO(4), NORMAL(5),VENENOSO(6),
    ELETRICO(7), TERRA(8), LUTADOR(9), PSIQUICO(10), PEDRA(11),
    VOADOR(12), FANTASMA(13), GELO(14), DRAGAO(15), METALICO(16),
    NOTURNO(17), FADA(18);
    private int valorTipo;
    EnumTipo(int valor){
        valorTipo = valor;
    }
    public int getValorTipo(){
        return valorTipo;
    }
}
