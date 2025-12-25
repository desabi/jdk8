package generators.company;

public class Project {
  private String title;
  private double budget;
  private boolean completed; // Constructors, getters, setters

  public Project(String title, double budget, boolean completed) {
    this.title = title;
    this.budget = budget;
    this.completed = completed;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public double getBudget() {
    return budget;
  }

  public void setBudget(double budget) {
    this.budget = budget;
  }

  public boolean isCompleted() {
    return completed;
  }

  public void setCompleted(boolean completed) {
    this.completed = completed;
  }

  @Override
  public String toString() {
    return String.format(
        "{ \"title\": \"%s\", \"budget\": %.2f, \"completed\": %b }",
        title, budget, completed
    );
  }

}