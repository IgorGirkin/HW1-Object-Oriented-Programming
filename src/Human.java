public class Human {
    public int yearOfBirth;
    public String name;
    public String town;
    public String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.jobTitle=jobTitle;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я ра" +
                "ботаю на должности "+jobTitle+ " Будем знакомы!";

    }
}
