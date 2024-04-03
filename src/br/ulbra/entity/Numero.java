package br.ulbra.entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Numero {

    public ArrayList numero;

    public Numero() {
        numero = new ArrayList();
    }

    //create - add
    public void salvar(String item) {
        numero.add(item);
        JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
    }

    //read - listar
    public String listar() {
        String res = "";
        if (!numero.isEmpty()) {
            for (int i = 0; i < numero.size(); i++) {
                res += ("Número - " ) + numero.get(i) + "\n";
            }

        } else {
            res = "Lista Vazia";
        }
        return res;

    }

    //delete
    public void excluir(int num) {
    if (!numero.isEmpty()) {
        if (num >= 0 && num < numero.size()) { // Ajuste aqui, permitindo que o índice comece em 0
            numero.remove(num); // Remova o "- 1" aqui
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!!");
        } else {
            JOptionPane.showMessageDialog(null, "Código não existe!");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Impossível excluir, a lista está vazia!");
    }
}

    public void alterar(int num, String elemento) {
        if (!numero.isEmpty()) {
            if (num > 0 && num < numero.size()) {
                numero.set(num - 1, elemento);
                JOptionPane.showMessageDialog(null, "Alterado com sucesso!!");
            } else {
                JOptionPane.showMessageDialog(null, "Código não existe!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Impossível alterar, a lsita está vazia!");
        }
    }
    
}
