package trabalhoQTG;

import java.util.ArrayList;
import java.util.List;

public class Receita {
    private String nome;
    private List<Ingrediente> ingredientes;
    private List<ModoPreparo> modoPreparo;
    
    public Receita(String nome) {
        this.nome = nome;
        this.ingredientes = new ArrayList<>();
        this.modoPreparo = new ArrayList<>();

    }

    public String getNome() {
        return nome;
    }

    public void adicionarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void adicionarModoPreparo(ModoPreparo etapa) {
        modoPreparo.add(etapa);
    }

    public void mostrarDetalhes() {
        System.out.println("\n Receita: " + nome);
        System.out.println("\n Igrediente: ");
        for (Ingrediente ing : ingredientes) {
            System.out.println(" " + ing);
        }

        System.out.println("\n Modo de Preparo:");
        for (int i = 0; i < modoPreparo.size(); i++) {
            System.out.println(" Passo" + (i + 1) + ": " + modoPreparo.get(i).getEtapa());
        }
    }
}
