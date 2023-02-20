package Trabalhador;

import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts;

    public void addContract(HourContract contract){

    }
    public void removeContract(HourContract contract){

    }
    public double income(Integer year,Integer month){
        return year+month;

    }

}
