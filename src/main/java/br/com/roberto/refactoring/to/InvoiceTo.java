package br.com.roberto.refactoring.to;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class InvoiceTo {
    @SerializedName("customer")
    @Expose
    private String customer;

    @SerializedName("performances")
    @Expose
    private PerformanceTo[] performances;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public PerformanceTo[] getPerformances() {
        return performances;
    }

    public void setPerformances(PerformanceTo[] performances) {
        this.performances = performances;
    }

    @Override
    public String toString() {
        return "InvoiceTo{" +
                "customer='" + customer + '\'' +
                ", performances=" + Arrays.toString(performances) +
                '}';
    }
}


