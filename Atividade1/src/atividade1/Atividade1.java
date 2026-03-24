/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

/**
 *
 * @author aluno.saolucas
 */
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Cachorro c1 = new Cachorro("Lótus", 5, 10.5);
        Gato g1 = new Gato("Vito", 3, 4.2);
        Cavalo ca1 = new Cavalo("Pé de Pano", 7, 400);
        Leao l1 = new Leao("Simba", 6, 190);
        Vaca v1 = new Vaca("Mimosa", 4, 500);

        c1.emitirSom();
        g1.emitirSom();
        ca1.emitirSom();
        l1.emitirSom();
        v1.emitirSom();
    }
    
}
