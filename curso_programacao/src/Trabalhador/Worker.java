package Trabalhador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public  Worker(){

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;

    }
    //NOTA SOBRE CONSTRUTOR
    //Não gere o get e set de lista, porque a lista pode ser trocada por outra lista

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);

    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);

    }
    //Calculando o Income pelas datas usando calendar
    public double income(Integer year,Integer month){
        //pega o basesalary local
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        //Varre a lista de contratos
        for (HourContract c: contracts) {
            //adiciona a data de c ao calendar teporário a cada iteração
            cal.setTime(c.getData());
            //pega o ano e mes de cada item na lista
            int c_year = cal.get(Calendar.YEAR);
            int c_month = cal.get(Calendar.MONTH);
            //Compara se ambas as condições são atendidas, se sim soma
            if (year == c_year && month == c_month){
                sum+= c.totalValue();
            }


        }
        return sum;


    }

}
