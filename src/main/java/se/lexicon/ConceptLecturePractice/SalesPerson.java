package se.lexicon.ConceptLecturePractice;

import java.time.LocalDate;

public class SalesPerson extends Employee {

    private String[] clients;
    private int acquiredClients;

    public SalesPerson(int id, String name, LocalDate dateHired, int acquiredClients, String[] clients) {
        super(id, name, dateHired);
        setClients(clients);
        setAcquiredClients(acquiredClients);
    }

    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
        calculateSalary();
    }

    public int getAcquiredClients() {
        return acquiredClients;
    }

    public void setAcquiredClients(int acquiredClients) {
        this.acquiredClients = acquiredClients;
        calculateSalary();
    }

    @Override
    public void calculateSalary() {
        int sum = 25000;
        if(clients != null) sum+= 500 * clients.length;
        sum += 1000 * acquiredClients;
        setSalary(sum);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ").append(getId());
        sb.append(", name: ").append(getName());
        sb.append(", salary: ").append(getSalary());
        sb.append(", hired date: ").append(getDateHired());
        sb.append(", acquiredClients: ").append(getAcquiredClients());
        sb.append(", clients: ");
        for (String client : clients)
            sb.append(client).append(" ");
        return sb.toString();
    }
}
