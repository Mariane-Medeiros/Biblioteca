import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Ficha {
    HashMap<Integer, HashMap<Integer, Livro>> fichas = new HashMap<Integer, HashMap<Integer, Livro>>(); //
    Iterator<Map.Entry<Integer, HashMap<Integer, Livro>>> iterator = fichas.entrySet().iterator();


    private int id_usuario;
    private boolean liberado = true;

    private HashMap criarFicha(int id_usuario){
        
        boolean tem_ficha=false;

        //Percorre fichas
        while(iterator.hasNext()){
            //verifica se o usuario já tem ficha
            if(fichas.containsKey(id_usuario)){
                tem_ficha=true;
                break;
            }
        }

        if(!tem_ficha){
            //cria uma nova ficha para ele
            HashMap<Integer, Livro> ficha = new HashMap<Integer, Livro>();
            //coloca essa ficha no fichas
            fichas.put(id_usuario, ficha);
        }

        return fichas.get(id_usuario);
        }

    private boolean emprestarLivro(Livro livro){
        if(liberado){
        fichas.get(id_usuario).put(livro.getid_livro(), livro);
        livro.diminuirQtd_exemplares();
        return true;
        }
        return false;
    }

    private void devolverLivro(Livro livro){
        fichas.get(id_usuario).remove(livro.getid_livro(), livro);
        livro.aumentarQtd_exemplares();
    }

    private double calculaMulta(HashMap ficha){
        LocalDate data_atual = LocalDate.now();
        int qtd_livros = fichas.get(id_usuario).size();
        long diferencaEmDias = 0;
        double valorMulta = 2; 

        for(int i=0; i<qtd_livros; i++){
            Livro livro = (Livro) ficha.get(i);
            LocalDate dataDevolucao = livro.getData_devolucao();
            diferencaEmDias += ChronoUnit.DAYS.between(dataDevolucao, data_atual);
        }

        double Totalmulta = diferencaEmDias * valorMulta;
        return Totalmulta;
    }

    private void valorTotalMultas(){
        
    }

}
/* Retorna o valor do ticket médio no momento da chamada ao método. O
 * valor do ticket médio é a soma do valor total de todos os carrinhos de compra
 * dividido pela quantidade de carrinhos de compra.O valor retornado deverá ser
 * arredondado com duas casas decimais, seguindo a regra:0-4 deve ser
 * arredondado para baixo e 5-9 deve ser arredondado para cima.
 */