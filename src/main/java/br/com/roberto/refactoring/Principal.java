package br.com.roberto.refactoring;

import br.com.roberto.refactoring.to.InvoiceTo;
import br.com.roberto.refactoring.to.PerformanceTo;
import br.com.roberto.refactoring.to.PlayTo;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) throws IOException {
        List<InvoiceTo> invoices = loadInvoices();
        List<PlayTo> plays = loadPlays();
        statement(invoices, plays);
    }

    private static void statement(List<InvoiceTo> invoices, List<PlayTo> plays) {
        Integer totalAmount =0;
        Integer volumeCredits = 0;
        String customer;

        for (InvoiceTo invoice : invoices){
            customer = invoice.getCustomer();
        }
        for (InvoiceTo perf : invoices){
            for (PerformanceTo performance: perf.getPerformances()){
                //PlayTo play = plays[performance.getPlayID()];
            }
        //Página 22 do Livro



        }


    }

    private static List<PlayTo> loadPlays() throws FileNotFoundException {
        Reader fileReader =  new FileReader("C:\\Desenvolvimento\\sistemas\\revision-general-design-patterns\\src\\main\\java\\br\\com\\roberto\\refactoring\\dbfiles\\plays.json");
        PlayTo[] arrayPlay = new Gson().fromJson(fileReader, PlayTo[].class);
        return Arrays.asList(arrayPlay);
    }

    private static List<InvoiceTo> loadInvoices() throws FileNotFoundException {
        Reader fileReader =  new FileReader("C:\\Desenvolvimento\\sistemas\\revision-general-design-patterns\\src\\main\\java\\br\\com\\roberto\\refactoring\\dbfiles\\invoices.json");
        InvoiceTo[] arrayInvoice = new Gson().fromJson(fileReader, InvoiceTo[].class);
        return Arrays.asList(arrayInvoice);
    }

}
