package br.fastfood.facade;

import br.fastfood.model.Bebida;
import br.fastfood.model.Burger;
import br.fastfood.model.Combo;
import br.fastfood.model.Sobremesa;

public class ComboFacade {
    private Combo combo;
    
    public void criarCombo(int codigo) {
        switch (codigo) {
            case 1:
                // TODO: Criar Combo Master
            	combo = new Combo(
                        new Burger("Big Cheddar", 18.00),
                        new Bebida("Coca-Cola", 8.00),
                        new Sobremesa("Sundae", 9.90));
                break;
            case 2:
                // TODO: Criar Super Combo
            	 combo = new Combo(
                         new Burger("Mega Bacon", 16.00),
                         new Bebida("Guaraná", 7.50),
                         new Sobremesa("Torta de Maçã", 9.00)
                     );
                break;
            case 3:
                // TODO: Criar Combo Kids
                combo = new Combo(
                        new Burger("Mini Burger", 12.00),
                        new Bebida("Suco de Laranja", 6.00),
                        new Sobremesa("Sorvete", 4.90)
                    );
                break;
            default:
                System.out.println("Código de combo inválido!");
                break;
        }
    }
    
    public void exibirItens() {
        if (combo == null) {
            System.out.println("Nenhum combo criado ainda!");
            return;
        }
        
        System.out.println("\n=== Detalhes do Pedido ===");
        System.out.println("Burger: " + combo.getBurger());
        System.out.println("Bebida: " + combo.getBebida());
        System.out.println("Sobremesa: " + combo.getSobremesa());
        System.out.println("==========================");
    }

    public double getPrecoTotal() {
    	if (combo == null) return 0.0;
        return combo.getPrecoTotal();
    }
}