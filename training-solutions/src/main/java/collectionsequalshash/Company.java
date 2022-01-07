package collectionsequalshash;

import java.util.Objects;

public class Company {
    private String name;
    private String TAXno;

    public Company(String name, String TAXno) {
        this.name = name;
        this.TAXno = TAXno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(TAXno, company.TAXno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, TAXno);
    }
}
