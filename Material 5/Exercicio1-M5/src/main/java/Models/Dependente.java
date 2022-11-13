package Models;/*Essa classe armazena as informações referentes aos possíveis dependentes
de um sócio. Os atributos da classe são autoexplicativos. O único método
contido pela classe permite gerar uma nova instância da mesma. Pode-se
perceber que um dependente está relacionado a um único sócio, mas um
sócio pode não ter nenhum dependente ou pode ter vários.*/

public class Dependente {

    private long cartao_dep;
    private String nom_dep;
    private String parentesco;
    private String email_dep;
    private Socio socio_rel;

    private long ultimoCartao = 200124000L;

    public long regDep(String nome, int parent, String email, Socio socio){ //Registra dependente

        nom_dep = nome;
        email_dep =  email;
        socio_rel = socio;
        cartao_dep = gerarNumCartao();

        switch (parent){
            case 1:
                parentesco = "Filho(a)";

            case 2:
                parentesco = "Neto(a)";

            case 3:
                parentesco = "Companheiro(a)";

            case 4:
                parentesco = "Pai/Mãe";

            case 5:
                parentesco = "Avó/Avó";
        }

        return cartao_dep;
    }

    private long gerarNumCartao(){

        long novoNum = ultimoCartao++;

        return novoNum;
    }
}
