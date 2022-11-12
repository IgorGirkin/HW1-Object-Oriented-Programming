import java.util.Objects;

public class Human {
    public int yearOfBirth;
    public String name;
    public String town;
    public String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name == null||name.length() == 0) {
            this.name="Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null||town.length() == 0) {
            this.name = "Информация не указана";
        } else {
            this.town = town;
        }
        if ( jobTitle == null||jobTitle.length() == 0) {
            this.name = "Информация не указана";
        } else {
            this.jobTitle=jobTitle;
        }

    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я ра" +
                "ботаю на должности "+jobTitle+ " Будем знакомы!";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return name.equals(human.name) && town.equals(human.town) && jobTitle.equals(human.jobTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, town, jobTitle);
    }
}


