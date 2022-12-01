public class Client {
    public static void main(String[] args) {

        Item caixaGrande = new Caixa();

        //Criando uma Caixa Menor (Objeto composto)
        Caixa caixaMenor1 = new Caixa();
        Produto martelo = new Produto(20D);

        //Adicionando os itens na Caixa Menor
        caixaMenor1.adicionar(martelo);

        //Criando uma Caixa Mediana (Objeto composto)
        Caixa caixaMediana = new Caixa();
        Caixa caixaMenor2 = new Caixa();
        Caixa caixaMenor3 = new Caixa();
        Produto telefone = new Produto(50D);
        Produto foneDeOuvido = new Produto(10D);

        //Adicionando os itens na Caixa Mediana
        caixaMediana.adicionar(caixaMenor2);
        caixaMediana.adicionar(caixaMenor3);
        caixaMediana.adicionar(telefone);
        caixaMediana.adicionar(foneDeOuvido);

        //Criando um Objetos simples
        Produto recibo = new Produto(1D);

        //Adicionando tudo no Caixa Grande
        caixaGrande.adicionar(caixaMenor1);
        caixaGrande.adicionar(caixaMediana);
        caixaGrande.adicionar(recibo);

        System.out.println("Valor total: R$ " + caixaGrande.getPreco());
    }
}