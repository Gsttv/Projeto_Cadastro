package App;

import Entites.Profissonal;
import Utils.Imposto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Profissonal prof = new Profissonal();
        List<Double> salarios = new ArrayList<Double>();
        List<Profissonal> lista = new ArrayList<Profissonal>();
        List<Double> novoSalarioImposto = new ArrayList<Double>();
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite os dadas da "+(i+1)+"°");
            System.out.println("ID: ");
            int id = sc.nextInt();
            System.out.println("NOME: ");
            String nome = sc.next();
            System.out.println("EMAIL: ");
            String email = sc.next();
            System.out.println("SALARIO: ");
            double salario = sc.nextDouble();
            prof = new Profissonal(id, nome, email, salario);
            lista.add(prof);
        }

        for (int i = 0; i < lista.size(); i++) {
            Profissonal listaProf = lista.get(i);
            System.out.println("Digite a procentagem de aumento: ");
            double porc = sc.nextDouble();
            double salarioAumentado = listaProf.aumentarSalario(porc);
            salarios.add(salarioAumentado);
            double salarioImposto = Imposto.impostoSobRenda(listaProf.getSalario());
            novoSalarioImposto.add(salarioImposto);

        }
        for (int i =0;i< lista.size();i++){
            System.out.println("O salarios sem a redução do imporot é - "+lista.get(i).getNome() + ": "+salarios.get(i));
            System.out.println("O salarios com a redução do imporot é - "+lista.get(i).getNome() + ": " + novoSalarioImposto.get(i));
            System.out.println();
        }

    }
}