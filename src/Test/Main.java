package Test;

import java.util.ArrayList;
import java.util.List;

import TiposPessoa.PessoaFisica;
import TiposPessoa.PessoaJuridica;
import Repositorio.MPessoa;

public class Main {
    public static void main(String[] args) {
        List<MPessoa> pessoas = new ArrayList<>();

        System.out.println("================CREATE=================(READ)");

        
        
        //  CREATE PessoaFisica
        PessoaFisica pessoaFisica1 = new PessoaFisica("Jean Woodly Estime", 1234567);
        pessoas.add(pessoaFisica1);

        //  CREATE PessoaJuridica
        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("KuduroCorporation", "123456789-0");
        pessoas.add(pessoaJuridica1);

        //  READ para PessoFisica e PessoaJuridica
        System.out.println("Pessoas:");
        for (MPessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            if (pessoa instanceof PessoaFisica) {
                System.out.println("CPF: " + ((PessoaFisica) pessoa).getCpf());
            } else if (pessoa instanceof PessoaJuridica) {
                System.out.println("CNPJ: " + ((PessoaJuridica) pessoa).getCnpj());
            }
        }

        // Operação UPDATE para PessoaFisica
        if (pessoaFisica1 instanceof PessoaFisica) {
            ((PessoaFisica) pessoaFisica1).setCpf(987654321);

        }
        
        
        // Operação UPDATE para PessoaJuridica
        if (pessoaJuridica1 instanceof PessoaJuridica) {
            ((PessoaJuridica) pessoaJuridica1).setCnpj("987654321-0");

        }
        System.out.println("================UPDATE=================(READ)");
        
        //  READ para PessoFisica e PessoaJuridica
        System.out.println("Pessoas:");
        for (MPessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            if (pessoa instanceof PessoaFisica) {
                System.out.println("CPF: " + ((PessoaFisica) pessoa).getCpf());
            } else if (pessoa instanceof PessoaJuridica) {
                System.out.println("CNPJ: " + ((PessoaJuridica) pessoa).getCnpj());
            }
        }


        // Operação DELETE para PessoaJuridica
        pessoas.remove(pessoaJuridica1);
        
        System.out.println("================DELETE - Pessoa Juridica=================(READ)");

        //  READ para PessoFisica e PessoaJuridica
        System.out.println("Pessoas:");
        for (MPessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            if (pessoa instanceof PessoaFisica) {
                System.out.println("CPF: " + ((PessoaFisica) pessoa).getCpf());
            } else if (pessoa instanceof PessoaJuridica) {
                System.out.println("CNPJ: " + ((PessoaJuridica) pessoa).getCnpj());
            }
        }

    }
    
    
}
