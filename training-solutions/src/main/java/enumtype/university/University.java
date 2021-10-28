package enumtype.university;

public enum University {
    PTE("Pécsi Tudomány Egyetem"),SZTE("Szegedi Tudomány Egyetem"),BME("Budapesti Műszaki Egyetem"),DE("Debreceni Egyetem"),SOTE("Semmelweis Orvostudományi Egyetem");

    private final String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
