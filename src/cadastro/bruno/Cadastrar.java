/*      Atividade, crie um sistema com 3 menus
        1- Cadastrar
        2- Listar
        3- Sair

        No cadastrar, vc vai inserir 4 campos, nome, idade, gênero e CPF.

        No listar, vai trazer a lista dos cadastrados, sendo que se estiver vazia, deve me mostrar um erro "não há cadastros"

        No 3 ele encerra a aplicação e me manda a mensagem "volte sempre"
*/

package cadastro.bruno;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastrar {
    ArrayList<String> lista = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    String nome, genero, opcao, idade, cpf;


    void cadastro(){
        System.out.println("Informe o nome completo: ");
        nome = input.nextLine();
        System.out.println("Informe a idade: ");
        idade = input.next();
        System.out.println("Informe seu genero: ");
        genero = input.next();
        System.out.println("Informe o CPF: ");
        cpf = input.next();

        lista.add(nome+ "--" + idade+ "--" +genero+ "--" +cpf);
        System.out.println(lista);

        menuOpcoes();
    }

    void listar(){
        if (lista.isEmpty()){
            System.out.println("Nenhum dado cadastrado"); //lembrar de incluir a opcão cadastrar novamente
        }else {
            for (Object element : lista) {
                System.out.println(element);
            }
        }
    }

    void sair(){
        System.out.println("Obrigado" +nome+ ", volte sempre");
    }

    void menuOpcoes(){
        System.out.println("Você deseja Cadastrar, Ver Cadastros ou Sair: ");
        opcao = input.nextLine();

        switch (opcao){
            case "Cadastrar":
                cadastro();
                break;
            case "Ver Cadastros":
                listar();
                break;
            case "Sair":
                sair();
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

}
