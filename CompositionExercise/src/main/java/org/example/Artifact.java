package org.example;

public class Artifact {
    private String name;
    private Person discoverer;
    private Person curator;
    private int yearOfDiscovery;

    public Artifact(String name, int yearOfDiscovery, Person discoverer, Person curator) {
        this.name = name;
        this.yearOfDiscovery = yearOfDiscovery;
        this.discoverer = discoverer;
        this.curator = curator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getDiscoverer() {
        return discoverer;
    }

    public void setDiscoverer(Person discoverer) {
        this.discoverer = discoverer;
    }

    public Person getCurator() {
        return curator;
    }

    public void setCurator(Person curator) {
        this.curator = curator;
    }

    public int getYearOfDiscovery() {
        return yearOfDiscovery;
    }

    public void setYearOfDiscovery(int yearOfDiscovery) {
        this.yearOfDiscovery = yearOfDiscovery;
    }

    @Override
    public String toString() {
        return "Artifact: " + getName() + " ( " + getYearOfDiscovery() + " )" + "\nDiscoverer: " +getDiscoverer().getFirstName() +  getDiscoverer().getLastName() + ", " + getDiscoverer().getPrimarySpecialty() + " \nCurator: "
                + getCurator().getFirstName() + getCurator().getLastName() + ", " + getCurator().getPrimarySpecialty();
    }
}
