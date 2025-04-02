package util.person.generator;

import java.time.LocalDate;
import java.util.List;

public class Person {
  private String name;
  private int age;
  private double weight;
  private char gender;
  private boolean married;
  private LocalDate birthDate;
  private List<String> hobbies;
  private List<SocialNetwork> socialNetworks;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public boolean isMarried() {
    return married;
  }

  public void setMarried(boolean married) {
    this.married = married;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public List<String> getHobbies() {
    return hobbies;
  }

  public void setHobbies(List<String> hobbies) {
    this.hobbies = hobbies;
  }

  public List<SocialNetwork> getSocialNetworks() {
    return socialNetworks;
  }

  public void setSocialNetworks(List<SocialNetwork> socialNetworks) {
    this.socialNetworks = socialNetworks;
  }

  @Override
  public String toString() {
    return "Person {" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", weight=" + weight +
        ", gender=" + gender +
        ", married=" + married +
        ", birthDate=" + birthDate +
        ", hobbies=" + hobbies +
        ", socialNetworks=" + socialNetworks +
        '}';
  }
}
