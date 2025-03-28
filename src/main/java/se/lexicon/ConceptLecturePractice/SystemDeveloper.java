package se.lexicon.ConceptLecturePractice;

import java.time.LocalDate;

public class SystemDeveloper extends Employee {

    private String[] certificates;
    private String[] languages;

    public SystemDeveloper(int id, String name, LocalDate dateHired, String[] certificates, String[] languages) {
        super(id, name, dateHired);
        setCertificates(certificates);
        setLanguages(languages);
    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
        calculateSalary();
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
        calculateSalary();
    }

    @Override
    public void calculateSalary() {
        int sum = 25000;
        if(certificates != null) sum += 1000 * certificates.length;
        if(languages != null) sum += 1500 * languages.length;
        setSalary(sum);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ").append(getId());
        sb.append(", name: ").append(getName());
        sb.append(", salary: ").append(getSalary());
        sb.append(", hired date: ").append(getDateHired());
        sb.append(", certificates: ");
        for (String cer : certificates)
            sb.append(cer).append(" ");
        sb.append(", languages: ");
        for (String lang : languages)
            sb.append(lang).append(" ");

        return sb.toString();
    }
}
